package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTest {


    @Test
    public void testBackSpace() {
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }
}
