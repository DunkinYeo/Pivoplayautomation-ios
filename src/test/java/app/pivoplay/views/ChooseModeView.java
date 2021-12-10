package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ChooseModeView extends TestLibrary {

    private final int SECOND60 = 60;
    private final String TXT_TITLE = "TITLE";
    private final String ID_TITLE = "io.youvr.android.pivo:id/choose_mode_view";
    private final String BTN_CAPTURE = "CAPTURE";
    private final String XPATH_CAPTURE = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.Button";
    private final String BTN_PANORAMA = "PANORAMA";
    private final String XPATH_PANORAMA = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.Button";


    public MobileElement getViewElement(MobileDriver<MobileElement> driver, String elementText) {

        MobileElement element = null;
        switch (elementText) {
            case TXT_TITLE:
                element = findElementByIdWithWait(driver, SECOND60, ID_TITLE);
                break;
            case BTN_CAPTURE:
                element = findElementByXpathWithWait(driver, SECOND60, XPATH_CAPTURE);
                break;
            case BTN_PANORAMA:
                element = findElementByXpathWithWait(driver, SECOND60, XPATH_PANORAMA);
                break;
        }
        return element;
    }

}
