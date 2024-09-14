package io.learn;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelExample2Test {

    long startTime;
    long endTime;

    @BeforeSuite
    public void beforeSuite() {
        startTime = System.currentTimeMillis(); // Record the start time
    }

    @AfterSuite
    public void afterSuite() {
        endTime = System.currentTimeMillis(); // Record the end time
        long duration = endTime - startTime;
        System.out.println("Total execution time (ms): " + duration);
    }

    @Test
    public void testMethod1() throws InterruptedException {
        System.out.println("This is the actual TEST method1");
        this.getThreadDetails();
        Thread.sleep(2000);
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
    public void testMethod4() throws InterruptedException {
        System.out.println("This is the actual TEST method4");
        this.getThreadDetails();
        Thread.sleep(2000);
    }

    private void getThreadDetails() {
        Thread currentThread = Thread.currentThread();

        // Print thread details
        System.out.println("Current thread: " + currentThread);
        System.out.println("Thread Name: " + currentThread.getName());
    }
}
