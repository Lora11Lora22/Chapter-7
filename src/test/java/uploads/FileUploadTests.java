package uploads;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload() {
        homePage.clickLinkPage("File Upload");
        fileUploadPage.uploadFile("C:\\Git\\Chapter-7\\src\\test\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
