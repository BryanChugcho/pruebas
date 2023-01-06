package com.alquimia.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String TIPOID_CLIENTE;
	private String NUMID_CLIENTE; 
	private String NOMBRES_CLIENTE ; 
	private String CORREO_CLIENTE ; 
	private String CELULAR_CLIENTE;
	
	@ManyToOne
	@JoinColumn (name = "ID_DIRECCION")
	private Direccion direccion;
	
	
	
	public Cliente(Long id, String TIPOID_CLIENTE, String NUMID_CLIENTE, String NOMBRES_CLIENTE, String CORREO_CLIENTE,String CELULAR_CLIENTE) {
		this.id=id;
		this.TIPOID_CLIENTE=TIPOID_CLIENTE;
		this.NUMID_CLIENTE=NUMID_CLIENTE;
		this.NOMBRES_CLIENTE=NOMBRES_CLIENTE;
		this.CORREO_CLIENTE=CORREO_CLIENTE;
		this.CELULAR_CLIENTE=CELULAR_CLIENTE;
	}

	public String getTIPOID_CLIENTE() {
		return TIPOID_CLIENTE;
	}

	public void setTIPOID_CLIENTE(String TIPOID_CLIENTE) {
		this.TIPOID_CLIENTE = TIPOID_CLIENTE;
	}

	public String getNOMBRES_CLIENTE() {
		return NOMBRES_CLIENTE;
	}

	public void setNOMBRES_CLIENTE(String NOMBRES_CLIENTE) {
		this.NOMBRES_CLIENTE = NOMBRES_CLIENTE;
	}

	public String getNUMID_CLIENTE() {
		return NUMID_CLIENTE;
	}

	public void setNUMID_CLIENTE(String NUMID_CLIENTE) {
		this.NUMID_CLIENTE = NUMID_CLIENTE;
	}

	public String getCORREO_CLIENTE() {
		return CORREO_CLIENTE;
	}

	public void setCORREO_CLIENTE(String CORREO_CLIENTE) {
		this.CORREO_CLIENTE = CORREO_CLIENTE;
	}

	public String getCELULAR_CLIENTE() {
		return CELULAR_CLIENTE;
	}

	public void setCELULAR_CLIENTE(String CELULAR_CLIENTE) {
		this.CELULAR_CLIENTE = CELULAR_CLIENTE;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	
	
	
}
