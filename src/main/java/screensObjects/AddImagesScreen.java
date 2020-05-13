package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddImagesScreen {

	public AddImagesScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	
	@AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@value='Recents']")
	public AndroidElement RecentsLabel;

	@AndroidFindBy(xpath = "(//XCUIElementTypeOther)[9]")
	public AndroidElement ImagesDrawer;

	@AndroidFindBy(accessibility = "أخذ صورة")
	public AndroidElement TakePicture;

	@AndroidFindBy(accessibility = "مكتبة الصور")
	public AndroidElement ImagesLibrary;

	@AndroidFindBy(accessibility = "Recents")
	public AndroidElement Recent;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[1]")
	public AndroidElement FirstImage;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[2]")
	public AndroidElement SecondImage;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[3]")
	public AndroidElement ThirdImage;

	@AndroidFindBy(accessibility = "Done")
	public AndroidElement ImageDoneButton;

	@AndroidFindBy(accessibility = "تحميل")
	public AndroidElement UploadButton;

}