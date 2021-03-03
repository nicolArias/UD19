package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import punto1.Punto1View;
import punto2.Punto2View;
import punto3.Punto3View;


public class Menu extends JFrame{
	
	private static final long serialVersionUID = 1L;
	//Atributos
	private JPanel cPanel;
	private JLabel mensaje;
	private JComboBox opciones;
	private JButton btnEnviar;
	
	public Menu() {
		
		//Titulo 
		setTitle("Menú");

		
		/*Coordenadas x y de la aplicación y su altura y longitud,
		 * si no lo indicamos aparecera una ventana muy pequeña*/
		setBounds(400,200,351,300);
		
		/*Indica que cuando se cierre la ventana se acaba la aplicacion, si no 
		 * lo indicamos cuando cerramos la ventana, la aplicacion seguira funcionando*/
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Hace visible la ventana
		setVisible(true);
		
		cPanel=new JPanel();
		
		//Asignar el panel a la ventana
		setContentPane(cPanel);
		cPanel.setLayout(null);
		
		mensaje=new JLabel("Ingrese el número de la actividad que quiere ejecutar:");
		mensaje.setBounds(44, 45, 260, 14);
		cPanel.add(mensaje);
		opciones=new JComboBox<>();
		opciones.setBounds(117, 82, 146, 20);
		cPanel.add(opciones);
		opciones.addItem("Punto 1");
		opciones.addItem("Punto 2");
		opciones.addItem("Punto 3");
		opciones.addItem("Punto 4");
		
		btnEnviar=new JButton("Enviar");
		btnEnviar.setBounds(141, 154, 93, 23);
		cPanel.add(btnEnviar);
		
		Enviar();
	}
	
	public void Enviar() {
	
		ActionListener al=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String respuesta;
				respuesta=opciones.getSelectedItem().toString();
				System.out.println(respuesta);
				switch(respuesta) {
				case ("Punto 1"):
					Punto1View p1=new Punto1View();
					break;
				case ("Punto 2"):
					Punto2View p2=new Punto2View();
					break;
				case ("Punto 3"):
					Punto3View p3=new Punto3View();
					break;
				case ("Punto 4"):
					//Punto4View p4=new Punto4View();
					break;
				}
			}
		};
		btnEnviar.addActionListener(al);
		

	}
	
	
	
	
}
