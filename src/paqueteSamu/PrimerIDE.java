package paqueteSamu;

import java.awt.BorderLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimerIDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mensaje hello world
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel emptyLabel1= new JLabel("hello world!!");
		frame.getContentPane().add(emptyLabel1,BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
		
		//ponemos un calendario
		Calendar rightNow = Calendar.getInstance();
		JLabel emptyLabel2= new JLabel(rightNow.getTime().toString());
		frame.getContentPane().add(emptyLabel2,BorderLayout.CENTER);
		
		//ponemos un boton con el texto calendario 
		JButton b = new JButton(rightNow.getTime().toString());
		frame.getContentPane().add(b,BorderLayout.SOUTH);
		
		
		
	}

}
