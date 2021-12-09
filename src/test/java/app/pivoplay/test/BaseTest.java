package app.pivoplay.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;

public abstract class BaseTest {

    private static AppiumDriverLocalService service;
    public AppiumDriver<WebElement> driver;


    @BeforeSuite(groups = {"abstract"})
    public void globalSetup() throws IOException {
        System.out.println("Starting BeforeSuite...");

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();

    }

    @BeforeTest(groups = {"abstract"})
    public void setUp() throws Exception {
        System.out.println("BeforeTest...");
        DesiredCapabilities cap = new DesiredCapabilities();

        //Real device
        //S21 5G KR model
        cap.setCapability("deviceName", "Galaxy S21 5G");
        cap.setCapability("udid","R3CR104QQDV");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");
        cap.setCapability("appPackage","io.youvr.android.pivo");
        cap.setCapability("appActivity","io.youvr.android.pivo.activity.ScanActivity");
        cap.setCapability("noReset", "true");
        cap.setCapability("fullReset", "false");


        try {
            driver = new AppiumDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }


    @AfterTest(groups = { "abstract" })
    public void tearDown() {
        System.out.println("AfterTest...");

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite(groups = { "abstract" })
    public void globalTearDown () {
        System.out.println("AfterSuite...");

        if (service != null) {
            service.stop();
        }
    }
    public URL getServiceUrl () {
        return service.getUrl();
    }
}

