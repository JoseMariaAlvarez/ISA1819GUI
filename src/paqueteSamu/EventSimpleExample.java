package paqueteSamu;

import javax.swing.JFrame;

public class EventSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("ButtonDemo") ;
		frame . setDefaultCloseOperation(JFrame . EXIT_ON_CLOSE) ;
		SimpleEventListenerClass aListener = new SimpleEventListenerClass ( ) ;
		ButtonDemoWithEvent newContentPane = new ButtonDemoWithEvent(aListener) ;
		newContentPane . setOpaque(true) ; //content panes must be opaque
		frame . setContentPane(newContentPane) ;
		frame . pack ( ) ;
		frame . setVisible(true) ;
		
	}

}
