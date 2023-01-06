package com.alquimia.rest;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import com.alquimia.ClienteServicio.*;
import com.alquimia.modelo.Cliente;

@RestController
@RequestMapping ("/api/cliente")
public class ClienteREST {

	@Autowired
	private ClienteServicio clienteServicio;
	
	@PostMapping
	private ResponseEntity<Cliente> guardar (@RequestBody Cliente cliente){
		Cliente temporal = clienteServicio.create(cliente);
		
		try {
			return ResponseEntity.created(new URI("/api/persona" + temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	
	@GetMapping
	private ResponseEntity<List<Cliente>> listarTodasLasPersona (){
		return ResponseEntity.ok(clienteServicio.getAllClientes());
	}
	
	@DeleteMapping
	private ResponseEntity <Void> eliminarCliente (@RequestBody Cliente cliente){
		clienteServicio.delete(cliente);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}" )
	private ResponseEntity<Optional<Cliente>> ListarPersonas(@PathVariable("id") Long id){
		return ResponseEntity.ok(clienteServicio.findById(id));
	}
	
	
}
