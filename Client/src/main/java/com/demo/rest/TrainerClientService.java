package com.demo.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bo.ClientBO;
import com.demo.bo.TrainerBO;
import com.demo.dao.UserRepository;
import com.demo.dto.LoginRequest;
import com.demo.dto.TrainerDTO;
import com.demo.entity.Trainer;
import com.demo.entity.User;
import com.demo.exception.TrainerNotFoundException;
import com.demo.response.ResponseObject;
import com.demo.service.ClientService;
import com.demo.service.TrainerService;
@CrossOrigin 
@RestController
@Service
public class TrainerClientService {
	 @Autowired
     private UserRepository userRepository;

	@Autowired
	TrainerBO bo1;

	@Autowired
	ClientBO bo2;

	@Autowired
	TrainerService service1;

	@Autowired
	ClientService service2;

	  @RequestMapping("/sayhello") public String sayhello() { return "Say Hello"; }

  //Create trainer (parent)

	  @RequestMapping(value = "/createTrainer", method = RequestMethod.POST) 
	  @CrossOrigin(origins="http://localhost:3000")
	  public
	  TrainerDTO addTrainer(@RequestBody TrainerDTO msg) {
	  System.out.println("Name" + msg.getName()); Trainer t = new Trainer();
	  t.setName(msg.getName()); Trainer t1 = bo1.insertTrainer(t);
	  msg.setId(t1.getId()); msg.setCreatedAt(t1.getCreatedAt());
	  msg.setUpdatedAt(t1.getUpdatedAt()); return msg; }
	  
	  //Update trainer (parent)  
	  @RequestMapping(value = "/updateTrainer/{id}", method = RequestMethod.POST)
	  @CrossOrigin(origins="http://localhost:3000")
	  public TrainerDTO updateTrainer(@PathVariable("id") int id,
	  
	  @RequestBody TrainerDTO msg) throws TrainerNotFoundException {
	  System.out.println("name:" + msg.getName()); Trainer q = bo1.findById(id);
	  q.setName(msg.getName()); Trainer q1 = bo1.updateTrainer(q); TrainerDTO q2 =
	  new TrainerDTO(); q2.setId(q1.getId()); q2.setName(q1.getName());
	  q2.setCreatedAt(q1.getCreatedAt()); q2.setUpdatedAt(q1.getUpdatedAt());
	  return msg; }
	  //Find Trainer By Id(parent)
	  
	  //Find by trainer (parent)
	  @RequestMapping(value="/FindTrainerById",method=RequestMethod.GET) 
	  @CrossOrigin(origins="http://localhost:3000")public
	  TrainerDTO findTrainer(@RequestParam int id) throws TrainerNotFoundException
	  { System.out.println("Id:"+id); Trainer t = service1.findById(id); TrainerDTO
	  dto = new TrainerDTO(); dto.setId(t.getId()); dto.setName(t.getName());
	  dto.setCreatedAt(t.getCreatedAt()); dto.setUpdatedAt(t.getUpdatedAt());
	  
	  return dto; }
	  
	  
	  // FindAllTrainer(parent)
	  
	  
	  @RequestMapping(value = "/findAllTrainer", method = RequestMethod.GET)
	  @CrossOrigin(origins="http://localhost:3000")public
	  List<TrainerDTO> findAllTrainer() { List<Trainer> trainer =
	  bo1.findAllTrainer(); List<TrainerDTO> dtos = new ArrayList<>(); for (Trainer
	  t : trainer) { TrainerDTO dto = new TrainerDTO(); dto.setId(t.getId());
	  dto.setName(t.getName()); dto.setUpdatedAt(t.getUpdatedAt());
	  dto.setCreatedAt(t.getCreatedAt()); dtos.add(dto); } return dtos; }
	 
	  
  
   
	
	  // Insert Client (child)
	  
		/*
		 * @RequestMapping(value = "/insertclient", method = RequestMethod.POST) public
		 * Client addClient(@RequestBody Client msg) { System.out.println("Client Id" +
		 * msg.getId()); System.out.println("Client Name:" + msg.getName());
		 * System.out.println("Client DOB:" + msg.getDob()); Trainer t =
		 * service2.findTrainer(msg.getTrainer().getId());
		 * System.out.println("Trainer ------>" + t); Client c = new Client();
		 * c.setName(msg.getName()); c.setDob(msg.getDob()); TrainerService service2;
		 * Client response = service1.insertClient(msg); return msg; }
		 */
	  
	  
	  // Fetch client (child)
	  
		/*
		 * @RequestMapping(value = "/fetchClient", method = RequestMethod.GET) public
		 * Client fetchClient(@RequestParam int id) { System.out.println("Client Id " +
		 * id); Client c = bo2.findClient(id); c.getContactNumber(); c.getId();
		 * c.getEmail(); c.getDob(); c.getName();
		 * System.out.println("Client fetched successfully......"); return c; }
		 */
	  //TrainerService service = ctx.getBean(TrainerService.class);
	  
	  
	  //Fetch all client(child) TrainerService service2 ;
	  
		/*
		 * @RequestMapping(value = "/fetchAllClient", method = RequestMethod.GET) public
		 * List<Client>fetchAllClient(){ List<Client>fetchAll =
		 * service2.findAllClient(); return fetchAll; }
		 * 
		 */
	  
	  // id query
	  
		
		  @RequestMapping(value = "/greaterThanGivenId", method = RequestMethod.GET)
		  public List<Trainer> getTrainerById(@RequestParam int id) { List<Trainer>
		  greaterThan = service1.findTrainerById( id); return greaterThan; }
	  
	   // Find by query
	  
		
		/*
		 * @RequestMapping(value = "/findTrainerByName", method = RequestMethod.GET)
		 * public List<Trainer> getTrainerByName(@RequestParam String name1) {
		 * List<Trainer> nameAt= service1.findTrainerByName(name1); return nameAt; }
		 */
		 
	  
	  
	  // Find by query
	  
		
		/*
		 * @RequestMapping(value = "/findAllOrderByNameDescending", method =
		 * RequestMethod.GET) public List<Trainer>
		 * getOrderByNameDescending(@RequestParam String name1) { List<Trainer> nameAt=
		 * service1.findAllOrderByNameDescending();
		 * 
		 * return nameAt; }
		 */
		  
		  
		 	 
	  @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest request) {
	        Map<String, Object> response = new HashMap<>();

	        User user = userRepository.findByUsername(request.getUsername());

	        if (user != null && user.getPassword().equals(request.getPassword())) {
	            response.put("success", true);
	            response.put("message", "Login successful");
	            return ResponseEntity.ok(response);
	        } else {
	            response.put("success", false);
	            response.put("message", "Invalid credentials");
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
	        }
  //}
}
}
