package paqueteSamu;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio1 {
	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Ejercicio 1"); //creamos la ventana
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerramos la app cuando cerramos la ventana
		JPanel panel1 = new JPanel(); //creamos un panel
		frame1.setContentPane(panel1); //a�adimos el panel a la ventana
		Calendar rightNow = Calendar.getInstance();//creamos un calendario
		JLabel fecha= new JLabel(rightNow.getTime().toString());//creamos una etiqueta con la fecha
		panel1.add(fecha);//a�adimos la fecha al panel
		frame1.pack();//establecemos el tama�o de la ventana
		frame1.setVisible(true);//ponemos la ventana visible
		
	}
}
