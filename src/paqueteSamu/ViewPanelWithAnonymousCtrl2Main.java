package paqueteSamu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPanelWithAnonymousCtrl2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame view = new JFrame("prueba con dos paneles");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.RED);
		view.add(panel1,BorderLayout.NORTH);
		view.add(panel2,BorderLayout.SOUTH);
		view.pack();
		view.setVisible(true);
		
		JButton bY = new JButton("Yes");
		JButton bN = new JButton("No");
		JLabel l = new JLabel("True?");
		bY . addActionListener(new ActionListener ( ) {
			public void actionPerformed(ActionEvent e) {
			l . setText("Pressed Yes") ;
			}
			} ) ;
		bN . addActionListener(new ActionListener ( ) {
			public void actionPerformed(ActionEvent e) {
			l . setText("Pressed No") ;
			}
			} ) ;
		panel1.add(bY);
		panel1.add(bN);
		panel2.add(l);
		
		
		
		
	}

}
