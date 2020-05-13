package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen {

	public HomeScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	// Main Sections Buttons

	@AndroidFindBy(id = "com.awi.waseet:id/navigation_add_post")
	public AndroidElement AddPostButton;

	@AndroidFindBy(id = "com.awi.waseet:id/navigation_my_account")
	public AndroidElement MoreButton;

	@AndroidFindBy(id = "com.awi.waseet:id/navigation_my_ads")
	public AndroidElement MyAdsButton;
	
	@AndroidFindBy(id = "com.awi.waseet:id/navigation_search")
	public AndroidElement SearchButton;
	
	@AndroidFindBy(id = "com.awi.waseet:id/navigation_home")
	public AndroidElement HomeScreenButton;

	// Categories

	@AndroidFindBy(accessibility = "عقارات")
	public AndroidElement RealEstatesCategory;

	@AndroidFindBy(accessibility = "سيارات")
	public AndroidElement CarsCategory;

	@AndroidFindBy(accessibility = "خدمات")
	public AndroidElement ServicesCategory;

	@AndroidFindBy(accessibility = "الكل / الأحدث")
	public AndroidElement RecentsCategories;

	@AndroidFindBy(accessibility = "حرف ومقاولات")
	public AndroidElement ContractingCraftsCategories;

}