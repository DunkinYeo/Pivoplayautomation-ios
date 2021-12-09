package app.pivoplay.test;

import app.pivoplay.views.ConnectPodView;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class ConnectPodTest extends BaseTest {

    @Test
    public void connectPod() {
        ConnectPodView connectPodView = new ConnectPodView();
        MobileElement connect = connectPodView.getViewElement(driver,"CONNECT");
        assertTrue("Can not find connect button", connect != null);

        connect.click();

    }



}
