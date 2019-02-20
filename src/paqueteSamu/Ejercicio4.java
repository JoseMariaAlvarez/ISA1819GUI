package paqueteSamu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame1= new JFrame("Ejercicio 4");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerramos la app cuando cerramos la ventana
		JPanel panel1 = new JPanel(); //creamos un panel
		JPanel panel2 = new JPanel(); //creamos un panel

		panel1.setBackground(Color.CYAN);//añadimos un color de fondo al panel
		panel2.setBackground(Color.RED);//añadimos un color de fondo al panel

		frame1.add(panel1,BorderLayout.NORTH);//colocamos el panel dentro de la ventana
		frame1.add(panel2,BorderLayout.SOUTH);//colocamos el panel dentro de la ventana

		frame1.pack();//establecemos el tamaño de la ventana
		frame1.setVisible(true);//ponemos la ventana visible

		JTextField caja = new JTextField("area de texto",20);//creamos una caja de texto con texto por defecto y 20 columnas de espacio
		JLabel etiqueta = new JLabel();//creamos la etiqueta que queremos modificar
		caja.addActionListener(new ActionListener() {
			//creamos un evento nuevo para que pbtenga el texto de la caja y lo escriba en la etiqueta
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String input=caja.getText();//cogemos el texto
				etiqueta.setText(input);//lo escribimos en la etiqueta
			}
		});

		panel1.add(caja);//añadimos el area de texto al panel
		panel1.add(etiqueta);//añadimos la etiqueta al panel

		Calendar rightNow = Calendar.getInstance();//creamos un calendario
		JButton Botonfecha = new JButton(rightNow.getTime().toString());//creamos un boton con la fecha
		panel2.add(Botonfecha);//añadimos la fecha al panel
		
		String[] opciones = {"primera opcion","segunda opcion", "tercera opcion"};//opciones disponibles del desplegable
		JList<String> lista = new JList<String>(opciones);//creamos la lista de opciones
		lista.setVisibleRowCount(3);//numero de opciones visibles 
		JScrollPane barra = new JScrollPane(lista);//añadimos la barra de movimiento
		panel2.add(barra);//añadimos al panel 2
		
	}

}
