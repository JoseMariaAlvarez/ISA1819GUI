package PaqueteL;


import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class EtiquetaFecha {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		String dia, mes, annio,hour,minute,second;
			   
		dia = Integer.toString(c.get(Calendar.DATE));
		mes = Integer.toString(c.get(Calendar.MONTH)+1); //0 a 11
		annio = Integer.toString(c.get(Calendar.YEAR));
		hour = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
	    minute = Integer.toString(c.get(Calendar.MINUTE));
	    second = Integer.toString(c.get(Calendar.SECOND));

		JFrame frame= new JFrame("Actividad 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label= new JLabel("La fecha de hoy es: " + dia + "/" + mes +"/" + annio+ "/"+ hour + ":" + minute+ ":"+second);
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
	}
		
}
