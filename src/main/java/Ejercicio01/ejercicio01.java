package Ejercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ejercicio01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new CompoundBorder());
		panel.setBounds(174, 83, 232, 96);
		contentPane.add(panel);
		
		JButton btnMin = new JButton("min");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnMin);
		
		JButton btnMax = new JButton("max");
		btnMax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnMax.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnMax);
		
		JButton btnClose = new JButton("close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnClose);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
	}
}
