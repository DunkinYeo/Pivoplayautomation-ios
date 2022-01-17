package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class NotificationView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_IGNORE = "IGNORE"; //Ignore button on the notification for warning phone's position
    private final String ID_IGNORE = "io.youvr.android.pivo:id/btn_neg";
    private final String BTN_OK = "OK";
    private final String ID_OK = "io.youvr.android.pivo:id/btn_pos";


    public AndroidElement getViewElement(MobileDriver<AndroidElement> driver, String elementText) {

        AndroidElement element = null;
        switch (elementText) {
            case BTN_IGNORE:
                element = findElementByIdWithWait(driver, SECOND60, ID_IGNORE);
                break;
            case BTN_OK:
                element = findElementByIdWithWait(driver, SECOND60, ID_OK);
                break;
        }
        return element;
    }
}
