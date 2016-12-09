package com.task8.screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AppTest {

    private WebDriver driver = new FirefoxDriver();

    private static String fileName = "src\\main\\resources\\image.png";
    private String url = "https://192.168.100.26/";
    private String username = "AnastasiaShumskaya";
    private String password = "1";

    @BeforeMethod
    public void setUp() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearsDown() {

        driver.close();
    }

    @Test
    public void loginSeleniumTest() throws Exception {

        try {

            driver.findElement(By.id("Username")).sendKeys(username);
            driver.findElement(By.id("Password")).sendKeys(password);
            driver.findElement(By.id("SubmitButton")).click();

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(fileName));
            Assert.assertTrue(driver.getTitle().toLowerCase().contains("home"));
        }
        catch (Exception e) {
            System.out.println("It is an exception!");
            getScreenshot();
        }
    }
    public void getScreenshot() throws Exception {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(fileName));
    }
}
