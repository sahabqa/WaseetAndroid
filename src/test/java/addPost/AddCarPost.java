package addPost;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.CapsFile;
import base.CustomSteps;
import screensObjects.AddImagesScreen;
import screensObjects.AddPostStepOneScreen;
import screensObjects.AddPostStepTwoScreen;
import screensObjects.ChooseSectionScreen;
import screensObjects.Commons;
import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.LoginScreen;
import screensObjects.MoreScreen;

public class AddCarPost extends CapsFile {

    @AfterMethod
    public void resetApp() {

        driver.resetApp();

    }

    CustomSteps customStep = new CustomSteps();
    String randomString = customStep.randomString();

    @Test
    public void AddCarPostWithImages() throws IOException {

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
        CustomSteps customSteps = new CustomSteps();

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

        // Add Car Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.Cars.click();
        ChooseSection.TheCars.click();
        ChooseSection.American.click();
        ChooseSection.GMC.click();
        ChooseSection.Savana.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicCarTitle"));
        AddPostStepOne.AddImagesButton.click();
        AddPostStepOne.AllowImagesPermission.click();
        AddPostStepOne.DownloadsCategory.click();
        AddPostStepOne.FirstImage.click();
        AddPostStepOne.SecondImage.click();
        AddPostStepOne.DoneAddingImages.click();
        customSteps.idVisibilityStep(AddPostStepOne.SuccessfulImagesUploadText, 10);
        AddPostStepOne.NextStepButton.click();

        // Add Car Post Step TWO scenario

        AddPostStepTwo.CarColorDrop.click();
        AddPostStepTwo.Black.click();
        AddPostStepTwo.ManufacturingYearDrop.click();
        AddPostStepTwo.NewCar.click();
        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollToText(p.getProperty("T&CagreementText"));
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

//		driver.resetApp();

    }

    @Test
    public void AddCarPostWithoutImages() throws IOException {

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
        CustomSteps customSteps = new CustomSteps();

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

        // Add Car Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.Cars.click();
        ChooseSection.TheCars.click();
        ChooseSection.American.click();
        ChooseSection.GMC.click();
        ChooseSection.Savana.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicCarTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Car Post Step TWO scenario

        AddPostStepTwo.CarColorDrop.click();
        AddPostStepTwo.Black.click();
        AddPostStepTwo.ManufacturingYearDrop.click();
        AddPostStepTwo.NewCar.click();
        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }
}