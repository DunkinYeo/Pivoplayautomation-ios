package app.pivoplay.views.playmodes;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;

public class PanoramaView extends TestLibrary {

    private final int SECOND10 = 10;

    private final String BTN_CAPTURE = "CAPTURE";
    private final String AI_CAPTURE = "ic menu Pano";



    public IOSElement getViewElement(MobileDriver<IOSElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_CAPTURE:
                element = findElementByAccessibilityWithWait(driver, SECOND10, AI_CAPTURE);
                break;
        }
        return element;
    }
}
