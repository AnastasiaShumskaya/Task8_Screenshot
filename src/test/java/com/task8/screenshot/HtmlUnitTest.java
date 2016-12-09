package com.task8.screenshot;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HtmlUnitTest {

    private HtmlUnitDriver driver =new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
    private String url = "https://192.168.100.26/";
    private String username = "AnastasiaShumskaya";
    private String password = "1";

    @BeforeMethod
    public void setUp() {

        driver.setJavascriptEnabled(true);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearsDown() {

        driver.close();
    }

    @Test
    public void loginHtmlUnitTest() throws IOException {

        driver.get(url);

        driver.findElement(By.id("Username")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("SubmitButton")).click();

        Assert.assertTrue(driver.getTitle().toLowerCase().contains("home"));
    }
}
