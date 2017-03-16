package com.techelevator.npgeek.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCParkDao implements ParkDao{
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCParkDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void createPark(int acreage, int annualVisitorCount, String climate, int elevationInFeet, int entryFee, String inspirationalQuote, String inspirationalQuoteSource, float milesOfTrail,  int numberOfAnimalSpecies, int numberOfCampsites, String parkCode, String parkDescription, String parkName, String state, int yearFounded) {
		String sqlNewPark = "insert into park (acreage, annualvisitorcount, climate, elevationinfeet, entryfee, inspirationalquote,inspirationalquotesource, milesoftrail, numberofanimalspecies, numberofcampsites, parkcode,parkdescription,parkname, state, yearfounded) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";   
		jdbcTemplate.update(sqlNewPark, acreage, annualVisitorCount, climate, elevationInFeet, entryFee, inspirationalQuote,inspirationalQuoteSource, milesOfTrail, numberOfAnimalSpecies, numberOfCampsites, parkCode,parkDescription,parkName, state, yearFounded);
		
	}

	@Override
	public List<Park> getAllParks() {
		String sqlAllParks = "select * from park";
		SqlRowSet allParks = jdbcTemplate.queryForRowSet(sqlAllParks);
		List<Park> parkList = new ArrayList<>();

		while(allParks.next()){
			Park park = new Park();
			park.setAcreage(allParks.getInt("acreage"));
			park.setAnnualVisitorCount(allParks.getInt("annualvisitorcount"));
			park.setClimate(allParks.getString("climate"));
			park.setElevationInFeet(allParks.getInt("elevationinfeet"));
			park.setEntryFee(allParks.getInt("entryfee"));
			park.setInspirationalQuote(allParks.getString("inspirationalquote"));
			park.setInspirationalQuoteSource(allParks.getString("inspirationalquotesource"));
			park.setMilesOfTrail(allParks.getDouble("milesoftrail"));
			park.setNumberOfAnimalSpecies(allParks.getInt("numberofanimalspecies"));
			park.setNumberOfCampsites(allParks.getInt("numberofcampsites"));
			park.setParkCode(allParks.getString("parkcode"));
			park.setParkDescription(allParks.getString("parkdescription"));
			park.setParkName(allParks.getString("parkname"));
			park.setState(allParks.getString("state"));
			park.setYearFounded(allParks.getInt("yearfounded"));
			parkList.add(park);
		}
		return parkList;
	}

	

}
