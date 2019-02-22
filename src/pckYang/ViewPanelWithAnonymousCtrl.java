package pckYang;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewPanelWithAnonymousCtrl extends JPanel{
	private JButton bY , bN ;
	private JLabel l;
	public ViewPanelWithAnonymousCtrl ( ) { 
	this.setLayout(null);
	
	bY = new JButton("Yes") ;
	bN = new JButton("NO") ;
	bY.setBounds(10,30,60,20);
	bN.setBounds(10,60,60,20);
	l = new JLabel("True?") ; 
	bY.addActionListener((ActionListener) new ActionListener(){
	public void actionPerformed ( ActionEvent e) {
			l.setText("Pressed Yes");
	} }) ;
	bN.addActionListener(new ActionListener(){ 
		public void actionPerformed ( ActionEvent e) {
	l.setText("Pressed No"); 
	l.setBounds(10,0,50,30);
	}
	}) ;
	add(l) ; add(bY) ; add(bN) ;
	}
	public void changeText ( String s ) { l.setText(s) ;
	}
	public interface WindowPanelWithExternalCtrl { public static String YES = "Yes";
	public static String NO = "No";
	public void controller(ActionListener ctr) ;
	public void changeText(String s) ; }

}
