package com.techelevator.npgeek.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCForecastDao implements ForecastDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCForecastDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Forecast> getAllForecast(String parkCode) {
		String sqlGetAllForecasts = "select * from weather where parkcode = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetAllForecasts, parkCode);
		List<Forecast> forecastList = new ArrayList<>();
		while(result.next()){
			Forecast forecast = new Forecast();
			forecast.setFiveDayForecastValue(result.getInt("fivedayforecastvalue"));
			forecast.setForecast(result.getString("forecast"));
			forecast.setHigh(result.getInt("high"));
			forecast.setLow(result.getInt("low"));
			forecast.setParkCode(result.getString("parkcode"));
			forecastList.add(forecast);
		}
		return forecastList;
	}

}
