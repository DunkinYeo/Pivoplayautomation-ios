package app.pivoplay.test;

import app.pivoplay.utils.DesiredCaps;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.URL;

public abstract class BaseTest {

    public IOSDriver<IOSElement> driver;
    private static AppiumDriverLocalService service;
    private final DesiredCaps desiredCaps = new DesiredCaps();

    @BeforeSuite
    public void globalSetup() throws IOException {
        System.out.println("Starting BeforeSuite...");

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @BeforeMethod
    @Parameters({"deviceName", "platformVersion", "udid"})
    public void setUp(String deviceName, String platformVersion, String udid) throws IOException {
        System.out.println("BeforeTest...");
        DesiredCapabilities caps = desiredCaps.getDesiredCapabilities(deviceName, platformVersion, udid);

        try {
            driver = new IOSDriver<IOSElement>(getServiceUrl(), caps);
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }


    @AfterMethod
    public void tearDown() {
        System.out.println("AfterTest...");
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void globalTearDown() {
        System.out.println("AfterSuite...");

        if (service != null) {
            service.stop();
        }
    }
    public URL getServiceUrl () {
        return service.getUrl();
    }
}

