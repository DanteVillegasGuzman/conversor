package com.per.conversor.main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.per.conversor.controlador.ControladorUnidadDeConversion;
import com.per.conversor.modelo.DatosUnidadDeConversion;
import com.per.conversor.modelo.Moneda;
import com.per.conversor.modelo.UnidadDeConversion;
import com.per.conversor.vista.VistaPrincipal;

public class main {

	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			
		VistaPrincipal vistainicial;
		UnidadDeConversion unidaddeconversiones;
		ControladorUnidadDeConversion controladorunidaddeconversion;				
		
		vistainicial=new VistaPrincipal();		
		unidaddeconversiones=new UnidadDeConversion();
		controladorunidaddeconversion=new ControladorUnidadDeConversion(vistainicial);
		
	}

}
