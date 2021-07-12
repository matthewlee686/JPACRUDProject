package com.skilldistillery.volvo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.volvo.data.VolvoDAO;
import com.skilldistillery.volvo.entities.Vehicle;

@Controller
public class VolvoController {

	@Autowired
	private VolvoDAO dao; 
	
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(path = "ShowAll.do", method = RequestMethod.GET)
	public String showFilm(Model model) {
		model.addAttribute("vehicles", dao.showAll());
		return "vehicles/show";
	}

	@RequestMapping(path = "VehicleInfo.do",params="id", method = RequestMethod.GET)
	public String showVehicleInfo(@RequestParam("id") int vid/*vehicle id*/, Model model) {
		model.addAttribute("vehicle", dao.findById(vid));
		return "vehicles/vehicleInfo";
	}
	
	@RequestMapping("AddOrUpdate.do")
	public String addUpdate() {
		return "vehicles/addOrUpdate";
	}
	
	//Search for a Volvo
	@RequestMapping("Search.do")
	public String search() {
		return "vehicles/search";
	}
	
	@RequestMapping(path="SearchResults.do", method = RequestMethod.GET)
	public String searchResults(
								@RequestParam("model") String modelType, 
//								@RequestParam("trim") String trim,
//								@RequestParam("color") String color,
//								@RequestParam("drivetrain") String drivetrain,
//								@RequestParam("modelYear") int year, 
								Model model) {
		
		model.addAttribute("vehicles", dao.searchResult(modelType));
		return "vehicles/searchResults";
	}
	
	//Add a Volvo
	@RequestMapping("AddVolvo.do")
	public String add() {
		return "vehicles/addVolvo";
	}
	
	@RequestMapping(path = "AddResult.do", method = RequestMethod.POST)
	public String addResult(Vehicle vehicle, Model model) {
		model.addAttribute("vehicle", dao.addVolvo(vehicle));
		return "vehicles/addResult";
	}
	
	
	//Update a Volvo
		//method = POST
	
	
	
	
	//Delete a Volvo
	@RequestMapping(path = "Delete.do", params = "id", method = RequestMethod.POST)
	public String delete(@RequestParam("id") int vid, Model model) {
		model.addAttribute("vehicle", dao.destroyVolvo(vid));
		return "vehicles/deleteConfirmation";
	}
	
}
