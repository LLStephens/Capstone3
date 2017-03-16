package com.techelevator.npgeek.integration;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.npgeek.model.JDBCSurveyDao;
import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.SurveyDao;

public class JDBCSurveyDAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;
	private SurveyDao dao;
	
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
		dao = new JDBCSurveyDao(dataSource);
	}

	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Test
	public void save_and_returns_most_popular_park(){
		Survey survey = dao.getTopPark();
		int votes = survey.getVotes();
		Survey testSurvey = new Survey();
		testSurvey.setActivityLevel("inactive");
		testSurvey.setEmailAddress("gmail");
		testSurvey.setParkCode(survey.getParkCode());
		testSurvey.setState("Mi");
		dao.save(testSurvey);
		Survey resultSurvey = dao.getTopPark();
		int votes2 = resultSurvey.getVotes();
		
		Assert.assertTrue(votes<votes2);
	}
}
