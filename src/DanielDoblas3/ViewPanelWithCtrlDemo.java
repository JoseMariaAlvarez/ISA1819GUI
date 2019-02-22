package DanielDoblas3;

import javax.swing.JFrame;

import DanielDoblas2.ButtonDemoWithEvent;

public class ViewPanelWithCtrlDemo {

	public static void main (String[] args) {
		ViewPanelWithAnonymousCtrl winPanel = new ViewPanelWithAnonymousCtrl();
		JFrame frame = new JFrame("An anonumous control example");
		frame.pack();
		frame.setVisible(true);
		
		winPanel.setOpaque(true) ;
		//content panes must be opaque
		frame.setContentPane(winPanel); 
	}
}
