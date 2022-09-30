package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTest {

    @Test
    public void testFrameText() {
       homePage.clickLinkPage("Frames");
        nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),
                "LEFT",
                "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),
                "BOTTOM",
                "Bottom frame text incorrect");
    }
}
