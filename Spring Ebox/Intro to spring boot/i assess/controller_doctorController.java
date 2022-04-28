package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springboot.dao.DoctorDAO;
import com.springboot.domain.Doctor;

//Fill your code here
@RestController
public class DoctorController {

	//Fill your code here
	@Autowired
	DoctorDAO doctordao;
	@GetMapping("/doctor/list")
	List<Doctor> getDoctors(){
		return doctordao.list();
	}
}
