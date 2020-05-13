package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAdsScreen {

	public MyAdsScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "(//XCUIElementTypeButton)[1]")
	public AndroidElement RecentPostSettingsButton;

	@AndroidFindBy(accessibility = "تعديل")
	public AndroidElement EditButton;

	@AndroidFindBy(accessibility = "إلغاء النشر")
	public AndroidElement UnpublishButton;

	@AndroidFindBy(accessibility = "حذف")
	public AndroidElement DeleteButton;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[1]")
	public AndroidElement MyRecentPost;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText)[5]")
	public AndroidElement MyRecentPostTitle;

}