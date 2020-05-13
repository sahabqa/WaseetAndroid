package addPost;

import base.CapsFile;
import base.CustomSteps;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screensObjects.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddMiscellaneousPost extends CapsFile {

	@AfterMethod
	public void resetApp() {

		driver.resetApp();

	}

	CustomSteps customSteps = new CustomSteps();
	String randomString = customSteps.randomString();

	@Test
	public void AddMiscellaneousPostWithoutImages() throws IOException {

		FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
		Properties p = new Properties();
		p.load(reader);

		HomeScreen HomePage = new HomeScreen(driver);
		MoreScreen More = new MoreScreen(driver);
		LoginScreen Login = new LoginScreen(driver);
		CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
		AddPostStepOneScreen AddPostStepOne = new AddPostStepOneScreen(driver);
		AddPostStepTwoScreen AddPostStepTwo = new AddPostStepTwoScreen(driver);
		ChooseSectionScreen ChooseSection = new ChooseSectionScreen(driver);

		// Login Scenario

		CountrySelection.AllCities.click();
		HomePage.MoreButton.click();
		More.LoginButton.click();
		Login.LoginOptionsButton.click();
		Login.LoginByPhoneButton.click();
		Login.CountrySelectionList.click();
		customSteps.ScrollToText(p.getProperty("JordanCountryKey"));
		Login.Jordan.click();
		Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
		Login.PasswordField.sendKeys(p.getProperty("Password"));
		Login.LoginButton2.click();
		customSteps.idVisibilityStep(Login.WelcomeMessage, 15);
		Login.WelcomeMessage.click();
		HomePage.AddPostButton.click();

		// Add Miscellaneous Post Step ONE scenario

		AddPostStepOne.ChooseSectionButton.click();
		customSteps.ScrollToText("متفرقات");
		ChooseSection.Miscellaneous.click();
		customSteps.ScrollToText("أشياء مطلوبة");
		ChooseSection.FreeAndDonations.click();
		AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicMiscellaneousTitle"));
		AddPostStepOne.NextStepButton.click();

		// Add Miscellaneous Post Step TWO scenario

		AddPostStepTwo.PriceField.sendKeys(customSteps.RandomPrice());
		customSteps.ScrollDown();
		AddPostStepTwo.SubmitPostButton.click();

		Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

	}

}
