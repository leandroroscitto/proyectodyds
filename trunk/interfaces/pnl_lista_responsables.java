package interfaces;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

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
public class pnl_lista_responsables extends javax.swing.JPanel {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static final long serialVersionUID = 1L;
	public JList lst_responsables;
	public JButton btn_agregar_resp;
	public JButton btn_quitar_resp;
	public JPanel pnl_botones_lst_resp;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new pnl_lista_responsables());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public pnl_lista_responsables() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(410, 175));
			this.setBorder(BorderFactory.createTitledBorder("Lista de Responsables"));
			this.setMinimumSize(new java.awt.Dimension(410, 175));
			{
				ListModel lst_responsablesModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				lst_responsables = new JList();
				this.add(lst_responsables, new AnchorConstraint(25, 15, 48, 15, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				lst_responsables.setModel(lst_responsablesModel);
				lst_responsables.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				lst_responsables.setPreferredSize(new java.awt.Dimension(380, 92));
			}
			{
				pnl_botones_lst_resp = new JPanel();
				this.add(pnl_botones_lst_resp, new AnchorConstraint(800, 13, 5, 17, AnchorConstraint.ANCHOR_NONE, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				FlowLayout pnl_botones_lst_respLayout = new FlowLayout();
				pnl_botones_lst_respLayout.setAlignOnBaseline(true);
				pnl_botones_lst_respLayout.setHgap(15);
				pnl_botones_lst_resp.setLayout(pnl_botones_lst_respLayout);
				pnl_botones_lst_resp.setPreferredSize(new java.awt.Dimension(380, 37));
				{
					btn_agregar_resp = new JButton();
					pnl_botones_lst_resp.add(btn_agregar_resp);
					btn_agregar_resp.setText("Agregar Responsable");
					btn_agregar_resp.setPreferredSize(new java.awt.Dimension(172, 26));
				}
				{
					btn_quitar_resp = new JButton();
					btn_quitar_resp.setLayout(null);
					pnl_botones_lst_resp.add(btn_quitar_resp);
					btn_quitar_resp.setText("Quitar Responsable");
					btn_quitar_resp.setPreferredSize(new java.awt.Dimension(172, 26));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
