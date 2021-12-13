package app.pivoplay.library;

import app.pivoplay.views.*;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertTrue;

public class TestLibrary {

    public MobileElement findElementByIdWithWait(WebDriver driver, int second, String id) {
        AndroidElement element = (AndroidElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.elementToBeClickable(MobileBy.id(id)));
        return element;
    }
    public MobileElement findElementByAccessibilityWithWait(WebDriver driver, int second, String ac_id) {
        AndroidElement element = (AndroidElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId(ac_id)));
        return element;
    }
    public MobileElement findElementByXpathWithWait(WebDriver driver, int second, String xpath) {
        AndroidElement element = (AndroidElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(xpath)));
        return element;
    }

    public MobileElement findElementByNameWithWait(WebDriver driver, int second, String name) {
        MobileElement element = (MobileElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.name(name)));
        return element;
    }

    public MobileElement findElementByClassNameWithWait(WebDriver driver, int second, String className) {
        MobileElement element = (MobileElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className(className)));
        return element;
    }

    public void connectPod(MobileDriver<MobileElement> driver) {
        ConnectPodView connectPodView = new ConnectPodView();
        MobileElement connect = connectPodView.getViewElement(driver, "CONNECT");
        assertTrue("Can not find connect button", connect != null);

        connect.click();

        try {
            Thread.sleep(1000);
        } catch (Exception exp) {
            exp.getMessage();
            exp.getCause();
        }
    }

    public void swipeToRight(AndroidDriver<MobileElement> driver) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(200, 1000)).waitAction().moveTo(PointOption.point(700, 1000)).release().perform();
    }

    public void swipeToLeft(AndroidDriver<MobileElement> driver) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(700, 1000)).waitAction().moveTo(PointOption.point(200, 1000)).release().perform();
    }
    public void verifyMakingMagic(AndroidDriver<MobileElement> driver) {
        PreviewView previewView = new PreviewView();
        MobileElement back = previewView.getViewElement(driver, "BACK");
        assertTrue("Can not find back button", back != null);
        back.click();
    }

    public void ignoreMessage(AndroidDriver<MobileElement> driver) {
        NotificationView notificationView = new NotificationView();
        MobileElement ignore = notificationView.getViewElement(driver, "IGNORE");
        assertTrue("Can not find ignore button", ignore != null);
        ignore.click();
    }

    public void FlashMode(AndroidDriver<MobileElement> driver) {
        ChooseModeView chooseModeView = new ChooseModeView();
        MobileElement flash = chooseModeView.getViewElement(driver,"FLASH");
        assertTrue("can not find flash", flash != null);
        flash.click();

    }

}