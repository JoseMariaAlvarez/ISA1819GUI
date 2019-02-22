package PaqueteL;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class ViewPanelWithAnonymousCtrl extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JButton bY , bN ;
	private JLabel l ;
	public ViewPanelWithAnonymousCtrl ( ) {
			
		setLayout(null ) ;
		bY = new JButton("Yes") ;
		bN = new JButton("NO") ;
		bY.setBounds(10,30,60,20);
		bN.setBounds(10,60,60,20);
		l = new JLabel("True?") ;
		bY . addActionListener(new ActionListener ( ) {
			public void actionPerformed(ActionEvent e) {
				l . setText("Pressed Yes") ;
			}
		} ) ;
		bN . addActionListener(new ActionListener ( ) {
			public void actionPerformed(ActionEvent e) {
				l . setText("Pressed No") ;
			}
		} ) ;
		add(l) ;
		add(bY) ;
		add(bN) ;
		
		
	}
	public void changeText(String s) {
		l . setText(s) ;
	}
}