package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PanoramaView extends TestLibrary {

    private final int SECOND60 = 30;

    private final String BTN_CAPTURE = "CAPTURE";
    private final String ID_CAPTURE = "io.youvr.android.pivo:id/capture_btn";

    public MobileElement getViewElement(MobileDriver<MobileElement> driver, String elementText) {

        MobileElement element = null;
        switch (elementText) {
            case BTN_CAPTURE:
                element = findElementByIdWithWait(driver, SECOND60, ID_CAPTURE);
                break;
        }
        return element;
    }
}
