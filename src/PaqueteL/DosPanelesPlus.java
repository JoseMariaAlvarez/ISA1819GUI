package PaqueteL;

import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.*;

public class DosPanelesPlus {
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable ( ) {
			public void run (){
				createAndShowGUI();
			}
		} ) ;		
	}
	public static void createAndShowGUI() {
		
		JFrame frame= new JFrame("Ejercicio 4");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1= new JPanel();
		JPanel p2= new JPanel();
		
		
		JLabel l=new JLabel ("Escriba texto aquí: ");
		p1.add(l,BorderLayout.WEST);
		TextField t= new TextField(20);
		t.setEditable(true);
		p1.add(t, BorderLayout.EAST);
		
		JButton b1= new JButton(getFecha());
		p2.add(b1, BorderLayout.WEST);
		JComboBox <String> box=new JComboBox<>();
		box.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[]{"Opción 1", "Opcion 2","Opcion 3"}));
		p2.add(box, BorderLayout.EAST);
		
		frame.getContentPane().add(p1,BorderLayout.NORTH);
		frame.getContentPane().add(p2,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
		b1.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setText(getFecha());
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
