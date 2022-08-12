package com.juhlima.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juhlima.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
