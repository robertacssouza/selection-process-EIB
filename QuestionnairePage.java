package com.ctg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class QuestionnairePage {
    private WebDriver driver;
    private Random random;

    // Locators
    private By radioButtonGeneral_NonEUOperationNo = By.id("metrobarView:operationIQDatatable:0:complianceIQWebPresenter:0:questionResponseRadioButton:0");
    private By radioButtonGeneral_NonEUOperationYes = By.id("metrobarView:operationIQDatatable:0:complianceIQWebPresenter:0:questionResponseRadioButton:1");
    private By radioButtonGeneral_OperationInvolvingNo = By.id("metrobarView:operationIQDatatable:0:complianceIQWebPresenter:1:questionResponseRadioButton:0");
    private By radioButtonGeneral_OperationInvolvingYes = By.id("metrobarView:operationIQDatatable:0:complianceIQWebPresenter:1:questionResponseRadioButton:1");
    private By radioButtonGeneral_TheOperationRequiresApprovalByTheNewProductCommitteeNo = By.id("metrobarView:operationIQDatatable:0:complianceIQWebPresenter:2:questionResponseRadioButton:0");
    private By radioButtonGeneral_TheOperationRequiresApprovalByTheNewProductCommitteeYes = By.id("metrobarView:operationIQDatatable:0:complianceIQWebPresenter:2:questionResponseRadioButton:1");
    private By radioButtonMLFTRiskFactors_NCJLocationOwnershipOrControlLinkNo = By.id("metrobarView:operationIQDatatable:1:complianceIQWebPresenter:0:questionResponseRadioButton:0");
    private By radioButtonMLFTRiskFactors_NCJLocationOwnershipOrControlLinkYes = By.id("metrobarView:operationIQDatatable:1:complianceIQWebPresenter:0:questionResponseRadioButton:1");
    private By radioButtonHighRiskCrossBorderOperationNo = By.id("metrobarView:operationIQDatatable:1:complianceIQWebPresenter:1:questionResponseRadioButton:0");
    private By radioButtonHighRiskCrossBorderOperationYes = By.id("metrobarView:operationIQDatatable:1:complianceIQWebPresenter:1:questionResponseRadioButton:1");
    
    // TODO defined other fields that is missing in the HTML page
    private By radioButtonIndicationThatTheNCJOperationNo = By.id("metrobarView:operationIQDatatable:1:complianceIQWebPresenter:6:questionResponseRadioButton:0");
    private By radioButtonIndicationThatTheNCJOperationYes = By.id("metrobarView:operationIQDatatable:1:complianceIQWebPresenter:6:questionResponseRadioButton:1");
    public By comboBox = By.id("lgi_operationCalendarDtoOperationCalendarEventList103List:0:lgi_genericCalendarEventDtoEventType471");
    private By comboBoxOptions = By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-allui-helper-reset']/li");
    
    
    // Constructor
    public QuestionnairePage(WebDriver driver) {
        this.driver = driver;
        this.random = new Random();
    }

    // Page Actions
    public void FillTheOperationIQ() {
        selectRandomRadioButton(radioButtonGeneral_NonEUOperationNo, radioButtonGeneral_NonEUOperationYes);
        selectRandomRadioButton(radioButtonGeneral_OperationInvolvingNo, radioButtonGeneral_OperationInvolvingYes);
        selectRandomRadioButton(radioButtonGeneral_TheOperationRequiresApprovalByTheNewProductCommitteeNo, radioButtonGeneral_TheOperationRequiresApprovalByTheNewProductCommitteeYes);
        selectRandomRadioButton(radioButtonMLFTRiskFactors_NCJLocationOwnershipOrControlLinkNo, radioButtonMLFTRiskFactors_NCJLocationOwnershipOrControlLinkYes);
        selectRandomRadioButton(radioButtonHighRiskCrossBorderOperationNo, radioButtonHighRiskCrossBorderOperationYes);
        selectRandomRadioButton(radioButtonIndicationThatTheNCJOperationNo, radioButtonIndicationThatTheNCJOperationYes);
    }

    private void selectRandomRadioButton(By option1, By option2) {
        boolean selectFirstOption = random.nextBoolean();
        WebElement radioButtonToSelect = driver.findElement(selectFirstOption ? option1 : option2);
        radioButtonToSelect.click();
    }
    
    
    public void selectComboBoxValue(String value) {
        // Wait until the combo box is visible and clickable
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement comboBoxElement = wait.until(ExpectedConditions.elementToBeClickable(comboBox));
        
        // Click the combo box to show the options
        comboBoxElement.click();

        // Wait until the options are visible
        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(comboBoxOptions));
        
        // Iterate through the options to find the one with the specified value
        for (WebElement option : options) {
            if (option.getAttribute("data-item-label").equals(value)) {
                option.click();
                return;  // Exit the method once the desired option is clicked
            }
        }
        
        // Optionally, throw an exception if the value is not found
        throw new IllegalArgumentException("Value not found in combo box: " + value);
    }
    
}
