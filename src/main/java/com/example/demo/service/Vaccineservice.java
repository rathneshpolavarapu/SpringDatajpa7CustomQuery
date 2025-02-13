package com.example.demo.service;


import java.util.Collection;
import java.util.List;

import com.example.demo.model.Vaccine;

public interface Vaccineservice {
	
//public List<Vaccine> searchByVaccine(String vaccine);

public List<Vaccine> searchByVaccine(String v1);

public List<String> searchbyCosts(Double mincost,Double maxcost);


public int updatetheCostByVaccine(Double newCost,String vaccine);

public int deletetheVaccineByCost(Double cost);

public int insertInToTheVaccine(int id,String vaccinecompany,Double cost,String vaccine);

}
