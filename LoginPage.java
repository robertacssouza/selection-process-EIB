package com.ctg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By emailField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("kc-login");
    private By successMessage = By.xpath("//div[contains(text(), 'success')]");
    private By invalidEmailMessage = By.xpath("//div[contains(text(), 'invalid email')]");
    private By enterCorrectEmailMessage = By.xpath("//div[contains(text(), 'enter correct email')]");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Actions
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void	login(String email, String password) {
    	driver.findElement(emailField).sendKeys(email);
    	driver.findElement(passwordField).sendKeys(password);
    	driver.findElement(loginButton).click();
    }
    
    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    public String getInvalidEmailMessage() {
        return driver.findElement(invalidEmailMessage).getText();
    }

    public String getEnterCorrectEmailMessage() {
        return driver.findElement(enterCorrectEmailMessage).getText();
    }

    public boolean isOnLoginPage() {
        return driver.getTitle().equals("Log in to VMD-SERAPIS-01");
    }
}
