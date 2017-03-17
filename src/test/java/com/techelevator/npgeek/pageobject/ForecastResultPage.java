package com.techelevator.npgeek.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForecastResultPage {

	private WebDriver webDriver;
	
	public ForecastResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public boolean verifyParkCode(String parkCode){
		WebElement outputParkCode =webDriver.findElement(By.id("parkCode"));
		return outputParkCode.getText().equals(parkCode);
	}
	
	public boolean verifyFiveDayForecastValue(String value){
		WebElement outputValue = webDriver.findElement(By.id("value"));
		return outputValue.getText().equals(value);
	}

	public boolean verifyLow(String low){
		WebElement outputLow = webDriver.findElement(By.id("low"));
		return outputLow.getText().equals(low);
	}
	
	public boolean verifyHigh(String high){
		WebElement outputHigh = webDriver.findElement(By.id("high"));
		return outputHigh.getText().equals(high);
	}
	
	public boolean verifyCLow(String clow){
		WebElement outputCLow = webDriver.findElement(By.id("clow"));
		return outputCLow.getText().equals(clow);
	}
	
	public boolean verifyCHigh(String chigh){
		WebElement outputCHigh = webDriver.findElement(By.id("chigh"));
		return outputCHigh.getText().equals(chigh);
	}
	
	public boolean verifyForecast(String forecast){
		WebElement outputForecast=webDriver.findElement(By.id("forecast"));
		return outputForecast.getText().equals(forecast);	
	}
	
	public boolean verifyRec1(String rec1){
		WebElement outputRec1=webDriver.findElement(By.id("rec1"));
		return outputRec1.getText().equals(rec1);	
	}
	
	public boolean verifyRec2(String rec2){
		WebElement outputRec2=webDriver.findElement(By.id("rec2"));
		return outputRec2.getText().equals(rec2);	
	}
	
	public String verifyForecastResultPageLanding(){
		return "http://localhost:8080/m3-java-capstone/forecastDetail?parkCode=CVNP";
	}
}
