package paqueteSamu;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Ejercicio2 {
	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Ejercicio 2"); //creamos la ventana
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerramos la app cuando cerramos la ventana
		JPanel panel1 = new JPanel(); //creamos un panel
		frame1.setContentPane(panel1); //añadimos el panel a la ventana
		Calendar rightNow = Calendar.getInstance();//creamos un calendario
		JButton fecha = new JButton(rightNow.getTime().toString());//creamos un boton con la fecha
		panel1.add(fecha);//añadimos la fecha al panel
		frame1.pack();//establecemos el tamaño de la ventana
		frame1.setVisible(true);//ponemos la ventana visible

	}
}
