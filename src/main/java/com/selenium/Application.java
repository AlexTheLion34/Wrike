package com.selenium;

import com.selenium.config.SeleniumConfig;
import com.selenium.page.MainPage;
import org.openqa.selenium.WebDriver;

public class Application {

    public static void main(String[] args) {
        WebDriver driver = new SeleniumConfig().getDriver();
        driver.get("https://www.wrike.com");
        MainPage page = new MainPage(driver);
        page.clickGetStartedForFree();
        page.fillEmail();
        page.clickCreateAccount().fillProfile();
    }

}
