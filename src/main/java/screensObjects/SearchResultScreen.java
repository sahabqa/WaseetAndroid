package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchResultScreen {

	public SearchResultScreen(AndroidDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[1]")
	public AndroidElement FirstPost;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[2]")
	public AndroidElement SecondPost;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[3]")
	public AndroidElement ThirdPost;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[4]")
	public AndroidElement ForthPost;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[5]")
	public AndroidElement FifthPost;

	@AndroidFindBy(xpath = "(//XCUIElementTypeCell)[6]")
	public AndroidElement SixthPost;

}