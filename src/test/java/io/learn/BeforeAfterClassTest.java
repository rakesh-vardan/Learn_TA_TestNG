package io.learn;

import org.testng.annotations.*;

public class BeforeAfterClassTest {

    @BeforeClass
    public void setUp() {
        System.out.println("This method will be executed before any TEST method execution in class");
    }

    @Test
    public void testMethod1() {
        System.out.println("This is the actual TEST method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("This is the actual TEST method2");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("This method will be executed after all TEST method execution in class");
    }
}
