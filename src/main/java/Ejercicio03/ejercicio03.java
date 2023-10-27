package Ejercicio03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio03 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private int veces1 = 0;
	private int veces2 = 0;
	
	public ejercicio03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(45, 36, 439, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl1.setBounds(63, 75, 367, 28);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl2.setBounds(63, 122, 367, 28);
		panel.add(lbl2);
		
		JButton btn1 = new JButton("Boton1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				veces1++;				
				String boton1 = "Has pulsado el boton1 " + veces1 + " veces";
				lbl1.setText(boton1);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBounds(120, 5, 89, 23);
		panel.add(btn1);
		
		JButton btn2 = new JButton("Boton2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				veces2++;	
				String boton2 = "Has pulsado el boton2 " + veces2 + " veces";
				lbl2.setText(boton2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBounds(229, 5, 89, 23);
		panel.add(btn2);
	}
}
