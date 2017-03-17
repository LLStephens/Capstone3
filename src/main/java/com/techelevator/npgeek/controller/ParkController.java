package com.techelevator.npgeek.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.npgeek.model.Forecast;
import com.techelevator.npgeek.model.ForecastDao;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;
import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.SurveyDao;


@Controller
@SessionAttributes("tempUnit")
public class ParkController {
	
	@Autowired
	private SurveyDao surveyDao;
	@Autowired
	private ParkDao parkDao;
	@Autowired
	private ForecastDao forecastDao;

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayHome(HttpServletRequest request) {
		List<Park> parkList = parkDao.getAllParks();
		request.setAttribute("parkList", parkList);
		return "Home";
	}
	
	@RequestMapping(path="/surveyInput", method=RequestMethod.GET)
	public String displaySurvey(){
		return "surveyInput";
	}
	
	@RequestMapping(path="/surveyInput", method=RequestMethod.POST)
	public String processSurvey(Survey survey){
		surveyDao.save(survey);
		return "redirect:/surveyResults";
	}
	
	@RequestMapping(path="/surveyResults", method=RequestMethod.GET)
	public String showSurveyResults(HttpServletRequest request){
		Survey result = surveyDao.getTopPark();
		List<Park> parkList = parkDao.getAllParks();
		Park ourPark = new Park();
		for(Park park: parkList){
			if (park.getParkCode().equals(result.getParkCode())){
			ourPark = park;
			}
		}
		request.setAttribute("result", result);
		request.setAttribute("park", ourPark);
		return "surveyResults";
	}
	
	@RequestMapping(path="/parkDetail", method=RequestMethod.GET)
	public String showParkDetail(@RequestParam String parkCode,  HttpServletRequest request){
		List<Park> parkList = parkDao.getAllParks();
		for(Park park : parkList){
			if(park.getParkCode().equals(parkCode)){
				request.setAttribute("park", park);
			}
		}
		return "parkDetail";
	}
	
	@RequestMapping(path="/forecastDetail", method=RequestMethod.GET)
	public String showParkForecast(@RequestParam String parkCode, HttpServletRequest request,ModelMap map){
		String tempUnit = request.getParameter("tempUnit");
		if(tempUnit==null){
			if(map.containsKey("tempUnit")) {
				tempUnit=(String)map.get("tempUnit");
			} else {
				tempUnit="farenheit";
			}
		}
		map.put("tempUnit", tempUnit);
		List<Forecast> forecastList = forecastDao.getAllForecast(parkCode);
		request.setAttribute("forecastList", forecastList);
		return "forecastDetail";
	}
	
}