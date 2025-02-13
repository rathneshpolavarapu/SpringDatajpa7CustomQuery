package com.example.demo.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Vaccine;

public interface Vaccinerepo extends JpaRepository<Vaccine, Integer> {
	
//   @Query("From Vaccine where vaccine=:vaccine")
//	public List<Vaccine> serachByVaccine(String vaccine);
//	
   @Query(value="Select * from vaccine where vaccine=?",nativeQuery=true)
	public List<Vaccine> serachByVaccine(String v1);

	
	
@Query("Select vaccine from Vaccine where cost Between:mincost AND :maxcost")	
	public List<String> searchbyCosts(Double mincost,Double maxcost);

@Transactional
@Modifying
@Query(value="Update vaccine set cost=? where vaccine=?",nativeQuery=true)
public int updateCostByVaccine(Double newCost,String vaccine);

@Transactional
@Modifying
@Query(value="Delete from vaccine Where cost=?",nativeQuery=true)
public int deleteVaccineByCost(Double cost);

@Transactional
@Modifying
@Query(value="Insert into vaccine(`id`,`vaccinecompany`,`cost`,`vaccine`) values(?,?,?,?)",nativeQuery=true)
public int insertInToVaccine(int id,String vaccinecompany,Double cost,String vaccine);

}