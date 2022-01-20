package app.pivoplay.views;

import app.pivoplay.library.TestLibrary;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.ios.IOSElement;

public class ChooseModeView extends TestLibrary {

    private final int SECOND60 = 60;
    private final String MODE_SELECTION = "MODE SELECTION";
    private final String AI_MODE_SELECTION = "Mode Selection";
    private final String BTN_CAPTURE = "CAPTURE";
    private final String AI_CAPTURE = "Capture";
    private final String BTN_PANORAMA = "PANORAMA";
    private final String AI_PANORAMA = "Panorama";
    private final String BTN_MULTI_STREAM = "MULTI_STREAM";
    private final String AI_MULTI_STREAM = "Multistream";
    private final String BTN_MANYME = "MANY_ME";
    private final String AI_MANYME = "Many Me";
    private final String BTN_FLASH = "FLASH";
    private final String AI_FLASH = "Flash";
    private final String BTN_DOUBLETAKE = "DOUBLE_TAKE";
    private final String AI_DOUBLETAKE = "Double Take";
    private final String BTN_VS = "VS";
    private final String AI_VS = "Versus";
    private final String BTN_50 = "50/50";
    private final String AI_50 = "50/50";
    private final String BTN_TIMELAPSE = "TIME_LAPSE";
    private final String AI_TIMELAPSE = "Timelapse";
    private final String BTN_TINY_PLANET = "TINY_PLANET";
    private final String AI_TINY_PLANET = "Tiny Planet";
    private final String BTN_MANYME_VIDEO = "MANY_ME_VIDEO";
    private final String AI_MANYME_VIDEO = "Many Me Video";
    private final String BTN_SETTING = "SETTING";
    private final String AI_SETTING = "ic setting";

    public IOSElement getViewElement(MobileDriver<IOSElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case MODE_SELECTION:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_MODE_SELECTION);
                break;
            case BTN_CAPTURE:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_CAPTURE);
                break;
            case BTN_PANORAMA:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_PANORAMA);
                break;
            case BTN_MULTI_STREAM:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_MULTI_STREAM);
                break;
            case BTN_MANYME:
                element = findElementByAccessibilityWithWait(driver, SECOND60,AI_MANYME);
                break;
            case BTN_FLASH:
                element = findElementByAccessibilityWithWait(driver,SECOND60, AI_FLASH);
                break;
            case BTN_DOUBLETAKE:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_DOUBLETAKE);
                break;
            case BTN_VS:
                element = findElementByAccessibilityWithWait(driver, SECOND60,AI_VS);
                break;
            case BTN_50:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_50);
                break;
            case BTN_TIMELAPSE:
                element = findElementByAccessibilityWithWait(driver, SECOND60,AI_TIMELAPSE);
                break;
            case BTN_TINY_PLANET:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_TINY_PLANET);
                break;
            case BTN_MANYME_VIDEO:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_MANYME_VIDEO);
                break;
            case BTN_SETTING:
                element = findElementByAccessibilityWithWait(driver, SECOND60, AI_SETTING);
                break;
        }
        return element;
    }

}
