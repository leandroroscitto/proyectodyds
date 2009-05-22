package interfaces;
import java.awt.Component;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
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
public class pnl_atrib_act extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lb_nombre;
	private JLabel lb_acargo;
	private JLabel lb_asignado;
	private JComboBox cb_tipo_act;
	private JLabel lb_nombre_acargo;
	private JButton bt_acargo;
	private JComboBox cb_acargo;
	private JTextField txf_nombre;
	private JLabel lb_tipo_act;

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
		frame.getContentPane().add(new pnl_atrib_act());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public pnl_atrib_act() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)this);
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(466, 170));
			{
				lb_nombre = new JLabel();
				lb_nombre.setText("Nombre:");
			}
			{
				lb_nombre_acargo = new JLabel();
				lb_nombre_acargo.setText("<<Nombre>>");
			}
			{
				lb_acargo = new JLabel();
				lb_acargo.setText("Persona a cargo:");
			}
			{
				lb_asignado = new JLabel();
				lb_asignado.setText("Asignado al Evento:");
			}
			{
				lb_tipo_act = new JLabel();
				lb_tipo_act.setText("Tipo de Actividad:");
			}
			{
				txf_nombre = new JTextField();
			}
			{
				ComboBoxModel cb_tipo_actModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				cb_tipo_act = new JComboBox();
				cb_tipo_act.setModel(cb_tipo_actModel);
				cb_tipo_act.setFont(new java.awt.Font("Dialog",0,12));
				cb_tipo_act.setSize(258, 28);
			}
			{
				ComboBoxModel cb_acargoModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				cb_acargo = new JComboBox();
				cb_acargo.setModel(cb_acargoModel);
				cb_acargo.setFont(new java.awt.Font("Dialog",0,12));
				cb_acargo.setSize(258, 28);
			}
			{
				bt_acargo = new JButton();
				bt_acargo.setText("Seleccionar");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(txf_nombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_nombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(cb_tipo_act, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_tipo_act, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(bt_acargo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_acargo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_nombre_acargo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(cb_acargo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_asignado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(lb_asignado, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_acargo, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_tipo_act, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_nombre, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(cb_acargo, GroupLayout.Alignment.LEADING, 0, 348, Short.MAX_VALUE)
				    .addComponent(cb_tipo_act, GroupLayout.Alignment.LEADING, 0, 348, Short.MAX_VALUE)
				    .addComponent(txf_nombre, GroupLayout.Alignment.LEADING, 0, 348, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lb_nombre_acargo, 0, 184, Short.MAX_VALUE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE)
				        .addComponent(bt_acargo, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))));
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {bt_acargo, cb_acargo, cb_tipo_act, txf_nombre});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
