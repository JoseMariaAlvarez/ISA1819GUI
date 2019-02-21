//Crear una aplicación con un botón con la fecha y hora actuales
package pckYang;
import javax.swing.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class p02 extends JFrame{
		public JButton d_button;
		public JPanel display;

		public p02() {
			display=new JPanel();
			d_button=configButton(d_button);
			display.add(d_button);
			this.setContentPane(display);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(400,400);
			this.setLocationRelativeTo(null); 
		    this.setVisible(true);
		}

public String timeOutput() {
	SimpleDateFormat t_format=new SimpleDateFormat("yy/MM/dd HH:mm");
	String time= t_format.format(Calendar.getInstance().getTime());
	return time;
}
public JButton configButton(JButton b) {
		b=new JButton(timeOutput());	
		return b;
}	

}
