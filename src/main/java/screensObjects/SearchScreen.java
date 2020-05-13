package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchScreen {

	public SearchScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name='البحث']")
	public AndroidElement SearchField;

	@AndroidFindBy(accessibility = "Search")
	public AndroidElement SearchKeypadButton;

}