package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthandcareprofessional;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement digitaltechnologyprofessional;
    @FindBy(xpath = "//input[@id='response-2']")

    WebElement academicorresearcher;


    @FindBy(xpath = "//input[@id='response-3']")
    WebElement workinartsorculture;

    @FindBy(xpath = "//input[@id='response-4']")
    WebElement professionalsportsperson;
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousworker;
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement Iwanttostartabusiness;

    public void selectworkPlne(String workPlne) {
        switch (workPlne) {
            case "Health and care professional":
                log.info("Clicking on health and care professional" + healthandcareprofessional.toString() + "<br>");
                clickOnElement(healthandcareprofessional);
                break;
            case "Digital technology professional":
            log.info("Clicking on digital technology professional " + digitaltechnologyprofessional.toString() + "<br>");
                clickOnElement(digitaltechnologyprofessional);
                break;
            case "Academic or researcher":
                log.info("Clicking on Academic or researcher" + academicorresearcher.toString() + "<br>");
                clickOnElement(academicorresearcher);
                break;
            case "Work in arts or culture":
                clickOnElement(workinartsorculture);
                log.info("Clicking on Work in arts or culture " + workinartsorculture.toString() + "<br>");
                break;
            case "Professional sports person":
                log.info("Clicking on Professional sports person " + professionalsportsperson.toString() + "<br>");
                clickOnElement(professionalsportsperson);
                break;
            case "Religious worker":
                log.info("Clicking on Religious worker " + religiousworker.toString() + "<br>");
                clickOnElement(religiousworker);
                break;
            case "Iwantto start business":
                log.info("Clicking on Iwantto start business" + Iwanttostartabusiness.toString() + "<br>");
                clickOnElement(Iwanttostartabusiness);
                break;
            case "I want to do ano ther type of jobs howmeo theri work visas":
                log.info("Clicking on I want to do ano ther type of jobs howmeo theri work visas" + iwanttodoanothertypeofjobshowmeotherworkvisas.toString() + "<br>");
                clickOnElement(iwanttodoanothertypeofjobshowmeotherworkvisas);
                break;
        }
    }
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement iwanttodoanothertypeofjobshowmeotherworkvisas;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement WorkPlanningContinue;

    public void ClickOnWorkPlanningContinue() {
        clickOnElement(WorkPlanningContinue);
        log.info("Clicking on WorkPlanningContinue" + WorkPlanningContinue.toString() + "<br>");
    }


}

