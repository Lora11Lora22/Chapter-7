package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickLinkPage("Frames");
        framesPage.clickNestedFrames();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickLinkPage("Multiple Windows");
        multipleWindowsPage.clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
