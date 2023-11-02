package com.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;

import com.demo.bo.ClientBO;
import com.demo.bo.TrainerBO;
import com.demo.dao.ClientCustomized;
import com.demo.dao.TrainerCustomized;
import com.demo.entity.Client;
import com.demo.entity.Trainer;
import com.demo.exception.TrainerNotFoundException;

import org.springframework.transaction.annotation.*;

@Component
public class TrainerService {

	public Trainer insertTrainer(Trainer addTrainer) {
		return bo1.insertTrainer(addTrainer);
	}

	public List<Trainer> findAllTrainer() {
		return bo1.findAllTrainer();
	}
	
	public Trainer findById(Integer id) throws TrainerNotFoundException    {
		return  bo1.findById(id);
		
		}
	public Trainer updateTrainer(Trainer updateTrainer) {
		return bo1.updateTrainer(updateTrainer);	
}

	@Autowired
	TrainerBO bo1;

	@Autowired
	ClientBO bo2;

	@Transactional(propagation = Propagation.REQUIRED) public void
	  transactionDemo(Trainer t, Client c) {
	  System.out.println("Trainer Add----Before"); bo1.insertTrainer(t);
	  System.out.println("Trainer Add----After");
	  System.out.println("Client Add----Before"); bo2.insertClient(c);
	  System.out.println("Client Add----After");
	}

	
	  // Custom query
	  
		
		
		
		  public List<Trainer> findTrainerById(int id) { return
		  bo1.findTrainerById(id); }
		 
		 
	/*
	 * public Client insertClient(Client msg) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * public List<Trainer>findTrainerByName(String name1) { return
	 * bo1.findTrainerByName(name1); //}
	 */	 

	
	/*
	 * public List<TrainerCustomized> findTrainerByNameCustomized(String name1) {
	 * return bo1.findTrainerByNameCustomized(name1); }
	 * 
	 */
	/*
	 * public List<Trainer> findAllOrderByNameDescending() { return
	 * bo1.findAllOrderByNameDescending(); }
	 */
public List<Trainer> findTrainerByName(String name1) {
	
	return null;
}
  
/*
 * // Inner Join
 * 
 * public List<Trainer> findTrainerWithClient() { return
 * bo1.findTrainerWithClient(); }
 * 
 * 
 * //Left Outer join public List<Trainer>findTrainerWithClientLeft() { return
 * bo1.findTrainerWithClientLeft(); } // Customized data by join public
 * 
 * List<ClientCustomized> findByTrainerClientCustomized() { return
 * bo1.findByTrainerClientCustomized(); }
 */
 

}
