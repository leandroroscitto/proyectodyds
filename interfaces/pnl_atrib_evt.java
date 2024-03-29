package interfaces;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

import com.toedter.calendar.JDateChooser;

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
public class pnl_atrib_evt extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public JLabel lb_nombre_evt;
	public JLabel lb_fecha_fin_evt;
	public JTextField txf_organizador_evt;
	public JDateChooser dtc_fecha_fin_evt;
	public JDateChooser dtc_fecha_ini_evt;
	public JTextField txf_nombre_evt;
	public JLabel lb_fecha_ini_evt;
	public JLabel lb_organizador_evt;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new pnl_atrib_evt());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public pnl_atrib_evt() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)this);
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(450, 140));
			{
				lb_nombre_evt = new JLabel();
				lb_nombre_evt.setText("Nombre:");
			}
			{
				dtc_fecha_ini_evt = new JDateChooser();
			}
			{
				dtc_fecha_fin_evt = new JDateChooser();
			}
			{
				lb_organizador_evt = new JLabel();
				lb_organizador_evt.setText("Organizador:");
			}
			{
				lb_fecha_ini_evt = new JLabel();
				lb_fecha_ini_evt.setText("Fecha de inicio de Evento:");
			}
			{
				lb_fecha_fin_evt = new JLabel();
				lb_fecha_fin_evt.setText("Fecha de fin de Evento:");
			}
			{
				txf_nombre_evt = new JTextField();
				txf_nombre_evt.setBorder(BorderFactory.createCompoundBorder(
						BorderFactory.createBevelBorder(BevelBorder.LOWERED), 
						null));
			}
			{
				txf_organizador_evt = new JTextField();
				txf_organizador_evt.setBorder(BorderFactory.createCompoundBorder(
						BorderFactory.createBevelBorder(BevelBorder.LOWERED), 
						null));
			}
				thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(txf_nombre_evt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(lb_nombre_evt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(txf_organizador_evt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(lb_organizador_evt, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(lb_fecha_ini_evt, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
					    .addComponent(dtc_fecha_ini_evt, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(lb_fecha_fin_evt, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
					    .addComponent(dtc_fecha_fin_evt, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)));
				thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
					.addGroup(thisLayout.createSequentialGroup()
					    .addGroup(thisLayout.createParallelGroup()
					        .addComponent(lb_fecha_fin_evt, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					        .addComponent(lb_fecha_ini_evt, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
					    .addGroup(thisLayout.createParallelGroup()
					        .addGroup(thisLayout.createSequentialGroup()
					            .addComponent(dtc_fecha_ini_evt, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
					        .addGroup(thisLayout.createSequentialGroup()
					            .addComponent(dtc_fecha_fin_evt, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
					    .addGap(0, 158, Short.MAX_VALUE))
					.addGroup(thisLayout.createSequentialGroup()
					    .addGroup(thisLayout.createParallelGroup()
					        .addComponent(lb_organizador_evt, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					        .addComponent(lb_nombre_evt, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					    .addGroup(thisLayout.createParallelGroup()
					        .addComponent(txf_organizador_evt, GroupLayout.Alignment.LEADING, 0, 361, Short.MAX_VALUE)
					        .addComponent(txf_nombre_evt, GroupLayout.Alignment.LEADING, 0, 361, Short.MAX_VALUE))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
