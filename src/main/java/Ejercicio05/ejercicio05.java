package Ejercicio05;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio05 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextArea textArea;
	private String escucha = "Texto inicial \n";
	
	public ejercicio05() {
		
		setTitle("Ventana oyente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(51, 27, 481, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textArea = new JTextArea(escucha);
		textArea.setBounds(10, 11, 445, 254);
		textArea.setEditable(true);
		panel.add(textArea);
		
		JLabel lblNewLabel = new JLabel("EVENTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(0, 152, 55, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnDel = new JButton("BORRAR");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText("");
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDel.setBounds(238, 333, 89, 23);
		contentPane.add(btnDel);
		
		textArea.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				anadirOyente("Click en el area \n");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				anadirOyente("Mouse dentro del area \n");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				anadirOyente("Mouse salio del area \n");
			}
				
		});
		
	}
	
	private void anadirOyente(String escucha) {
		
		textArea.append(escucha + " ");
	}
}
