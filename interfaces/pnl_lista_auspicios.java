package interfaces;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class pnl_lista_auspicios extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public JList lst_auspicios;
	public JButton btn_quitar_aus;
	public JButton btn_modificar_aus;
	public JButton btn_agregar_aus;
	public JPanel pnl_botones_lst_aus;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new pnl_lista_auspicios());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public pnl_lista_auspicios() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(475, 145));
			this.setBorder(BorderFactory.createTitledBorder("Lista de Auspicios"));
			AnchorLayout thisLayout = new AnchorLayout();
			this.setLayout(thisLayout);
			this.setMinimumSize(new java.awt.Dimension(475, 145));
			this.setSize(475, 145);
			{
				ListModel lst_auspiciosModel = 
					new DefaultComboBoxModel(
							new String[] {  });
				lst_auspicios = new JList();
				this.add(lst_auspicios, new AnchorConstraint(25, 15, 48, 15, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				lst_auspicios.setModel(lst_auspiciosModel);
				lst_auspicios.setPreferredSize(new java.awt.Dimension(445, 102));
				lst_auspicios.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			}
			{
				pnl_botones_lst_aus = new JPanel();
				FlowLayout pnl_botones_lst_ausLayout = new FlowLayout();
				pnl_botones_lst_ausLayout.setHgap(15);
				pnl_botones_lst_aus.setLayout(pnl_botones_lst_ausLayout);
				this.add(pnl_botones_lst_aus, new AnchorConstraint(800, 15, 5, 15, AnchorConstraint.ANCHOR_NONE, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				pnl_botones_lst_aus.setPreferredSize(new java.awt.Dimension(445, 37));
				{
					btn_agregar_aus = new JButton();
					pnl_botones_lst_aus.add(btn_agregar_aus);
					btn_agregar_aus.setText("Agregar Auspicio");
					btn_agregar_aus.setPreferredSize(new java.awt.Dimension(135, 26));
					btn_agregar_aus.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_agregar_ausActionPerformed(evt);
						}
					});
				}
				{
					btn_modificar_aus = new JButton();
					pnl_botones_lst_aus.add(btn_modificar_aus);
					btn_modificar_aus.setText("Modificar Auspicio");
					btn_modificar_aus.setPreferredSize(new java.awt.Dimension(140, 26));
				}
				{
					btn_quitar_aus = new JButton();
					pnl_botones_lst_aus.add(btn_quitar_aus);
					btn_quitar_aus.setText("Quitar Auspicio");
					btn_quitar_aus.setPreferredSize(new java.awt.Dimension(125, 26));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btn_agregar_ausActionPerformed(ActionEvent evt) {
		System.out.println("btn_agregar_aus.actionPerformed, event="+evt);
		
		dlg_registro_ausp dlg_auspicions = new dlg_registro_ausp(this);
		
		dlg_auspicions.setVisible(true);
	}

}
