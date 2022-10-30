package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackDao {
	@Autowired
	FeedbackRepository repo;
	
		
	//insertion 
		public Feedback insert(Feedback e) {
			return repo.save(e);
		}
		public List<Feedback> getall(){
			return repo.findAll();
		}
		

}
