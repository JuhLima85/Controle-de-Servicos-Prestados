package com.juhlima.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.juhlima.model.entity.Cliente;
import com.juhlima.model.entity.ServicoPrestado;

public interface ServicoPrestadoRepository extends JpaRepository<Cliente, Integer>{

	ServicoPrestado save(ServicoPrestado servicoPrestado);
	
	@Query(" select s from ServicoPrestado s join s.cliente c " +
			" where upper( c.nome ) like upper( :nome ) and MONTH(s.data) =:mes ")
	List<ServicoPrestado> findByNomeClienteAndMes (
			@Param("nome") String nome, @Param("mes") Integer mes);
			
	
	

}
