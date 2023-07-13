package com.per.conversor.modelo;

public class Longitud extends UnidadDeConversion{
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
		// TODO Auto-generated method stub
		super.limpiarcantidad();
		
	}

	@Override
	public String cambiarUnidadDeConversion(Double cantidad, String origenseleccion, String destinoseleccion) {
		// TODO Auto-generated method stub		
		datosunidaddeconversion=new DatosUnidadDeConversion();
		
		for(int j=0;j<datosunidaddeconversion.arrayLongitudesReferencia().length;j++) {			
			if(String.valueOf(datosunidaddeconversion.arrayLongitudesReferencia()[j][1]).equals(origenseleccion)) 
				fdcorigen= Double.valueOf((Double)datosunidaddeconversion.arrayLongitudesReferencia()[j][2]);
			if(String.valueOf(datosunidaddeconversion.arrayLongitudesReferencia()[j][1]).equals(destinoseleccion)) {				
				fdcdestino= Double.valueOf((Double)datosunidaddeconversion.arrayLongitudesReferencia()[j][2]);
				destinoint=Integer.valueOf(j);
			}		
		}		
		this.conversion=(cantidad*fdcdestino)/fdcorigen;		
		conversion=((conversion*100000)/100000.0);		
		this.resultado=this.conversion+" "+datosunidaddeconversion.arrayLongitudesReferencia()[destinoint][0];
		return this.resultado;
	}

}
