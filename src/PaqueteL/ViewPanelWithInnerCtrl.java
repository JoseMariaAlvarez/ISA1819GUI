package PaqueteL;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPanelWithInnerCtrl extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton bY , bN ;
	private JLabel l ;
	public ViewPanelWithInnerCtrl ( ) {
		setLayout(new FlowLayout ( ) ) ;
		bY = new JButton("Yes") ;
		bN = new JButton("NO") ;
		l = new JLabel("True?") ;
		ButtonControl bc = new ButtonControl ( ) ;
		bY . addActionListener(bc) ;
		bY . setActionCommand(WindowPanelWithExternalCtrl . YES) ;
		bN . addActionListener(bc) ;
		bN . setActionCommand(WindowPanelWithExternalCtrl . NO) ;
		add(l) ;
		add(bY) ;
		add(bN) ;
	}
	public void changeText(String s) {
		l . setText(s) ;
	}
	class ButtonControl implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String command = e . getActionCommand ( ) ;
			if (command == WindowPanelWithExternalCtrl . YES)
				l . setText("Pressed Yes") ;
			else if (command == WindowPanelWithExternalCtrl . NO)
				l . setText("Pressed No") ;
		}
	}
	public interface WindowPanelWithExternalCtrl {
		public static String YES = "Yes" ;
		public static String NO = "No" ;
		public void controller(ActionListener ctr) ;
		public void changeText(String s) ;
	}
}
