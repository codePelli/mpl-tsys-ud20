package Ejercicio06;

import java.awt.EventQueue;

public class MainApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio6 frame = new ejercicio6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
