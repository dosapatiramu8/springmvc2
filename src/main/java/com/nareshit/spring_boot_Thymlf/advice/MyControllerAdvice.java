package com.nareshit.spring_boot_Thymlf.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.nareshit.spring_boot_Thymlf.exception.EmployeeException;

@ControllerAdvice
public class MyControllerAdvice {
@ExceptionHandler(EmployeeException.class)
public ModelAndView handlerEmpty(EmployeeException exception) {
	
//	ErrorMessage mes=new ErrorMessage();
//	mes.setMessage("Input fields empty");
	ModelAndView model=new ModelAndView("error");
	model.addObject("error",exception);
//	return new ResponseEntity<String>("Input field is empty",HttpStatus.BAD_REQUEST);
	return model;
}
	
}
