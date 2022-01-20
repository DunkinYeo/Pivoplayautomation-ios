package app.pivoplay.test;

import app.pivoplay.library.TestLibrary;

import app.pivoplay.views.PreviewView;
import app.pivoplay.views.playmodes.*;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class PlayModeTest extends BaseTest {

    @Test
    public void PanoramaTest() {

        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver);

        testLibrary.chooseMode(driver,"PANORAMA");

        PanoramaView panoramaView = new PanoramaView();
        IOSElement capture = panoramaView.getViewElement(driver,"CAPTURE");
        capture.click(); //start capture

        testLibrary.ignoreMessage(driver); //ignore message

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    @Test
    public void ManymeTest() {

        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver); //open choose mode view

        testLibrary.chooseMode(driver,"MANY_ME");

        ManyMeView manyMeView = new ManyMeView();
        IOSElement capture = manyMeView.getViewElement(driver,"CAPTURE");
        capture.click(); //start capture

        testLibrary.ignoreMessage(driver); //ignore message

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    @Test
    public void FlashTest() {

        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver); //open choose mode view

        testLibrary.chooseMode(driver,"FLASH");

        testLibrary.setAuto(driver); //Set as Auto

        FlashView flashView = new FlashView();
        IOSElement capture = flashView.getViewElement(driver,"CAPTURE");
        capture.click(); //start capture

        testLibrary.verifyMakingMagic(driver); // check capturing is finished

    }
    @Test
    public void DoubleTakeTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver); //open choose mode view

        testLibrary.chooseMode(driver,"DOUBLE_TAKE");

        testLibrary.setAuto(driver); //Set as Auto

        DoubleTakeView doubleTakeView = new DoubleTakeView();
        IOSElement capture = doubleTakeView.getViewElement(driver,"CAPTURE");
        capture.click(); //start capture

        testLibrary.verifyMakingMagic(driver); // check capturing is finished

    }

    @Test
    public void VSTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver); //open choose mode view

        testLibrary.chooseMode(driver,"VS");

        testLibrary.setAuto(driver); //Set as Auto

        VersusView versusView = new VersusView();
        IOSElement capture = versusView.getViewElement(driver,"CAPTURE");
        capture.click(); //start capture

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    @Test
    public void fiftyFiftyTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver); //open choose mode view

        testLibrary.chooseMode(driver,"50/50");

        testLibrary.setAuto(driver); //Set as Auto

        FiftyFiftyView fiftyFiftyView = new FiftyFiftyView();
        IOSElement capture = fiftyFiftyView.getViewElement(driver,"CAPTURE");
        capture.click(); //start capture

        testLibrary.ignoreMessage(driver); //ignore message

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    //@Test
    public void timeLapseTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver); //open choose mode view

        testLibrary.chooseMode(driver,"TIME_LAPSE");

        testLibrary.setAuto(driver); //Set as Auto

        TimeLapseView timeLapseView = new TimeLapseView();
        IOSElement capture = timeLapseView.getViewElement(driver,"CAPTURE");
        capture.click(); //start capture

        testLibrary.ignoreMessage(driver); //ignore message

        testLibrary.verifyMakingMagic(driver); // check capturing is finished

    }

    @Test
    public void tinyPlanetTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver); //open choose mode view

        testLibrary.chooseMode(driver,"TINY_PLANET");

        TinyPlanetView tinyPlanetView = new TinyPlanetView();
        IOSElement capture = tinyPlanetView.getViewElement(driver,"CAPTURE");
        assertTrue("Cannot find capture button", capture.isDisplayed());
        capture.click(); //start capture

        testLibrary.ignoreMessage(driver); //ignore message

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    @Test
    public void manyMeVideoTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.openModeSelection(driver); //open choose mode view

        testLibrary.chooseMode(driver,"MANY_ME_VIDEO");

        ManyMeVideoView manyMeVideoView = new ManyMeVideoView();
        IOSElement capture = manyMeVideoView.getViewElement(driver,"CAPTURE");
        capture.click(); //start capture

        testLibrary.ignoreMessage(driver); //ignore message + start capture automatically

        PreviewView previewView = new PreviewView();
        IOSElement done = previewView.getViewElement(driver,"DONE");
        assertTrue("Cannot find done button", done.isDisplayed());
        done.click(); //finish

    }

}
