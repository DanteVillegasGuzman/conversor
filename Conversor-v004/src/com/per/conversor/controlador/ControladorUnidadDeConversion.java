package com.per.conversor.controlador;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.per.conversor.modelo.Almacenamiento;
import com.per.conversor.modelo.DatosUnidadDeConversion;
import com.per.conversor.modelo.Longitud;
import com.per.conversor.modelo.Moneda;
import com.per.conversor.modelo.Temperatura;
import com.per.conversor.modelo.UnidadDeConversion;
import com.per.conversor.vista.VistaPrincipal;
public class ControladorUnidadDeConversion extends WindowAdapter implements ActionListener {
	
	private UnidadDeConversion unidaddeconversion;
	VistaPrincipal vistaprincipal;
	DatosUnidadDeConversion datosunidaddeconversion;
	Boolean rspta=false;

	public ControladorUnidadDeConversion(/*UnidadDeConversion udc ,*/VistaPrincipal vp) {
		// TODO Auto-generated method stub
		this.vistaprincipal=vp;		
		this.vistaprincipal.menuitemMonedas.addActionListener(this);	
		this.vistaprincipal.menuitemTemperatura.addActionListener(this);
		this.vistaprincipal.menuitemLongitud.addActionListener(this);
		this.vistaprincipal.menuitemAlmacenamiento.addActionListener(this);
		this.vistaprincipal.menuitemCerrar.addActionListener(this);
		this.vistaprincipal.ventana.addWindowListener(this);
		this.vistaprincipal.conversionbtn.addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String conversiontxt;	
		this.vistaprincipal.cantidadJtxt.setFocusable(true);
		this.datosunidaddeconversion=new DatosUnidadDeConversion();
		
		if(e.getSource()==this.vistaprincipal.menuitemCerrar) {
			this.vistaprincipal.ventana.dispose();
		}	
		
		if(e.getSource()==this.vistaprincipal.menuitemMonedas) {
			//System.out.println("menuitemMonedas");
			this.vistaprincipal.cantidadJtxt.setText("");
			this.vistaprincipal.conversiontxt.setText("");
			MostrarInterfaz(this.vistaprincipal,"Moneda","Cantidad","Conversion","Resultado",this.datosunidaddeconversion.arrayMonedasReferencia(),1);			
		}
		
		if(e.getSource()==this.vistaprincipal.menuitemTemperatura) {
			//System.out.println("menuitemTemperatura");
			this.vistaprincipal.cantidadJtxt.setText("");
			this.vistaprincipal.conversiontxt.setText("");
			MostrarInterfaz(this.vistaprincipal,"Temperatura","Grados","Escala","Resultado",this.datosunidaddeconversion.arrayTemperaturasReferencia(),1);			
		}
		
		if(e.getSource()==this.vistaprincipal.menuitemLongitud) {
			//System.out.println("menuitemLongitud");
			this.vistaprincipal.cantidadJtxt.setText("");
			this.vistaprincipal.conversiontxt.setText("");
			MostrarInterfaz(this.vistaprincipal,"Longitud","Cantidad","Medida","Resultado",this.datosunidaddeconversion.arrayLongitudesReferencia(),1);			
		}
		
		if(e.getSource()==this.vistaprincipal.menuitemAlmacenamiento) {
			System.out.println("menuitemAlmacenamiento");
			this.vistaprincipal.cantidadJtxt.setText("");
			this.vistaprincipal.conversiontxt.setText("");
			MostrarInterfaz(this.vistaprincipal,"Almacenamiento","Cantidad","Capacidad","Resultado",this.datosunidaddeconversion.arrayAlmacenamientosReferencia(),1);			
		}	
		
		if(e.getSource()==this.vistaprincipal.conversionbtn && this.vistaprincipal.modulolbl.getText()=="Moneda") {
			//System.out.println("Inicio conversionbtn");
			unidaddeconversion=new Moneda();
			this.vistaprincipal.cantidadJtxt.setText(unidaddeconversion.eliminarVacios(this.vistaprincipal.cantidadJtxt.getText()));
			
			if(unidaddeconversion.verificarCantidad(this.vistaprincipal.cantidadJtxt.getText())) {
				unidaddeconversion.setcantidad(Double.valueOf(this.vistaprincipal.cantidadJtxt.getText()));			
				conversiontxt=String.valueOf(unidaddeconversion.cambiarUnidadDeConversion(unidaddeconversion.getcantidad(),(String)this.vistaprincipal.origenconversionesJcmb.getSelectedItem(),(String)this.vistaprincipal.destinoconversionesJcmb.getSelectedItem()));
				this.vistaprincipal.cantidadJtxt.setFocusable(true);
				this.vistaprincipal.conversiontxt.setText(conversiontxt);
				//System.out.println("Fin conversionbtn");
			}
			else
				JOptionPane.showInternalMessageDialog(null, "Ingresa un dato valido", "INTENTEMOSLO DE NUEVO", JOptionPane.WARNING_MESSAGE);
		}
		
		if(e.getSource()==this.vistaprincipal.conversionbtn && this.vistaprincipal.modulolbl.getText()=="Temperatura") {
			//System.out.println("Inicio conversionbtn");
			unidaddeconversion=new Temperatura();
			this.vistaprincipal.cantidadJtxt.setText(unidaddeconversion.eliminarVacios(this.vistaprincipal.cantidadJtxt.getText()));
			if(unidaddeconversion.verificarCantidad(this.vistaprincipal.cantidadJtxt.getText())) {
				unidaddeconversion.setcantidad(Double.valueOf(this.vistaprincipal.cantidadJtxt.getText()));			
				conversiontxt=String.valueOf(unidaddeconversion.cambiarUnidadDeConversion(unidaddeconversion.getcantidad(),(String)this.vistaprincipal.origenconversionesJcmb.getSelectedItem(),(String)this.vistaprincipal.destinoconversionesJcmb.getSelectedItem()));
				this.vistaprincipal.cantidadJtxt.setFocusable(true);
				this.vistaprincipal.conversiontxt.setText(conversiontxt);
				//System.out.println("Fin conversionbtn");
			}
			else
				JOptionPane.showInternalMessageDialog(null, "Ingresa un dato valido", "INTENTEMOSLO DE NUEVO", JOptionPane.WARNING_MESSAGE);
		}
		
		if(e.getSource()==this.vistaprincipal.conversionbtn && this.vistaprincipal.modulolbl.getText()=="Longitud") {
			//System.out.println("Inicio conversionbtn");
			unidaddeconversion=new Longitud();
			this.vistaprincipal.cantidadJtxt.setText(unidaddeconversion.eliminarVacios(this.vistaprincipal.cantidadJtxt.getText()));
			
			if(unidaddeconversion.verificarCantidad(this.vistaprincipal.cantidadJtxt.getText())) {
				unidaddeconversion.setcantidad(Double.valueOf(this.vistaprincipal.cantidadJtxt.getText()));			
				conversiontxt=String.valueOf(unidaddeconversion.cambiarUnidadDeConversion(unidaddeconversion.getcantidad(),(String)this.vistaprincipal.origenconversionesJcmb.getSelectedItem(),(String)this.vistaprincipal.destinoconversionesJcmb.getSelectedItem()));
				this.vistaprincipal.cantidadJtxt.setFocusable(true);
				this.vistaprincipal.conversiontxt.setText(conversiontxt);
				//System.out.println("Fin conversionbtn");
			}
			else
				JOptionPane.showInternalMessageDialog(null, "Ingresa un dato valido", "INTENTEMOSLO DE NUEVO", JOptionPane.WARNING_MESSAGE);
		}
		if(e.getSource()==this.vistaprincipal.conversionbtn && this.vistaprincipal.modulolbl.getText()=="Almacenamiento") {
			//System.out.println("Inicio conversionbtn");
			unidaddeconversion=new Almacenamiento();
			this.vistaprincipal.cantidadJtxt.setText(unidaddeconversion.eliminarVacios(this.vistaprincipal.cantidadJtxt.getText()));
			
			if(unidaddeconversion.verificarCantidad(this.vistaprincipal.cantidadJtxt.getText())) {
				unidaddeconversion.setcantidad(Double.valueOf(this.vistaprincipal.cantidadJtxt.getText()));			
				conversiontxt=String.valueOf(unidaddeconversion.cambiarUnidadDeConversion(unidaddeconversion.getcantidad(),(String)this.vistaprincipal.origenconversionesJcmb.getSelectedItem(),(String)this.vistaprincipal.destinoconversionesJcmb.getSelectedItem()));
				this.vistaprincipal.cantidadJtxt.setFocusable(true);
				this.vistaprincipal.conversiontxt.setText(conversiontxt);
				//System.out.println("Fin conversionbtn");
			}
			else
				JOptionPane.showInternalMessageDialog(null, "Ingresa un dato valido", "INTENTEMOSLO DE NUEVO", JOptionPane.WARNING_MESSAGE);
		}
	}

	private void MostrarInterfaz(VistaPrincipal vp,String modulo,String origentxt,String destinotxt,String resultado,Object[][] dudc,int x){
		vp.panelNort.setVisible(true);
		vp.panelWest.setVisible(true);
		vp.panelCenter.setVisible(true);
		vp.panelCenterUp.setVisible(false);
		vp.panelCenterDown.setVisible(true);
		vp.panelSouth.setVisible(true);
		vp.ventana.pack();
		vp.modulolbl.setText(modulo);
		vp.cantidadJlbl.setText(origentxt);	
		vp.conversionlbl.setText(destinotxt);
		vp.albl.setText("a");
		vp.resultadolbl.setText(resultado);
		vp.origenconversionesJcmb.removeAllItems();
		vp.destinoconversionesJcmb.removeAllItems();
		
		for(int i=0;i<dudc.length;i++) {
			vp.origenconversionesJcmb.addItem((String)dudc[i][x]);
			vp.destinoconversionesJcmb.addItem((String)dudc[i][x]);
		}			
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		//this.vistaprincipal.ventana.dispose();
		System.exit(0);
	}
}
