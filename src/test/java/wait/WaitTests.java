package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {


    @Test
    public void testWaitUntilVisible(){
        DynamicLoadingExample1Page dynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingPage.clickStart();
        assertEquals(dynamicLoadingPage.getLoadedText(),
                "Hello World!", "Loaded text incorrect");
    }
}


