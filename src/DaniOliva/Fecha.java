package DaniOliva;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Fecha extends JPanel{
	
	private String dia;
	private String mes;
	private String anyo;
	private String hora;
	private String min;
	private String seg;
	private Calendar cal;
	private JLabel l1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola a todos");
		JButton bFecha=new JButton("Pulsa para ver la fecha");
	}

	public void fecha() {
		cal= Calendar.getInstance();
	
		dia = Integer.toString(cal.get(Calendar.DATE));
		mes = Integer.toString(cal.get(Calendar.MONTH));
		anyo = Integer.toString(cal.get(Calendar.YEAR));
		hora= Integer.toString(cal.get(Calendar.HOUR_OF_DAY));
		min= Integer.toString(cal.get(Calendar.MINUTE));
		seg= Integer.toString(cal.get(Calendar.SECOND));
		System.out.println(dia +"/"+ mes + "/" + anyo+ "a las " +hora+ ":" +min+ ":" +seg);
	}
	
	public Fecha() {
		setLayout(new BorderLayout ( ) ) ;
		add(new JLabel("My north label") , BorderLayout . NORTH) ;
		add(new JLabel("My south label") , BorderLayout . SOUTH) ;
		
	}
	
	
	
}
