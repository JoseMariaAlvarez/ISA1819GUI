//crear una aplicacion con una etiqueta con la fecha y hora actual 
package pckYang;
import java.awt.BorderLayout;

import javax.swing.*;


public class p01 {
		private JFrame f;
		private JLabel timeLabel;
		private JLabel dateLabel;
		p01(){
			init();
		}
		public static void main(String[] args) {
			new p01();
		}
		public void init() {
			f= new JFrame("Frame01");
			JPanel panel = (JPanel) f.getContentPane();
			timeLabel=new JLabel("time");
			dateLabel=new JLabel("date");
			panel.add(timeLabel,BorderLayout.CENTER);
			f.setVisible(true);
		}
		
}
