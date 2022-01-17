package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidElement;

public class ConnectPodView extends TestLibrary {

    private final int SECOND60 = 60;
    private final String BTN_CONNECT = "CONNECT";
    private final String ID_CONNECT = "io.youvr.android.pivo:id/connect_to_pivo_btn";
    private final String BTN_GALLERY = "GALLERY";
    private final String ID_GALLERY = "io.youvr.android.pivo:id/gallery_btn";

    public AndroidElement getViewElement(MobileDriver<AndroidElement> driver, String elementText) {

        AndroidElement element = null;
        switch (elementText) {
            case BTN_CONNECT:
                element = findElementByIdWithWait(driver, SECOND60, ID_CONNECT);
                break;
            case BTN_GALLERY:
                element = findElementByIdWithWait(driver, SECOND60, ID_GALLERY);
                break;
        }
        return element;
    }

}
