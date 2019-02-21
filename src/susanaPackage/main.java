package susanaPackage;

import javax.swing.SwingUtilities;

public class main {
	public static void main(String[] args) {
	SwingUtilities.invokeLater ( new Runnable(){
		
			 public void run ( ){
			//MyOwnFrame frame = new MyOwnFrame("FrameDemo2"); //Display the window.
			//Etiqueta1 frame2 = new Etiqueta1("FrameDemo2"); // Ejercicio 1
			//BotonUnico1 frame2 = new BotonUnico1("Boton con Fecha actual "); //Ejercicio 2
			//BotonUnico frame2 = new BotonUnico("Boton con Fecha actual "); //Ejercicio 2.1
			//DosPaneles frame2 = new DosPaneles("Etiqueta y boton"); //Ejercicio3
			DosPaneles2 frame2 = new DosPaneles2(); //Ejercicio 4
			frame2.pack() ;
			frame2.setVisible(true);
		
			 }
			});
	
}
}
