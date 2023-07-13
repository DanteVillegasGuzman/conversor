package com.per.conversor.modelo;

import java.util.ArrayList;
import java.util.List;

public class DatosUnidadDeConversion {
	private Object[][] arrayMonedas, arrayTemperaturas,arrayLongitudes,arrayAlmacenamientos;
	private List listaOpcionesCambioMoneda;
	
	public Object[][] arrayMonedasReferencia() {
		// TODO Auto-generated method stub
		
		this.arrayMonedas=new Object[][]{
			//{"Codigo","Nombre","Zona","UnidadMedida","FactorConversion"},
			{"S/","Sol",1.0},
			{"$","DolarEstadounidense",0.275903},
			{"€","Euro",0.253107},
			{"£","LibraEsterlina",0.21749},
			{"¥","YenJapones",39.9514},
			{"₩","WonSurCoreano",359.102}
			};
		
		return arrayMonedas;
	}	
	
	public Object[][] arrayTemperaturasReferencia() {
		// TODO Auto-generated method stub
		
		this.arrayTemperaturas=new Object[][]{
			//{"Codigo","Nombre",partnumerador,denominador,},
			{"°C","Celsius",0.0,5.0},
			{"°K","Kelvin",273.0,5.0},
			{"°F","Fahrenheit",32.0,9.0},
			{"°Ra","Rankine",492.0,9.0},
			{"°Re","Reaumur",0.0,4.0},
			{"°Ro","Romer",7.5,2.625},
			{"°N","Newton",0.0,1.65},
			{"°De","Delisle",100.0,3.333}//7.5-3.33
			};
		
		return arrayTemperaturas;
	}	
	
	public Object[][] arrayLongitudesReferencia() {
		// TODO Auto-generated method stub
		
		this.arrayLongitudes=new Object[][]{
			//{"Codigo","Nombre",partnumerador,denominador,},
			{"m","metro",1.0},
			{"dam","decametro",0.1},
			{"hm","hectometro",0.01},
			{"km","kilometro",0.001},
			{"dm","decimetro",10.0},
			{"cm","centimetro",100.0},
			{"mm","milimetro",1000.0},
			{"um","micrometro",1000000.0},
			{"nm","nanometro",1000000000.0},
			{"pulg","pulgada",39.3701},
			{"pie","pie",3.28084},
			{"yarda","yarda",1.09361},
			{"milla","milla",6.21371}
		};
		
		return arrayLongitudes;
	}
	
	public Object[][] arrayAlmacenamientosReferencia() {
		// TODO Auto-generated method stub
		
		this.arrayAlmacenamientos=new Object[][]{
			//{"Codigo","Nombre",partnumerador,denominador,},
			{"B","byte",0.0},
			{"KB","kilobyte",10.0},
			{"MB","megabyte",20.0},
			{"GB","gigabyte",30.0},
			{"TB","terabyte",40.0},
			{"PB","petabyte",50.0},
			{"EB","exabyte",60.0},
			{"ZB","zettabyte",70.0},
			{"YB","yottabyte",80.0},
			{"BB","brontobyte",90.0},
			{"GeB","geopbyte",100.0}			
		};
		
		return arrayAlmacenamientos;
	}

}
