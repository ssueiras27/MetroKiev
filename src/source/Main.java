package source;

import java.awt.EventQueue;

import javax.swing.UIManager;

public class Main {
	public static Metro metro = new Metro();
	
    public static void main(String[] args) { 
    	//INICIAR GRAFICOS
    	try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window(metro);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        
        
    }
}
