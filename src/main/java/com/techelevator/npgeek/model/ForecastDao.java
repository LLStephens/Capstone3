package com.techelevator.npgeek.model;

import java.util.List;

public interface ForecastDao {
	
	public List<Forecast> getAllForecast(String parkCode);

}
