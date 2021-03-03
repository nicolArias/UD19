package punto4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*Autor: Nicol Arias*/
public class Punto4View extends JFrame {
	private static final long serialVersionUID = 1L;

	// Atributos
	JPanel cPanel = new JPanel();
	private JTextField result;
	private JTextField operando2;
	private JTextField operando1;

	public Punto4View() {
		// Titulo
		setTitle("Punto 4");

		// Hace visible la ventana
		setVisible(true);
		/*
		 * Coordenadas x y de la aplicación y su altura y longitud, si no lo indicamos
		 * aparecera una ventana muy pequeña
		 */
		setBounds(400, 200, 772, 297);

		/*
		 * Indica que cuando se cierre la ventana se acaba la aplicacion, si no lo
		 * indicamos cuando cerramos la ventana, la aplicacion seguira funcionando
		 */
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		cPanel = new JPanel();

		// Asignar el panel a la ventana
		setContentPane(cPanel);
		cPanel.setLayout(null);
		
		result = new JTextField();
		result.setFont(new Font("Tahoma", Font.PLAIN, 13));
		result.setBounds(498, 49, 138, 33);
		cPanel.add(result);
		result.setColumns(10);
		
		operando2 = new JTextField();
		operando2.setBounds(233, 50, 138, 33);
		cPanel.add(operando2);
		operando2.setColumns(10);
		
		operando1 = new JTextField();
		operando1.setBounds(37, 50, 139, 33);
		cPanel.add(operando1);
		operando1.setColumns(10);
		
		JLabel signo = new JLabel("");
		signo.setFont(new Font("Tahoma", Font.BOLD, 14));
		signo.setBounds(186, 49, 39, 33);
		cPanel.add(signo);
		
		//Botones
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signo.setText("+");
			}
		});
		btnSuma.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnSuma.setBounds(37, 126, 57, 45);
		cPanel.add(btnSuma);
		
		JButton btnRest = new JButton("-");
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signo.setText("-");
			}
		});
		btnRest.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnRest.setBounds(119, 126, 57, 45);
		cPanel.add(btnRest);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signo.setText("x");
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnMult.setBounds(233, 126, 57, 45);
		cPanel.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signo.setText("/");
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnDiv.setBounds(314, 126, 57, 45);
		cPanel.add(btnDiv);
		
		//Labels
		JLabel lblNewLabel_1 = new JLabel("Operando 1");
		lblNewLabel_1.setBounds(37, 11, 107, 28);
		cPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operando 2");
		lblNewLabel_2.setBounds(233, 11, 92, 21);
		cPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(498, 15, 101, 21);
		cPanel.add(lblNewLabel_3);
		
		//BOTON PARA VER EL RESULTADO
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op1=Double.parseDouble(operando1.getText());
				double op2=Double.parseDouble(operando2.getText());
				double resultado=0;
				
				if(signo.getText().equals("+")) {
					resultado=op1+op2;
					
				}else if(signo.getText().equals("-")) {
					resultado=op1-op2;
				}else if(signo.getText().equals("x")) {
					resultado=op1*op2;
				}else if(signo.getText().equals("/")) {
					resultado=op1/op2;
				}
				
				result.setText(Double.toString(resultado));
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnResult.setBounds(405, 49, 57, 33);
		cPanel.add(btnResult);
		
	
		
		
		JLabel lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMensaje.setBounds(154, 207, 445, 39);
		cPanel.add(lblMensaje);
		
		JButton btnAbout= new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("Calculadora creada por Nicol Arias");
			}
		});
		btnAbout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAbout.setBounds(37, 213, 89, 23);
		cPanel.add(btnAbout);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signo.setText("");
				operando1.setText("");
				operando2.setText("");
				result.setText("");
			}
		});
		btnReset.setBounds(498, 126, 101, 45);
		cPanel.add(btnReset);
		
		
		
		
		
		

	}
}
