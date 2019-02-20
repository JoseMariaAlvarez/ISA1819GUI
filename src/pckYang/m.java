import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class m {

	private static void createAndShowGUI ( ) {
		//Create and set up the window.
		JFrame frame = new JFrame("HelloWorldSwing") ;
		frame . setDefaultCloseOperation(JFrame . EXIT_ON_CLOSE) ;
		JLabel label = new JLabel("Hello World") ;
		frame . getContentPane ( ) . add(label, BorderLayout.CENTER) ;
		//Display the window.
		frame . pack ( ) ;
		frame . setVisible(true) ;
	}

	public static void main (String[] arg) {
		SwingUtilities . invokeLater(new Runnable ( ) {
			public void run ( ) {
				createAndShowGUI ( ) ;
			}
		} ) ;
	}
}