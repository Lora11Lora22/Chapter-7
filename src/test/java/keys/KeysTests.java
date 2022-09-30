package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTest {

    @Test
    public void testBackSpace() {
        homePage.clickLinkPage("Key Presses");
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        homePage.clickLinkPage("Key Presses");
        keyPressesPage.enterPi();
    }
}
