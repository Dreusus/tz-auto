package com.yourname.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
    private WebDriver driver;

    private By locationField = By.name("location");
    private By searchButton = By.cssSelector(".MyButton_button__q4IIh");
    private By hostelCity = By.cssSelector(".HotelBlock_city__J4HJG");

    public Main(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForLocation(String location) {
        driver.findElement(locationField).clear();
        driver.findElement(locationField).sendKeys(location);
        driver.findElement(searchButton).click();
    }

    public String getDisplayedCity() {
        return driver.findElement(hostelCity).getText();
    }
}
