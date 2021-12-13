package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class GalleryView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_BACK = "BACK";
    private final String ID_BACK = "//android.widget.ImageButton[@content-desc='Navigate up']";
    private final String BTN_DELETE = "DELETE";
    private final String ID_DELETE = "io.youvr.android.pivo:id/action_delete";

    public MobileElement getViewElement(MobileDriver<MobileElement> driver, String elementText) {

        MobileElement element = null;
        switch (elementText) {
            case BTN_BACK:
                element = findElementByXpathWithWait(driver,SECOND60,ID_BACK);
                break;
            case BTN_DELETE:
                element = findElementByIdWithWait(driver, SECOND60,ID_DELETE);
                break;
        }
        return element;
    }

}
