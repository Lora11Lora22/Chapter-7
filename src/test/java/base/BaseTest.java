package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.*;
import utils.MultipleWindowsPage;
import utils.WindowManager;
import java.io.File;
import java.io.IOException;


public class BaseTest {
        protected WebDriver driver;
        protected HomePage homePage;
        protected JavaScriptAlertsPage javaScriptAlertsPage;
        protected HorizontalSliderPage horizontalSliderPage;
        protected FileUploadPage fileUploadPage;
        protected ContextMenuPage contextMenuPage;
        protected WysiwygEditorPage wysiwygEditorPage;
        protected NestedFramesPage nestedFramesPage;
        protected FramesPage framesPage;
        protected DynamicLoadingPage dynamicLoadingPage;
        protected DynamicLoadingExample1Page dynamicLoadingExample1Page;
        protected DynamicLoadingExample2Page dynamicLoadingExample2Page;
        protected LargeAndDeepDomPage largeAndDeepDomPage;
        protected InfiniteScrollPage infiniteScrollPage;
        protected MultipleWindowsPage multipleWindowsPage;
        protected WindowManager windowManager;


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
            dynamicLoadingExample1Page = new DynamicLoadingExample1Page(driver);
            dynamicLoadingExample2Page = new DynamicLoadingExample2Page(driver);
            largeAndDeepDomPage = new  LargeAndDeepDomPage(driver);
            infiniteScrollPage = new InfiniteScrollPage(driver);
            multipleWindowsPage = new MultipleWindowsPage(driver);
            windowManager = new WindowManager(driver);
        }

        @BeforeMethod
        public void goHome(){
            driver.get("https://the-internet.herokuapp.com/");
        }

        @AfterTest(alwaysRun = true)
        public void tearDown() {
            driver.quit();
        }

        @AfterMethod
        public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
            try{
                Files.move(screenshot,
                        new File("src/test/resources/screenshot/" + result.getName() + ".png"));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        }

        public WindowManager getWindowManager(){
        return new WindowManager(driver);
        }
    }