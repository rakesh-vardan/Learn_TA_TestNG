package io.learn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

//    String userName = "rakesh";
//    String password = "12345";

    @Test
    @Parameters({ "userName", "password" })
    public void testLogin(String userName, String password) {
        System.out.println("Username is: " +userName);
        System.out.println("Password is: " +password);
    }
}
