package punto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Punto1View extends JFrame{
	//Atributos
	private JPanel cPanel;
	private JLabel mensaje;
	private JTextField txtNom;
	private JButton btnSaludar;
	
	public Punto1View() {
		
		//Titulo 
		setTitle("Punto 1");

		//Hace visible la ventana
		setVisible(true);
		/*Coordenadas x y de la aplicación y su altura y longitud,
		 * si no lo indicamos aparecera una ventana muy pequeña*/
		setBounds(400,200,351,300);
		
		/*Indica que cuando se cierre la ventana se acaba la aplicacion, si no 
		 * lo indicamos cuando cerramos la ventana, la aplicacion seguira funcionando*/
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		cPanel=new JPanel();
		
		//Indicar diseño 
		cPanel.setLayout(null);
		
		//Asignar el panel a la ventana
		setContentPane(cPanel);
		
		mensaje=new JLabel("Escribe un nombre para saludar");
		cPanel.add(mensaje);
		txtNom=new JTextField();
		txtNom.setBounds(62,92,230,30);
		cPanel.add(txtNom);
		
		btnSaludar=new JButton("¡Saludar!");
		btnSaludar.setBounds(142, 146, 89, 23);
		cPanel.add(btnSaludar);
		
		saludar();
	}
	
	public void saludar() {
		
		ActionListener al=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"¡Hola "+txtNom.getText()+"!");
			}
		};
		btnSaludar.addActionListener(al);
	}
}
