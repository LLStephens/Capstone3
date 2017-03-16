package com.techelevator.npgeek.integration;


import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.npgeek.model.Forecast;
import com.techelevator.npgeek.model.ForecastDao;
import com.techelevator.npgeek.model.JDBCForecastDao;

public class JDBCForecaseDAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;
	private ForecastDao dao;
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/npgeek");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		dataSource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}
	

	@Before
	public void setup() {
		dao = new JDBCForecastDao(dataSource);
	}

	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Test
	public void returns_all_forecasts(){
		List<Forecast> forecast = dao.getAllForecast("CVNP");
		
		Assert.assertTrue(forecast.size()==5);
		
	}
	
}
