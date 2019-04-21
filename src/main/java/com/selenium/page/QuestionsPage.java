package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    private WebElement[] interestChoices;

    private WebElement[] teamNumbers;

    private WebElement[] questions;

    QuestionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        interestChoices = new WebElement[]{veryIntersedButton, justLookingButton};
        teamNumbers = new WebElement[]{oneToFiveButton, sixToFifteenButton, sixteenToTwentyfifthButton,
                                                        twentyfifthToFiftythButton, aboveFifrtyButton};
        questions = new WebElement[]{yesButton, noButton, otherButton};
        this.driver = driver;
    }

    public void fillProfile() {
        interestChoices[(int) (Math.random() * (interestChoices.length - 1))].click();
        teamNumbers[(int) (Math.random() * (teamNumbers.length - 1))].click();
        questions[(int) (Math.random() * (questions.length - 1))].click();
        submitResultsButton.click();
    }
}
