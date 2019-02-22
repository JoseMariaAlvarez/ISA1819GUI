package PaqueteL;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonDemoWithEvent extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JButton b1 ;
	public ButtonDemoWithEvent(ActionListener al) {
		b1 = new JButton("The one and only button") ;
		b1 . addActionListener(al) ;
		add(b1) ;
	}
}
