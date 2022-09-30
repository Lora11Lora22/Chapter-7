package frame;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {

    @Test
    public void testWysiwyg(){
       homePage.clickLinkPage("WYSIWYG Editor");
       wysiwygEditorPage.clearTextArea();

       String text1 = "hello ";
       String text2 = "world";

       wysiwygEditorPage.setTextArea(text1);
       wysiwygEditorPage.decreaseIndentButton();
       wysiwygEditorPage.setTextArea(text2);

       assertEquals(wysiwygEditorPage.getTextFromEditor(),
               text1+text2,
               "Text from editor is incorrect");
    }
}
