package app.pivoplay.views.playmodes;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;

public class NotificationView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_IGNORE = "IGNORE"; //Ignore button on the notification for warning phone's position
    private final String AI_IGNORE = "Ignore";
    private final String BTN_OK = "OK";
    private final String AI_OK = "OK";


    public IOSElement getViewElement(MobileDriver<IOSElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_IGNORE:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_IGNORE);
                break;
            case BTN_OK:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_OK);
                break;
        }
        return element;
    }
}
