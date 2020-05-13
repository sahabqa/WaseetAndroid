package addPost;

import base.CapsFile;
import helpers.ServerChecker;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AAAAAAConfigurations extends CapsFile {

    @BeforeSuite
    @Parameters({ "deviceName"})
    public void configurations(String deviceName) throws IOException, InterruptedException {

        ServerChecker.serverChecker();
        ServerChecker.service.start();

        AndroidDriver<AndroidElement> driver = capabilities(deviceName);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @AfterSuite
    public void closeServer() throws IOException, InterruptedException {

        ServerChecker.service.stop();

    }

}