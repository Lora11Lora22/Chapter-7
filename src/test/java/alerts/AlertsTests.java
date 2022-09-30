package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTest {

        @Test
        public void testAcceptAlert(){
            homePage.clickLinkPage("JavaScript Alerts");
            javaScriptAlertsPage.triggerAlert();
            javaScriptAlertsPage.alert_clickToAccept();
            assertEquals(javaScriptAlertsPage.getResult(),
                    "You successfully clicked an alert",
                    "Result text incorrect");
        }

        @Test
    public void testGetTextFromAlert(){
            homePage.clickLinkPage("JavaScript Alerts");
            javaScriptAlertsPage.triggerConfirm();
            String text = javaScriptAlertsPage.getText();
            javaScriptAlertsPage.alert_clickToDismiss();
            assertEquals(text,
                    "I am a JS Confirm",
                    "Alert text incorrect");
        }

        @Test
    public void testSetInputInAlert(){
            homePage.clickLinkPage("JavaScript Alerts");
            javaScriptAlertsPage.triggerPrompt();
            String text = "TAU rocks!";
            javaScriptAlertsPage.alert_setInput(text);
            javaScriptAlertsPage.alert_clickToAccept();
            assertEquals(javaScriptAlertsPage.getResult(),
                    "You entered: " +text,
                    "Results text incorrect");
        }

    }


