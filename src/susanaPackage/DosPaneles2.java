/*
 * Crear una aplicación con dos paneles, uno arriba con una etiqueta y un área de texto 
   en el que el usuario pueda escribir y 
  otro panel abajo con un botón con la fecha y hora actuales y un desplegable con tres opciones distintas.
 */

package susanaPackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DosPaneles2 extends JFrame{

	private static int NUM_COLUM = 25;
	private static int NUM_FILA = 25;
	
	
	private JPanel panelArriba;
	private JPanel panelAbajo;
	
	JLabel etiqueta;
	JTextArea AreaTexto;
	
	JButton boton;
	JComboBox <String> desplegable;
	
	public DosPaneles2(){
		
		panelArriba = new JPanel();
		panelAbajo = new JPanel();
		
		setLayout(new GridLayout(0, 1));
		
		//Panel superior:
		etiqueta = new JLabel ("Aqui puedes escribir: ");
		AreaTexto = new JTextArea(NUM_COLUM, NUM_FILA);
		panelArriba.add(etiqueta, BorderLayout.AFTER_LAST_LINE);
		panelArriba.add(AreaTexto, BorderLayout.CENTER);
		
		//Panel inferior:
		
		boton = new JButton(BorderLayout.WEST);
		String [] desple = new String []{"Opcion1", "Opcion2", "Opcion3"};
		desplegable = new JComboBox <String>(desple);
		desplegable.setVisible(true);
		add(desplegable, BorderLayout.EAST);
		panelAbajo.add(boton);
		panelAbajo.add(desplegable);
		
		
		this.add(panelArriba);
		this.add(panelAbajo);
	}

	
}
