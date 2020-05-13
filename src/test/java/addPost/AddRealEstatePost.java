package addPost;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
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

public class AddRealEstatePost extends CapsFile {

    @AfterMethod
    public void resetApp() {

        driver.resetApp();

    }

    CustomSteps customStep = new CustomSteps();
    String randomString = customStep.randomString();

    @Test
    public void AddRealEstatePostWithoutImages() throws IOException {

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

        // Add Real Estate Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.RealEstates.click();
        ChooseSection.RealEstateForSale.click();
        ChooseSection.Residential.click();
        ChooseSection.HouseAndVillas.click();
        ChooseSection.AlAsimah.click();
        ChooseSection.AlDesmeh.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicRealEstateTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Real Estate Post Step TWO scenario

        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        AddPostStepTwo.Size.sendKeys(customStep.RandomSize());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }

}
