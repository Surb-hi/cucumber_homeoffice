package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;

public class visacheck {
    @Given("^I am in homepage of homeoffice website$")
    public void iAmInHomepageOfHomeofficeWebsite() {

    }

    @When("^I Click on start button$")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();

    }

    @And("^I Select a Nationality \"([^\"]*)\" australia$")
    public void iSelectANationalityAustralia(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);

    }

    @And("^I Click on Continue button for australia$")
    public void iClickOnContinueButtonForAustralia() {
        new SelectNationalityPage().ClickOnNationalityContinue();
    }

    @And("^I Click on Continue button for toursim$")
    public void iClickOnContinueButtonForToursim() {
        new ReasonForTravelPage().ClickOnReasonContinue();
    }

    @Then("^I verify result 'You will not need a visa to come to the UK'$")
    public void iVerifyResultYouWillNotNeedAVisaToComeToTheUK() {
        new ResultPage().confirmResultMessage("You will not need a visa to come to the UK");
    }

    @And("^I select a nationality chile \"([^\"]*)\"$")
    public void iSelectANationalityChile(String nationality2) {
        new SelectNationalityPage().selectNationality(nationality2);
    }

    @And("^I click on Continue button for Chile$")
    public void iClickOnContinueButtonForChile() {
        new SelectNationalityPage().ClickOnNationalityContinue();
    }


    @And("^I click on Continue button for Work, academic visit or business$")
    public void iClickOnContinueButtonForWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().ClickOnReasonContinue();
    }

    @And("^I click on Continue button for longer than (\\d+) months$")
    public void iClickOnContinueButtonForLongerThanMonths() throws InterruptedException {
        Thread.sleep(1000);
        new DurationOfStayPage().ClickOndDurationContinue();
    }

    @And("^I select have planning to work for \"([^\"]*)\"$")
    public void iSelectHavePlanningToWorkFor(String planning) {
        new WorkTypePage().selectworkPlne(planning);
    }

    @And("^I click on Continue button for Health and care professional$")
    public void iClickOnContinueButtonForHealthAndCareProfessional() {
        new WorkTypePage().ClickOnWorkPlanningContinue();
    }

    @Then("^I verify result 'You need a visa to work in health and care'$")
    public void iVerifyResultYouNeedAVisaToWorkInHealthAndCare() {
        new ResultPage().confirmResultMessage("You need a visa to work in health and care");
    }

    @And("^I Select a Nationality colombia \"([^\"]*)\"$")
    public void iSelectANationalityColombia(String nationality2) {
        new SelectNationalityPage().selectNationality(nationality2);
    }

    @And("^I Click on Continue button for Colombia$")
    public void iClickOnContinueButtonForColombia() {
        new SelectNationalityPage().ClickOnNationalityContinue();
    }


    @And("^I Click on Continue button for Join partner or family for a long stay$")
    public void iClickOnContinueButtonForJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().ClickOnReasonContinue();
    }

    @And("^I Select state My partner of family member have uk immigration status \"([^\"]*)\"$")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String status) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }

    @And("^I Click on Continue button for immigration status$")
    public void iClickOnContinueButtonForImmigrationStatus() {
        new FamilyImmigrationStatusPage().ClickOnStatusContinue();
    }


    @And("^I Select reason 'Tourism' tourism$")
    public void iSelectReasonTourismTourism() {
        new ReasonForTravelPage().reasonForTravelling1("Tourism");
    }

    @And("^I select reason wavb 'Work, academic visit or business'$")
    public void iSelectReasonWavbWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().reasonForTravelling1("Work,academic visit or business");
    }

    @And("^I Select reason jpf'Join partner or family for a long stay'$")
    public void iSelectReasonJpfJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().reasonForTravelling1("Join partner or family for a long stay");
    }

    @Then("^I verify result 'You'll need a visa to join your family or partner in the Uk'$")
    public void iVerifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUk() {
        new ResultPage().confirmResultMessage("You’ll need a visa to join your family or partner in the UK");

    }

    
    @And("^I select have planning to work for 'Health and care professional'$")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectworkPlne("Health and care professional");
    }

    @And("^I select  intendent to stay for 'longer than six months' six month$")
    public void iSelectIntendentToStayForLongerThanSixMonthsSixMonth() {
        new DurationOfStayPage().selectLengthOfStay("longer than 6 months");

    }
}
