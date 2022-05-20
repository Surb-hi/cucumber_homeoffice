Feature: : Home office visa check
  As user I want to test Home office visa check functionality

  Scenario:Verify that an australian coming to uK for tourism.
    Given  I am in homepage of homeoffice website
    When   I Click on start button
    And    I Select a Nationality "Australia" australia
    And    I Click on Continue button for australia
    And    I Select reason 'Tourism' tourism
    And    I Click on Continue button for toursim
    Then   I verify result 'You will not need a visa to come to the UK'

  Scenario:Verify that a chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given   I am in homepage of homeoffice website
    When    I Click on start button
    And     I select a nationality chile "Chile"
    And     I click on Continue button for Chile
    And     I select reason wavb 'Work, academic visit or business'
    And     I click on Continue button for Work, academic visit or business
    And     I select  intendent to stay for 'longer than six months' six month
    And     I click on Continue button for longer than 6 months
    And     I select have planning to work for 'Health and care professional'
    And     I click on Continue button for Health and care professional
    Then    I verify result 'You need a visa to work in health and care'
  @smoke
  Scenario:Verify a columbian national coming to the uk to join a partner for a long stay they do have an article 10Or20 Card
    Given  I am in homepage of homeoffice website
    When   I Click on start button
    And    I Select a Nationality colombia "Colombia"
    And    I Click on Continue button for Colombia
    And    I Select reason jpf'Join partner or family for a long stay'
    And    I Click on Continue button for Join partner or family for a long stay
    And    I Select state My partner of family member have uk immigration status "yes"
    And    I Click on Continue button for immigration status
    Then   I verify result 'You'll need a visa to join your family or partner in the Uk'