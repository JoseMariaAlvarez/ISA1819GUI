/*
 * Crear una aplicación con dos paneles, uno arriba con una etiqueta y un área de texto en el que el usuario pueda escribir y 
otro panel abajo con un botón con la fecha y hora actuales y un desplegable con tres opciones distintas.
 */
package pckYang;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

public class p04 extends JFrame{
		private JPanel panel01;
		private JPanel panel02;
		private JTextArea areaText1;
		private JComboBox <String> areaText2;
		private JLabel label;
		private JButton button;
		
		public p04() {
				label=new JLabel(timeOutput());
				button=new JButton(timeOutput());
				areaText1=new JTextArea(30,30);
				areaText1.setCaretColor(Color.red);
				String[] list = new String[]{"A", "B", "C"};
				areaText2=new JComboBox<String> (list);
			    panel01=new JPanel();
			    panel01.add(label);
			    panel01.add(areaText1);
			    
			    
			    panel02=new JPanel();
			    panel02.add(button);
			    panel02.add(areaText2);
				this.add(panel01);
				this.add(panel02);
				this.setLayout(null);
				this.setSize(400, 400);
				panel01.setBounds(100, 100, 300, 50);
			    panel02.setBounds(100, 180, 300, 50);
			    this.setVisible(true);
			    
		}



public String timeOutput() {
	SimpleDateFormat t_format=new SimpleDateFormat("yy/MM/dd HH:mm");
	String time= t_format.format(Calendar.getInstance().getTime());
	return time;
}	

}