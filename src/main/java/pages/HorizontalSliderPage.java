package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HorizontalSliderPage {

    private WebDriver driver;

    private By sliderRange = By.id("range");
    private By slider = By.xpath("//div[@class='sliderContainer']//input");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider(double range) {
        for (double i = 0.0; i < range; i += 0.5) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getTextFromSlider() {
        String text = driver.findElement(sliderRange).getText();
        return text;
    }
}


