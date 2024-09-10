package io.learn;

import org.testng.annotations.Test;

public class GroupingAndPriorityTest {

    @Test(groups = {"smoke"}, priority = 1)
    public void smokeTest() {
        System.out.println("Smoke Test 1");
    }

    @Test(groups = {"regression"}, priority = 2)
    public void regressionTest() {
        System.out.println("Regression Test 1");
    }

    @Test(groups = {"smoke", "regression"}, priority = 0)
    public void smokeRegressionTest() {
        System.out.println("Smoke & Regression Test");
    }
}
