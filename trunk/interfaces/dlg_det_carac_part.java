package interfaces;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


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
public class dlg_det_carac_part extends javax.swing.JDialog {
	public JComboBox cb_carc_part;
	public JFormattedTextField ftxf_arancel;
	public JCheckBox cbx_e_cert;
	public JLabel lb_porcent;
	public JLabel lb_arancel;
	public JLabel lb_carac_part;
	public JSpinner sp_porcent;
	public JCheckBox cbx_eva;

	// Componentes
	private JFrame Parent;
	
	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				dlg_det_carac_part inst = new dlg_det_carac_part(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public dlg_det_carac_part(JFrame P) {
		super();
		Parent=P;
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			this.setTitle("Detalles de Caracter de Participación");
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					thisWindowClosing(evt);
				}
			});
			{
				ComboBoxModel cb_carc_partModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				cb_carc_part = new JComboBox();
				cb_carc_part.setModel(cb_carc_partModel);
			}
			{
				ftxf_arancel = new JFormattedTextField();
				ftxf_arancel.setText("$ 0,00");
			}
			{
				cbx_eva = new JCheckBox();
				cbx_eva.setText("Es evaluado:");
				cbx_eva.setHorizontalTextPosition(SwingConstants.LEFT);
			}
			{
				cbx_e_cert = new JCheckBox();
				cbx_e_cert.setText("Emite certificado");
				cbx_e_cert.setHorizontalTextPosition(SwingConstants.LEFT);
			}
			{
				SpinnerListModel sp_porcentModel = 
					new SpinnerListModel(
							new String[] { "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100"});
				sp_porcent = new JSpinner();
				sp_porcent.setModel(sp_porcentModel);
			}
			{
				lb_carac_part = new JLabel();
				lb_carac_part.setText("Caracter de Participación:");
			}
			{
				lb_arancel = new JLabel();
				lb_arancel.setText("Monto de arancel:");
			}
			{
				lb_porcent = new JLabel();
				lb_porcent.setText("Porcentaje mínimo de asistencia:");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGap(8)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(cb_carc_part, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_carac_part, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(ftxf_arancel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_arancel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(cbx_eva, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(cbx_e_cert, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(sp_porcent, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_porcent, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(6));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(12, 12)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(lb_carac_part, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(cbx_eva, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(cbx_e_cert, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				            .addComponent(lb_arancel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(cb_carc_part, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(ftxf_arancel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
				                .addGap(69))))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lb_porcent, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addComponent(sp_porcent, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 25, Short.MAX_VALUE)))
				.addContainerGap());
			pack();
			this.setSize(330, 169);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosing, event="+evt);
		Parent.setEnabled(true);
		Parent.requestFocus();
		setVisible(false);
	}

}
