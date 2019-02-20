package DanielDoblas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

//Crear una aplicación con dos paneles, uno arriba con una etiqueta y un área de texto en el que el usuario pueda escribir y
//otro panel abajo con un botón con la fecha y hora actuales y un desplegable con tres opciones distintas.





public class MyOwnFrame extends JFrame{
	String strdate=null;
	JComboBox combo;
	JButton button1 = new JButton(strdate);
	GridLayout Layout = new GridLayout(0,2);
	
	Calendar calendardate = Calendar.getInstance();

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 'a las' HH:mm:ss");
	
	
	public MyOwnFrame (String s) {
		super(s);
	

	}
	
	public void getFecha() {
		if (calendardate!=null) {
			strdate = sdf.format(calendardate.getTime());
		};

	}
	
	public void addComponentsToPane(final Container pane) {
		final JPanel arriba = new JPanel();
		arriba.setLayout(Layout);
		JPanel abajo = new JPanel();
		abajo.setLayout(new GridLayout(2,2));
		getFecha();
		abajo.add(button1);
		abajo.add(combo);
		
		 pane.add(arriba, BorderLayout.NORTH);
	     pane.add(new JSeparator(), BorderLayout.CENTER);
	     pane.add(abajo, BorderLayout.SOUTH);
		
	}

	
	
}
