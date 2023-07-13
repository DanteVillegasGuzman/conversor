package com.per.conversor.modelo;

public class Almacenamiento extends UnidadDeConversion{

	private DatosUnidadDeConversion datosunidaddeconversion;	
	private Double edcdestino=Double.valueOf(0),edcorigen=Double.valueOf(0),dedcdestino=Double.valueOf(0),conversion=Double.valueOf(0);
	private String resultado="";
	private Integer destinoint=0;
	
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
		super.limpiarcantidad();		
	}
	
	@Override
	public String cambiarUnidadDeConversion(Double cantidad, String origenseleccion, String destinoseleccion) {
		// TODO Auto-generated method stub
		datosunidaddeconversion=new DatosUnidadDeConversion();
		
		for(int j=0;j<datosunidaddeconversion.arrayAlmacenamientosReferencia().length;j++) {			
			if(String.valueOf(datosunidaddeconversion.arrayAlmacenamientosReferencia()[j][1]).equals(origenseleccion)) 
				edcorigen= (Double)datosunidaddeconversion.arrayAlmacenamientosReferencia()[j][2];
			if(String.valueOf(datosunidaddeconversion.arrayAlmacenamientosReferencia()[j][1]).equals(destinoseleccion)) {				
				{
					edcdestino= (Double)datosunidaddeconversion.arrayAlmacenamientosReferencia()[j][2];
					destinoint=Integer.valueOf(j);
				}
			}		
		}	
		dedcdestino=edcdestino-edcorigen;
		if(dedcdestino>0.0)conversion=cantidad/Math.pow(2,dedcdestino );	
		else conversion=cantidad*Math.pow(2,(dedcdestino*-1) );		
		//conversion=((conversion*1000)/1000.0);		
		resultado=conversion+" "+datosunidaddeconversion.arrayAlmacenamientosReferencia()[destinoint][0];
		return resultado;
	}	
}
