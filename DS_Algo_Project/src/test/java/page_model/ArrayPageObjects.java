package page_model;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;

import org.openqa.selenium.By;

import stepdefinitions.Common_Step_Def;

public class ArrayPageObjects {
	
private static ArrayPageObjects arrayPageObjects;
	
	private ArrayPageObjects() {};
	
	public static ArrayPageObjects getInstance() {
		if(arrayPageObjects==null) {
			arrayPageObjects= new ArrayPageObjects();
		}
		return arrayPageObjects;
		
	}

   
   
	By arraysinpythonBtn    = By.xpath("//a[@href='arrays-in-python']");
	By tryhereBtn           = By.partialLinkText("Try here");
	By editorbox            = By.xpath("//textarea[@tabindex='0']");
	By runBtn               = By.xpath("//button[@type='button']");
	By console              = By.xpath("//pre[@id='output']");
	By arraysusinglist      = By.xpath("//a[contains(text(),'Arrays Using List')]");
	By basic_link           = By.xpath("//a[contains(text(),'Basic Operations in Lists')]");
    By applications_array   = By.xpath("//a[contains(text(),'Applications of Array')]");
	By practice_questions   = By.xpath("//a[contains(text(),'Practice Questions')]");
	By search_the_Array     = By.xpath("//a[contains(text(),'Search the array')]");
	By submitBtn            = By.xpath("//input[@value='Submit']");
	By max_consecutive_Ones = By.xpath("//a[contains(text(),'Max Consecutive Ones')]");
	By find_Numbers         = By.xpath("//a[contains(text(),'Find Numbers with Even Number of Digits')]");
	By squares_sortedArray  = By.xpath("//a[contains(text(),'Squares of  a Sorted Array')]");
	
	
	public void clickArraysinPythonBtn() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(arraysinpythonBtn).click();
	}
	
   public void clickTryhere() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(tryhereBtn).click();
	}
   public void enterCode(String code) throws InterruptedException {
		System.out.println("inside invalid error code");
		Common_Step_Def.driver.findElement(editorbox).sendKeys(code);
		System.out.println("after sleep");
	}
   public void clickRunBtn() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(runBtn).click();
		
	}
   public void enterValidCode(String validCode) throws InterruptedException {
	   
	    Common_Step_Def.driver.findElement(editorbox).sendKeys(validCode);
		
	}
   
   public String getOutput() throws InterruptedException {
		
	    return Common_Step_Def.driver.findElement(console).getText().trim();
	}
   public void clickArraysUsingList() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(arraysusinglist).click();
	}
   public void clickBasicOperationsinLists() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(basic_link).click();
	}
   public void clickApplicationsOfArray() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(applications_array).click();
	}
   public void clickPracticeQuestions() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(practice_questions).click();
	}
   public void clicksearchTheArray() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(search_the_Array).click();
	}
   public void clickmaxConsecutiveOnes() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(max_consecutive_Ones).click();
	}
   public void clickfindNumbers() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(find_Numbers).click();
	}
   public void clicksquaresOfSortedArray() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(squares_sortedArray).click();
	}
   public void clickSubmitBtn() throws InterruptedException {
		
		Common_Step_Def.driver.findElement(submitBtn).click();
	}
  
   
   
}

