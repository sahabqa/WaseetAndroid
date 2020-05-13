package helpers;

		import java.io.File;
		import java.io.IOException;

		import io.appium.java_client.android.AndroidDriver;
		import io.appium.java_client.android.AndroidElement;
		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;

		import base.CapsFile;

public class Screenshots {

	static AndroidDriver<AndroidElement> SsObject = CapsFile.driver;

	public static void getScreenshot(String s) throws IOException {

		File screenShot = ((TakesScreenshot) SsObject).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(
				System.getProperty("user.dir") + "/src/main/java/runReports/failuresScreenshots/" + s + ".jpg"));

	}

}
