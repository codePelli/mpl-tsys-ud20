package Ejercicio07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ejercicio7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCantidad;
	private JTextField tfResultado;
	private boolean conversion;


	public ejercicio7() {
		getContentPane().setLayout(null);
		setBounds(100,100,500,300);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(10, 11, 105, 14);
		getContentPane().add(lblNewLabel);
		
		tfCantidad = new JTextField();
		tfCantidad.setBounds(125, 8, 86, 20);
		getContentPane().add(tfCantidad);
		tfCantidad.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 57, 105, 14);
		getContentPane().add(lblResultado);
		
		tfResultado = new JTextField();
		tfResultado.setColumns(10);
		tfResultado.setBounds(125, 54, 86, 20);
		getContentPane().add(tfResultado);
		
		JButton btnConversion = new JButton("€ a ptas");
		btnConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (conversion) {
					
					double euros = Double.parseDouble(tfCantidad.getText());
					double pesetas = euros * 166.386;
					tfResultado.setText(String.valueOf(pesetas));
				} else {
					
					double pesetas = Double.parseDouble(tfCantidad.getText());
					double euros = pesetas / 166.3866;
					tfResultado.setText(String.valueOf(euros));
				}

					
			}
		});
		btnConversion.setBounds(125, 150, 89, 23);
		getContentPane().add(btnConversion);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.setBounds(224, 150, 89, 23);
		getContentPane().add(btnCambiar);
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				conversion = !conversion;
				
				if(conversion) {
					
					btnConversion.setText("€ a ptas");
				} else {
					
					btnConversion.setText("ptas a €");
				}
					
			}
		});
	}
}
