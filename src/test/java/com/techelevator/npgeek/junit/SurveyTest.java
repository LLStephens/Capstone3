package com.techelevator.npgeek.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.npgeek.model.Forecast;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.Survey;

public class SurveyTest {
	private Survey survey;
	
	@Before
	public void setup(){
		survey = new Survey();
		survey.setActivityLevel("inactive");
		survey.setEmailAddress("bieberFan@aol.com");
		survey.setState("OH");
		survey.setParkCode("OPP");
		
	}
	
	@Test
	public void getters_and_setters(){
		String level = survey.getActivityLevel();
		String email = survey.getEmailAddress();
		String state = survey.getState();
		String code = survey.getParkCode();
	
		
		Assert.assertEquals("inactive", level);
		Assert.assertEquals("bieberFan@aol.com", email);
		Assert.assertEquals("OH", state);
		Assert.assertEquals("OPP", code);

	}
		
}
