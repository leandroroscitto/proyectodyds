package interfaces;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
import com.sun.org.apache.bcel.internal.generic.LSTORE;

import datos.Evento;
import datos.Persona;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class frm_abm_eventos extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
	private static final long serialVersionUID = 1L;
	private pnl_botones_ac pnl_botones_ac1;
	private pnl_atrib_evt pnl_atrib_evt1;
	private pnl_lista_auspicios pnl_lista_auspicios1;
	private pnl_lista_responsables pnl_lista_responsables1;
	
	// Componentes
	private JFrame Parent;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frm_abm_eventos inst = new frm_abm_eventos(null);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public frm_abm_eventos(JFrame P) {
		super();
		Parent = P;
		initGUI();
	}

	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			this.setTitle("ABM Eventos");
			this.setPreferredSize(new java.awt.Dimension(495, 530));
			this.setMinimumSize(new java.awt.Dimension(495, 530));
			this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt){
					thisWindowClosing(evt);
				}
			});
			{
				pnl_botones_ac1 = new pnl_botones_ac();
				getContentPane().add(pnl_botones_ac1, new AnchorConstraint(850, 5, 5, 5, AnchorConstraint.ANCHOR_NONE, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				pnl_botones_ac1.setPreferredSize(new java.awt.Dimension(477, 51));
			}
			{
				pnl_atrib_evt1 = new pnl_atrib_evt();
				getContentPane().add(pnl_atrib_evt1, new AnchorConstraint(5, 5, 259, 5, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_NONE, AnchorConstraint.ANCHOR_ABS));
				pnl_atrib_evt1.setPreferredSize(new java.awt.Dimension(477, 116));
			}
			{
				pnl_lista_responsables1 = new pnl_lista_responsables(this);
				getContentPane().add(pnl_lista_responsables1, new AnchorConstraint(127, 5, 546, 5, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_ABS));
				pnl_lista_responsables1.setPreferredSize(new java.awt.Dimension(477, 172));
				pnl_lista_responsables1.setMinimumSize(new java.awt.Dimension(210, 224));
			}
			{
				pnl_lista_auspicios1 = new pnl_lista_auspicios();
				getContentPane().add(pnl_lista_auspicios1, new AnchorConstraint(568, 5, 62, 5, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				pnl_lista_auspicios1.setPreferredSize(new java.awt.Dimension(477, 175));
			}
			pack();
			
			this.setSize(495, 575);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosed, event="+evt);
		this.setVisible(false);
		Parent.setEnabled(true);
		Parent.requestFocus();
	}
}
