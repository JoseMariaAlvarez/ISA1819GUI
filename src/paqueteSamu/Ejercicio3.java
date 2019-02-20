package paqueteSamu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame1= new JFrame("Ejercicio 3");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerramos la app cuando cerramos la ventana
		JPanel panel1 = new JPanel(); //creamos un panel
		JPanel panel2 = new JPanel(); //creamos un panel
		
		panel1.setBackground(Color.CYAN);//añadimos un color de fondo al panel
		panel2.setBackground(Color.RED);//añadimos un color de fondo al panel
		
		frame1.add(panel1,BorderLayout.NORTH);//colocamos el panel dentro de la ventana
		frame1.add(panel2,BorderLayout.SOUTH);//colocamos el panel dentro de la ventana
		
		frame1.pack();//establecemos el tamaño de la ventana
		frame1.setVisible(true);//ponemos la ventana visible
		
		Calendar rightNow = Calendar.getInstance();//creamos un calendario
		
		JLabel Etiquetafecha= new JLabel(rightNow.getTime().toString());//creamos una etiqueta con la fecha
		panel1.add(Etiquetafecha);//añadimos la fecha al panel
		
		JButton Botonfecha = new JButton(rightNow.getTime().toString());//creamos un boton con la fecha
		panel2.add(Botonfecha);//añadimos la fecha al panel


	}

}
