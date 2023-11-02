package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

	  @Query(value = "select t from Trainer t where t.id>:id") List<Trainer>
	  findTrainerById(@Param("id") int id);
		
		/*
		 * @Query(value = "select t from Trainer t where t.name LIKE%:name1%")
		 * List<Trainer> findTrainerByName( String name);
		 */
		  
		  // only few columns
		  
			
			  @Query("select t.name as name from Trainer t where t.name=:name1")
			  List<TrainerCustomized> findTrainerByNameCustomized(@Param("name1") String
			  name);
			 
		  
		   //Named query
		  // List<Trainer> findAllOrderByNameDescending();
		  
		  //Inner join
		  
			/*
			 * @Query("select t from Trainer t Left JOIN t.client c") List<Trainer>
			 * findTrainerWithClient();
			 * 
			 * //Left Outer join
			 * 
			 * @Query("select t from Trainer t Left Outer JOIN t.client c")
			 * List<Trainer>findTrainerWithClientLeft();
			 * 
			 * 
			 * //Customized data by join
			 * 
			 * @Query("select Trainer t.name as name,Client c.name as ClientName ")
			 * List<ClientCustomized> findByTrainerClientCustomized();
			 */
		 
	 
}