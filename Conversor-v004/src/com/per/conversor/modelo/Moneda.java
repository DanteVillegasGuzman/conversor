package com.per.conversor.modelo;

import java.util.List;
import com.per.conversor.modelo.DatosUnidadDeConversion;
public class Moneda extends UnidadDeConversion{
	
	private DatosUnidadDeConversion datosunidaddeconversion;	
	private Double fdcdestino=Double.valueOf(0),fdcorigen=Double.valueOf(0),conversion=Double.valueOf(0);
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
		
		for(int j=0;j<datosunidaddeconversion.arrayMonedasReferencia().length;j++) {			
			if(String.valueOf(datosunidaddeconversion.arrayMonedasReferencia()[j][1]).equals(origenseleccion)) 
				fdcorigen= (Double)datosunidaddeconversion.arrayMonedasReferencia()[j][2];
			if(String.valueOf(datosunidaddeconversion.arrayMonedasReferencia()[j][1]).equals(destinoseleccion)) {				
				{
					fdcdestino= (Double)datosunidaddeconversion.arrayMonedasReferencia()[j][2];
					destinoint=Integer.valueOf(j);
				}
			}		
		}		
		conversion=(cantidad*fdcdestino)/fdcorigen;		
		conversion=Double.valueOf(Math.round(conversion*1000)/1000.0);		
		resultado=conversion+" "+datosunidaddeconversion.arrayMonedasReferencia()[destinoint][0];
		return resultado;
	}	
}
