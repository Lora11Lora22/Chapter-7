package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MultipleWindowsPage;

public class HomePage {
    private WebDriver driver;
    private By formKeyPressesLink = By.linkText("Key Presses");
    private By formHorizontalSliderLink = By.linkText("Horizontal Slider");
    private By fromJavaScriptAlerts = By.linkText("JavaScript Alerts");
    private By fromFileUpload = By.linkText("File Uploader");
    private By fromContextMenu = By.linkText("Context Menu");
    private By fromWysiwygEditor = By.linkText("WYSIWYG Editor");
    private By fromNestedFrames = By.linkText("Nested Frames");
    private By fromFrames = By.linkText("Frames");
    private By fromDynamicLoading = By.linkText("Dynamic Loading");
    private By fromLargeAndDeepDom = By.linkText("Large & Deep DOM");
    private By fromInfiniteScroll = By.linkText("Infinite Scroll");
    private By fromMultipleWindows = By.linkText("Multiple Windows");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public KeyPressesPage clickKeyPresses(){
        driver.findElement(formKeyPressesLink).click();
        return new KeyPressesPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        driver.findElement(fromMultipleWindows).click();
        return new MultipleWindowsPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        driver.findElement(fromInfiniteScroll).click();
        return new InfiniteScrollPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        driver.findElement(fromLargeAndDeepDom).click();
        return new LargeAndDeepDomPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        driver.findElement(fromJavaScriptAlerts).click();
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUploader(){
        driver.findElement(fromFileUpload).click();
        return new FileUploadPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        driver.findElement(formHorizontalSliderLink).click();
        return new HorizontalSliderPage(driver);
    }

    public ContextMenuPage clickContextMenuPage(){
        driver.findElement(fromContextMenu).click();
        return new ContextMenuPage(driver);
    }
    public WysiwygEditorPage clickWysiwygEditor(){
        driver.findElement(fromWysiwygEditor).click();
        return new WysiwygEditorPage(driver);
    }
    public FramesPage clickFramesPage(){
        driver.findElement(fromFrames).click();
        return new FramesPage(driver);
    }

    public NestedFramesPage clickNestedFrames(){
        driver.findElement(fromNestedFrames).click();
        return new NestedFramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        driver.findElement(fromDynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }

    public void clickLinkPage(String textPage){
        driver.findElement(By.linkText(textPage)).click();

    }
}