package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

public class CameraView extends TestLibrary {

    private final int SECOND60 = 60;
    private final String BTN_CAPTURE = "CAPTURE";
    private final String ID_CAPTURE = "io.youvr.android.pivo:id/capture_btn";
    private final String BTN_GALLERY = "GALLERY";
    private final String ID_GALLERY = "io.youvr.android.pivo:id/gallery_btn";
    private final String BTN_CAMERA = "CAMERA";
    private final String ID_CAMERA = "io.youvr.android.pivo:id/record_btn";


    public AndroidElement getViewElement(MobileDriver<AndroidElement> driver, String elementText) {

        AndroidElement element = null;
        switch (elementText) {
            case BTN_CAPTURE:
                element = findElementByIdWithWait(driver, SECOND60, ID_CAPTURE);
                break;
            case BTN_GALLERY:
                element = findElementByIdWithWait(driver, SECOND60, ID_GALLERY);
                break;
            case BTN_CAMERA:
                element = findElementByIdWithWait(driver, SECOND60, ID_CAMERA);
                break;
        }
        return element;
    }
}
