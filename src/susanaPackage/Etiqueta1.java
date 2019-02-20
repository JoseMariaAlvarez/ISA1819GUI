package susanaPackage;

import java.awt.Dimension;
import java.util.Date;

import javax.swing.*;

public class Etiqueta1 extends JFrame{

	public Etiqueta1(String s) {
		super(s);
		setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
		Date fecha = new Date();
		JLabel aLabel = new JLabel(); 
		aLabel.setPreferredSize(new Dimension(175 , 100));
		
	   getContentPane().add(aLabel);
	}
}
