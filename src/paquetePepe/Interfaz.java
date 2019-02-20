package paquetePepe;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Interfaz {
	
	public static void main(String[] args) {
		JFrame frame= new JFrame("HELLO WORLD SWING");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label= new JLabel("Hello world");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
	}

}
