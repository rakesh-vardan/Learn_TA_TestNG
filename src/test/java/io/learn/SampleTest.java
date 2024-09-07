package io.learn;

public class SampleTest {

    public static void main(String[] args) {
        // Run tests
        testAddPositive();
        testAddNegative();
    }

    public static void testAddPositive() {
        int result = Calculator.add(2, 3);
        if (result == 5) {
            System.out.println("testAddPositive PASSED");
        } else {
            System.out.println("testAddPositive FAILED: Expected 5 but got " + result);
        }
    }

    public static void testAddNegative() {
        int result = Calculator.add(2, 4);
        if (result == 5) {
            System.out.println("testAddNegative PASSED");
        } else {
            System.out.println("testAddNegative FAILED: Expected 5 but got " + result);
        }
    }
}
