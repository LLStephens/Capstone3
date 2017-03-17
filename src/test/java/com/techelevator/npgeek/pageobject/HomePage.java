package com.techelevator.npgeek.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver webDriver;
	
	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public SurveyInputPage clickSurveyInputPage(){
		WebElement link = webDriver.findElement(By.linkText("Take Survey"));
		link.click();
		return new SurveyInputPage(webDriver);
	}
	
	public ParkDetailResultPage clickParkDetailPictureLink(){
		WebElement link = webDriver.findElement(By.id("parkDetailLinkPicture"));
		link.click();
		return new ParkDetailResultPage (webDriver);
	}
	
	public ParkDetailResultPage clickParkDetailNameLink(String parkName){
		WebElement link = webDriver.findElement(By.linkText(parkName));
		link.click();
		return new ParkDetailResultPage (webDriver);
	}
	
	public ForecastResultPage clickForecastLink(){
		WebElement link = webDriver.findElement(By.id("forecastLink"));
		link.click();
		return new ForecastResultPage(webDriver);
		
	}
	
	public ForecastResultPage clickCelsiusButton(){
		WebElement link = webDriver.findElement(By.id("button"));
		link.click();
		return new ForecastResultPage(webDriver);
	}
	
}
