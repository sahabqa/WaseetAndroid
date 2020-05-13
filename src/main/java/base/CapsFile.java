package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.Parameters;


public class CapsFile {

    public static Properties p = new Properties();
    public static AndroidDriver<AndroidElement> driver;

    public CapsFile() {
    }

    @Parameters({"deviceName"})
    public static AndroidDriver<AndroidElement> capabilities(String runningDevice) throws IOException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        File appDir = new File("src");
        File app = new File(appDir, "Waseet-Staging-Apr15.apk");

        capabilities.setCapability("newCommandTimeout", 100000);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, runningDevice);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("appPackage", "com.awi.waseet");
        capabilities.setCapability("appActivity", "splash.SplashActivity");
        capabilities.setCapability("appWaitDuration", "20000");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        capabilities.setCapability("clearSystemFiles", true);

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return driver;
    }

}