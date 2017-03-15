package com.techelevator.npgeek.model;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCSurveyDao implements SurveyDao{
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCSurveyDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void save(Survey survey) {
		String sqlInsertSurvey = "INSERT INTO survey_result(parkcode, emailaddress, state, activitylevel) VALUES (?,?,?,?)";
		jdbcTemplate.update(sqlInsertSurvey, survey.getParkCode(), survey.getEmailAddress(), survey.getState(), survey.getActivityLevel());
	}

	@Override
	public Survey getTopPark() {
		String sqlTopPark = "select count (*) as count, parkcode from survey_result " +
							"group by parkcode order by count DESC limit 1";
		SqlRowSet topPark = jdbcTemplate.queryForRowSet(sqlTopPark);
		Survey survey = new Survey();
		topPark.next();
		survey.setVotes(topPark.getInt("count"));
		survey.setParkCode(topPark.getString("parkcode"));
		survey.setActivityLevel(null);
		survey.setEmailAddress(null);
		survey.setState(null);
		survey.setSurveyId(0);
		return survey;
	}
	
}
