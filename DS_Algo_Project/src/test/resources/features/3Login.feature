@Login
Feature: Getting Started to Signin DS_Algo Portal 
Background: DS_Algo introduction page
    Given the user is on the DS_Algo introduction page
    When the user clicks on Sign_in button
    When the user should be redirected to signin page
    Then the user must able to see "Register" link text box
  
  Scenario: DS_Algo signin page
    Given the user is on the DS_Algo signin page
    When The user clicks login button after leaving the "<username>" textbox and "<password>" textbox blank
    Then The error message "Please fill out this field." appears below Username textbox 
  
  Scenario: DS_Algo signin page
    When The user clicks login button after entering the "<username>" textbox and leaves  "<password>" textbox blank
    Then The error message "Please fill out this field." appears below Pwd textbox 
    When the user clicks login button after entering invalid username and invalid password 
    Then the user should able to see an error message "Invalid username and password".
    When The user clicks login button after entering valid username and valid password
    Then The user should land in Data Structure Home Page