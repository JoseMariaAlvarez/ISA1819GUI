import javax.swing.*;
import java.awt.*;
public class frame {
	
	public static void main(String[] args) {
	
	JFrame frame = new JFrame("FrameDemo");
	frame.setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE) ;
	
	//creat empty label
	JLabel label=new JLabel("hola");
	
	frame . getContentPane ( ) . add ( label , BorderLayout.CENTER);
			frame.pack() ; 
			frame.setVisible ( true ) ;
			
	}	
	
	
}
