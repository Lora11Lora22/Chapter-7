package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private final WebDriver driver;
    private final By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private final By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private final By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");

    private By results = By.id("result");

    public JavaScriptAlertsPage (WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        triggerAlertButton.findElement(driver).click();
    }

    public void triggerConfirm(){
        triggerConfirmButton.findElement(driver).click();
    }

    public void triggerPrompt(){
        triggerPromptButton.findElement(driver).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getText(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }
}
