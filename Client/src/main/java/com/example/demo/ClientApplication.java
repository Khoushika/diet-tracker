package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.demo.bo.ClientBO;
import com.demo.bo.TrainerBO;
import com.demo.dao.ClientCustomized;
import com.demo.dao.TrainerCustomized;
import com.demo.entity.Client;
import com.demo.entity.Trainer;
import com.demo.service.ClientService;
import com.demo.service.TrainerService;

import jakarta.persistence.Column;

@ComponentScan("com.demo")
@EntityScan(basePackages = { "com.demo.entity" })
@EnableJpaAuditing
@EnableJpaRepositories("com.demo.dao")
@SpringBootApplication
public class ClientApplication {
	//static Logger log = Logger.getLogger(ClientApplication.class.getName());
	public static void main(String[] args) {
		//log.info("Application started");
		ApplicationContext ctx = SpringApplication.run(ClientApplication.class, args);
		ClientService service = ctx.getBean(ClientService.class);
		/*
		  Client clientobj = new Client(); 
		  clientobj.setId(1);
		  clientobj.setName("Khoushi");
		  clientobj.setEmail("khoushi@gmail.com");
		  clientobj.setContactNumber(9876685498l);
		  clientobj.setDob("23-4-99");
		  
		  service.insertClient(clientobj) ;
		 */

		/*
		 * // UPDATE clientobj.setId(1); clientobj.setName("Kala");
		 * clientobj.setEmail("Kala@gmail.com");
		 * clientobj.setContactNumber(8667689897l);
		 */
		// service.updateClient(clientobj);
		/*
		 * //Find by id System.out.println(service.findClient(1));
		 * 
		 * //Find All System.out.println(service.findAllClient());
		 */

		// TASK 1

		
		
		
		 TrainerBO bo = ctx.getBean(TrainerBO.class);
		  
		  
			/*
			 * Trainer l = new Trainer();
			 * 
			 * l.setName("ram"); l.setId(4); bo.insertTrainer(l);
			 * 
			 */
			 
//Task 2
		
				
			
			  ClientBO clientbo = ctx.getBean(ClientBO.class);
			  
			  
				/*
				 * Client b = new Client(); b.setContactNumber(6879000); b.setName("janani");
				 * b.setEmail("janani@gmail.com"); b.setDob("04-06-05");
				 * 
				 * Trainer l2= new Trainer(); l2.setId(88);
				 * 
				 * b.setTrainer(l2);
				 * 
				 * clientbo.insertClient(b);
				 */

		// TASK 3

		// Creating client
		
		/*
		 * Client c1 = new Client(); c1.setContactNumber(586757687l);
		 * c1.setEmail("lakshmi@gmail.com"); c1.setName("lakshmi");
		 * c1.setDob("12-3-33"); clientbo.insertClient(c1);
		 * 
		 * Client c2 = new Client(); c2.setContactNumber(97554435788l);
		 * c2.setEmail("ragavi@gmail.com"); c2.setName("Ragavi"); c2.setDob("05-3-89");
		 * clientbo.insertClient(c2); // Creating Trainer Trainer t3 = new Trainer();
		 * t3.setName("Mathavi"); bo.insertTrainer(t3); // Associating Client to Trainer
		 * c1.setTrainer(t3); c2.setTrainer(t3); // Associating Trainer with Client
		 * List<Client> l5 = new ArrayList<Client>(); l5.add(c1); l5.add(c2);
		 * t3.setClient(l5);
		 * 
		 * System.out.println("Adding Trainer"); bo.insertTrainer(t3);
		 */
		 
		// Transaction

		/*
		 * TrainerService svc =ctx.getBean(TrainerService.class);
		 * 
		 * Client client = new Client(); client.setContactNumber(97643688657l);
		 * client.setName("fs"); client.setEmail("fs@gmail.com");
		 * 
		 * Trainer trainer= new Trainer(); trainer.setId(1); client.setTrainer(trainer);
		 * 
		 * Trainer trainer1 = new Trainer(); trainer1.setName("Tim");
		 * 
		 * svc.transactionDemo(trainer1,client);
		 * 
		 */
		
		  //Join Process
			/*
			 * Trainer t7 = bo.findTrainer(2); System.out.println("Trainer:" + t7);
			 * List<Client> clientlist = t7.getClient();
			 * System.out.println("*************Printing client*****************"); for
			 * (Client bobj : clientlist) System.out.println("Client Name:"
			 * +bobj.getName());
			 * 
			 * List<Trainer>list=bo.findTrainerById(1); System.out.println();
			 */

		// Custom query		
		
		//  TrainerService service = ctx.getBean(TrainerService.class);
		  
		  
			/*
			 * List<Trainer>list =service.findTrainerById(1);
			 * System.out.println("Trainer>ID 1:"+list);
			 */
		 
		 

		// error
		/*
		 * List<Trainer>list1=service.findTrainerByName("m");
		 * System.out.println("Trainer name with 'm':"+list1);
		 */

		/*
		 * List <TrainerCustomized> list2=service.findTrainerByNameCustomized("Tim");
		 * for(TrainerCustomized t:list2) {
		 * System.out.println("Customized details: "+t.getName()); }
		 */
		// Named query

		 //System.out.println("Trainer details Order by descending name:"+service.findAllOrderByNameDescending());

		// Inner Join
		/*
		 * List<Trainer> trainerlist = service.findTrainerWithClient();
		 * System.out.println("Trainer with client INNER JOIN "+ trainerlist);
		 */

		/*
		 * //Left outer join List<Trainer>
		 * Trainerlist1=service.findTrainerWithClientLeft();
		 * System.out.println("Trainer with Client Left outer join"+Trainerlist1);
		 */
		// Customized join
		/*
		 * List<ClientCustomized>
		 * TrainerClientlist=service.findByTrainerClientCustomized();
		 * for(ClientCustomized client:TrainerClientlist) {
		 * System.out.println("Customized Joined data y using joins========>"+client.
		 * getName()+"-"); }
		 */
	}
}
