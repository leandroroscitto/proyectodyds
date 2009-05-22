package interfaces;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class pnl_botones_ac extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btn_cancelar;
	private JButton btn_acepta;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new pnl_botones_ac());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public pnl_botones_ac() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			FlowLayout thisLayout = new FlowLayout();
			thisLayout.setHgap(15);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				btn_acepta = new JButton();
				this.add(btn_acepta);
				btn_acepta.setText("Aceptar");
				btn_acepta.setFont(new java.awt.Font("Dialog",1,18));
				btn_acepta.setPreferredSize(new java.awt.Dimension(138, 38));
			}
			{
				btn_cancelar = new JButton();
				this.add(btn_cancelar);
				btn_cancelar.setText("Cancelar");
				btn_cancelar.setFont(new java.awt.Font("Dialog",1,18));
				btn_cancelar.setPreferredSize(new java.awt.Dimension(138, 38));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
