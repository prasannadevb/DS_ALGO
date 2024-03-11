
@DS_Introductionpage
Feature: Data Structure Home page - DS_Introduction
 
	 
 Scenario Outline: Home Page
   Given the user is on the DS Algo Home Page
   When the user clicks  Get Started button below the Data structures-Introduction
   Then The user should land in "Data Structures- Introduction Page" page 
   When the user clicks Time Complexity link
   Then the user should be redirected to "Time Complexity"TC page 
   When The user clicks Try Here  button of Time Complexity page
   Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
   When user adds invalid code with "<SheetName>" and rownumber <RowNumber>
   #And Click the Run Button
   Then The user should able to see an error message in alert window
   
   Examples:
    |SheetName     |   RowNumber   |
    |Python Code   |   1     |
    
    	
   
   
   Scenario Outline:
   Given the user is on the DS Algo Home Page
   When  user clicks get started on DS_introduction
   When the user clicks Time Complexity link
   When The user clicks Try Here  button of Time Complexity page
   When user adds valid python code with "<SheetName>" and rownumber <RowNumber>
   And Click the  python page run Button
   Then The user should able to see output in the console
  
    
    Examples:
    |     SheetName     |   RowNumber   |
    |     Python Code   |   0      |
    
    
    
   Scenario: Python editor
   Given The user is on the Time Complexity Data Structure Home Page
   When The user clicks Practice Questions link
   When the user will land on the practice question page
   Then The user doesn't find any practice problems and the page is blank
   
   
   
   