package paqueteSamu;


import java.awt.BorderLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwoPaneApp {
	public TwoPaneApp() {
		JFrame topLevelContainer = new JFrame ( ) ;
		Calendar rightNow = Calendar.getInstance();
		// primera etiqueta
		JPanel contentPane1 = new JPanel(new BorderLayout ( ) ) ;
		contentPane1.add(new JLabel(rightNow.getTime().toString()),BorderLayout.NORTH);
		topLevelContainer.setContentPane(contentPane1);
		topLevelContainer.setVisible(true);
		// segundo boton
		JPanel contentPane2 = new JPanel(new BorderLayout ( ) ) ;
		contentPane2.add(new JButton(rightNow.getTime().toString()), BorderLayout.SOUTH);
		topLevelContainer.setVisible(true);
	}
	
}
