package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;

public class PreviewView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_BACK = "BACK";
    private final String AI_BACK = "ic button back";
    private final String BTN_GIF = "GIF";
    private final String AI_GIF = "ic button gif";
    private final String BTN_EDIT = "EDIT";
    private final String AI_EDIT = "ic button edit";
    private final String BTN_SHARE = "SHARE";
    private final String AI_SHARE = "ic button share";
    private final String BTN_EXPORT = "EXPORT";
    private final String AI_EXPORT = "ic button file download";
    private final String BTN_DELETE = "DELETE";
    private final String AI_DELETE = "ic button delete";
    private final String BTN_DONE = "DONE";
    private final String CI_DONE = "**/XCUIElementTypeStaticText[`label == \"Done\"`]";

    public IOSElement getViewElement(MobileDriver<IOSElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_BACK:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_BACK);
                break;
            case BTN_GIF:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_GIF);
                break;
            case BTN_EDIT:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_EDIT);
                break;
            case BTN_SHARE:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_SHARE);
                break;
            case BTN_EXPORT:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_EXPORT);
                break;
            case BTN_DELETE:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_DELETE);
                break;
            case BTN_DONE:
                element = findElementByClassChainIDWithWait(driver, SECOND60, CI_DONE);
                break;
        }
        return element;
    }
}
