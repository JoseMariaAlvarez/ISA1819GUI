package PaqueteL;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ExternalCtrlDemo {
	public static void main(String [ ] args) {
		ViewPanelWithAnonymousCtrl winPanel =new ViewPanelWithAnonymousCtrl();
		JFrame mainWin = new JFrame("An anonymous control example") ;
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				createAndShowGUI();
			}
			
			private void createAndShowGUI() {
				mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainWin.setContentPane(winPanel);
				mainWin.pack();
				mainWin.setVisible(true);
			}
		});
	}
}

