package paqueteSamu;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimerIDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel emptyLabel= new JLabel("hola que tal");
		frame.getContentPane().add(emptyLabel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
