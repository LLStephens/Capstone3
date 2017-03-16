package com.techelevator.npgeek.cukes;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.pageobject.HomePage;
import com.techelevator.npgeek.pageobject.SurveyInputPage;
import com.techelevator.npgeek.pageobject.SurveyResultPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class SurveyInputSteps {
		
	private WebDriver webDriver;
	private HomePage homePage;
	private SurveyInputPage surveyInput;
	private SurveyResultPage surveyResult;
	
	
	@Autowired
	public SurveyInputSteps(WebDriver webDriver){
		this.webDriver = webDriver;
		homePage = new HomePage(webDriver);
		surveyInput = new SurveyInputPage(webDriver);
		surveyResult = new SurveyResultPage(webDriver);			
	}
	
	@Given("^I am on the survey input page$")
	public void goToSurveyInputPage()throws Throwable{
		webDriver.get("http://localhost:8080/m3-java-capstone/");
		homePage.clickSurveyInputPage();
	}
	
	@Given("^I choose the park (.*)$")
	public void selectPark(String park) throws Throwable{
		surveyInput.selectPark(park);		
	}
	
	@Given("^I enter the email address (.*)$")
	public void inputEmail(String email) throws Throwable{
		surveyInput.inputEmail(email);		
	}
	
	@Given("^I enter the state (.*)$")
	public void inputState(String state) throws Throwable{
		surveyInput.inputState(state);	
	}
	
	@Given("^I choose the activity level (.*)$")
	public void selectActivityLevel(String activityLevel) throws Throwable{
		surveyInput.selectActivityLevel(activityLevel);	
	}
	
	@When("^I submit the survey$")
	public void submitSurvey() throws Throwable{
		surveyInput.submit();
	}
	
	@Then("^The Url base should be (.*)$")
	public void verifyResultPageLanding(String curl) throws Throwable{
		surveyResult.verifySurveyPageLanding();
	}
	
}

