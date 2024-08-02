package com.ctg.tests;

import com.ctg.pages.LoginPage;
import com.ctg.pages.QuestionnairePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestionnaireTest {
	private WebDriver driver;
	private LoginPage loginPage;
    private QuestionnairePage questionnairePage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ctgtest.com"); 
        loginPage = new LoginPage(driver);
        loginPage.login("xxx", "yyy");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testFillTheOperationIQ() {
        questionnairePage.FillTheOperationIQ();
        
        //TODO define asserts
    }
    
    @Test
    public void testselectComboBoxEvent() {
    	questionnairePage.selectComboBoxValue("D2 approval by Advisory Committee");
    	assertEquals("D2 approval by Advisory Committee", questionnairePage.comboBox);
    }
}



