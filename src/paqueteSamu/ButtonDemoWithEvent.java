package paqueteSamu;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonDemoWithEvent extends JPanel {
	protected JButton b1;
	public ButtonDemoWithEvent(ActionListener a1) {
		b1 = new JButton("The one and only button");	
		
	}
}
