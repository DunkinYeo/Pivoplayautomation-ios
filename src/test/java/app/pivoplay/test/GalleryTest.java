package app.pivoplay.test;

import app.pivoplay.library.TestLibrary;
import app.pivoplay.views.ConnectPodView;
import app.pivoplay.views.GalleryView;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;


import static org.junit.Assert.assertTrue;

public class GalleryTest extends BaseTest{

    //@Test(groups = {"Regression"})
    public void GalleryTest() {

        ConnectPodView connectPodView = new ConnectPodView();
        MobileElement gallery = connectPodView.getViewElement(driver, "GALLERY");
        assertTrue("Can not find connect button", gallery != null);

        gallery.click();

        GalleryView galleryView = new GalleryView();
        MobileElement back = galleryView.getViewElement(driver, "BACK");
        assertTrue("Can not find back button", back != null);
        back.click();



    }
}
