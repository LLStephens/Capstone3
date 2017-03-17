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
public class ParkForecastSteps {
	private WebDriver webDriver;
	private HomePage homePage;
	private ForecastResultPage forecastResult;

	@Autowired
	public ParkForecastSteps(WebDriver webDriver) {
		this.webDriver = webDriver;
		homePage = new HomePage(webDriver);
		forecastResult = new ForecastResultPage(webDriver);
	}
	
	@Given("^I am on the Cuyahoga Valley National Park page$")
	public void loadParkDetailPage() throws Throwable{
		webDriver.get("http://localhost:8080/m3-java-capstone/parkDetail?parkCode=CVNP");
	}
	
	@When("^I click the forecast link$")
	public void loadForecastPage() throws Throwable{
		homePage.clickForecastLink();
	}
	
	@Then("^I land on (.*)$")
	public void readForecastPage(String curl) throws Throwable{
		forecastResult.verifyForecastResultPageLanding(curl);
	}
	
	@Then ("^the forecast value is (.*)$")
	public void verifyForecastValue(String dayNum) throws Throwable{
		forecastResult.verifyFiveDayForecastValue(dayNum);
	}
	
	@Then ("^the low is (.*)$")
	public void verifyLow(String low) throws Throwable{
		forecastResult.verifyLow(low);
	}
	
	@Then ("^the high is (.*)$")
	public void verifyHigh(String high) throws Throwable{
		forecastResult.verifyHigh(high);
	}
	
	@Then ("^forecast is (.*)$")
	public void verifyForecast(String forecast) throws Throwable{
		forecastResult.verifyForecast(forecast);
	}
	@Then ("^the first recommendation is (.*)$")
	public void verifyFirstRecommendation(String rec1) throws Throwable{
		forecastResult.verifyRec1(rec1);
	}
	
	@Then ("^the second recommendation is (.*)$")
	public void verifySecondRecommendation(String rec2) throws Throwable{
		forecastResult.verifyRec1(rec2);
	}
}
