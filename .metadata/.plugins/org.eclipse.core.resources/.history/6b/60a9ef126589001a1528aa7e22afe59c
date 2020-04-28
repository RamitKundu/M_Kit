package com.erev.Survey19.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erev.Survey19.Dao.SurveyDao;
import com.erev.Survey19.Model.SurveyModel;

@RestController
public class SurveyController {
	
	@Autowired
	SurveyDao surveyDao;


	@PostMapping("/")
	public String add(@RequestBody SurveyModel surveyModel) {

		surveyDao.addPeople(surveyModel);
		

		return "Home";
	}

}
