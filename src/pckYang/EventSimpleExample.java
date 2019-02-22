package pckYang;

import javax.swing.JFrame;

public class EventSimpleExample {
	public static void main ( String [ ] args ) {
		JFrame frame = new JFrame("ButtonDemo") ;
		frame . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE ) ;
		ViewPanelWithAnonymousCtrl aListener = new ViewPanelWithAnonymousCtrl ( ) ;
		frame.add(aListener);
		frame.setSize(400,400);
		frame . setVisible ( true ) ; }
}
