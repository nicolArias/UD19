package punto3;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Punto3View  extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	//Atributos
	private JPanel cPanel;
	
	//Radio Button
	private JRadioButton windows;
	private JRadioButton linux;
	private JRadioButton mac;
	
	//Check Box
	private JCheckBox progr;
	private JCheckBox dGrafico;
	private JCheckBox admin;
	private JSlider numeros;
	private JButton btnEnviar;
	
	public Punto3View() {
		

		//Titulo 
		setTitle("Punto 3");

		//Hace visible la ventana
		setVisible(true);
		/*Coordenadas x y de la aplicación y su altura y longitud,
		 * si no lo indicamos aparecera una ventana muy pequeña*/
		setBounds(400,200,442,309);
		
		/*Indica que cuando se cierre la ventana se acaba la aplicacion, si no 
		 * lo indicamos cuando cerramos la ventana, la aplicacion seguira funcionando*/
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		cPanel=new JPanel();
		
		//Asignar el panel a la ventana
		setContentPane(cPanel);
		cPanel.setLayout(null);
		
		JLabel mensaje1=new JLabel("Elija un sistema operativo:");
		mensaje1.setBounds(46, 28, 179, 23);
		mensaje1.setFont(new Font("Tahoma", Font.BOLD, 12));
		cPanel.add(mensaje1);
		
		//RadioButton
		windows=new JRadioButton("Windows",false);
		windows.setBounds(46, 58, 69, 23);
		cPanel.add(windows);
		
		linux=new JRadioButton("Linux",false);
		linux.setBounds(174, 58, 51, 23);
		cPanel.add(linux);
		
		mac=new JRadioButton("Mac",false);
		mac.setBounds(305, 58, 45, 23);
		cPanel.add(mac);
		
		//Agrupacion RadioButton
		ButtonGroup bgroup=new ButtonGroup();
		bgroup.add(windows);
		bgroup.add(linux);
		bgroup.add(mac);
		
		JLabel mensaje2 = new JLabel("Especialidad: ");
		mensaje2.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensaje2.setBounds(46, 88, 130, 31);
		cPanel.add(mensaje2);
		//Check Box
		progr=new JCheckBox("Programacion",false);
		progr.setBounds(46, 126, 91, 23);
		cPanel.add(progr);
		
		dGrafico=new JCheckBox("Diseño Grafico",false);
		dGrafico.setBounds(173, 126, 95, 23);
		cPanel.add(dGrafico);
		
		admin=new JCheckBox("Administracion",false);
		admin.setBounds(305, 126, 95, 23);
		cPanel.add(admin);
		
		
		JLabel mensaje3 = new JLabel("Horas dedicadas en el ordenador:");
		mensaje3.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensaje3.setBounds(46, 173, 236, 23);
		cPanel.add(mensaje3);
		//Slider
		numeros=new JSlider(0,10);
		numeros.setBounds(46, 207, 200, 26);
		cPanel.add(numeros);
		
		//Boton
		btnEnviar=new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnviar.setBounds(305, 210, 91, 23);
		cPanel.add(btnEnviar);
		
	
		mostrarMensaje();	
	}
	
	public void mostrarMensaje() {
		
		
		
		ActionListener al=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="";
				
				//RadioButton condiciones para validad que opcion selecciona el usuario
				if(windows.isSelected()) {
					mensaje="Windows";
				}else if(linux.isSelected()) {
					mensaje="Linux";
				}else if(mac.isSelected()) {
					mensaje="Mac";
				}
				
				//CheckBox
				if(progr.isSelected()) {
					mensaje+="\nEspecialidad: Programación";
				}
				if(dGrafico.isSelected()) {
					mensaje+="\nEspecialidad: Diseño Gráfico";
				}
				if(admin.isSelected()) {
					mensaje+="\nEspecialidad: Administración";
				}
				
				
				JOptionPane.showMessageDialog(null,"Sistemas operativo: "+mensaje
													+"\nHoras: "+numeros.getValue());
			}
		};
		btnEnviar.addActionListener(al);
	}
}
