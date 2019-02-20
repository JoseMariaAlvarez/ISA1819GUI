package DanielDoblas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyOwnFrame extends JFrame{

	public MyOwnFrame(String s) {
		super (s);
		//Que hacer al cerrar
		setDefaultCloseOperation(JFrame . EXIT_ON_CLOSE) ;
		
	
		
		//A�adir Label B
		JLabel bLabel = new JLabel("Fecha Actual") ;
		bLabel . setPreferredSize(new Dimension( 100 , 100) ) ;
		// A�adimos Label B al layout en el centro usando BorderLayout
		getContentPane ( ) . add(bLabel,BorderLayout.CENTER) ;
		
		
		// A�adir Calendario
		
		Calendar calendardate = Calendar.getInstance();
		
		JLabel clabel = new JLabel(calendardate.getTime().toString());
		getContentPane ( ) . add(clabel,BorderLayout.EAST) ;
	
		String strdate=null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 'a las' HH:mm:ss") ;
		if(calendardate!= null){
			strdate=sdf.format(calendardate.getTime( ) ) ;
		}
		clabel.setText(strdate);
		
	
		//Creamos el boton
		JButton boton1 = new JButton(strdate);
		//A�adimos el boton debajo de la fecha
		getContentPane().add(boton1, BorderLayout.SOUTH);
		//Ajusta todos los componentes del frame al tama�o maximo
		this.pack();
	}

}
