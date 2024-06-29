package com.saucedemo.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @SuppressWarnings("unused")
    private WebDriver driver;

    @FindBy(xpath = "//input[contains(@placeholder,'Username')]")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[contains(@placeholder,'Password')]")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[contains(@type,'submit')]")
    private WebElement loginButton;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Metodos
    public void setUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}

