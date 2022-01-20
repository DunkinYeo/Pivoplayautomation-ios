package app.pivoplay.library;

import app.pivoplay.views.*;
import app.pivoplay.views.playmodes.TuneSettingView;
import app.pivoplay.views.playmodes.NotificationView;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.concurrent.CancellationException;

import static org.junit.Assert.assertTrue;

public class TestLibrary {

    /*
    * Method for finding element with WebDriverWait
    */
    public IOSElement findElementByIdWithWait(WebDriver driver, int second, String id) {
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.elementToBeClickable(MobileBy.id(id)));
        return element;
    }

    public IOSElement findElementByClassChainIDWithWait(WebDriver driver, int second, String classchainId){
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.elementToBeClickable(MobileBy.iOSClassChain(classchainId)));
        return element;
    }
    public IOSElement findElementByAccessibilityWithWait(WebDriver driver, int second, String ac_id) {
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(ac_id)));
        return element;
    }
    public IOSElement findElementByXpathWithWait(WebDriver driver, int second, String xpath) {
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.elementToBeClickable(MobileBy.xpath(xpath)));
        return element;
    }

    public IOSElement findElementByNameWithWait(WebDriver driver, int second, String name) {
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.elementToBeClickable(MobileBy.name(name)));
        return element;
    }

    public IOSElement findElementByClassNameWithWait(WebDriver driver, int second, String className) {
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className(className)));
        return element;
    }

    /**
     * Performs screen swipe
     *
     * @param dir the direction of swipe
     * @version java-client: 7.3.0
     **/
    public void swipeScreen(Direction dir, IOSDriver driver) {
        System.out.println("mobileSwipeScreenIOS(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms
        final HashMap<String, String> scrollObject = new HashMap<String, String>();

        switch (dir) {
            case DOWN: // from up to down (! differs from mobile:scroll)
                scrollObject.put("direction", "down");
                break;
            case UP: // from down to up  (! differs from mobile:scroll)
                scrollObject.put("direction", "up");
                break;
            case LEFT: // from right to left  (! differs from mobile:scroll)
                scrollObject.put("direction", "left");
                break;
            case RIGHT: // from left to right  (! differs from mobile:scroll)
                scrollObject.put("direction", "right");
                break;
            default:
                throw new IllegalArgumentException("mobileSwipeScreenIOS(): dir: '" + dir + "' NOT supported");
        }
        try {
            driver.executeScript("mobile:swipe", scrollObject);
            Thread.sleep(ANIMATION_TIME); // always allow swipe action to complete
        } catch (Exception e) {
            System.err.println("mobileSwipeScreenIOS(): FAILED\n" + e.getMessage());
            return;
        }
    }


    /*Initialize the app connect with pod etc.*/

    public void connectPod(IOSDriver<IOSElement> driver) {
        ConnectPodView connectPodView = new ConnectPodView();
        MobileElement connect = connectPodView.getViewElement(driver, "CONNECT");
        //assertTrue("Can not find connect button", connect != null);

        connect.click();

        try {
            Thread.sleep(10000);
        } catch (Exception exp) {
            exp.getMessage();
            exp.getCause();
        }
    }


    /*
   Library for calling global setting view which is using same ID
    */
    public void setAuto(IOSDriver<IOSElement> driver) {

        swipeScreen(Direction.LEFT,driver); // Open setting view

        TuneSettingView tuneSettingView = new TuneSettingView();
        IOSElement auto = tuneSettingView.getViewElement(driver, "AUTO");
        auto.click();

        IOSElement confirm = tuneSettingView.getViewElement(driver, "CONFIRM");
        confirm.click();
    }
    public void ignoreMessage(IOSDriver<IOSElement> driver) {
        NotificationView notificationView = new NotificationView();
        IOSElement ok = notificationView.getViewElement(driver,"OK");
        IOSElement ignore = notificationView.getViewElement(driver, "IGNORE");

        /*
        while(ignore == null){
            ok.click();
        }
        */

        if(ignore != null) {
            ignore.click();
        }else if(ok != null){
            ok.click();
            System.out.println("Only Ok button appears, not ignore button");
            ignoreMessage(driver);
        }
    }

    public void verifyMakingMagic(IOSDriver<IOSElement> driver) {
        PreviewView previewView = new PreviewView();
        IOSElement back = previewView.getViewElement(driver, "BACK");
        back.click();
    }

    public void openModeSelection(IOSDriver driver){
        CameraView cameraView = new CameraView();

        swipeScreen(Direction.RIGHT, driver);
    }

    public void chooseMode(IOSDriver<IOSElement> driver, String elementText) {
        ChooseModeView chooseModeView = new ChooseModeView();
        IOSElement mode = null;
        switch (elementText){
            case "PANORAMA":
                mode = chooseModeView.getViewElement(driver, "PANORAMA");
                break;
            case "MULTI_STREAM":
                mode = chooseModeView.getViewElement(driver, "MULTI_STREAM");
                break;
            case "MANY_ME":
                mode = chooseModeView.getViewElement(driver, "MANY_ME");
                break;
            case "FLASH":
                mode = chooseModeView.getViewElement(driver,"FLASH");
                break;
            case "DOUBLE_TAKE":
                mode = chooseModeView.getViewElement(driver,"DOUBLE_TAKE");
                break;
            case "VS":
                mode = chooseModeView.getViewElement(driver,"VS");
                break;
            case "50/50":
                mode = chooseModeView.getViewElement(driver,"50/50");
                break;
            case "TIME_LAPSE":
                mode = chooseModeView.getViewElement(driver,"TIME_LAPSE");
            case "TINY_PLANET":
                mode = chooseModeView.getViewElement(driver,"TINY_PLANET");
                break;
            case "MANY_ME_VIDEO":
                mode = chooseModeView.getViewElement(driver, "MANY_ME_VIDEO");
                break;
            case "SETTING":
                mode = chooseModeView.getViewElement(driver, "SETTING");
                break;
        }
        mode.click();

        try {
            Thread.sleep(1000);
        } catch (Exception exp) {
            exp.getMessage();
            exp.getCause();
        }
    }

    public void startCapture(IOSDriver<IOSElement> driver){
        CameraView cameraView = new CameraView();
        IOSElement capture = cameraView.getViewElement(driver, "CAPTURE");
        capture.click();
    }
}