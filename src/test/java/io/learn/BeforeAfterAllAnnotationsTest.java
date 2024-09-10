package io.learn;

import org.testng.annotations.*;

public class BeforeAfterAllAnnotationsTest {

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("BeforeSuite: This method will be executed before any TEST method execution in entire suite");
    }

    @BeforeTest
    public void setUpTest() {
        System.out.println("BeforeTest: This method will be executed before any TEST method execution in each test section");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("BeforeClass: This method will be executed before any TEST method execution in class");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("BeforeMethod: This method will be executed before each TEST method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test-1: This is the actual TEST method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test-2: This is the actual TEST method2");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("AfterMethod: This method will be executed after each TEST method");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("AfterClass: This method will be executed after all TEST method execution in class");
    }

    @AfterTest
    public void tearDownTest() {
        System.out.println("AfterTest: This method will be executed after all TEST method execution in each test section");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("AfterSuite: This method will be executed after all TEST method execution in entire suite");
    }
}
