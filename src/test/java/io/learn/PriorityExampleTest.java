package io.learn;

import org.testng.annotations.Test;

public class PriorityExampleTest {

    @Test(priority = 1)
    public void a() {
        System.out.println("Method: a with priority");
    }

    @Test(priority = 2)
    public void b() {
        System.out.println("Method: b with priority");
    }

    @Test(priority = 0)
    public void c() {
        System.out.println("Method: c with priority");
    }
}
