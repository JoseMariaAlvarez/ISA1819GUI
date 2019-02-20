package susanaPackage;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Date;

import javax.swing.*;

public class BotonUnico1 extends JFrame{
	public BotonUnico1(String s) {
		super(s);
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );
		Date fecha = new Date();
		JButton boton1 = new JButton("Fecha y hora actual: " + fecha);
		
		
		boton1.setPreferredSize(new Dimension(375, 200));
		
		getContentPane().add(boton1, BorderLayout.CENTER);
		   
		   
	}

}
