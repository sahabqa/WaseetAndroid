package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CarsCategoryScreen {

	public CarsCategoryScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// Main

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText[@name='أوروبية'])[1]")
	public AndroidElement European;

	@AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أمريكية']")
	public AndroidElement American;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText[@name='يابانية'])[1]")
	public AndroidElement Japanese;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText[@name='كورية'])[1]")
	public AndroidElement Korean;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText[@name='صينية'])[1]")
	public AndroidElement Chinese;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText[@name='كلاسيكية'])[1]")
	public AndroidElement Classic;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText[@name='مطلوب سيارات'])[1]")
	public AndroidElement CarsWanted;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText[@name='أنواع أخرى'])[1]")
	public AndroidElement OtherTypes;

	@AndroidFindBy(xpath = "(//XCUIElementTypeStaticText[@name='الكل / الأحدث'])[1]")
	public AndroidElement RecentMain;

	@AndroidFindBy(accessibility = "تعديل")
	public AndroidElement EditButton;

//	// American

	@AndroidFindBy(accessibility = "شيفرولية")
	public AndroidElement Chevrolette;

	@AndroidFindBy(xpath = "(//android.widget.TextView)[@text='جي إم سي']")
	public AndroidElement GMC;

	@AndroidFindBy(accessibility = "فورد")
	public AndroidElement Ford;

	@AndroidFindBy(accessibility = "لينكولن")
	public AndroidElement Lincoln;

	@AndroidFindBy(accessibility = "كاديلاك")
	public AndroidElement Cadillac;

	@AndroidFindBy(accessibility = "كرايزلر")
	public AndroidElement Chrysler;

	@AndroidFindBy(accessibility = "دودج")
	public AndroidElement Dodge;

	@AndroidFindBy(accessibility = "الكل / الأحدث")
	public AndroidElement RecentAmerican;

//	// European

	@AndroidFindBy(accessibility = "مرسيدس")
	public AndroidElement Mercedes;

	@AndroidFindBy(accessibility = "بي إم دبليو")
	public AndroidElement BMW;

	@AndroidFindBy(accessibility = "بورش")
	public AndroidElement Porsche;

	@AndroidFindBy(accessibility = "اودي")
	public AndroidElement Audi;

	@AndroidFindBy(accessibility = "فولكس واجن")
	public AndroidElement Volkswagen;

	@AndroidFindBy(accessibility = "لاندروفر")
	public AndroidElement Landrover;

	@AndroidFindBy(accessibility = "رولز رويس")
	public AndroidElement RollsRoyce;

	@AndroidFindBy(accessibility = "جاكوار")
	public AndroidElement Jaguar;

	@AndroidFindBy(accessibility = "بنتلي")
	public AndroidElement Bentli;

	@AndroidFindBy(accessibility = "استون مارتن")
	public AndroidElement AstonMartin;

	@AndroidFindBy(accessibility = "لامبرجيني")
	public AndroidElement Lamborghini;

	@AndroidFindBy(accessibility = "فيراري")
	public AndroidElement Ferrari;

	@AndroidFindBy(accessibility = "مازيراتي")
	public AndroidElement Mazeratti;

	@AndroidFindBy(accessibility = "ميني")
	public AndroidElement Mini;

	@AndroidFindBy(accessibility = "رينو")
	public AndroidElement Renault;

	@AndroidFindBy(accessibility = "الكل / الأحدث")
	public AndroidElement RecentEuropean;

}