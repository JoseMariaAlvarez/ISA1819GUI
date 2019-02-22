package ejercicioBotonesyPaneles;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Aplicación2 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
	private static void createAndShowGUI() {
		JFrame frame= new JFrame("Aplicación 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label= new JLabel(getFecha());
		frame.getContentPane().add(label, BorderLayout.NORTH);
		JButton but = new JButton("Pulsame");
		but.setVisible( true );
		frame.getContentPane().add(but,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){ 
				label.setText(getFecha());
				frame.pack();
				frame.setVisible(true);
	        }  
	    });  
		
		
		}
		private static String getFecha() {
			Calendar ca= Calendar.getInstance();
			String di=Integer.toString(ca.get(Calendar.DATE));
			String me= Integer.toString(ca.get(Calendar.MONTH)+1);
			String an = Integer.toString(ca.get(Calendar.YEAR));
			String ho=Integer.toString(ca.get(Calendar.HOUR));
			String mi = Integer.toString(ca.get(Calendar.MINUTE));
			String se = Integer.toString(ca.get(Calendar.SECOND));
			String f=di + "/"+ me+ "/" + an+ " "+ ho+ ":"+mi+":"+se;
			return f;
			
	}
}
