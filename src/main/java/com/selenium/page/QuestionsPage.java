package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class QuestionsPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[contains(.,'Very interested')]")
    private WebElement veryIntersedButton;

    @FindBy(xpath = "//button[contains(.,'Just looking')]")
    private WebElement justLookingButton;

    @FindBy(xpath = "//button[contains(.,'1–5')]")
    private WebElement oneToFiveButton;

    @FindBy(xpath = "//button[contains(.,'6–15')]")
    private WebElement sixToFifteenButton;

    @FindBy(xpath = "//button[contains(.,'16–25')]")
    private WebElement sixteenToTwentyfifthButton;

    @FindBy(xpath = "//button[contains(.,'26–50')]")
    private WebElement twentyfifthToFiftythButton;

    @FindBy(xpath = "//button[contains(.,'50+')]")
    private WebElement aboveFifrtyButton;

    @FindBy(xpath = "//button[contains(.,'Yes')]")
    private WebElement yesButton;

    @FindBy(xpath = "//button[contains(.,'No')]")
    private WebElement noButton;

    @FindBy(xpath = "//button[contains(.,'Other')]")
    private WebElement otherButton;

    @FindBy(xpath = "//button[contains(.,'Submit results')]")
    private WebElement submitResultsButton;

    @FindBy(xpath = "(//button[contains(.,'Resend email')])[2]")
    private WebElement resendEmailButton;

    @FindBy(xpath = "(//li[contains(@class,'social-item')])[1]")
    private WebElement twitterElemnt;

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

    public WebElement getTwitterElement() {
        return twitterElemnt;
    }

    public WebElement getSubmitResultsButton() {
        return submitResultsButton;
    }

    public WebElement getResendEmailButton() {
        return resendEmailButton;
    }
}
