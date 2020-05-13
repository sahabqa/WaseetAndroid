package base;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;

import helpers.ServerChecker;

public class Configurations extends CapsFile {

    @BeforeSuite
    @Parameters({"deviceName"})
    public void configurations(String deviceName) throws IOException, InterruptedException {

        ServerChecker.serverChecker();
        ServerChecker.service.start();

        Process macEmulator = new ProcessBuilder("emulator", "-avd", "" + deviceName + "").start();

        AndroidDriver<AndroidElement> driver = capabilities(deviceName);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterSuite
    public void closeServer() throws IOException, InterruptedException {

        ServerChecker.service.stop();

    }
}