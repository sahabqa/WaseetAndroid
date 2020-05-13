package base;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import screensObjects.PostDetailsScreen;
import screensObjects.SearchResultScreen;

public class CustomSteps extends CapsFile {

    public void idVisibilityStep(AndroidElement selector, int waitDuration) {

        WebDriverWait wait = new WebDriverWait(driver, waitDuration);
        wait.until(ExpectedConditions.visibilityOf(selector));

    }

    public void xpathVisibilityStep(AndroidElement selector, int waitDuration) {

        WebDriverWait wait = new WebDriverWait(driver, waitDuration);
        wait.until(ExpectedConditions.visibilityOf(selector));

    }

    public String randomString() {

        String s = RandomStringUtils.randomAlphanumeric(3).toUpperCase();

        return s;

    }

    public String RandomPrice() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("1000");
        list.add("1500");
        list.add("2000");
        list.add("2500");
        list.add("3000");
        list.add("3500");
        list.add("4000");
        list.add("4500");
        list.add("5000");
        list.add("5500");
        list.add("6000");
        list.add("6500");
        list.add("7000");
        list.add("7500");
        list.add("8000");
        list.add("8500");
        list.add("9000");
        list.add("10000");
        list.add("10500");
        list.add("11000");
        list.add("11500");
        list.add("12000");

        String random = list.get(new Random().nextInt(list.size()));

        return random;

    }

    public String RandomColor() {

        ArrayList<String> list = new ArrayList<String>();

        list.add("أسود");
        list.add("أزرق");
        list.add("بني");
        list.add("خمري");
        list.add("ذهبي");
        list.add("رمادي");
        list.add("أخضر");
        list.add("بنفسجي");
        list.add("أحمر");
        list.add("فضي");
        list.add("أسمر");
        list.add("أزرق مخضر");
        list.add("أبيض");
        list.add("أصفر");
        list.add("لون آخر");

        String random = list.get(new Random().nextInt(list.size()));

        return random;

    }

    public String RandomCarType() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("سيارة مستعملة");
        list.add("سيارة جديدة");

        String random = list.get(new Random().nextInt(list.size()));

        return random;

    }

    public String RandomYear() {

        int randomNum1 = ThreadLocalRandom.current().nextInt(1950, 2021);

        String randomNum2 = Integer.toString(randomNum1);

        return randomNum2;

    }

    public String RandomSize() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("100");
        list.add("120");
        list.add("140");
        list.add("150");
        list.add("160");
        list.add("170");
        list.add("180");
        list.add("190");
        list.add("200");
        list.add("210");
        list.add("220");
        list.add("230");
        list.add("240");
        list.add("250");
        list.add("260");
        list.add("270");
        list.add("280");
        list.add("290");
        list.add("300");

        String random = list.get(new Random().nextInt(list.size()));

        return random;

    }

    public void ScrollToText(String text) {

        driver.findElementByAndroidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView("
                + "new UiSelector().textContains(\"" + text + "\"));");

    }

    public void ScrollToElement(AndroidElement element) {

        String elementText = element.getText();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(" + elementText + "))");

    }

    public void ScrollDown() {

        TouchAction ts = new TouchAction(driver);
        ts.longPress(PointOption.point(730, 2200)).moveTo(PointOption.point(730, 900)).release().perform();

    }

    public void Scroll() {


    }

    public void ReportAbuseCheck(String toElement) throws FileNotFoundException {

        PostDetailsScreen PostDetails = new PostDetailsScreen(driver);
        SearchResultScreen SearchResult = new SearchResultScreen(driver);
        CustomSteps customStep = new CustomSteps();

        if (!PostDetails.ReportAbuseElement.isEmpty()) { // Check whether First post can be reported or not .. if Yes ,
            // it will go in
        } else {

            PostDetails.PostCloseButton.click();
            customStep.xpathVisibilityStep(SearchResult.SecondPost, 10);
            SearchResult.SecondPost.click();
            customStep.idVisibilityStep(PostDetails.PostTitle, 10);
            customStep.Scroll();

            if (!PostDetails.ReportAbuseElement.isEmpty()) {

            } else {

                PostDetails.PostCloseButton.click();
                customStep.xpathVisibilityStep(SearchResult.ThirdPost, 10);
                SearchResult.ThirdPost.click();
                customStep.idVisibilityStep(PostDetails.PostTitle, 10);
                customStep.Scroll();

                if (!PostDetails.ReportAbuseElement.isEmpty()) {

                } else {

                    PostDetails.PostCloseButton.click();
                    customStep.xpathVisibilityStep(SearchResult.ForthPost, 10);
                    SearchResult.ForthPost.click();
                    customStep.idVisibilityStep(PostDetails.PostTitle, 10);
                    customStep.Scroll();

                    if (!PostDetails.ReportAbuseElement.isEmpty()) {

                    } else {

                        PostDetails.PostCloseButton.click();
                        customStep.xpathVisibilityStep(SearchResult.FifthPost, 10);
                        SearchResult.FifthPost.click();
                        customStep.idVisibilityStep(PostDetails.PostTitle, 10);
                        customStep.Scroll();

                        if (!PostDetails.ReportAbuseElement.isEmpty()) {

                        } else {

                            PostDetails.PostCloseButton.click();
                            customStep.xpathVisibilityStep(SearchResult.SixthPost, 10);
                            SearchResult.SixthPost.click();
                            customStep.idVisibilityStep(PostDetails.PostTitle, 10);
                            customStep.Scroll();

                        }
                    }
                }
            }
        }

    }

    public void AddToFavoritesCheck() throws FileNotFoundException {

        PostDetailsScreen PostDetails = new PostDetailsScreen(driver);
        SearchResultScreen SearchResult = new SearchResultScreen(driver);
        CustomSteps customStep = new CustomSteps();

        if (!PostDetails.FavoriteElement.isEmpty()) { // Check whether First post can be reported or not .. if Yes ,
            // it will go in
        } else {

            PostDetails.PostCloseButton.click();
            customStep.xpathVisibilityStep(SearchResult.SecondPost, 10);
            SearchResult.SecondPost.click();
            customStep.idVisibilityStep(PostDetails.PostTitle, 10);

            if (!PostDetails.FavoriteElement.isEmpty()) {

            } else {

                PostDetails.PostCloseButton.click();
                customStep.xpathVisibilityStep(SearchResult.ThirdPost, 10);
                SearchResult.ThirdPost.click();
                customStep.idVisibilityStep(PostDetails.PostTitle, 10);

                if (!PostDetails.FavoriteElement.isEmpty()) {

                } else {

                    PostDetails.PostCloseButton.click();
                    customStep.xpathVisibilityStep(SearchResult.ForthPost, 10);
                    SearchResult.ForthPost.click();
                    customStep.idVisibilityStep(PostDetails.PostTitle, 10);

                    if (!PostDetails.FavoriteElement.isEmpty()) {

                    } else {

                        PostDetails.PostCloseButton.click();
                        customStep.xpathVisibilityStep(SearchResult.FifthPost, 10);
                        SearchResult.FifthPost.click();
                        customStep.idVisibilityStep(PostDetails.PostTitle, 10);

                        if (!PostDetails.FavoriteElement.isEmpty()) {

                        } else {

                            PostDetails.PostCloseButton.click();
                            customStep.xpathVisibilityStep(SearchResult.SixthPost, 10);
                            SearchResult.SixthPost.click();
                            customStep.idVisibilityStep(PostDetails.PostTitle, 10);

                        }
                    }
                }
            }
        }

    }

    public String GetElementText(AndroidElement element) {

        String string = element.getText();

        return string;

    }

}