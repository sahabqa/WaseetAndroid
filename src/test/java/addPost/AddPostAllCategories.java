package addPost;

import base.CapsFile;
import base.CustomSteps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screensObjects.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AddPostAllCategories extends CapsFile {

    CustomSteps customStep = new CustomSteps();
    String randomString = customStep.randomString();

    @AfterMethod
    public void resetApp() {

        driver.resetApp();

    }

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
        customSteps.ScrollDown();
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

    @Test
    public void AddServicesPostWithoutImages() throws IOException {

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

        // Add Services Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.Services.click();
        ChooseSection.TransferAndRelocation.click();
        ChooseSection.AlAsimah.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicServicesTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Services Post Step TWO scenario

        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }

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

    @Test
    public void AddEnginesAndMechanismsPostWithoutImages() throws IOException {

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

        // Add Engines And Mechanisms Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.EnginesAndMechanisms.click();
        ChooseSection.Boats.click();
        ChooseSection.JetSki.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicEnginesAndMechanismsTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Engines And Mechanisms Post Step TWO scenario

        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }

    @Test
    public void AddCraftsAndContractingPostWithoutImages() throws IOException {

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

        // Add Crafts And Contracting Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.CraftsAndContracting.click();
        ChooseSection.AluminumAndKitchens.click();
        ChooseSection.AlAsimah.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicCraftsAndContractingTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Crafts And Contracting Post Step TWO scenario

        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }

    @Test
    public void AddFurniturePostWithoutImages() throws IOException {

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

        // Add Furniture Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.Furniture.click();
        ChooseSection.HomeFurnishings.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicFurnitureTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Furniture Post Step TWO scenario

        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }

    @Test
    public void AddElectronicsAndDevicesPostWithoutImages() throws IOException {

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

        // Add Electronics And Devices Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.ElectronicsAndDevices.click();
        ChooseSection.HouseholdAppliance.click();
        ChooseSection.Refrigerators.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicElectronicsAndDevicesTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Electronics And Devices Post Step TWO scenario

        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }

    @Test
    public void AddAnimalsPostWithoutImages() throws IOException {

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
        ChooseSection.Animals.click();
        ChooseSection.Dogs.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicAnimalsTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Car Post Step TWO scenario

        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }

    @Test
    public void AddFamilyAndHealthPostWithoutImages() throws IOException {

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

        // Add Family And Health Post Step ONE scenario

        AddPostStepOne.ChooseSectionButton.click();
        ChooseSection.FamilyAndHealth.click();
        customStep.ScrollToText("متفرقات");
        ChooseSection.WomenAccessories.click();
        ChooseSection.Clothes.click();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicHealthAndFamilyTitle"));
        AddPostStepOne.NextStepButton.click();

        // Add Family And Health Post Step TWO scenario

        AddPostStepTwo.PriceField.sendKeys(customStep.RandomPrice());
        customSteps.ScrollDown();
        AddPostStepTwo.SubmitPostButton.click();

        Assert.assertTrue(AddPostStepTwo.PostAddedSuccessfullyText.isDisplayed());

    }

}
