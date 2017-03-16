package com.techelevator.npgeek.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParkDetailResultPage {
	
	private WebDriver webDriver;
	
	public ParkDetailResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
		
	public boolean verifyAcreage(String acreage){
		WebElement outputAcreage =webDriver.findElement(By.id("acreage"));
		return outputAcreage.getText().equals(acreage);
	}
	
	public boolean verifyAnnualVisitiorCount(String annualVisitorCount){
		WebElement outputVisitorCount =webDriver.findElement(By.id("visitors"));
		return outputVisitorCount.getText().equals(annualVisitorCount);
	}
	
	public boolean verifyClimate(String climate){
		WebElement outputClimate = webDriver.findElement(By.id("climate"));
		return outputClimate.getText().equals(climate);
	}
	
	public boolean verifyElevation(String elevationInFeet){
		WebElement outputElevation = webDriver.findElement(By.id("elevation"));
		return outputElevation.getText().equals(elevationInFeet);
	}
	
	public boolean verifyEntryFee(String entryFee){
		WebElement outputEntryFee = webDriver.findElement(By.id("fee"));
		return outputEntryFee.getText().equals(entryFee);
	}
	
	public boolean verifyInspirationalQuote(String InspirationalQuote){
		WebElement outputQuote = webDriver.findElement(By.id("quote"));
		return outputQuote.getText().equals(InspirationalQuote);
	}
	
	public boolean verifyQuoteSource(String InspirationalQuoteSource){
		WebElement outputQuoteSource = webDriver.findElement(By.id("source"));
		return outputQuoteSource.getText().equals(InspirationalQuoteSource);
	}
	
	public boolean verifymilesOfTrail(String milesOfTrail){
		WebElement outputMiles = webDriver.findElement(By.id("miles"));
		return outputMiles.getText().equals(milesOfTrail);
	}
	
	public boolean verifynumberOfAnimalSpecies(String numberOfAnimalSpecies){
		WebElement outputspecies = webDriver.findElement(By.id("species"));
		return outputspecies.getText().equals(numberOfAnimalSpecies);
	}
	
	public boolean verifyNumberOfCampsites(String numberOfCampsites){
		WebElement outputCampsties = webDriver.findElement(By.id("campsites"));
		return outputCampsties.getText().equals(numberOfCampsites);
	}
	
	public boolean verifyParkDescription(String parkDescription){
		WebElement outputDescription = webDriver.findElement(By.id("description"));
		return outputDescription.getText().equals(parkDescription);
	}
	
	public boolean verifyParkName(String parkName){
		WebElement outputParkName = webDriver.findElement(By.id("name"));
		return outputParkName.getText().equals(parkName);
	}
	
	public boolean verifyState(String state){
		WebElement outputState = webDriver.findElement(By.id("state"));
		return outputState.getText().equals(state);
	}
	
	public boolean verifyYearFounded(String yearFounded){
		WebElement outputYear = webDriver.findElement(By.id("year"));
		return outputYear.getText().equals(yearFounded);
	}
		
}
