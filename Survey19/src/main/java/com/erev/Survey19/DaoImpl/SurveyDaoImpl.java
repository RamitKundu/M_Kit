package com.erev.Survey19.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.erev.Survey19.Dao.SurveyDao;
import com.erev.Survey19.Model.SurveyModel;


@Repository
@Transactional
public class SurveyDaoImpl implements SurveyDao{
	@Autowired
	private SessionFactory sessionFactory;

	public void addPeople(SurveyModel sm) {
		// TODO Auto-generated method stub
		try{
		sessionFactory.getCurrentSession().save(sm);
		}catch(Exception e){
			
			System.out.println("Exception Occurred");
			
		}
		
	}
	

}
