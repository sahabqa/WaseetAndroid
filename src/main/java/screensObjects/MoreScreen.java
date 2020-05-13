package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MoreScreen {

    public MoreScreen(AndroidDriver<?> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(id = "com.awi.waseet:id/nameOfUser")
    public AndroidElement LoginButton;

    @AndroidFindBy(xpath = "(//XCUIElementTypeCell)[8]")
    public AndroidElement LogoutButton;

    @AndroidFindBy(accessibility = "نعم")
    public AndroidElement LogoutConfirmationYesButton;

    @AndroidFindBy(accessibility = "لا")
    public AndroidElement LogoutConfirmationNoButton;

    @AndroidFindBy(xpath = "(//XCUIElementTypeCell)[3]")
    public AndroidElement MyFavoritesButton;


}