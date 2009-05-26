package interfaces;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;

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
public class pnl_caract_part_aceptados extends javax.swing.JPanel {

	public static final long serialVersionUID = 1L;
	public JList lst_caracter_part;
	public JButton btn_quitar_car;
	public JButton btn_modificar_car;
	public JButton btn_agregar_car;
	public JPanel pnl_botones_caracter_part;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new pnl_caract_part_aceptados());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public pnl_caract_part_aceptados() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(475, 145));
			this.setBorder(BorderFactory.createTitledBorder("Caracteres de Participación aceptados"));
			this.setMinimumSize(new java.awt.Dimension(475, 145));
			{
				ListModel lst_auspiciosModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				lst_caracter_part = new JList();
				this.add(lst_caracter_part, new AnchorConstraint(25, 15, 50, 15, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				lst_caracter_part.setModel(lst_auspiciosModel);
				lst_caracter_part.setPreferredSize(new java.awt.Dimension(445, 228));
				lst_caracter_part.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			}
			{
				pnl_botones_caracter_part = new JPanel();
				this.add(pnl_botones_caracter_part, new AnchorConstraint(800, 15, 5, 15, AnchorConstraint.ANCHOR_NONE, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				FlowLayout pnl_botones_lst_ausLayout = new FlowLayout();
				pnl_botones_lst_ausLayout.setHgap(15);
				pnl_botones_caracter_part.setPreferredSize(new java.awt.Dimension(445, 39));
				pnl_botones_caracter_part.setLayout(pnl_botones_lst_ausLayout);
				{
					btn_agregar_car = new JButton();
					pnl_botones_caracter_part.add(btn_agregar_car);
					btn_agregar_car.setText("Agregar Caracter");
					btn_agregar_car.setPreferredSize(new java.awt.Dimension(135,26));
				}
				{
					btn_modificar_car = new JButton();
					pnl_botones_caracter_part.add(btn_modificar_car);
					btn_modificar_car.setText("Modificar Caracter");
					btn_modificar_car.setPreferredSize(new java.awt.Dimension(140,26));
				}
				{
					btn_quitar_car = new JButton();
					pnl_botones_caracter_part.add(btn_quitar_car);
					btn_quitar_car.setText("Quitar Caracter");
					btn_quitar_car.setPreferredSize(new java.awt.Dimension(125,26));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
