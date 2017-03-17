package com.techelevator.npgeek.cukes;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.pageobject.ForecastResultPage;
import com.techelevator.npgeek.pageobject.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class ParkForecastCelsiusSteps {
	private WebDriver webDriver;
	private HomePage homePage;
	private ForecastResultPage forecastResult;

	@Autowired
	public ParkForecastCelsiusSteps(WebDriver webDriver) {
		this.webDriver = webDriver;
		homePage = new HomePage(webDriver);
		forecastResult = new ForecastResultPage(webDriver);
	}
	
	@Given("^I am on the forecast page for Cuyahoga Valley National Park$")
	public void loadParkDetailPage() throws Throwable{
		webDriver.get("http://localhost:8080/m3-java-capstone/forecastDetail?parkCode=CVNP");
	}
	
	@When("^I click on the celsius button$")
	public void loadCelsiusPage() throws Throwable{
		homePage.clickCelsiusButton();
	}
	
	@Then("^I am taken to (.*)$")
	public void readForecastPage(String curl) throws Throwable{
		forecastResult.verifyForecastCelsiusPageLanding();
	}
	
	@Then ("^the celsius low is (.*)$")
	public void verifyLow(String low) throws Throwable{
		forecastResult.verifyCLow(low);
	}
	
	@Then ("^the celsius high is (.*)$")
	public void verifyHigh(String high) throws Throwable{
		forecastResult.verifyCHigh(high);
	}
	
}
