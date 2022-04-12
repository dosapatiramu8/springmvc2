package com.nareshit.spring_boot_Thymlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


import com.nareshit.spring_boot_Thymlf.dto.WorkerDto;

import com.nareshit.spring_boot_Thymlf.exception.EmployeeException;
import com.nareshit.spring_boot_Thymlf.service.ServiceIn;


@Controller
public class WorkerControlr {
	
	@Autowired
	private ServiceIn service;
	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	   public String employeeOperation(Model model) {
		WorkerDto dto=new WorkerDto();
		model.addAttribute(dto);
		   return "add";
	   }
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String add(WorkerDto worker) {
		System.out.println(worker);
		if(worker.getName().length()==0) {
			throw new EmployeeException("601","Input fields are empty");
		}
		else
		service.add(worker);
		return "redirect:/new";
		
	}
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public ModelAndView get() {
		
		ModelAndView modelAndView = new ModelAndView("getAll");
		modelAndView.addObject("listOfwork",service.getAl());
		return modelAndView;
	}
	
	
}
