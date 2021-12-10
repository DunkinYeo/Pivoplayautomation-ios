package app.pivoplay.test;

import app.pivoplay.library.TestLibrary;
import app.pivoplay.views.CameraView;
import app.pivoplay.views.ChooseModeView;
import app.pivoplay.views.PanoramaView;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;


import static org.junit.Assert.*;

public class PanoramaTest extends BaseTest {

    @Test
    public void PanoramaTest() {

        // Pod connection
        TestLibrary testLibrary = new TestLibrary();

        try {
            testLibrary.connectPod(driver);
        } catch (Exception exp) {
            fail("Connect Fail");
            exp.getCause();
            exp.getMessage();
        }

        //Make sure redirected to camera view
        CameraView cameraView = new CameraView();
        MobileElement capture = cameraView.getViewElement(driver, "CAPTURE");
        assertTrue("Cannot find capture button", capture != null);

        //swipe right to open ChooseModeView
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(200, 1000)).waitAction().moveTo(PointOption.point(700, 1000)).release().perform();

        //get panorama view element
        ChooseModeView chooseModeView = new ChooseModeView();
        MobileElement panorama = chooseModeView.getViewElement(driver, "PANORAMA");
        assertTrue("Can not find panorama button", panorama != null);

        panorama.click(); //

        PanoramaView panoramaView = new PanoramaView();
        MobileElement panoramaCapture = panoramaView.getViewElement(driver, "CAPTURE");
        assertTrue("cannot find capture button", panoramaCapture != null);

        panoramaCapture.click();

        try {
            Thread.sleep(20000);
        } catch (Exception exp) {
            exp.getMessage();
            exp.getCause();
        }
    }



}
