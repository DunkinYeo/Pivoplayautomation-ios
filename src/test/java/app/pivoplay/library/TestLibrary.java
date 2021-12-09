package app.pivoplay.library;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class TestLibrary {

    public MobileElement findElementByXpathWithWait(WebDriver driver, int second, String xpath) {
        MobileElement element = (MobileElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(xpath)));
        return element;
    }

    public MobileElement findElementByIdWithWait(WebDriver driver, int second, String id) {
        MobileElement element = (MobileElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id(id)));
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
}
