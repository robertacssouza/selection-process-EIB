package com.ctg.tests;

import com.ctg.pages.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ctgtest.com"); 
        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testSuccessfulLogin() {
        loginPage.enterEmail("xxx");
        loginPage.enterPassword("yyy");
        loginPage.clickLogin();
        assertEquals("success", loginPage.getSuccessMessage());
    }

    @Test
    public void testInvalidEmailLogin() {
        loginPage.enterEmail("wrong-email");
        loginPage.enterPassword("yyy");
        loginPage.clickLogin();
        assertEquals("invalid email", loginPage.getInvalidEmailMessage());
    }

    @Test
    public void testEnterCorrectEmailLogin() {
        loginPage.enterEmail("");
        loginPage.enterPassword("yyy");
        loginPage.clickLogin();
        assertEquals("enter correct email", loginPage.getEnterCorrectEmailMessage());
    }

    @Test
    public void testIsOnLoginPage() {
        assertTrue(loginPage.isOnLoginPage());
    }
}

