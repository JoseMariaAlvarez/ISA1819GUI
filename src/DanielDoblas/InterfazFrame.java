package DanielDoblas;

import javax.swing.SwingUtilities;

public class InterfazFrame {
	public static void main(String [ ] args) {
		//Create and set up the window.
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

