package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class GlobalSettingView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_CONFIRM = "CONFIRM";
    private final String ID_CONFIRM = "io.youvr.android.pivo:id/confirm_btn";
    private final String BTN_AUTO = "AUTO";
    private final String ID_AUTO = "io.youvr.android.pivo:id/btn_auto";
    private final String BTN_MANUAL = "MANUAL";
    private final String ID_MANUAL = "io.youvr.android.pivo:id/btn_manual";

    public MobileElement getViewElement(MobileDriver<MobileElement> driver, String elementText) {

        MobileElement element = null;
        switch (elementText) {
            case BTN_CONFIRM:
                element = findElementByXpathWithWait(driver,SECOND60,ID_CONFIRM);
                break;
            case BTN_AUTO:
                element = findElementByIdWithWait(driver, SECOND60,ID_AUTO);
                break;
            case BTN_MANUAL:
                element = findElementByIdWithWait(driver, SECOND60, ID_MANUAL);
                break;
        }
        return element;
    }
}
