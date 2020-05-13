package loginAndLogout;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import base.CustomSteps;
import org.testng.annotations.Test;

import base.CapsFile;
import screensObjects.CountrySelectionScreen;
import screensObjects.HomeScreen;
import screensObjects.LoginScreen;
import screensObjects.MoreScreen;



public class Login extends CapsFile {

    CustomSteps customSteps = new CustomSteps();

    @Test
    public void LoginWithValidCredentials() throws IOException {

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
//        Login.LoginOptionsButton.click();
//        Login.LoginByPhoneButton.click();
//        Login.CountrySelectionList.click();
//        customSteps.ScrollToText(p.getProperty("JordanCountryKey"));
//        Login.Jordan.click();
//        Login.PhoneNumberField.sendKeys(p.getProperty("PhoneNumber"));
//        Login.PasswordField.sendKeys(p.getProperty("Password"));
//        Login.LoginButton2.click();
//        customSteps.idVisibilityStep(Login.WelcomeMessage, 10);
//
//        Assert.assertTrue(Login.WelcomeMessage.isDisplayed());

    }
}