package io.learn;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExecutionListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getStatus());
    }
}
