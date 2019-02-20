package susanaPackage;

import javax.swing.SwingUtilities;

public class main {
	public static void main(String[] args) {
	SwingUtilities.invokeLater ( new Runnable(){
		
			 public void run ( ){
			MyOwnFrame frame = new MyOwnFrame("FrameDemo2"); //Display the window.
			Etiqueta1 frame2 = new Etiqueta1("FrameDemo2");
			frame.pack() ;
			frame.setVisible(true);
			 }
			});
}
}
