package app.pivoplay.utils;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCaps {
    public DesiredCapabilities getDesiredCapabilities(String deviceName, String platformVersion, String udid) {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("xcodeOrgId", "4JQH63J424");
        capabilities.setCapability("xcodeSigninId","iPhone Developer");
        capabilities.setCapability("automationName","XCUITest");
        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("platformVersion",platformVersion);
        capabilities.setCapability("deviceName",deviceName);
        capabilities.setCapability("bundleId","io.youvr.ios.pivo");
        capabilities.setCapability("udid",udid);

        return capabilities;
    }

}
