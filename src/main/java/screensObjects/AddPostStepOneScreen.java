package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddPostStepOneScreen {

	public AddPostStepOneScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "com.awi.waseet:id/selectedCatText")
	public AndroidElement ChooseSectionButton;

	@AndroidFindBy(id = "com.awi.waseet:id/nextStep")
	public AndroidElement NextStepButton;

	@AndroidFindBy(id = "com.awi.waseet:id/addImages")
	public AndroidElement AddImagesButton;

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public AndroidElement AllowImagesPermission;

	@AndroidFindBy(id = "com.awi.waseet:id/image_view_album_image")
	public AndroidElement DownloadsCategory;

	@AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
	public AndroidElement FirstImage;

	@AndroidFindBy(xpath = "(//android.widget.ImageView)[2]")
	public AndroidElement SecondImage;

	@AndroidFindBy(xpath = "(//android.widget.TextView)[@text='تم التحميل'][2]")
	public AndroidElement SuccessfulImagesUploadText;

	@AndroidFindBy(id = "com.awi.waseet:id/menu_item_add_image")
	public AndroidElement DoneAddingImages;

//	@AndroidFindBy(accessibility = "Done")
//	public AndroidElement DoneButton;
//
//	@AndroidFindBy(accessibility = "الوصف")
//	public AndroidElement DescriptionLabel;
//
	@AndroidFindBy(id = "com.awi.waseet:id/ad_title")
	public AndroidElement Title;
//
	@AndroidFindBy(id = "com.awi.waseet:id/ad_details")
	public AndroidElement Description;
//
//	@AndroidFindBy(accessibility = "تم")
//	public AndroidElement DescriptionDone;
//
//	@AndroidFindBy(xpath = "//XCUIElementTypeButton[@name='DeleteImage']")
//	public AndroidElement DeleteImageButton;


}