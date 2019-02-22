package susanaPackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPanelWithAnonymousCtrl extends JPanel{
	private JButton bY , bN ;
	private JLabel l ;
	private JPanel panel1;
	private JPanel panel2;
	
	public ViewPanelWithAnonymousCtrl(){
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		setLayout(new GridLayout(0, 1));
		bY = new JButton("Yes");
		bN = new JButton("NO");
		l = new JLabel("True?");
		bY.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				l.setText("Pressed Yes");
				}
			});
		bN . addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				l.setText("Pressed No") ;
			}
			});
		//add(l) ;
		//add(bY) ;
		//add(bN) ;
		panel1.add(l, BorderLayout.LINE_START);
		panel2.add(bY, BorderLayout.EAST);
		panel2.add(bN, BorderLayout.WEST);
		this.add(panel1);
		this.add(panel2);
		
	}
	
	public void changeText(String s) {
		l.setText(s) ;
	}
	
	public interface WindowPanelWithExternalCtrl {
		public static String YES = "Yes" ;
		public static String NO = "No" ;
		public void controller(ActionListener ctr) ;
		public void changeText(String s) ;
		}

}
