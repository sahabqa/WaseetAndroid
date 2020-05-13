package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen {

	public LoginScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "com.awi.waseet:id/customSpinnerTextView")
	public AndroidElement LoginOptionsButton;

	@AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[2]")
	public AndroidElement LoginByPhoneButton;

	@AndroidFindBy(id = "com.awi.waseet:id/nameOfUser")
	public AndroidElement LoginButton;

//	@AndroidFindBy(xpath = "//XCUIElementTypePickerWheel[@value='965+ الكويت']")
//	public AndroidElement Kuwait;
//
	@AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[9]")
	public AndroidElement Jordan;
//
	@AndroidFindBy(xpath = "(//android.widget.LinearLayout)[6]")
	public AndroidElement CountrySelectionList;
//
//	@AndroidFindBy(xpath = "//XCUIElementTypeButton[@name='تم']")
//	public AndroidElement PickerDoneButton;
//
	@AndroidFindBy(id = "com.awi.waseet:id/phoneNumber")
	public AndroidElement PhoneNumberField;
//
	@AndroidFindBy(id = "com.awi.waseet:id/password")
	public AndroidElement PasswordField;
//
	@AndroidFindBy(id = "com.awi.waseet:id/loginButton")
	public AndroidElement LoginButton2;

	@AndroidFindBy(id = "com.awi.waseet:id/welcome_txt")
	public AndroidElement WelcomeMessage;



//	(//XCUIElementTypeButton[@name='ic arrow phone'])[2]

//			findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");

}