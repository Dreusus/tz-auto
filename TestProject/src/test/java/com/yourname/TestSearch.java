package com.yourname;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.yourname.pages.Auth;
import com.yourname.pages.Main;

public class TestSearch {

  @Test
  public void testSearchFunctionality() {
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://anatoliinovikov.ru/projects/hotels/");

    // Авторизация
    Auth authPage = new Auth(driver);
    Main mainPage = authPage.login("qwerty@qwerty.ru", "12345678");

    // Поиск Логации
    mainPage.searchForLocation("Санкт-Петербург");

    // Проверка результатов выдачи
    Assert.assertEquals("Санкт-Петербург", mainPage.getDisplayedCity());

    driver.quit();
  }
}
