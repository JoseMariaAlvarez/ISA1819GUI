package DanielDoblas;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyOwnFrame extends JFrame{

	public MyOwnFrame(String s) {
		super (s);

		setDefaultCloseOperation(JFrame . EXIT_ON_CLOSE) ;
		JLabel aLabel = new JLabel("Hello again") ;
		aLabel . setPreferredSize(new Dimension( 300 , 100) ) ;
		getContentPane ( ) . add(aLabel) ;
	}

}
