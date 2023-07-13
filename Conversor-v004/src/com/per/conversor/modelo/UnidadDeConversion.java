package com.per.conversor.modelo;

import java.util.List;

public class UnidadDeConversion {
	
	protected Double cantidad;//unidad a medir o convertir
	private String zona;//procedencia
	private String nombre;//moneda-temperatura
	private String codigo;//abreviatura
	private String unidadMedida;//unidad de medicion
	private Double factorConversion;//		

	public  Double getcantidad()
	{		return cantidad;	}

	public  void setcantidad(Double cantida) 
	{		this.cantidad = cantida;	}
	
	public  void limpiarcantidad() 
	{		this.cantidad=0.0;	}	
	
	@Override
	public String toString() {		
		String mensaje=" zona: "+this.zona+" Nombre: "+this.nombre+" codigo: "+this.codigo+" unidadMedida: "+this.unidadMedida+" factorConversion: "+this.factorConversion;
		return mensaje;		
	}	
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public Double getFactorConversion() {
		return factorConversion;
	}

	public void setFactorConversion(Double factorConversion) {
		this.factorConversion = factorConversion;
	}
	
	public String eliminarVacios(String str) {
		String txt="";
		txt=str.trim();		
		return txt;
	}
	
	public Boolean verificarCantidad(String cantida) {
		
		Boolean rspt=false;
		/*if(cantida==""||cantida==null || cantida.isBlank() || cantida.isEmpty()) {		
			rspt=false;				
		}	*/		
		
		if(cantida.trim().matches("^[0-9]+([.][0-9]+)?$") /*&& Double.valueOf(cantida.trim())>0*/) {
			rspt=true;			
		}		
		return rspt;
	}
	public String cambiarUnidadDeConversion(Double cantidad,String origenconversion,String destinoconversion) 
	{				return "";	}
	
	
}
