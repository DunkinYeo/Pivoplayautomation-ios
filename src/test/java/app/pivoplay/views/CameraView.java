package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

public class CameraView extends TestLibrary {

    private final int SECOND60 = 60;
    private final String BTN_CAPTURE = "CAPTURE";
    private final String AI_CAPTURE = "ic menu record";
    private final String BTN_GALLERY = "GALLERY";
    private final String AI_GALLERY = "1642050729263 thumb";
    private final String BTN_CAMERA = "CAMERA";
    private final String AI_CAMERA = "ic cam screenshot";


    public IOSElement getViewElement(MobileDriver<IOSElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_CAPTURE:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_CAPTURE);
                break;
            case BTN_GALLERY:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_GALLERY);
                break;
            case BTN_CAMERA:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_CAMERA);
                break;
        }
        return element;
    }
}
