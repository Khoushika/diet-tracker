package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
