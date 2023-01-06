package com.alquimia.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import com.alquimia.modelo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{


	
}
