package io.learn;

import org.testng.annotations.*;

public class BeforeAfterSuiteTest {

    @BeforeSuite
    public void setUp() {
        System.out.println("BeforeSuite: This method will be executed before any TEST method execution in entire suite");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test-1: This is the actual TEST method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test-2: This is the actual TEST method2");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("AfterSuite: This method will be executed after all TEST method execution in entire suite");
    }
}
