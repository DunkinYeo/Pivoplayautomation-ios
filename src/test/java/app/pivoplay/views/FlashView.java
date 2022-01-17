package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class FlashView extends TestLibrary {

    private final int SECOND30 = 30;

    private final String BTN_CAPTURE = "CAPTURE";
    private final String ID_CAPTURE = "io.youvr.android.pivo:id/capture_btn";

    public AndroidElement getViewElement(MobileDriver<AndroidElement> driver, String elementText) {

        AndroidElement element = null;
        switch (elementText) {
            case BTN_CAPTURE:
                element = findElementByXpathWithWait(driver,SECOND30,ID_CAPTURE);
                break;
        }
        return element;
    }
}
