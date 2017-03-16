package com.techelevator.npgeek.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.npgeek.model.Forecast;

public class ForecastTest {
	private Forecast forecast;
	
	@Before
	public void setup(){
		forecast = new Forecast();
		forecast.setFiveDayForecastValue(5);
		forecast.setForecast("rainy");
		forecast.setLow(10);
		forecast.setHigh(100);
		forecast.setParkCode("OPP");
	}
	
	@Test
	public void getters_and_setters(){
		int value = forecast.getFiveDayForecastValue();
		String fcast = forecast.getForecast();
		int high = forecast.getHigh();
		int low = forecast.getLow();
		String code = forecast.getParkCode();
	
		Assert.assertEquals(5, value);
		Assert.assertEquals("rainy", fcast);
		Assert.assertEquals(10, low);
		Assert.assertEquals(100, high);
		Assert.assertEquals("OPP", code);
	}
}
