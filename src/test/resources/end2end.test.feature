Feature: automated end to end test
  Description: The purpose of description is end to end test

  Scenario: user will go to loginPage and enter login to the dashboard page
    Given user is on Homepage
    When user clicks on login button
    And user enter userName
    And user enter password
    And user logs in
    And correct user is logged in





