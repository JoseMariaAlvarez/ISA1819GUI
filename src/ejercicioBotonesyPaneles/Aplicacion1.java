package ejercicioBotonesyPaneles;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Aplicacion1 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
	private static void createAndShowGUI() {
		JFrame frame= new JFrame("Aplicación 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calendar cal= Calendar.getInstance();
		String dia= Integer.toString(cal.get(Calendar.DATE));
		String mes= Integer.toString(cal.get(Calendar.MONTH));
		String ano= Integer.toString(cal.get(Calendar.YEAR));
		String hora= Integer.toString(cal.get(Calendar.HOUR));
		String min= Integer.toString(cal.get(Calendar.MINUTE));
		JLabel label2= new JLabel(dia + "/"+ mes+ "/" + ano+ " "+ hora+ ":"+min);
		frame.getContentPane().add(label2);
		frame.pack();
		frame.setVisible(true);
	
	}
}
