package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.bo.ClientBO;
import com.demo.entity.Client;
import com.demo.entity.Trainer;

@Component
public class ClientService {
	@Autowired
	ClientBO bo;

	public Client insertClient(Client addClient) {
		return bo.insertClient(addClient);
	}

	public Client updateClient(Client updateClient) {
		return bo.updateClient(updateClient);
	}

	public List<Client> findAllClient() {
		return bo.findAllClient();
	}

	public Client findClient(Integer id) {
		return bo.findClient(id);
	}

	

	public Trainer findTrainer(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
