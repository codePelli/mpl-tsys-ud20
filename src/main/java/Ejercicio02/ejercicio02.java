package Ejercicio02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ejercicio02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(65, 73, 509, 278);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRespuesta = new JLabel("");
		lblRespuesta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
		lblRespuesta.setBounds(101, 170, 309, 59);
		panel.add(lblRespuesta);
		
		JButton btnNewButton = new JButton("Boton1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String boton1 = "Has pulsado el boton1";
				lblRespuesta.setText(boton1);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(101, 27, 110, 46);
		panel.add(btnNewButton);
		
		JButton btnBoton = new JButton("Boton2");
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String boton2 = "Has pulsado el boton2";
				lblRespuesta.setText(boton2);
			}
		});
		btnBoton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBoton.setBounds(300, 27, 110, 46);
		panel.add(btnBoton);
	}

}
