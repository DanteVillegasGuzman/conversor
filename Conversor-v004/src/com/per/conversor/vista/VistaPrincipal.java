package com.per.conversor.vista;
import java.awt.*;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;

import com.per.conversor.modelo.DatosUnidadDeConversion;
import com.per.conversor.modelo.UnidadDeConversion;
public class VistaPrincipal {
	
	public JFrame ventana;
	public JPanel panelNort,panelCenter,panelCenterUp,panelCenterDown,panelSouth,panelWest;
	Container contenedor;
	JMenu menu;
	JMenuBar menubar;	
	public JMenuItem menuitemMonedas;		
	public JMenuItem menuitemTemperatura;
	public JMenuItem menuitemLongitud;
	public JMenuItem menuitemAlmacenamiento;
	public JMenuItem menuitemCerrar;
	
	public JLabel tituloJlbl,cantidadJlbl,conversionlbl,bienvenidaJlbl,modulolbl,notalbl,albl,resultadolbl;
	public JTextField cantidadJtxt,conversiontxt;
	public JComboBox<String> origenconversionesJcmb,destinoconversionesJcmb;
	public JButton conversionbtn;
	Dimension dimension,dimpanelNort,dimpanelCenter,dimpanelSouth,dimpanelWest;
	Color colorposterior,colorfrontal,colornimbusBase,colortext,colorfondotext;
	
	public VistaPrincipal(){
		initComponentes();		
	}
		
	public void initComponentes(){
		
		colornimbusBase=new Color(20,90,150);
		colortext=new Color(163,132,118);
		colorfondotext=new Color(100,100,100);	
		
		UIManager.put("nimbusBase", Color.black);
		UIManager.put("control", colornimbusBase);
		UIManager.put("ComboBox.background", Color.GRAY);
		UIManager.put("TextField.background", colorfondotext);
		UIManager.put("text", colortext);
		 try {
	            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (Exception e) {
	            // If Nimbus is not available, you can set the GUI to another look and feel.
	        }
		
		//creamos el JFrame
		ventana=new JFrame("CONVERSOR");
		ventana.setUndecorated(true);
		ventana.setLocation(200, 50);
		
		
		//ingresamos el panel general al contenedor
		contenedor=ventana.getContentPane();
		contenedor.setFocusable(true);
		//asignamos un patron de diseño al panel general
		contenedor.setLayout(new BorderLayout());
		
		//asignamos los tamaños a las dimensiones
		dimension=new Dimension(700,300);
		dimpanelNort=new Dimension(700,25);
		dimpanelCenter=new Dimension(650,250);
		dimpanelSouth=new Dimension(700,25);
		dimpanelWest=new Dimension(50,250);
		
		//atribuimos propiedades al JFrame
		ventana.setPreferredSize(dimension);
		ventana.setVisible(true);
		ventana.setResizable(false);		
		
		//Border border= BorderFactory.createLineBorder(colorposterior,1,true);
		
		//instanciamos nuestro JMenuBar
		menubar=new JMenuBar();
		//asignamos un titulo a nuestro JMenu general
		menu=new JMenu("CONVERSIONES");
		
		
		
		//asignaamos a los JMenuItem un titulo
		menuitemMonedas=new JMenuItem("Monedas");
		menuitemTemperatura=new JMenuItem("Temperatura");
		menuitemLongitud=new JMenuItem("Longitud");
		menuitemAlmacenamiento=new JMenuItem("Almacenamiento");
		menuitemCerrar=new JMenuItem("Salir");
		
		//añadimos los JMenuItem a nuestro JMenu
		menu.add(menuitemMonedas);
		menu.add(menuitemTemperatura);
		menu.add(menuitemLongitud);
		menu.add(menuitemAlmacenamiento);
		menu.add(menuitemCerrar);
		
		//añadimos el JMenu a nuestro JMenuBar
		menubar.add(menu);
		
		//añadimos el JMenuBar a nuestra ventana
		ventana.setJMenuBar(menubar);
		
		//instanciamos nuestros paneles
		panelNort=new JPanel();
		
		panelCenter=new JPanel();
		panelCenterUp=new JPanel();
		panelCenterDown=new JPanel();
		
		panelSouth=new JPanel();
		panelWest=new JPanel();
		
		
		//agregamos propiedades a nuestro panelWest
		colorposterior=new Color(20,90,150);//20,75,150
		panelWest.setBackground(colorposterior);
		panelWest.setLayout(new FlowLayout());
		
		//agregamos propiedades a nuestro panelCenter
		colorfrontal=new Color(20,95,150);//20,75,100
		panelCenter.setBackground(colorfrontal);
		panelCenter.setLayout(new FlowLayout());
		
		panelCenterUp.setBackground(colorfrontal);
		//agregamos propiedades a nuestro panelCenter
		panelCenterDown.setBackground(colorfrontal);
		//agregamos patron de diseño a nuestro panelCenterDown
		panelCenterDown.setLayout(new GridLayout(5,4));		
		
		//instanciamos nuestra etiquetas JLabel
		modulolbl=new JLabel();	
		modulolbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		tituloJlbl=new JLabel("CONVERSOR");
		tituloJlbl.setHorizontalAlignment(SwingConstants.CENTER);
		//tituloJlbl.setBounds(0, 0, 20, 50);
		
		bienvenidaJlbl=new JLabel();
		bienvenidaJlbl.setText("Bienvenidos");
		bienvenidaJlbl.setHorizontalAlignment(SwingConstants.CENTER);		
		//bienvenidaJlbl.setAlignmentY(10);
						
		cantidadJlbl=new JLabel();
		cantidadJlbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		conversionlbl=new JLabel();
		conversionlbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		albl=new JLabel();
		albl.setHorizontalAlignment(SwingConstants.CENTER);
		
		resultadolbl=new JLabel();
		resultadolbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		notalbl=new JLabel("ONE-Oracle Next Education - AluraLatam");
		notalbl.setHorizontalAlignment(SwingConstants.RIGHT);
		
		//instanciamos y agregamos atributos a nuestra caja de texto JTextField
		cantidadJtxt=new JTextField();
		cantidadJtxt.setText("0");
		
		conversiontxt=new JTextField();
		
		//instanciamos nuestra JComboBox
		origenconversionesJcmb=new JComboBox<String>();	
		destinoconversionesJcmb=new JComboBox<String>();
		
		//Border border= BorderFactory.createLineBorder(colorfondotxt.WHITE,1,true);
		//instanciamos nuestra JButton
		conversionbtn=new JButton();
		conversionbtn.setText("Convertir");	
		
		//establecemos y añadimos  atributos a panelNort
		panelNort.setSize(dimpanelNort);
		panelNort.add(tituloJlbl);
		panelNort.setVisible(false);
		panelNort.setBackground(colorposterior);
		
		//establecemos y añadimos  atributos a panelWest
		panelWest.setSize(dimpanelWest);		
		panelWest.add(modulolbl);
		panelWest.setVisible(true);
		
		//establecemos y añadimos  atributos a panelCenter-Up-Down
		panelCenter.setSize(dimpanelCenter);
		panelCenter.setVisible(true);
		
		panelCenterUp.setVisible(true);
		panelCenterUp.add(bienvenidaJlbl);
		
		panelCenterDown.setVisible(false);
		panelCenterDown.add(cantidadJlbl);
		panelCenterDown.add(cantidadJtxt);
		panelCenterDown.add(new JLabel(""));
		panelCenterDown.add(new JLabel(""));
		
		panelCenterDown.add(conversionlbl);		
		panelCenterDown.add(origenconversionesJcmb);
		panelCenterDown.add(new JLabel(""));
		panelCenterDown.add(new JLabel(""));
		
		panelCenterDown.add(albl);
		panelCenterDown.add(destinoconversionesJcmb);
		panelCenterDown.add(new JLabel(""));
		panelCenterDown.add(new JLabel(""));
		
		panelCenterDown.add(new JLabel(""));
		panelCenterDown.add(new JLabel(""));
		panelCenterDown.add(conversionbtn);
		panelCenterDown.add(new JLabel(""));
		
		panelCenterDown.add(new JLabel(""));
		panelCenterDown.add(new JLabel(""));
		panelCenterDown.add(resultadolbl);
		panelCenterDown.add(conversiontxt);		
		
		panelCenter.add(panelCenterUp);
		panelCenter.add(panelCenterDown);
				
		//establecemos y añadimos  atributos a panelSouth
		panelSouth.setSize(dimpanelSouth);
		panelSouth.add(notalbl);
		panelSouth.setVisible(false);	
		panelSouth.setBackground(colorposterior);
		
		//añadimos los paneles a nuestro panel general Contenedor	
		contenedor.add("North",panelNort);
		contenedor.add("West",panelWest);
		contenedor.add("Center",panelCenter);		
		contenedor.add("South",panelSouth);
		ventana.pack();
	}

}
