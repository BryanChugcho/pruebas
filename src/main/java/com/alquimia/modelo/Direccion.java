package com.alquimia.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table (name = "direccion")
public class Direccion {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID_DIRECCION;
	private String PROVINCIA;
	private String CIUDAD;
	private String DIRECCION;
	
	
	@OneToMany(mappedBy = "cliente")
	private List<Cliente> cliente;
	
	public Long getID_DIRECCION() {
		return ID_DIRECCION;
	}
	public void setID_DIRECCION(Long iD_DIRECCION) {
		this.ID_DIRECCION = iD_DIRECCION;
	}
	public String getPROVINCIA() {
		return PROVINCIA;
	}
	public void setPROVINCIA(String PROVINCIA) {
		this.PROVINCIA = PROVINCIA;
	}
	public String getCIUDAD() {
		return CIUDAD;
	}
	public void setCIUDAD(String CIUDAD) {
		this.CIUDAD = CIUDAD;
	}
	public String getDIRECCION() {
		return DIRECCION;
	}
	public void setDIRECCION(String DIRECCION) {
		this.DIRECCION = DIRECCION;
	}
	
}
