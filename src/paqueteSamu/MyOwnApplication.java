package paqueteSamu;
import javax.swing.*;
public class MyOwnApplication {
	static public void main(String args [ ] ) {
		SwingUtilities . invokeLater(new Runnable ( ) {
			public void run ( ) {
				JFrame topLevelContainer = new JFrame ( ) ;
				MyOwnPane contentPane = new MyOwnPane ( ) ;
				topLevelContainer . setContentPane(contentPane) ;
				topLevelContainer . pack ( ) ;
				topLevelContainer . setVisible(true) ;
			}
		} ) ;
	}


}