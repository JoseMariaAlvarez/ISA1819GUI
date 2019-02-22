package DanielDoblas3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewPanelWithAnonymousCtrl extends JPanel{
	
	private JButton bY,bN;
	private JLabel l;
	
	public ViewPanelWithAnonymousCtrl( ){
		setLayout(new GridLayout(3,1) ) ;
		bY=new JButton("Yes") ;
		bN=new JButton("NO") ;
		l=new JLabel("True?") ;
		bY.addActionListener(new ActionListener( ){
			public void actionPerformed(ActionEvent e){
				l.setText("Pressed Yes") ;}
		} );
		bN.addActionListener(new ActionListener( ){
			public void actionPerformed(ActionEvent e){
				l.setText("Pressed No");}} );
		add(l) ;
		add(bY) ;
		add(bN) ;}
	
	public void changeText(String s)   {l.setText(s) ;}
}