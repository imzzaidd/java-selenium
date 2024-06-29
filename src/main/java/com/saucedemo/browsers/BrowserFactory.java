package com.saucedemo.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory {

    public static WebDriver createInstance(String browserName) throws MalformedURLException {
        WebDriver driver;

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();

        // Set other browser options as needed

        // Set remote WebDriver URL
        URL gridUrl = new URL("http://selenium-hub:4444/wd/hub");
        
        // Create driver instance
        driver = new RemoteWebDriver(gridUrl, options);
        
        return driver;
    }
}
