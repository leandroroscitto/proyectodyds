package interfaces;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class frm_abm_actividades extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private pnl_atrib_act pnl_atrib_act1;
	private pnl_botones_ac pnl_botones_ac1;
	private pnl_lista_responsables pnl_lista_responsables1;
	private pnl_caract_part_aceptados pnl_caract_part_aceptados1;
	private pnl_fechas_act pnl_fechas_act1;

	// Componentes
	private JFrame Parent;
	private dlg_det_carac_part dcpart;
	private dlg_reg_resp drresp;

	private void Iniciar_comp() {
		dcpart = new dlg_det_carac_part(this);
		drresp = new dlg_reg_resp(this);
	}

	{
		// Set Look & Feel
		try {
			javax.swing.UIManager
					.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frm_abm_actividades inst = new frm_abm_actividades(null);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public frm_abm_actividades(JFrame P) {
		super();
		Parent = P;
		Iniciar_comp();
		initGUI();
	}

	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setPreferredSize(new java.awt.Dimension(498, 649));
			this.setMinimumSize(new java.awt.Dimension(0, 0));
			this.setTitle("ABM Actividades");
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					thisWindowClosing(evt);
				}
			});
			{
				pnl_atrib_act1 = new pnl_atrib_act();
				getContentPane().add(
						pnl_atrib_act1,
						new AnchorConstraint(5, 5, 385, 5,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_NONE,
								AnchorConstraint.ANCHOR_ABS));
				pnl_atrib_act1
						.setPreferredSize(new java.awt.Dimension(611, 99));
			}
			{
				pnl_fechas_act1 = new pnl_fechas_act();
				getContentPane().add(
						pnl_fechas_act1,
						new AnchorConstraint(108, 5, 431, 5,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_NONE,
								AnchorConstraint.ANCHOR_ABS));
				pnl_fechas_act1.setPreferredSize(new java.awt.Dimension(480,
						186));
			}
			{
				pnl_caract_part_aceptados1 = new pnl_caract_part_aceptados();
				getContentPane().add(
						pnl_caract_part_aceptados1,
						new AnchorConstraint(300, 5, 685, 5,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_REL,
								AnchorConstraint.ANCHOR_ABS));
				pnl_caract_part_aceptados1
						.setPreferredSize(new java.awt.Dimension(480, 126));
				pnl_caract_part_aceptados1.btn_agregar_car
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btn_agregar_carActionPerformed(evt);
							}
						});
			}
			{
				pnl_lista_responsables1 = new pnl_lista_responsables(Parent);
				getContentPane().add(
						pnl_lista_responsables1,
						new AnchorConstraint(695, 5, 52, 5,
								AnchorConstraint.ANCHOR_REL,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS));
				pnl_lista_responsables1
						.setPreferredSize(new java.awt.Dimension(480, 138));
			}
			{
				pnl_botones_ac1 = new pnl_botones_ac();
				getContentPane().add(
						pnl_botones_ac1,
						new AnchorConstraint(921, 5, 0, 5,
								AnchorConstraint.ANCHOR_NONE,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS));
				pnl_botones_ac1
						.setPreferredSize(new java.awt.Dimension(507, 46));
			}
			pack();
			this.setSize(498, 649);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosing, event=" + evt);
		this.setVisible(false);
		Parent.setEnabled(true);
		Parent.requestFocus();
	}
	
	private void btn_agregar_carActionPerformed(ActionEvent evt){
		System.out.println("btn_agregar_car.actionPerformed, event="+evt);
		dcpart.setVisible(true);
		dcpart.requestFocus();
		setEnabled(false);
	}

}
