//Crear una aplicación con una etiqueta con la fecha y hora actuales:

package susanaPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Date;

import javax.swing.*;

public class Etiqueta1 extends JFrame{

	public Etiqueta1(String s) {
		super(s);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );
		Date fecha = new Date();
		JLabel aLabel = new JLabel("Fecha: " + fecha); 
		aLabel.setPreferredSize(new Dimension(275, 200));
		
	   getContentPane().add(aLabel, BorderLayout.CENTER);
	}
}
