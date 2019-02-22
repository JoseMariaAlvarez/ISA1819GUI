package susanaPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEventListenerClass implements ActionListener{
	public SimpleEventListenerClass ( ) {}
	public void actionPerformed(ActionEvent e) {
	System . out . println("It seems someone pushed a button") ;
	System.out.println(e.getActionCommand());
	System.out.println(e.getModifiers());
	System.out.println(e.getWhen());
	System.out.println(e.paramString());
	}
}
