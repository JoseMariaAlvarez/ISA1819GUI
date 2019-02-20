//Crear una aplicación con un botón con la fecha y hora actuales:
	
package susanaPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;






public class BotonUnico extends JFrame implements ActionListener{
	private JLabel etiqueta;
	private JButton boton1;
	
	public BotonUnico(String s) {
		super(s);
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );
		Date fecha = new Date();
		boton1 = new JButton();
		etiqueta = new JLabel("Fecha y hora actual: ");
		
		boton1.setPreferredSize(new Dimension(375, 200));
		
		getContentPane().add(boton1, BorderLayout.CENTER);
		   
	}
	public void actionPerformed(ActionEvent e) {
	    
		etiqueta.setText("Has pulsado el botón ");			
	  }	
}
