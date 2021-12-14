package app.pivoplay.test;

import app.pivoplay.library.TestLibrary;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class PlayModeTest extends BaseTest {

    @Test(groups = {"Regression"})
    public void PanoramaTest() {

        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.swipeToRight(driver); //open choose mode view

        testLibrary.chooseMode(driver,"PANORAMA");

        testLibrary.startCapture(driver); //Start capture
        testLibrary.ignoreMessage(driver); //ignore message

        try {
            testLibrary.startCapture(driver);
        }catch (Exception exp){
            fail("Can not start capture after ignore the message");
            exp.getCause();
            exp.getMessage();
        }

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    @Test(groups = {"Regression"})
    public void ManymeTest() {

        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.swipeToRight(driver); //open choose mode view

        testLibrary.chooseMode(driver,"MANY_ME");

        testLibrary.startCapture(driver); //Start capture
        testLibrary.ignoreMessage(driver); //ignore message

        try {
            testLibrary.startCapture(driver);
        }catch (Exception exp){
            fail("Can not start capture after ignore the message");
            exp.getCause();
            exp.getMessage();
        }

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    @Test(groups = {"Regression"})
    public void FlashTest() {

        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.swipeToRight(driver); //open choose mode view

        testLibrary.chooseMode(driver,"FLASH");

        testLibrary.setAuto(driver); //Set as Auto

        testLibrary.startCapture(driver); //Start capture

        testLibrary.verifyMakingMagic(driver); // check capturing is finished

    }
    @Test(groups = {"Regression"})
    public void DoubleTakeTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.swipeToRight(driver); //open choose mode view

        testLibrary.chooseMode(driver,"DOUBLE_TAKE");

        testLibrary.setAuto(driver); //Set as Auto

        testLibrary.startCapture(driver); //Start capture

        testLibrary.verifyMakingMagic(driver); // check capturing is finished

    }

    @Test(groups = {"Regression"})
    public void VSTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.swipeToRight(driver); //open choose mode view

        testLibrary.chooseMode(driver,"VS");

        testLibrary.setAuto(driver); //Set as Auto

        testLibrary.startCapture(driver); //Start capture

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    @Test(groups = {"Regression"})
    public void fiftyFiftyTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.swipeToRight(driver); //open choose mode view

        testLibrary.chooseMode(driver,"50/50");

        testLibrary.setAuto(driver); //Set as Auto

        testLibrary.startCapture(driver); //Start capture
        testLibrary.ignoreMessage(driver); //ignore message

        try {
            testLibrary.startCapture(driver);
        }catch (Exception exp){
            fail("Can not start capture after ignore the message");
            exp.getCause();
            exp.getMessage();
        }

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

    @Test(groups = {"Regression"})
    public void tinyPlanetTest(){
        TestLibrary testLibrary = new TestLibrary();

        testLibrary.connectPod(driver); // connect to pod

        testLibrary.swipeToRight(driver); //open choose mode view

        testLibrary.chooseMode(driver,"TINY_PLANET");

        testLibrary.startCapture(driver); //Start capture
        testLibrary.ignoreMessage(driver); //ignore message

        try {
            testLibrary.startCapture(driver);
        }catch (Exception exp){
            fail("Can not start capture after ignore the message");
            exp.getCause();
            exp.getMessage();
        }

        testLibrary.verifyMakingMagic(driver); // check capturing is finished
    }

}
