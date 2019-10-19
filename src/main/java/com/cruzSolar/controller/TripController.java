package com.cruzSolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cruzSolar.service.BusService;
import com.cruzSolar.service.DepartmentService;
import com.cruzSolar.service.TripService;

@Controller
@RequestMapping("/trips")
public class TripController {
	
	@Autowired
	private TripService tripService;
	
	@Autowired
	private BusService busService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public String showAllTrips(Model model) {
		model.addAttribute("trips", tripService.getAll());
		model.addAttribute("buses", busService.getAll());
		model.addAttribute("departments", departmentService.getAll());
		return "trips/list";
	}
}
