package paqueteSamu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPanelWithAnonymousCtr1 extends JPanel {
	private JButton bY , bN ;
	private JLabel l ;
	public ViewPanelWithAnonymousCtr1 ( ) {
	setLayout(new FlowLayout ( ) ) ;
	bY = new JButton("Yes") ;
	bN = new JButton("NO") ;
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
