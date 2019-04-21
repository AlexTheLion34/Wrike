package com.selenium.page;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/header/div[3]/div[2]/div/div/div[2]/div/form/button")
    private WebElement startForFreeButton;

    @FindBy(xpath = "//*[@id=\"modal-pro\"]/form/label[1]/input")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"modal-pro\"]/form/label[2]/button")
    private WebElement createWrikeAccountButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickGetStartedForFree() {
        startForFreeButton.click();
    }

    public void fillEmail() {
        String email = RandomStringUtils.random(8, true, false);
        emailField.sendKeys(email.toLowerCase() + "+wpt@wriketask.qaa");
    }

    public QuestionsPage clickCreateAccount() {
        createWrikeAccountButton.click();
        return new QuestionsPage(driver);
    }
}