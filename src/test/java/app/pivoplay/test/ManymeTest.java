package app.pivoplay.test;

import app.pivoplay.library.TestLibrary;
import app.pivoplay.views.CameraView;
import app.pivoplay.views.ChooseModeView;
import app.pivoplay.views.ManyMeView;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ManymeTest extends BaseTest{

    //@Test(groups = {"Regression"})
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


        try {
            Thread.sleep(20000);
        } catch (Exception exp) {
            exp.getMessage();
            exp.getCause();
        }

    }
}
