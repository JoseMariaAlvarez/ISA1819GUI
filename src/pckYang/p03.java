//Crear una aplicación con dos paneles, uno arriba con una etiqueta con la fecha actual 
//y otro abajo con un botón con la fecha actual
package pckYang;

import java.awt.FlowLayout;
import javax.swing.*;;

public class p03 extends p02{
	public JPanel panel_label;
	public JLabel label;
	public p03() {
		label=configLabel(label);
		panel_label=new JPanel();
		panel_label.add(label);
		this.setLayout(new FlowLayout());
		this.add(panel_label);
		this.setLocationRelativeTo(null);
	    this.setVisible(true);
		this.d_button.setBounds(10,55,300,30);
		panel_label.setBounds(10, 10, 300, 30);
	}
	
	public JLabel configLabel(JLabel l) {
		l=new JLabel(timeOutput());	
		return l;
	}	
	
	
}
	