package com.telusko.trainticketreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.trainticketreservation.model.train;
import com.telusko.trainticketreservation.model.user;
import com.telusko.trainticketreservation.repository.trainRepository;
import com.telusko.trainticketreservation.repository.userRepository;

@Controller
public class userController {
	
	@Autowired
	userRepository userRepo;
	
	@Autowired
	trainRepository trainRepo;
	
	@RequestMapping("/register")
	public String Register()
	{
		return "Register.jsp";
	}
	
	@RequestMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(user user1)
	{
		userRepo.save(user1);
		return "Register.jsp";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("ticket.jsp");
		user user1=userRepo.findById(id).orElse(new user());
		mv.addObject(user1);
		return mv;
	}
	
	@RequestMapping("/trainDetails")
	public ModelAndView trainDetails(@RequestParam int train_no)
	{
		ModelAndView mv1=new ModelAndView("trainDetails.jsp");
		train train1=trainRepo.findById(train_no).orElse(new train());
		mv1.addObject(train1);
		return mv1;
	}
	
	@RequestMapping("/reservation")
	public ModelAndView reservation(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("reserved.jsp");
		user user1=userRepo.findById(id).orElse(new user());
		mv.addObject(user1);
		return mv;
	}

}
