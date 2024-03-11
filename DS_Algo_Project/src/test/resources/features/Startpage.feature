@startpage
Feature: Getting Started to DS_Algo Portal

  Scenario: This test is to verify the GetStarted button
    Given user is on the get started page
    When  user clicks the get start button
    Then user should see the homepage
    
   Scenario: User tries to click on something on homepage
   	Given user is on the home page
   	When user clicks on the get started button in data Structure introduction
   	Then you are not logged in statement is displayed
