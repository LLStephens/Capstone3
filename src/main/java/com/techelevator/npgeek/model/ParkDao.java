package com.techelevator.npgeek.model;

import java.util.List;

public interface ParkDao {

	
	public List<Park> getAllParks();
	
	public void createPark(int acreage, int annualvisitorcount, String climate, int elevationinfeet, int entryfee,
			String inspirationalquote, String inspirationalquotesource, float milesoftrail, int numberofanimalspecies,
			int numberofcampsites, String parkcode, String parkdescription, String parkname, String state,
			int yearfounded);
}
