/*
 * Crear una aplicación con dos paneles, 
 * uno arriba con una etiqueta con la fecha actual y otro abajo con un botón con la fecha 
 * actual:
 **/

package susanaPackage;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

public class DosPaneles extends JFrame{

	
	public DosPaneles(String s) {
		super(s);
		
		JPanel panelArriba = new JPanel(new BorderLayout());
		JPanel panelAbajo = new JPanel(new BorderLayout());
		JFrame frame = new JFrame();
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );
		
		Date fecha = new Date();
		
		JLabel aLabel = new JLabel("Fecha "); 
		JButton boton1 = new JButton("fecha:  " + fecha);
		
		boton1.setPreferredSize(new Dimension(300, 80));
		aLabel.setPreferredSize(new Dimension(300, 80));
		
		//panelArriba.setLayout(new BorderLayout());
		panelArriba.add(aLabel, BorderLayout.PAGE_START);
		//panelAbajo.setLayout(new BorderLayout());
		panelArriba.add(boton1, BorderLayout.PAGE_END);
		
		frame.setContentPane(panelArriba);
		frame.setContentPane(panelAbajo);
		frame.setVisible(true);
		
		Container con = getContentPane();
		
		con.add(panelArriba, BorderLayout.PAGE_START);
		con.add(panelAbajo, BorderLayout.PAGE_END);
		
		
		
	    }
	 
		
	
}
