package com.skilldistillery.volvo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.volvo.data.VolvoDAO;

@Controller
public class VolvoController {

	@Autowired
	private VolvoDAO dao; 
	
	@RequestMapping(path="/")
	public String index(Model model) {
		
		model.addAttribute("vehicle", dao.findById(1));
		return "index";
	}
	
//	@RequestMapping("getVehicle.do")
//	public String showFilm(Integer vid, Model model) {
//		
//		model.addAttribute("vehicle", dao.findById(1));
//		return "film/show";
//	}
	
	
}
