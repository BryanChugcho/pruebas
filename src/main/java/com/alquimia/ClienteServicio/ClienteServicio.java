package com.alquimia.ClienteServicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquimia.modelo.Cliente;
import com.alquimia.repositorio.ClienteRepositorio;


@Service
public class ClienteServicio {

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	public Cliente create (Cliente cliente) {
	     return clienteRepositorio.save(cliente);
	}
	
	public  List<Cliente> getAllClientes (){
		return clienteRepositorio.findAll();
		
	}
	
	public  void delete (Cliente cliente) {
		 clienteRepositorio.delete(cliente);
	}
	
	public Optional<Cliente> findById(Long id){
		return clienteRepositorio.findById(id);
	}
	
	
}
