package io.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestNGTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
         driver = new ChromeDriver();
    }
    
    @Test
    public void testTitle() {
        driver.get("https://the-internet.herokuapp.com/");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        Assert.assertEquals(title, "The Internet");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
