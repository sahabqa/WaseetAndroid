package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CountrySelectionScreen {

    public CountrySelectionScreen(AndroidDriver<AndroidElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
    public AndroidElement AllCities;

}