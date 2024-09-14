package io.learn;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners( {ExecutionListener.class} )
public class ListenerTest {

    @Test
    public void testMethod1() {
        System.out.println("This is the actual TEST method1");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testMethod2() {
        System.out.println("This is the actual TEST method2");
        Assert.assertEquals(1, 2);
    }
}
