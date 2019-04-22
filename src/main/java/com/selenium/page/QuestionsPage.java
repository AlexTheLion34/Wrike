package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class QuestionsPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[1]/button")
    private WebElement veryIntersedButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[2]/button")
    private WebElement justLookingButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[1]/button")
    private WebElement oneToFiveButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[2]/button")
    private WebElement sixToFifteenButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[3]/button")
    private WebElement sixteenToTwentyfifthButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[4]/button")
    private WebElement twentyfifthToFiftythButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[5]/button")
    private WebElement aboveFifrtyButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[1]/button")
    private WebElement yesButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[2]/button")
    private WebElement noButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[3]/button")
    private WebElement otherButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/button")
    private WebElement submitResultsButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button")
    private WebElement resendEmailButton;

    private WebElement[] interestChoices;

    private WebElement[] teamNumbers;

    private WebElement[] questions;

    public QuestionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        interestChoices = new WebElement[]{veryIntersedButton, justLookingButton};
        teamNumbers = new WebElement[]{oneToFiveButton, sixToFifteenButton, sixteenToTwentyfifthButton,
                                                        twentyfifthToFiftythButton, aboveFifrtyButton};
        questions = new WebElement[]{yesButton, noButton, otherButton};
        this.driver = driver;
    }

    public void fillProfile() {
        interestChoices[new Random().nextInt(interestChoices.length)].click();
        teamNumbers[new Random().nextInt(teamNumbers.length)].click();
        questions[new Random().nextInt(questions.length - 1)].click();
        submitResultsButton.click();
    }

    public void resendEmail() {
        resendEmailButton.click();
    }

    public boolean isSubmitResultsButtonVisible() {
        return submitResultsButton.isDisplayed();
    }

    public boolean isResendEmailButtonVisible() {
        return resendEmailButton.isDisplayed();
    }
}
