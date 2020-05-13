package helpers;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


public class Listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        ITestListener.super.onTestFailure(result);

        String s = result.getName();
        try {
            Screenshots.getScreenshot(s);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        ITestListener.super.onTestStart(result);
    }

}
