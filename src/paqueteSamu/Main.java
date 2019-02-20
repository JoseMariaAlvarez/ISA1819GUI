package paqueteSamu;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities . invokeLater(new Runnable ( ) {
			public void run ( ) {
				MyOwnFrame frame = new MyOwnFrame("FrameDemo2") ;
				//Display the window.
				frame . pack ( ) ;
				frame . setVisible(true) ;
			}
		} ) ;
	}




}
