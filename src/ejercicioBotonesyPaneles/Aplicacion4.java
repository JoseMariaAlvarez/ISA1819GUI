package ejercicioBotonesyPaneles;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
//Crear una aplicación con dos paneles, uno arriba con una etiqueta y un área de texto en el que el usuario pueda escribir y 
//otro panel abajo con un botón con la fecha y hora actuales y un desplegable con tres opciones distintas.


public class Aplicacion4 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
	
	private static void createAndShowGUI() {
		JFrame frame= new JFrame("Aplicación 4");
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JLabel label= new JLabel();
		JTextArea text= new JTextArea("Escriba");
		label.setText("ETIQUETA");
		text.setEditable(true);
		panel1.add(label,BorderLayout.NORTH);
		panel1.add(text,BorderLayout.SOUTH);
		JButton but= new JButton(getFecha());
		panel2.add(but, BorderLayout.NORTH);
		JComboBox <String> jComboBox1 = new javax.swing.JComboBox<>();
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opción 1", "Opción 2", "Opción 3" }));
		panel2.add(jComboBox1,BorderLayout.SOUTH);
		frame.getContentPane().add(panel1, BorderLayout.NORTH);
		frame.getContentPane().add(panel2, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){ 						
				but.setText(getFecha());
	        }  
	    });  	
	}
	private static String getFecha() {
		Calendar ca= Calendar.getInstance();
		String di=Integer.toString(ca.get(Calendar.DATE));
		String me= Integer.toString(ca.get(Calendar.MONTH));
		String an = Integer.toString(ca.get(Calendar.YEAR));
		String ho=Integer.toString(ca.get(Calendar.HOUR));
		String mi = Integer.toString(ca.get(Calendar.MINUTE));
		String se = Integer.toString(ca.get(Calendar.SECOND));
		String f=di + "/"+ me+ "/" + an+ " "+ ho+ ":"+mi+":"+se;
		return f;
}
	
}
