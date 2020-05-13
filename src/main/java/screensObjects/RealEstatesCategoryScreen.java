package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RealEstatesCategoryScreen {

	public RealEstatesCategoryScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// Main

	@AndroidFindBy(accessibility = "سكني واستثماري")
	public AndroidElement ResidentialAndinvestment;

	@AndroidFindBy(accessibility = "تجاري وصناعي")
	public AndroidElement CommercialAndIndustrial;

	@AndroidFindBy(accessibility = "إستراحات وشاليهات")
	public AndroidElement RestHousesAndChalets;

	// American

	// European

}