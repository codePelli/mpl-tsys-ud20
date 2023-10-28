package Ejercicio06;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ejercicio6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField tfAltura;
	private JTextField tfPeso;
	private JLabel lblImc;

	public ejercicio6() {
		
		double imc = 0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 179, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 143, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAltura = new JLabel("Altura(m):");
		lblAltura.setBounds(10, 11, 53, 23);
		panel.add(lblAltura);
		
		tfAltura = new JTextField();
		tfAltura.setBounds(65, 12, 53, 20);
		panel.add(tfAltura);
		tfAltura.setColumns(10);
		
		JLabel lblPesokg = new JLabel("Peso(kg):");
		lblPesokg.setBounds(10, 61, 53, 23);
		panel.add(lblPesokg);
		
		tfPeso = new JTextField();
		tfPeso.setColumns(10);
		tfPeso.setBounds(65, 62, 53, 20);
		panel.add(tfPeso);
		
		JButton btnImc = new JButton("IMC");
		btnImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double altura = Double.parseDouble(tfAltura.getText());
				double peso = Double.parseDouble(tfPeso.getText());
				
				double imc = peso / (altura * altura);
				
				String indice = Double.toString(imc);
				lblImc.setText(indice);
			}
		});
		
		btnImc.setBounds(24, 120, 94, 23);
		panel.add(btnImc);
		
		lblImc = new JLabel();
		lblImc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblImc.setBounds(33, 168, 85, 23);
		panel.add(lblImc);
	}

}
