package screensObjects;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PostDetailsScreen {

	public PostDetailsScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(accessibility = "star")
	public AndroidElement FavoriteButton;

	@AndroidFindBy(accessibility = "star")
	public List<WebElement> FavoriteElement;

	@AndroidFindBy(accessibility = "star filled")
	public AndroidElement FavoritedButton;

	@AndroidFindBy(accessibility = "Share")
	public AndroidElement ShareButton;

	@AndroidFindBy(accessibility = "التبليغ عن الإعلان")
	public List<WebElement> ReportAbuseElement;

	@AndroidFindBy(accessibility = "التبليغ عن الإعلان")
	public AndroidElement ReportAbuseButton;

	@AndroidFindBy(accessibility = "إرسال")
	public AndroidElement ReportAbuseSendButton;

	@AndroidFindBy(accessibility = "إعلان مُخل بالآداب")
	public AndroidElement Reason1;

	@AndroidFindBy(accessibility = "إعلان مكرر")
	public AndroidElement Reason2;

	@AndroidFindBy(accessibility = "إعلان في القسم الخطأ")
	public AndroidElement Reason3;

	@AndroidFindBy(accessibility = "رقم الهاتف غير صحيح")
	public AndroidElement Reason4;

	@AndroidFindBy(accessibility = "غير ذلك")
	public AndroidElement OtherReason;

	@AndroidFindBy(accessibility = "تم التبليغ عن الإعلان مسبقاً")
	public AndroidElement AlreadyReported;

	@AndroidFindBy(accessibility = "إغلاق")
	public AndroidElement PostCloseButton;

	@AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name='SMS']")
	public AndroidElement SMSbutton;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText)[3]")
	public AndroidElement PostTitle;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText)[3]")
	public AndroidElement My1stFavoritePostTitle;

	@AndroidFindBy(xpath = "(//XCUIElementTypeButton)[3]")
	public AndroidElement My1stFavoritePostNotesButton;

}