package interfaces;

import javax.swing.WindowConstants;

public class Principal extends javax.swing.JFrame {

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		Principal inst = new Principal();
		inst.setVisible(true);
	}
	
	public Principal() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
