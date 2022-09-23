package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

    public class ContextMenuTests extends BaseTest {

        @Test
        public void testRightClick(){
            homePage.clickContextMenuPage();
            contextMenuPage.rightClickInBox();
            String message = contextMenuPage.getPopUpText();
            contextMenuPage.acceptPopUp();
            assertEquals(message, "You selected a context menu", "Popup message incorrect");
        }
    }
