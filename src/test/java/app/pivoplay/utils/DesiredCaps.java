package app.pivoplay.utils;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCaps {
    public DesiredCapabilities getDesiredCapabilities(String deviceName, String platformVersion, String udid) {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("udid",udid);
        capabilities.setCapability("platformVersion",platformVersion);
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage","io.youvr.android.pivo");
        capabilities.setCapability("appActivity","io.youvr.android.pivo.activity.ScanActivity");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "false");

        return capabilities;
    }

}
