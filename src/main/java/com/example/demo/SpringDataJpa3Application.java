package com.example.demo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Vaccine;
import com.example.demo.service.Vaccineservice;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa3Application.class, args);
		
		Vaccineservice service=container.getBean(Vaccineservice.class);
		
//		service.searchByVaccine("Sputnick").forEach(v->System.out.print(v));
		
//		service.searchbyCosts(1.0, 17.1).forEach(v->System.out.print(v));
		
//		service.searchByVaccine("Sputnick").forEach(v->System.out.print(v));
		
		service.updatetheCostByVaccine(25.30, "whitemedicine");
//		service.deletetheVaccineByCost(12.67);
		
//		service.insertInToTheVaccine(9, "london", 12.67, "whitemedicine");
		
		
	}
}

