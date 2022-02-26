package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CY13_US6 {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//User navigate to Authorization page https://login2.nextbasecrm.com/
        driver.get("https://login.nextbasecrm.com");


    }


    @Test
    public void nextBaseCrm_test() {
//Enter user credentials  as hr user and click log in button
        WebElement hrUserLogin = driver.findElement(By.xpath("//input[@placeholder='Login']"));
        hrUserLogin.sendKeys("hr37@cydeo.com");


        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser");


        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();


    }

}


//        User navigate to more tab and click