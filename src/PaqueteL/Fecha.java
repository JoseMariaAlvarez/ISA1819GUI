package PaqueteL;

import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Fecha {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Hola mundo!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b1= new JButton("Pulsa aqui para ver la fecha");
		frame.getContentPane().add(b1);
		frame.pack();
		frame.setVisible(true);
		
		fecha();
	}


	public static void fecha() {
		
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);      // 0 to 11
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n",  // Pad with zero
				year, month+1, day, hour, minute, second);
	
		
	}
	
}
