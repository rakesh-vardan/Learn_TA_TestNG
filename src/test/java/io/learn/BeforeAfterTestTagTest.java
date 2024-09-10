package io.learn;

import org.testng.annotations.*;

public class BeforeAfterTestTagTest {

    @BeforeTest
    public void setUp() {
        System.out.println("BeforeTest: This method will be executed before any TEST method execution in each test section");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test-1: This is the actual TEST method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test-2: This is the actual TEST method2");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("AfterTest: This method will be executed after all TEST method execution in each test section");
    }
}
