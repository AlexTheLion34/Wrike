package com.selenium;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicationTest {

    private static Application application;

    @BeforeClass
    public static void setUp() {
        application = new Application();
    }

    @AfterClass
    public static void tearDown() {
        application.closeBrowser();
    }

    @Test
    public void testCreatingAccountAndMovingToNextPage() {
        String expectedTitle = "Thank you for choosing Wrike!";

        application.getStartedForFree();
        application.fillEmail();
        application.createAccountAndMoveToNextPage();
        application.sleepDriver();

        Assert.assertEquals(application.getCurrentTitle(), expectedTitle);
    }

    @Test
    public void testQuestionFormSubmission() {
        application.fillQuestions();
        application.sleepDriver();

        Assert.assertTrue(application.checkQuestionsFormSubmission());
    }

    @Test
    public void testResendingEmail() {
        application.resendEmail();
        application.sleepDriver();

        Assert.assertTrue(application.checkResendingEmail());
    }
}