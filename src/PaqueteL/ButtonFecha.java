package PaqueteL;

import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.event.*;

public class ButtonFecha {
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable ( ) {
			public void run (){
				createAndShowGUI();
			}
		} ) ;		
	}
	public static void createAndShowGUI() {
		JFrame frame= new JFrame("Actividad 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l=new JLabel (getFecha());
		
		JButton b1= new JButton("Pulsa aqui para ver la fecha");
		frame.getContentPane().add(b1,BorderLayout.NORTH);
		frame.getContentPane().add(l,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
		b1.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.setText(getFecha());
				frame.pack();
				frame.setVisible(true);
			}
		});
		
	}
	public static String getFecha() {
		Calendar c = Calendar.getInstance();

		String dia, mes, annio,hour,minute,second;
			   
		dia = Integer.toString(c.get(Calendar.DATE));
		mes = Integer.toString(c.get(Calendar.MONTH)+1); //0 a 11
		annio = Integer.toString(c.get(Calendar.YEAR));
		hour = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
	    minute = Integer.toString(c.get(Calendar.MINUTE));
	    second = Integer.toString(c.get(Calendar.SECOND));
	    
	    String f= "La fecha de hoy es: " + dia + "/" + mes +"/" + annio+ "/"+ hour + ":" + minute+ ":"+second;
		return f;
	}
	
}

