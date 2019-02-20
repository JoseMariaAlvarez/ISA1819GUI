package paqueteSamu;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MyOwnPane extends JPanel {
	public MyOwnPane() {
		setLayout(new BorderLayout());
		add(new JLabel("My north label"),BorderLayout.NORTH);
		add(new JLabel("My south label"),BorderLayout.SOUTH);
		//Adding a menu bar
		
	}
}
