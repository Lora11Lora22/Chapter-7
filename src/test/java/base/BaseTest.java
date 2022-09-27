package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
        private WebDriver driver;
        protected HomePage homePage;
        protected JavaScriptAlertsPage javaScriptAlertsPage;
        protected HorizontalSliderPage horizontalSliderPage;
        protected FileUploadPage fileUploadPage;
        protected ContextMenuPage contextMenuPage;
        protected WysiwygEditorPage wysiwygEditorPage;
        protected NestedFramesPage nestedFramesPage;
        protected FramesPage framesPage;
        protected DynamicLoadingPage dynamicLoadingPage;


        @BeforeTest
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //driver.manage().timeouts().pageLoadTimeout()
           // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            goHome();
            homePage = new HomePage(driver);
            javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
            horizontalSliderPage = new HorizontalSliderPage(driver);
            fileUploadPage = new FileUploadPage(driver);
            contextMenuPage = new ContextMenuPage(driver);
            wysiwygEditorPage = new WysiwygEditorPage(driver);
            nestedFramesPage = new NestedFramesPage(driver);
            framesPage = new FramesPage(driver);
            dynamicLoadingPage = new DynamicLoadingPage(driver);

        }

        @BeforeMethod
        public void goHome(){
            driver.get("https://the-internet.herokuapp.com/");
        }

        @AfterTest(alwaysRun = true)
        public void tearDown() {
            driver.quit();
        }
    }