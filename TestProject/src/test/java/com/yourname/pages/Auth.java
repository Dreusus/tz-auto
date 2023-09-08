package com.yourname.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Auth {
    private WebDriver driver;


    private By emailField = By.name("login");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector(".MyButton_button__q4IIh");

    public Auth(WebDriver driver) {
        this.driver = driver;
    }

    public Main login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new Main(driver);
    }
}
