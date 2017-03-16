package com.techelevator.npgeek.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SurveyInputPage {

	private WebDriver webDriver;
	
	public SurveyInputPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void selectPark(String parkName){
		WebElement selectElement = webDriver.findElement(By.id("park"));
		Select select = new Select(selectElement);
		select.selectByVisibleText(parkName);
	}
	
	public void inputEmail(String email){
		WebElement emailInput = webDriver.findElement(By.name("emailAddress"));
		emailInput.sendKeys(email);
	}
	
	public void inputState(String state){
		WebElement stateInput = webDriver.findElement(By.name("state"));
		stateInput.sendKeys(state);
	}
	
	public void selectActivityLevel(String activityLevel){
		WebElement selectElement = webDriver.findElement(By.id("activity"));
		Select select = new Select(selectElement);
		select.selectByVisibleText(activityLevel);
	}
	
	public SurveyResultPage submit(){
		WebElement submitButton=webDriver.findElement(By.id("submit"));
		submitButton.click();
		return new SurveyResultPage(webDriver);
	}
	
	
}
