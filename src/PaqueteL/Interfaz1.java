package PaqueteL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Interfaz1 {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
	
	private static void createAndShowGUI() {
		//esto es como se va a llamar 
		JFrame frame= new JFrame("HELLO WORLD SWING");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// la etiqueta que va a salir
		JLabel label= new JLabel("Hello world");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
		
	}

}
