package smoke;

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
import screensObjects.MyAdsScreen;
import screensObjects.PostDetailsScreen;
import screensObjects.SearchResultScreen;
import screensObjects.SearchScreen;

public class SmokeTest extends CapsFile {

    CustomSteps customStep = new CustomSteps();
    String randomString = customStep.randomString();

    public SmokeTest() throws FileNotFoundException {
    }

    @AfterMethod
    public void resetApp() {

        driver.resetApp();

    }

    @Test(priority = 0, enabled = true)
    public void LoginWithValidCredentials() throws IOException, InterruptedException {


        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        HomeScreen HomePage = new HomeScreen(driver);
        MoreScreen More = new MoreScreen(driver);
        LoginScreen Login = new LoginScreen(driver);

        CountrySelection.AllCities.click();
        HomePage.MoreButton.click();
        More.LoginButton.click();
        Login.LoginButton.click();
//        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
//        Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
//        Login.PasswordField.sendKeys(p.getProperty("Password"));
//        Login.LoginButton2.click();

        customStep.idVisibilityStep(HomePage.CarsCategory, 10);
        Assert.assertTrue(HomePage.CarsCategory.isDisplayed());

    }

    @Test(priority = 1, enabled = true)
    public void AddCarPostWithImages() throws IOException, InterruptedException {

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        HomeScreen HomePage = new HomeScreen(driver);
        MoreScreen More = new MoreScreen(driver);
        LoginScreen Login = new LoginScreen(driver);

        CustomSteps customStep = new CustomSteps();
        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        AddPostStepOneScreen AddPostStepOne = new AddPostStepOneScreen(driver);
        AddPostStepTwoScreen AddPostStepTwo = new AddPostStepTwoScreen(driver);
        ChooseSectionScreen ChooseSection = new ChooseSectionScreen(driver);
        AddImagesScreen AddImages = new AddImagesScreen(driver);
        Commons common = new Commons(driver);

        CountrySelection.AllCities.click();

        // Login Scenario

        HomePage.MoreButton.click();
        More.LoginButton.click();
        Login.LoginButton.click();
//        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
//        Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
//        Login.PasswordField.sendKeys(p.getProperty("Password"));
//        Login.LoginButton2.click();

        // Add button click

        customStep.idVisibilityStep(HomePage.AddPostButton, 10);
        HomePage.AddPostButton.click();
        AddPostStepOne.ChooseSectionButton.click();

        // Add Car Post Step ONE scenario

        ChooseSection.Cars.click();
        ChooseSection.TheCars.click();
        ChooseSection.American.click();
        ChooseSection.GMC.click();

        customStep.xpathVisibilityStep(AddImages.ImagesDrawer, 5);
        AddImages.ImagesDrawer.click();
        AddImages.ImagesLibrary.click();
        customStep.idVisibilityStep(common.promptOkButton, 5);
        common.promptOkButton.click();
        AddImages.Recent.click();
        customStep.idVisibilityStep(AddImages.RecentsLabel, 5);
        AddImages.FirstImage.click();
        AddImages.SecondImage.click();
        AddImages.ThirdImage.click();
        AddImages.ImageDoneButton.click();
        AddImages.UploadButton.click();

        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("ArabicCarTitle"));

        // Add Car Post Step TWO scenario


    }

    @Test(priority = 2, enabled = true)
    public void EditCarPost() throws IOException, InterruptedException {

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        HomeScreen HomePage = new HomeScreen(driver);
        MoreScreen More = new MoreScreen(driver);
        LoginScreen Login = new LoginScreen(driver);

        CustomSteps customStep = new CustomSteps();
        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        AddPostStepOneScreen AddPostStepOne = new AddPostStepOneScreen(driver);
        AddPostStepTwoScreen AddPostStepTwo = new AddPostStepTwoScreen(driver);
        MyAdsScreen MyAds = new MyAdsScreen(driver);
        AddImagesScreen AddImages = new AddImagesScreen(driver);
        Commons common = new Commons(driver);

        CountrySelection.AllCities.click();

        // Login Scenario

        HomePage.MoreButton.click();
        More.LoginButton.click();
        Login.LoginButton.click();
//        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
//        Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
//        Login.PasswordField.sendKeys(p.getProperty("Password"));
//        Login.LoginButton2.click();

        customStep.idVisibilityStep(HomePage.MyAdsButton, 10);
        HomePage.MyAdsButton.click();

        customStep.xpathVisibilityStep(MyAds.MyRecentPost, 10);
        MyAds.RecentPostSettingsButton.click();
        MyAds.EditButton.click();

        customStep.xpathVisibilityStep(AddImages.ImagesDrawer, 10);

        AddImages.ImagesDrawer.click();
        AddImages.ImagesLibrary.click();
        customStep.idVisibilityStep(common.promptOkButton, 5);
        common.promptOkButton.click();
        AddImages.Recent.click();
        customStep.idVisibilityStep(AddImages.RecentsLabel, 5);
        AddImages.FirstImage.click();
        AddImages.SecondImage.click();
        AddImages.ThirdImage.click();
        AddImages.ImageDoneButton.click();
        AddImages.UploadButton.click();

        AddPostStepOne.Title.clear();
        AddPostStepOne.Title.sendKeys(randomString + " " + p.getProperty("EditedArabicCarTitle"));
        AddPostStepOne.Description.clear();
        AddPostStepOne.Description.sendKeys(randomString + " " + p.getProperty("Description"));

    }

    @Test(priority = 3, enabled = true)
    public void PostAddToFavorites() throws IOException, InterruptedException {

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        HomeScreen HomePage = new HomeScreen(driver);
        MoreScreen More = new MoreScreen(driver);
        LoginScreen Login = new LoginScreen(driver);
        CustomSteps customStep = new CustomSteps();
        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        PostDetailsScreen PostDetails = new PostDetailsScreen(driver);
        SearchResultScreen SearchResult = new SearchResultScreen(driver);

        CountrySelection.AllCities.click();

        // Login Scenario

        HomePage.MoreButton.click();
        More.LoginButton.click();
        Login.LoginButton.click();
//        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
//        Login.PhoneNumberField.sendKeys(p.getProperty("AutomationAccountPhoneNumber"));
//        Login.PasswordField.sendKeys(p.getProperty("AutomationAccountPassword"));
//        Login.LoginButton2.click();

        // Add to Favorites scenario

        customStep.idVisibilityStep(HomePage.CarsCategory, 10);
        HomePage.RecentsCategories.click();

        customStep.xpathVisibilityStep(SearchResult.FirstPost, 10);
        SearchResult.FirstPost.click();
        customStep.idVisibilityStep(PostDetails.PostCloseButton, 5);

        customStep.AddToFavoritesCheck();
        PostDetails.FavoriteButton.click();

        // Assertion

        Assert.assertTrue(PostDetails.FavoritedButton.isDisplayed());

    }

//    @Test(priority = 4, enabled = true)
//    public void PostReportAbuse() throws IOException, InterruptedException {
//
//        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
//        Properties p = new Properties();
//        p.load(reader);
//
//        HomeScreen HomePage = new HomeScreen(driver);
//        MoreScreen More = new MoreScreen(driver);
//        LoginScreen Login = new LoginScreen(driver);
//        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
//        PostDetailsScreen PostDetails = new PostDetailsScreen(driver);
//        SearchResultScreen SearchResult = new SearchResultScreen(driver);
//
//        CountrySelection.Allow.click();
//        CountrySelection.AllCities.click();
//
//        // Login Scenario
//
//        HomePage.MoreButton.click();
//        More.LoginButton.click();
//        Login.LoginButton.click();
//        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
//        Login.PhoneNumberField.sendKeys(p.getProperty("AutomationAccountPhoneNumber"));
//        Login.PasswordField.sendKeys(p.getProperty("AutomationAccountPassword"));
//        Login.LoginButton2.click();
//
//        // Report Abuse scenario
//
//        customStep.idVisibilityStep(HomePage.CarsCategory, 10);
//        HomePage.RecentsCategories.click();
//
//        customStep.xpathVisibilityStep(SearchResult.FirstPost, 10);
//        SearchResult.FirstPost.click();
//        customStep.idVisibilityStep(PostDetails.PostCloseButton, 5);
//        customStep.Scroll();
//
//        customStep.ReportAbuseCheck();
//
//        PostDetails.ReportAbuseButton.click();
//        PostDetails.Reason1.click();
//        PostDetails.ReportAbuseSendButton.click();
//        customStep.idVisibilityStep(PostDetails.PostCloseButton, 5);
//        customStep.Scroll();
//
//        customStep.idVisibilityStep(PostDetails.AlreadyReported, 5);
//        Assert.assertTrue(PostDetails.AlreadyReported.isDisplayed());
//
//    }

    @Test(priority = 5, enabled = true)
    public void SearchPostResults() throws IOException, InterruptedException {

        HomeScreen HomePage = new HomeScreen(driver);
        CustomSteps customStep = new CustomSteps();
        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        SearchScreen Search = new SearchScreen(driver);
        SearchResultScreen SearchResult = new SearchResultScreen(driver);

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        CountrySelection.AllCities.click();

        // Search button click

        HomePage.SearchButton.click();
        Search.SearchField.click();
        Search.SearchField.sendKeys(p.getProperty("CarsSearchKey"));
        Search.SearchKeypadButton.click();

        customStep.xpathVisibilityStep(SearchResult.FirstPost, 10);
        Assert.assertTrue(SearchResult.FirstPost.isDisplayed());

    }

    @Test(priority = 6, enabled = true)
    public void DeleteFirstPost() throws IOException, InterruptedException {

        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
        Properties p = new Properties();
        p.load(reader);

        HomeScreen HomePage = new HomeScreen(driver);
        MoreScreen More = new MoreScreen(driver);
        LoginScreen Login = new LoginScreen(driver);
        CustomSteps customStep = new CustomSteps();
        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
        MyAdsScreen MyAds = new MyAdsScreen(driver);

        CountrySelection.AllCities.click();

        // Login Scenario

        HomePage.MoreButton.click();
        More.LoginButton.click();
        Login.LoginButton.click();
//        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
//        Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
//        Login.PasswordField.sendKeys(p.getProperty("Password"));
//        Login.LoginButton2.click();

        // Delete Scenario

        customStep.idVisibilityStep(HomePage.MyAdsButton, 10);
        HomePage.MyAdsButton.click();

        customStep.xpathVisibilityStep(MyAds.MyRecentPost, 10);
        final String expectedTitle = MyAds.MyRecentPostTitle.getText();

        MyAds.RecentPostSettingsButton.click();
        MyAds.DeleteButton.click();

        Thread.sleep(10000);
        customStep.xpathVisibilityStep(MyAds.MyRecentPost, 5);

        // Assertion on Strings

        Assert.assertNotEquals(expectedTitle, MyAds.MyRecentPostTitle.getText());

    }

//    @Test(priority = 7, enabled = true)
//    public void LogoutFromApp() throws IOException, InterruptedException {
//
//        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/testData/testData.properties");
//        Properties p = new Properties();
//        p.load(reader);
//
//        CountrySelectionScreen CountrySelection = new CountrySelectionScreen(driver);
//        HomeScreen HomePage = new HomeScreen(driver);
//        MoreScreen More = new MoreScreen(driver);
//        LoginScreen Login = new LoginScreen(driver);
//
//        // Login Scenario
//
//        CountrySelection.Allow.click();
//        CountrySelection.AllCities.click();
//        HomePage.MoreButton.click();
//        More.LoginButton.click();
//        Login.LoginButton.click();
//        Login.CountryPickerWheel.sendKeys(p.getProperty("Jordan"));
//        Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
//        Login.PasswordField.sendKeys(p.getProperty("Password"));
//        Login.LoginButton2.click();
//
//        // Logout Scenario
//
//        customStep.idVisibilityStep(HomePage.AddPostButton, 10);
//        HomePage.MoreButton.click();
//        customStep.Scroll();
//
//        More.LogoutButton.click();
//        More.LogoutConfirmationYesButton.click();
//        customStep.idVisibilityStep(More.LoginButton, 5);
//
//        Assert.assertTrue(More.LoginButton.isDisplayed());
//
//    }

}