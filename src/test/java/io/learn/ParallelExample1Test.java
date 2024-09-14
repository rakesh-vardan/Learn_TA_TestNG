package io.learn;

import org.testng.annotations.Test;

public class ParallelExample1Test {

    @Test
    public void testMethod1() {
        System.out.println("This is the actual TEST method1");
        this.getThreadDetails();
    }

    @Test
    public void testMethod2() {
        System.out.println("This is the actual TEST method2");
        this.getThreadDetails();
    }

    @Test
    public void testMethod3() {
        System.out.println("This is the actual TEST method3");
        this.getThreadDetails();
    }

    @Test
    public void testMethod4() {
        System.out.println("This is the actual TEST method4");
        this.getThreadDetails();
    }

    private void getThreadDetails() {
        Thread currentThread = Thread.currentThread();

        // Print thread details
        System.out.println("Current thread: " + currentThread);
        System.out.println("Thread Name: " + currentThread.getName());
    }
}
