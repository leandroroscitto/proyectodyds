package interfaces;
import com.toedter.calendar.JDateChooser;

import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

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
public class pnl_fechas_act extends javax.swing.JPanel {

	public static final long serialVersionUID = 1L;
	public JDateChooser dtc_fecha_ini_act;
	public JLabel lb_fecha_acepta_fin;
	public JLabel lb_fecha_ver_fin;
	public JDateChooser dtc_fecha_acept_fin;
	public JLabel lb_fecha_not_aut;
	public JLabel lb_fecha_recep;
	public JLabel lb_fecha_ini_act;
	public JCheckBox ftxf_acepta_rev_trab;
	public JDateChooser dtc_fecha_ini_atrab;
	public JDateChooser dtc_fecha_fin_act;
	public JCheckBox chb_acepta_trab;
	public JDateChooser dtc_fecha_ver_final;
	public JDateChooser dtc_fecha_not_aut;
	public JDateChooser dtc_fecha_fin_atrab;

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
		frame.getContentPane().add(new pnl_fechas_act());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public pnl_fechas_act() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)this);
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(456, 181));
			{
				chb_acepta_trab = new JCheckBox();
				chb_acepta_trab.setText("Acepta presentación de Trabajos");
				chb_acepta_trab.setHorizontalTextPosition(SwingConstants.LEFT);
			}
			{
				ftxf_acepta_rev_trab = new JCheckBox();
				ftxf_acepta_rev_trab.setText("Acepta revisón de Trabajos");
				ftxf_acepta_rev_trab.setHorizontalTextPosition(SwingConstants.LEFT);
			}
			{
				dtc_fecha_acept_fin = new JDateChooser();
			}
			{
				dtc_fecha_ini_atrab = new JDateChooser();
			}
			{
				dtc_fecha_fin_atrab = new JDateChooser();
			}
			{
				dtc_fecha_not_aut = new JDateChooser();
			}
			{
				dtc_fecha_ver_final = new JDateChooser();
			}
			{
				dtc_fecha_fin_act = new JDateChooser();
			}
			{
				dtc_fecha_ini_act = new JDateChooser();
			}
			{
				lb_fecha_not_aut = new JLabel();
				lb_fecha_not_aut.setText("Fecha de notificación a Autores:");
			}
			{
				lb_fecha_ver_fin = new JLabel();
				lb_fecha_ver_fin.setText("Fecha de versión final:");
			}
			{
				lb_fecha_acepta_fin = new JLabel();
				lb_fecha_acepta_fin.setText("Fecha de aceptación final:");
			}
			{
				lb_fecha_ini_act = new JLabel();
				lb_fecha_ini_act.setText("Fechas de Actividad:");
			}
			{
				lb_fecha_recep = new JLabel();
				lb_fecha_recep.setText("Fecha de recepción");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lb_fecha_ini_act, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				    .addComponent(dtc_fecha_ini_act, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				    .addComponent(dtc_fecha_fin_act, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(chb_acepta_trab, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lb_fecha_recep, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				    .addComponent(dtc_fecha_ini_atrab, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				    .addComponent(dtc_fecha_fin_atrab, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGap(11)
				.addComponent(ftxf_acepta_rev_trab, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lb_fecha_not_aut, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				    .addComponent(dtc_fecha_not_aut, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(dtc_fecha_ver_final, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lb_fecha_ver_fin, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lb_fecha_acepta_fin, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				    .addComponent(dtc_fecha_acept_fin, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)));
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lb_fecha_ini_act, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
				                .addComponent(dtc_fecha_ini_act, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(chb_acepta_trab, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
				                .addGap(44)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(dtc_fecha_fin_atrab, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
				            .addComponent(dtc_fecha_fin_act, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(ftxf_acepta_rev_trab, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 141, Short.MAX_VALUE)))
				.addGroup(thisLayout.createSequentialGroup()
				    .addGap(31)
				    .addGroup(thisLayout.createParallelGroup()
				        .addGroup(thisLayout.createSequentialGroup()
				            .addGroup(thisLayout.createParallelGroup()
				                .addComponent(lb_fecha_acepta_fin, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
				                .addComponent(lb_fecha_ver_fin, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
				                .addComponent(lb_fecha_not_aut, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
				            .addGroup(thisLayout.createParallelGroup()
				                .addGroup(thisLayout.createSequentialGroup()
				                    .addComponent(dtc_fecha_ver_final, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
				                .addGroup(thisLayout.createSequentialGroup()
				                    .addComponent(dtc_fecha_not_aut, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
				                .addGroup(thisLayout.createSequentialGroup()
				                    .addComponent(dtc_fecha_acept_fin, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
				            .addGap(0, 0, Short.MAX_VALUE))
				        .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				            .addComponent(lb_fecha_recep, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
				            .addComponent(dtc_fecha_ini_atrab, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
				            .addGap(0, 83, Short.MAX_VALUE)))
				    .addContainerGap(83, 83)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
