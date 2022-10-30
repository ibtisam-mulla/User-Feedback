package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FeedbackRESTController {
	
	@Autowired
	FeedbackDao dao;

	@PostMapping("/insert")
	public Feedback insertrecord(@RequestParam("name") String name,@RequestParam("email") String email, @RequestParam("feedback1") String feed) throws Exception {
		
		Feedback f=new Feedback(name,email,feed);
		return dao.insert(f);
	}
	
	@GetMapping("/getall")
	public List<Feedback> getall() {
		return dao.getall();
		}
	

}
