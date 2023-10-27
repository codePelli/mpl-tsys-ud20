package Ejercicio04;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ejercicio04 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextArea textArea;
	private String escucha = "Texto inicial \n";

	public ejercicio04() {
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
		textArea.setBounds(10, 11, 461, 279);
		textArea.setEditable(false);
		panel.add(textArea);
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		    anadirOyente("Click en ventana");
			}
		});
		
		JLabel lblNewLabel = new JLabel("EVENTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(0, 152, 55, 22);
		contentPane.add(lblNewLabel);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowIconified(WindowEvent e) {
				
				anadirOyente("Se minimizo la ventana");
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowDeiconified(WindowEvent e) {
				
				anadirOyente("Se restauro la ventana");
			}
		});
		
	}
	
	private void anadirOyente(String escucha) {
		
		textArea.append(escucha + "\n");
	}
}
