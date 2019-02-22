package ejercicioBotonesyPaneles;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
//Crear una aplicación con dos paneles, uno arriba con una etiqueta con la fecha actual y otro abajo con un botón con la fecha 
//actual
public class Aplicacion3 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
	
	private static void createAndShowGUI() {
		JFrame frame= new JFrame("Aplicación 3");
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JLabel label1= new JLabel(getFecha());
		panel1.add(label1);
		JButton but = new JButton(getFecha());     
		but.setVisible(true);
		panel2.add(but);
		frame.getContentPane().add(panel1, BorderLayout.NORTH);
		frame.getContentPane().add(panel2, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
