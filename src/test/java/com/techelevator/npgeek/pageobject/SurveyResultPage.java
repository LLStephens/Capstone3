package com.techelevator.npgeek.pageobject;

import org.openqa.selenium.WebDriver;

public class SurveyResultPage {

	private WebDriver webDriver;
	
	public SurveyResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public String verifySurveyPageLanding(){
		String inputUrl = webDriver.getCurrentUrl();
		String inputUrl2 = inputUrl.substring(0,52);
		return inputUrl2;
	}
}
