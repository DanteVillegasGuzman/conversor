package com.per.conversor.modelo;

import java.util.List;

public class Temperatura extends UnidadDeConversion{

	DatosUnidadDeConversion datosunidaddeconversion;
	Double escala=Double.valueOf(0);
	int origenescalanumero=0,destinoescalanumero=0;	
	Double partnumeradora=0.0,partnumeradorb=0.0,denominadora=0.0,denominadorb=0.0,delisleOrigen=-1.0,delisleDestino=1.0;
	Object [][] atr;
	String resultado="";	

	@Override
	public Double getcantidad() {
		// TODO Auto-generated method stub
		return super.getcantidad();
	}

	@Override
	public void setcantidad(Double cantida) {
		// TODO Auto-generated method stub
		super.setcantidad(cantida);		
	}

	@Override
	public void limpiarcantidad() {
		// TODO Auto-generated method stub
		super.limpiarcantidad();		
	}

	@Override
	public String cambiarUnidadDeConversion(Double cantidad, String origenescala, String destinoescala) {
		// TODO Auto-generated method stub		
		datosunidaddeconversion=new DatosUnidadDeConversion();
		atr=datosunidaddeconversion.arrayTemperaturasReferencia();
		for(int x=0;x<atr.length;x++)		{
			if(atr[x][1]==origenescala)	origenescalanumero=x;
			if(atr[x][1]==destinoescala)destinoescalanumero=x; 
		}
		partnumeradora=Double.valueOf((double)atr[origenescalanumero][2]);
		partnumeradorb=Double.valueOf((double)atr[destinoescalanumero][2]);
		denominadora=Double.valueOf((double)atr[origenescalanumero][3]);
		denominadorb=Double.valueOf((double)atr[destinoescalanumero][3]);
		
		if(origenescala.equals("Delisle") || destinoescala.equals("Delisle"))		{
			if(destinoescala.equals("Delisle")) {delisleDestino=-1.0;delisleOrigen=1.0;}
			this.escala=delisleDestino*(((((delisleOrigen*cantidad)-(partnumeradorb*delisleOrigen))/denominadorb)*denominadora)+(partnumeradora*delisleDestino));
		}
		else
			this.escala=(((cantidad-partnumeradora)/denominadora)*denominadorb)+partnumeradorb;
		
		this.escala=Double.valueOf(Math.round(escala*1000)/1000.0);	
		this.resultado=this.escala+" "+atr[destinoescalanumero][0];
		return this.resultado;
	}	
}
