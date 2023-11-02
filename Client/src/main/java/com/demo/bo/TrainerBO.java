package com.demo.bo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.dao.TrainerCustomized;
import com.demo.dao.TrainerRepository;
import com.demo.entity.Trainer;
import com.demo.exception.TrainerNotFoundException;

@Component
public class TrainerBO {
	@Autowired
	TrainerRepository trainer;

	public Trainer insertTrainer(Trainer addTrainer) {
		return trainer.save(addTrainer);
	}

	public Trainer updateTrainer(Trainer updateTrainer) {
		return trainer.save(updateTrainer);
	}

	public List<Trainer> findAllTrainer() {
		return trainer.findAll();
	}
	

	public Trainer findById(Integer id) throws TrainerNotFoundException {
		Optional<Trainer> fetch = trainer.findById(id);
		if(fetch.isPresent()) {
			Trainer c=fetch.get();
			return c;
		}
		else {
			throw new TrainerNotFoundException("Inappropriate Id");
		}
	}
	  //Custom query
		
		  public List <Trainer> findTrainerById(int id) { return
		  trainer.findTrainerById(id); }
		 
		 
	 
	
		/*
		 * public List<Trainer>findTrainerByName(String name1) { return trainer .
		 * findTrainerByName( name1); }
		 */
		/*
		 * public List<TrainerCustomized> findTrainerByNameCustomized(String name1) {
		 * return trainer. findTrainerByNameCustomized( name1); }
		 */
	/*
	 * public List<Trainer> findAllOrderByNameDescending() { return
	 * trainer.findAllOrderByNameDescending(); }
	 */

	  
/*
 * //Inner join public List<Trainer> findTrainerWithClient() { return
 * trainer.findTrainerWithClient(); }
 * 
 * //Left Outer join public List<Trainer>findTrainerWithClientLeft() { return
 * trainer.findTrainerWithClientLeft(); }
 * 
 * //Customized data by join public List<ClientCustomized>
 * findByTrainerClientCustomized() { return
 * trainer.findByTrainerClientCustomized(); }
 */
	 
}

//}