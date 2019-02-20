package PaqueteL;

import java.awt.Dimension ;
import javax.swing.JFrame ;
import javax.swing.JLabel ;
import javax.swing.SwingUtilities ;
	public class MyOwnFrame extends JFrame {
		
		private static final long serialVersionUID = 1L;
		
		public MyOwnFrame(String s){
			super(s) ;
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
			JLabel aLabel = new JLabel("Hello again") ;
			aLabel.setPreferredSize(new Dimension( 550 , 100 ) ) ;
			getContentPane().add(aLabel) ;
		}
	public static void main(String [ ] args) {
		//Create and set up the window.
		SwingUtilities.invokeLater(new Runnable ( ) {
			public void run (){
				MyOwnFrame frame = new MyOwnFrame("FrameDemo2") ;
				//Display the window.
				frame.pack();
				frame.setVisible(true) ;
			}
		} ) ;
	}
}