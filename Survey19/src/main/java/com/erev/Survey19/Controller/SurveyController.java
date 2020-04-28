package com.erev.Survey19.Controller;
import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erev.Survey19.Dao.SurveyDao;
import com.erev.Survey19.Model.SurveyModel;

@RestController
public class SurveyController {
	
	@Autowired
	SurveyDao surveyDao;


	/*@PostMapping(path="/")
	public ResponseEntity<SurveyModel> add(@RequestBody SurveyModel surveyModel) {
		System.out.println("Inside Add/Insert=================================================");
		surveyDao.addPeople(surveyModel);
		return new ResponseEntity<SurveyModel>(surveyModel, HttpStatus.OK);
	}*/
	
	//@PostMapping(path="/" )
	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public SurveyModel add(@RequestBody SurveyModel surveyModel) {
		System.out.println("Inside Add/Insert=================================================");
		surveyDao.addPeople(surveyModel);
		return surveyModel;
	}

}
