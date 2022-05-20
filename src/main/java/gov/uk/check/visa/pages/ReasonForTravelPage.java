package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement Tourism;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement Workacademicvisitorbusiness;
    @FindBy(xpath = "//input[@id='rTesponse4']")
    WebElement Joinpartnerorfamilyforalongstay;
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElement reasonForTravellingContinueButton;

    public void reasonForTravelling1(String reason){
        if(reason=="Tourism"){
            clickOnElement(Tourism);
            log.info("Clicking on Tourism "+ Tourism.toString()+ "<br>");
        }else if(reason=="Work,academic visit or business"){
            clickOnElement(Workacademicvisitorbusiness);
            log.info("Clicking on Work,academic visit or business"+ Workacademicvisitorbusiness.toString()+ "<br>");
        }else if(reason=="Join partner or family for a long stay"){
            clickOnElement(Joinpartnerorfamilyforalongstay);
            log.info("Clicking on Join partner or family for a long stay"+ Joinpartnerorfamilyforalongstay.toString()+ "<br>");
        }
    }

    public void ClickOnReasonContinue (){
        clickOnElement(reasonForTravellingContinueButton);
        log.info("Clicking on reason For Travelling Continue Button "+ reasonForTravellingContinueButton.toString()+ "<br>");
    }
}
