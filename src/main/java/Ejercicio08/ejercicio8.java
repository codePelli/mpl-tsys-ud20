package Ejercicio08;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ejercicio8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tfCantidad;
	private JTextField tfResultado;
	private boolean conversion;

	public ejercicio8() {
		
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
        setFocusable(true);
        requestFocus();
		btnConversion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				if (e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					
					btnConversion.doClick();
				}
			}
		});
		btnConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (conversion) {
					
					double euros = Double.parseDouble(tfCantidad.getText());
					double pesetas = euros * 166.386;
					tfResultado.setText(String.valueOf(pesetas));
					
					if (euros > 999999 || euros < 0) {
						
						JOptionPane.showMessageDialog(btnConversion, "Ingresa una cantidad correcta");
						return;
						
					} else if (pesetas > 99999 || pesetas < 0) {
						
						JOptionPane.showMessageDialog(btnConversion, "Ingresa una cantidad correcta");
						return;
					
					}
						
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
		btnCambiar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
					
					btnCambiar.doClick();
				}
			}
		});
		btnCambiar.setBounds(224, 150, 89, 23);
		getContentPane().add(btnCambiar);
		
		JButton btnDel = new JButton("Borrar");
		btnDel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				if (e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
					
					btnDel.doClick();
				}
			}
		});
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tfResultado.setText("");
				tfCantidad.setText("");
			}
		});
		btnDel.setBounds(326, 150, 89, 23);
		getContentPane().add(btnDel);
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
