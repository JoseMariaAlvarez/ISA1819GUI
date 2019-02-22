package DanielDoblas2;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonDemoWithEvent extends JPanel{
	protected JButton b1;
	public ButtonDemoWithEvent(ActionListener al){
		b1 = new JButton("The one and only buttton") ;
		b1.addActionListener(al) ;
		add(b1) ;
	}
}