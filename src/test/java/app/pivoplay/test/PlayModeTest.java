package app.pivoplay.test;

import app.pivoplay.library.TestLibrary;
import app.pivoplay.views.*;
import io.appium.java_client.MobileElement;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class PlayModeTest extends BaseTest {

    @Test(groups = {"Regression"})
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
        try {
            testLibrary.swipeToRight(driver);
        } catch (Exception exp) {
            exp.getCause();
            exp.getMessage();
        }

        //get panorama view element
        ChooseModeView chooseModeView = new ChooseModeView();
        MobileElement panorama = chooseModeView.getViewElement(driver, "PANORAMA");
        assertTrue("Can not find panorama button", panorama != null);

        panorama.click(); //redirect to panorama view

        PanoramaView panoramaView = new PanoramaView();
        MobileElement panoramaCapture = panoramaView.getViewElement(driver, "CAPTURE");
        assertTrue("cannot find capture button", panoramaCapture != null);

        panoramaCapture.click(); //Warning message will pop up at first time open capture panorama

        testLibrary.ignoreMessage(driver); // ignore the message to warning position of the device

        try {
            panoramaCapture.click();
        } catch (Exception exp) {
            fail("Panorama capture failed, it should work after ignore the message");
            exp.getMessage();
            exp.getCause();
        }

        try {
            Thread.sleep(3000);
        } catch (Exception exp) {
            exp.getMessage();
            exp.getCause();
        }

        testLibrary.verifyMakingMagic(driver); //Check Making magic finished
    }

    @Test(groups = {"Regression"})
    public void ManymeTest() {

        // Pod connection
        TestLibrary testLibrary = new TestLibrary();

        try {
            testLibrary.connectPod(driver);
        } catch (Exception exp) {
            fail("Connect Fail");
            exp.getCause();
            exp.getMessage();
        }

        //Make sure redirected to Camera View
        CameraView cameraView = new CameraView();
        MobileElement capture = cameraView.getViewElement(driver, "CAPTURE");
        assertTrue("Cannot find capture button", capture != null);


        testLibrary.swipeToRight(driver); //Open choose mode view

        ChooseModeView chooseModeView = new ChooseModeView();
        MobileElement manyMe = chooseModeView.getViewElement(driver,"MANY_ME");
        assertTrue("Can not find many me button", manyMe != null);

        manyMe.click(); //open manyMe View

        ManyMeView manyMeView = new ManyMeView();
        MobileElement capture_manyme = manyMeView.getViewElement(driver, "CAPTURE");
        assertTrue("Can not find capture button", capture_manyme != null);

        capture_manyme.click();

        testLibrary.ignoreMessage(driver);

        try {
            capture_manyme.click();
        }catch (Exception exp){
            fail("Can not start manay me capture");
            exp.getCause();
            exp.getMessage();
        }

        testLibrary.verifyMakingMagic(driver);
    }

    //@Test(groups = {"Regression"})
    public void FlashTest() {

        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod
        testLibrary.swipeToRight(driver); //open choose mode view




    }

}
