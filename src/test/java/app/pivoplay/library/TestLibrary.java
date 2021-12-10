package app.pivoplay.library;

import app.pivoplay.views.CameraView;
import app.pivoplay.views.ChooseModeView;
import app.pivoplay.views.ConnectPodView;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class TestLibrary {

    static final HashMap<String, String> scrollObject = new HashMap<String, String>();

    public MobileElement findElementByIdWithWait(WebDriver driver, int second, String id) {
        MobileElement element = (MobileElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id(id)));
        return element;
    }

    public AndroidElement findElementByXpathWithWait(WebDriver driver, int second, String xpath) {
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
}