package paqueteSamu;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ViewPanelWithAnonymousCtrlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame("prueba");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewPanelWithAnonymousCtr1 view = new ViewPanelWithAnonymousCtr1();
		ventana.setContentPane(view);
		ventana.pack();
		ventana.setVisible(true);
		

	}

}
