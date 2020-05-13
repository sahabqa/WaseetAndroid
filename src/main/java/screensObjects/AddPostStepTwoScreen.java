package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddPostStepTwoScreen {

    public AddPostStepTwoScreen(AndroidDriver<?> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

	@AndroidFindBy(id = "com.awi.waseet:id/submitAd")
	public AndroidElement SubmitPostButton;
//
//	@AndroidFindBy(accessibility = "نوع السيارة")
//	public AndroidElement CarTypeDrop;

//	@AndroidFindBy(className = "XCUIElementTypePickerWheel")
//	public AndroidElement CarTypePicker;

    @AndroidFindBy(xpath = "(//android.widget.Spinner)[1]")
    public AndroidElement CarColorDrop;

//    @AndroidFindBy(className = "XCUIElementTypePickerWheel")
//    public AndroidElement CarColorPicker;

	@AndroidFindBy(xpath = "(//android.widget.Spinner)[2]")
	public AndroidElement ManufacturingYearDrop;
//
//	@AndroidFindBy(className = "XCUIElementTypePickerWheel")
//	public AndroidElement ManufacturingYearPicker;
//
	@AndroidFindBy(xpath = "(//android.widget.EditText)[@text='السعر']")
	public AndroidElement PriceField;

	@AndroidFindBy(id = "com.awi.waseet:id/text_done")
	public AndroidElement PostAddedSuccessfullyText;

	@AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أوافق على شروط إستخدام الوسيط']")
	public AndroidElement AcceptTermsButton;

//	@AndroidFindBy(accessibility = "متابعة")
//	public AndroidElement ContinueButton;
//
//	@AndroidFindBy(accessibility = "تم")
//	public AndroidElement DonePostAddButton;
//
//	@AndroidFindBy(accessibility = "PhoneArrow")
//	public AndroidElement CountryCodeDropDown;
//
//	@AndroidFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
//	public AndroidElement PhoneNumberField;
//
//	@AndroidFindBy(xpath = "(//XCUIElementTypeTextField)[3]")
//	public AndroidElement RealEstatesPostPhoneNumberField;
//
//	@AndroidFindBy(accessibility = "تم تعديل الإعلان بنجاح")
//	public AndroidElement PostEditedSuccessfullyMessage;
//
	@AndroidFindBy(xpath = "(//android.widget.EditText)[@text='المساحة(متر مربع)']")
	public AndroidElement Size;

    // Car Colors

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أسود']")
    public AndroidElement Black;

    // Manufacturer Years

	@AndroidFindBy(xpath = "(//android.widget.TextView)[@text='2020']")
	public AndroidElement NewCar;

}