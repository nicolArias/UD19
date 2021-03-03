package punto2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
/*Autor: Nicol Arias*/
public class Punto2View extends JFrame{
	//Atributos
	private JPanel cPanel;
	private JLabel mensaje1;
	private JLabel mensaje2;
	private JTextField txtpelicula;
	private JButton btnAñadir;
	private JComboBox listaP;
	public Punto2View() {
		
		//Titulo 
		setTitle("Punto 2");

		//Hace visible la ventana
		setVisible(true);
	
		setBounds(400,200,356,237);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cPanel=new JPanel();
		setContentPane(cPanel);
		cPanel.setLayout(null);
		
		
		mensaje1=new JLabel("Escribe el titulo de una pelicula");
		mensaje1.setBounds(26, 52, 146, 14);
		cPanel.add(mensaje1);
		
		btnAñadir=new JButton("Añadir");
		btnAñadir.setBounds(72, 149, 63, 23);
		cPanel.add(btnAñadir);
		txtpelicula=new JTextField();
		txtpelicula.setBounds(26, 97, 146, 20);
		cPanel.add(txtpelicula);
		
		mensaje2=new JLabel("Peliculas");
		mensaje2.setBounds(205, 52, 40, 14);
		cPanel.add(mensaje2);
		
		listaP=new JComboBox<>();
		listaP.setBounds(205, 96, 101, 22);
		cPanel.add(listaP);
		Añadir();
	}
	
	public void Añadir() {
		
		ActionListener al=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomPel=txtpelicula.getText();
				listaP.addItem(nomPel);
			}
		};
		btnAñadir.addActionListener(al);
	}
}
