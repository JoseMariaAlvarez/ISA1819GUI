package pckYang;

import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonDemoWithEvent extends JPanel{
	protected JButton b1;
	public ButtonDemoWithEvent ( ActionListener al ) { b1 = new JButton("The one and only button");
	b1.addActionListener ( al ) ;
	b1.setActionCommand("game over");
	this.add(b1) ;
	} 
}
