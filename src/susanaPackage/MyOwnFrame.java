import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MyOwnFrame extends JFrame{
	public MyOwnFrame(String s) {
		super(s) ;
		setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE ) ;
		JLabel aLabel = new JLabel("Hello again") ; aLabel.setPreferredSize(new Dimension(175 , 100));
		
	   getContentPane().add(aLabel);
	}	
}
