package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {

    @Test
    public void testWysiwyg(){
       WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
       wysiwygEditorPage.clearTextArea();

       String text1 = "hello";
       String text2 = "world";

       wysiwygEditorPage.setTextArea(text1);
       wysiwygEditorPage.decreaseIndentButton();
       wysiwygEditorPage.setTextArea(text2);

       assertEquals(wysiwygEditorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }
}
