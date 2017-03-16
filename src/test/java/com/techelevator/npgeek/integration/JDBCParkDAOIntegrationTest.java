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

import com.techelevator.npgeek.model.JDBCParkDao;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;


public class JDBCParkDAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;
	private ParkDao dao;
	
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
		dao = new JDBCParkDao(dataSource);
	}

	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Test
	public void returns_all_parks(){
		dao.createPark(10, 10, "desert", 10, 5, "do not fall", "socrates", 10, 2, 2, "FUCKP", "parky", "fort union country kinfolk park", "co", 1999);
		List<Park> list1 = dao.getAllParks();
		dao.createPark(10, 10, "island", 10, 5, "fall", "isaac newton", 10, 2, 2, "IJNAP", "park-esque", "i just need a park", "mi", 1999);
		List<Park> list2 = dao.getAllParks();
		
		Assert.assertTrue(list2.size()>=2);
		Assert.assertTrue(list1.size()<list2.size());
	}
}
