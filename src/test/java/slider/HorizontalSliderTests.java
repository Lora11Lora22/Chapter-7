package slider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTest {

    private double rangeDegree = 2.0;

    @Test
    public void testSlider() {
        homePage.clickLinkPage("Horizontal Slider");
        horizontalSliderPage.moveSlider(rangeDegree);
        assertEquals(horizontalSliderPage.getTextFromSlider(), String.valueOf(Math.round(rangeDegree)),
                "Slider value is incorrect!");
    }
}
