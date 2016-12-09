package com.task8.screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.File;

public class PhantomTest {
/*
    private WebDriver driver =  new PhantomJSDriver();
    private static String fileName = "src\\main\\resources\\image2.png";
    private String url = "https://192.168.100.26/";
    private String username = "AnastasiaShumskaya";
    private String password = "1";

    @BeforeMethod
    public void setUp() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearsDown() {

        driver.close();
    }
    @Test
    public void loginPhantomJsTest() throws IOException {

        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.id("Username")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("SubmitButton")).click();

        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile1, new File(fileName));
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(fileName));
        System.out.println(driver.getTitle() + "  Title is");

        Assert.assertTrue(driver.getTitle().toLowerCase().contains("home"));
    }*/
}

