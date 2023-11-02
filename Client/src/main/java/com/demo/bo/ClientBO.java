package com.demo.bo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.dao.ClientRepository;
import com.demo.entity.Client;

@Component
public class ClientBO {
	@Autowired
	ClientRepository diet;

	public Client insertClient(Client addClient) {
		return diet.save(addClient);
	}

	public Client updateClient(Client updateClient) {
		return diet.save(updateClient);
	}

	public List<Client> findAllClient() {
		return diet.findAll();
	}

	public Client findClient(Integer id) {
		Optional<Client> fetch = diet.findById(id);
		return fetch.get();
	}

}
