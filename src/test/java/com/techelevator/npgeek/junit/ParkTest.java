package com.techelevator.npgeek.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.npgeek.model.Forecast;
import com.techelevator.npgeek.model.Park;

public class ParkTest {
	private Park park;
	
	@Before
	public void setup(){
		park = new Park();	
		park.setAcreage(10);
		park.setAnnualVisitorCount(100);
		park.setClimate("tundra");
		park.setElevationInFeet(1000);
		park.setEntryFee(2);
		park.setInspirationalQuote("don't fall");
		park.setInspirationalQuoteSource("socrates");
		park.setMilesOfTrail(50);
		park.setNumberOfAnimalSpecies(5);
		park.setNumberOfCampsites(25);
		park.setParkCode("OPP");
		park.setParkDescription("very nice");
		park.setParkName("outer park park");
		park.setState("Mi");
		park.setYearFounded(1999);
	}
	
	@Test
	public void getters_and_setters(){
		int acreage = park.getAcreage();
		int visitors = park.getAnnualVisitorCount();
		String climate = park.getClimate();
		int elv = park.getElevationInFeet();
		int fee = park.getEntryFee();
		String quote = park.getInspirationalQuote();
		String source = park.getInspirationalQuoteSource();
		double miles = park.getMilesOfTrail();
		int animals = park.getNumberOfAnimalSpecies();
		int sites = park.getNumberOfCampsites();
		String code = park.getParkCode();
		String desc = park.getParkDescription();
		String name = park.getParkName();
		String state = park.getState();
		int year = park.getYearFounded();
	
		Assert.assertEquals(10, acreage);
		Assert.assertEquals(100, visitors);
		Assert.assertEquals("tundra", climate);
		Assert.assertEquals(1000, elv);
		Assert.assertEquals(2, fee);
		Assert.assertEquals("don't fall", quote);
		Assert.assertEquals("socrates", source);
		Assert.assertEquals(50, miles, 0.0001);
		Assert.assertEquals(5, animals);
		Assert.assertEquals(25, sites);
		Assert.assertEquals("OPP", code);
		Assert.assertEquals("very nice", desc);
		Assert.assertEquals("outer park park", name);
		Assert.assertEquals("Mi", state);
		Assert.assertEquals(1999, year);
	}
		
}
