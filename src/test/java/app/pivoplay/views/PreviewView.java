package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class PreviewView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_BACK = "BACK";
    private final String AD_BACk = "Navigate up";
    private final String BTN_GIF = "GIF";
    private final String ID_GIF = "io.youvr.android.pivo:id/action_giphy";
    private final String BTN_SHARE = "SHARE";
    private final String ID_SHARE = "io.youvr.android.pivo:id/action_share";
    private final String BTN_EXPORT = "EXPORT";
    private final String ID_EXPORT = "io.youvr.android.pivo:id/action_export";
    private final String BTN_DELETE = "DELETE";
    private final String ID_DELETE = "io.youvr.android.pivo:id/action_delete";

    public AndroidElement getViewElement(MobileDriver<AndroidElement> driver, String elementText) {

        AndroidElement element = null;
        switch (elementText) {
            case BTN_BACK:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AD_BACk);
                break;
            case BTN_GIF:
                element = findElementByIdWithWait(driver, SECOND60, ID_GIF);
                break;
            case BTN_SHARE:
                element = findElementByIdWithWait(driver, SECOND60, ID_SHARE);
                break;
            case BTN_EXPORT:
                element = findElementByIdWithWait(driver, SECOND60, ID_EXPORT);
                break;
            case BTN_DELETE:
                element = findElementByIdWithWait(driver, SECOND60, ID_DELETE);
                break;
        }
        return element;
    }
}
