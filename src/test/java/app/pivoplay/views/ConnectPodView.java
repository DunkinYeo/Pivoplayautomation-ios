package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;

public class ConnectPodView extends TestLibrary {

    private final int SECOND60 = 60;
    private final String BTN_CONNECT = "CONNECT";
    private final String CI_CONNECT = "**/XCUIElementTypeStaticText[`label == \"Connect\"`]";
    private final String BTN_GALLERY = "GALLERY";
    private final String CI_GALLERY = "**/XCUIElementTypeStaticText[`label == \"Gallery\"`]";

    public IOSElement getViewElement(MobileDriver<IOSElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_CONNECT:
                element = findElementByClassChainIDWithWait(driver, SECOND60, CI_CONNECT);
                break;
            case BTN_GALLERY:
                element = findElementByClassChainIDWithWait(driver, SECOND60, CI_GALLERY);
                break;
        }
        return element;
    }

}
