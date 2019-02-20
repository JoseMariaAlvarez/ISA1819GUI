package paquetePepe;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.util.Calendar;

public class HoraBoton {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
	
	private static void createAndShowGUI() {
		//esto es como se va a llamar 
		JFrame frame= new JFrame("HELLO WORLD SWING");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// la etiqueta que va a salir
		JLabel label= new JLabel("Hello world");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
		String dia = null,  mes=null,  ano=null,  hora=null,  min=null;
		fecha( dia,  mes,  ano,  hora,  min);
		JLabel label2= new JLabel(dia + "/"+ mes+ "/" + ano+ " "+ hora+ ":"+min);
		frame.getContentPane().add(label2);
		JButton b1= new JButton("Pulsame");
		frame.getContentPane().add(b1);
			
	}
	
	public static void fecha(String dia, String mes, String ano, String hora, String min) {
		Calendar cal= Calendar.getInstance();
		dia= Integer.toString(cal.get(Calendar.DATE));
		mes= Integer.toString(cal.get(Calendar.MONTH));
		ano= Integer.toString(cal.get(Calendar.YEAR));
		hora= Integer.toString(cal.get(Calendar.HOUR));
		min= Integer.toString(cal.get(Calendar.MINUTE));
		
	}

}
