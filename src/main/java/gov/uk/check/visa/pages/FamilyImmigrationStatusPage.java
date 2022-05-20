package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement Yes;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement No;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement StatusContinue;

    public void selectImmigrationStatus(String status) {

        switch (status) {
            case "Yes":
                log.info("Clicking on Yes"+ Yes.toString()+ "<br>");
                clickOnElement(Yes);
                break;
            case "No" :
                log.info("Clicking on No "+ No.toString()+ "<br>");
                clickOnElement(No);
        }
    }

    public void ClickOnStatusContinue (){
        log.info("Clicking on StatusContinue "+ StatusContinue.toString()+ "<br>");
        clickOnElement(StatusContinue);
    }
}
