package com.saucedemo.tests;

import com.saucedemo.browsers.BrowserFactory;
import com.saucedemo.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginPageTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        // Create WebDriver instance using BrowserFactory for Selenium Grid
        driver = BrowserFactory.createInstance("chrome");
    }

    @Test
    public void loginTest() {
        // Navigate to login page
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();

    }

    @AfterClass
    public void teardown() {
        // Close the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }
}
