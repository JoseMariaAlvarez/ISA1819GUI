package susanaPackage;

import javax.swing.JFrame;

public class ViewPanelWithAnonymousMain {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("An anonymous control example") ;
		frame.setDefaultCloseOperation(JFrame . EXIT_ON_CLOSE) ;
		//SimpleEventListenerClass aListener = new SimpleEventListenerClass ( ) ;
		ViewPanelWithAnonymousCtrl newContentPane = new ViewPanelWithAnonymousCtrl() ;
		newContentPane.setOpaque(true) ; //content panes must be opaque
		frame.setContentPane(newContentPane) ;
		frame.pack();
		frame.setVisible(true) ;
		

	}

	/*
	 * SwingUtilities . invokeLater(new Runnable ( ) {
	public void run ( ) {
	createAndShowGUI ( ) ;
	}

	 */
}
