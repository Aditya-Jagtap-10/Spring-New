package com.springboot.dao;

import java.util.*;
import org.springframework.stereotype.Component;

import com.springboot.domain.Doctor;

@Component
public class DoctorDAO {
	
	
	static List<Doctor> doctorlist = new ArrayList<>(); 
		static {
				doctorlist.add(new Doctor(1,"Elizabeth","MBBS",4.2,"Cardiologist",750.00));
				doctorlist.add(new Doctor(2,"Michael","MBBS",2.0,"Dermatologist",1500.00));
				doctorlist.add(new Doctor(3,"Charlotte","MBBS",3.1,"Pediatrics",200.00));
				doctorlist.add(new Doctor(4,"Lucas","BDS",1.9,"Dentist",250.00));
		}
	public List<Doctor> list() {
		//Fill your code here
		return doctorlist;
		
	}
	
}
