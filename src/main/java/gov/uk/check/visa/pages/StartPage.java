package gov.uk.check.visa.pages;
import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());


    public StartPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement starPagecookies;

    public void clickCookies(){
        clickOnElement(StartNowButton);
        log.info("Clicking on starPagecookies "+ starPagecookies.toString()+ "<br>");
    }

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement  StartNowButton;

   public void clickStartNow(){
       clickOnElement(StartNowButton);
       log.info("Clicking on StartNowButton"+ StartNowButton.toString()+ "<br>");
   }

}
