package com.example.demo.service;


import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vaccine;
import com.example.demo.repo.Vaccinerepo;

@Service
public class Vaccineserviceimpl implements Vaccineservice {

	@Autowired
	private Vaccinerepo repo;

	@Override
	public int insertInToTheVaccine(int id, String vaccinecompany, Double cost, String vaccine) {
		// TODO Auto-generated method stub
		return repo.insertInToVaccine(id, vaccinecompany, cost, vaccine);
	}



	@Override
	public List<Vaccine> searchByVaccine(String v1) {
		// TODO Auto-generated method stub
		return repo.serachByVaccine(v1);
	}



	@Override
	public List<String> searchbyCosts(Double mincost, Double maxcost) {
		// TODO Auto-generated method stub
		return repo.searchbyCosts(mincost, maxcost);
	}



	@Override
	public int updatetheCostByVaccine(Double newCost, String vaccine) {
		// TODO Auto-generated method stub
		return repo.updateCostByVaccine(newCost, vaccine);
	}



	@Override
	public int deletetheVaccineByCost(Double cost) {
		// TODO Auto-generated method stub
		return repo.deleteVaccineByCost(cost);
	}




	


	

		
	}
	

	


