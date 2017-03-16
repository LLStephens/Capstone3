package com.techelevator.npgeek.cukes;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.pageobject.HomePage;
import com.techelevator.npgeek.pageobject.ParkDetailResultPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class ParkDetailSteps {

	private WebDriver webDriver;
	private HomePage homePage;
	private ParkDetailResultPage parkResult;
	
	@Autowired
	public ParkDetailSteps(WebDriver webDriver){
		this.webDriver = webDriver;
		homePage = new HomePage(webDriver);
		parkResult = new ParkDetailResultPage(webDriver);
	}
	
	@Given("^I am on the home page$")
	public void loadHomePage(){
	webDriver.get("http://localhost:8080/m3-java-capstone/");
	}
	
	@When("^I click the link for (.*)$")
	public void clickFristLink(String parkName) throws Throwable{
		homePage.clickParkDetailNameLink(parkName);
	}
	
	@Then ("^The park name is (.*)$")
	public void verifyParkName(String parkName) throws Throwable{
		parkResult.verifyParkName(parkName);
	}
	
	@Then ("^The elevation is (.*)$")
	public void verifyElevation(String elevation) throws Throwable{
		parkResult.verifyElevation(elevation);
	}
	
	@Then ("^The state is (.*)$")
	public void verifyState(String state) throws Throwable{
		parkResult.verifyState(state);
	}
	
	@Then ("^The acreage is (.*)$")
	public void verifyAcreage(String acreage) throws Throwable{
		parkResult.verifyAcreage(acreage);
	}
	
	@Then ("^The miles of trail are (.*)$")
	public void verifyMiles(String miles) throws Throwable{
		parkResult.verifymilesOfTrail(miles);
	}
	
	@Then ("^The number of campsites is (.*)$")
	public void verifyCampsites(String campsites) throws Throwable{
		parkResult.verifyNumberOfCampsites(campsites);
	}
	
	@Then ("^The climate is (.*)$")
	public void verifyClimate(String climate) throws Throwable{
		parkResult.verifyClimate(climate);
	}
	
	@Then ("^The year founded is (.*)$")
	public void verifyYearFounded(String year) throws Throwable{
		parkResult.verifyYearFounded(year);
	}
	
	@Then ("^The visitor count is (.*)$")
	public void verifyVisitorCount(String visitors) throws Throwable{
		parkResult.verifyAnnualVisitiorCount(visitors);
	}
	
	@Then ("^The inspirational quote is (.*)$")
	public void verifyQuote(String quote) throws Throwable{
		parkResult.verifyInspirationalQuote(quote);
	}
	
	@Then ("^The source of the quote is (.*)$")
	public void verifySource(String source) throws Throwable{
		parkResult.verifyQuoteSource(source);
	}
	
	@Then ("^The park description is (.*)$")
	public void verifyDescription(String description) throws Throwable{
		parkResult.verifyParkDescription(description);
	}
	
	@Then ("^The entry fee is (.*)$")
	public void verifyFee(String fee) throws Throwable{
		parkResult.verifyEntryFee(fee);
	}
	
	@Then ("^The Animal species count is (.*)$")
	public void verifySpecies(String species) throws Throwable{
		parkResult.verifynumberOfAnimalSpecies(species);
	}
}
