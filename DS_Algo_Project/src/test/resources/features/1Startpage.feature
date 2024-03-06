@Startpage
Feature: Getting started to DS_Algo Portal


 Scenario: This test is to verify the GetStarted button
    Given the user is on the get started page
    When  the user clicks the get start button
    Then  the user should see the homepage

 Scenario: This test is to check if the user tries to click other than the register button
    Given the user is on the home page
    When  the user clicks on the get started button in data structures introduction
    Then  you are not logged in statement is diplayed
 
 
 