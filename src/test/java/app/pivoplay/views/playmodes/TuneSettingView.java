package app.pivoplay.views.playmodes;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;

public class TuneSettingView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_CONFIRM = "CONFIRM";
    private final String AI_CONFIRM = "ic tune confirm";
    private final String BTN_AUTO = "AUTO";
    private final String CI_AUTO = "**/XCUIElementTypeStaticText[`label == \"Auto\"`]";
    private final String BTN_MANUAL = "MANUAL";
    private final String CI_MANUAL = "**/XCUIElementTypeStaticText[`label == \"Manual\"`]";

    public IOSElement getViewElement(MobileDriver<IOSElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_CONFIRM:
                element = findElementByAccessibilityWithWait(driver,SECOND60,AI_CONFIRM);
                break;
            case BTN_AUTO:
                element = findElementByClassChainIDWithWait(driver, SECOND60,CI_AUTO);
                break;
            case BTN_MANUAL:
                element = findElementByClassChainIDWithWait(driver, SECOND60, CI_MANUAL);
                break;
        }
        return element;
    }
}
