package io.learn;

import org.testng.annotations.Test;

public class ParallelExampleTest {

    @Test
    public void testMethod1() {
        System.out.println("This is the actual TEST method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("This is the actual TEST method2");
    }

    @Test
    public void testMethod3() {
        System.out.println("This is the actual TEST method3");
    }

    @Test
    public void testMethod4() {
        System.out.println("This is the actual TEST method4");
    }
}
