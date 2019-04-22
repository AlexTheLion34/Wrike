package com.selenium;

import com.selenium.config.SeleniumConfig;
import com.selenium.page.MainPage;
import com.selenium.page.QuestionsPage;
import org.openqa.selenium.WebDriver;

public class Application {

    private WebDriver driver;
    private MainPage mainPage;
    public QuestionsPage questionsPage;

    public Application() {
        driver = new SeleniumConfig().getDriver();
        driver.get("https://www.wrike.com");
        mainPage = new MainPage(driver);
    }

    public void getStartedForFree() {
        mainPage.clickGetStartedForFree();
    }

    public void fillEmail() {
        mainPage.fillEmail();
    }

    public void createAccountAndMoveToNextPage() {
        questionsPage = mainPage.clickCreateAccount();
    }

    public void fillQuestions() {
        questionsPage.fillProfile();
    }

    public void resendEmail() {
        questionsPage.resendEmail();
    }

    public String getCurrentTitle() {
        return driver.getTitle();
    }

    public boolean checkQuestionsFormSubmission() {
        return !questionsPage.isSubmitResultsButtonVisible();
    }

    public boolean checkResendingEmail() {
        return !questionsPage.isResendEmailButtonVisible();
    }

    public void sleepDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeBrowser() {
        driver.close();
    }
}
