package interfaces;

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

	private static final long serialVersionUID = 1L;
	private JFormattedTextField ftxf_fecha_ini_act;
	private JFormattedTextField ftxf_fecha_fin_act;
	private JLabel lb_act_al;
	private JLabel lb_fecha_acepta_fin;
	private JLabel lb_fecha_ver_fin;
	private JLabel lb_fecha_not_aut;
	private JFormattedTextField ftxf_fecha_not_aut;
	private JLabel lb_al;
	private JLabel lb_fecha_recep;
	private JLabel lb_fecha_ini_act;
	private JFormattedTextField ftxf_fecha_acepta_fin;
	private JFormattedTextField ftxf_fecha_ver_fin;
	private JCheckBox ftxf_acepta_rev_trab;
	private JFormattedTextField ftxf_fecha_fin_atrab;
	private JFormattedTextField ftxf_fecha_ini_atrab;
	private JCheckBox chb_acepta_trab;

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
			this.setPreferredSize(new java.awt.Dimension(468, 171));
			{
				ftxf_fecha_ini_act = new JFormattedTextField();
				ftxf_fecha_ini_act.setText("00/00/00");
				ftxf_fecha_ini_act.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ftxf_fecha_fin_act = new JFormattedTextField();
				ftxf_fecha_fin_act.setText("00/00/00");
				ftxf_fecha_fin_act.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				chb_acepta_trab = new JCheckBox();
				chb_acepta_trab.setText("Acepta presentación de Trabajos");
				chb_acepta_trab.setHorizontalTextPosition(SwingConstants.LEFT);
			}
			{
				ftxf_fecha_ini_atrab = new JFormattedTextField();
				ftxf_fecha_ini_atrab.setText("00/00/00");
				ftxf_fecha_ini_atrab.setToolTipText("Fecha de inicio de recepción");
				ftxf_fecha_ini_atrab.setEnabled(false);
				ftxf_fecha_ini_atrab.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ftxf_fecha_fin_atrab = new JFormattedTextField();
				ftxf_fecha_fin_atrab.setText("00/00/00");
				ftxf_fecha_fin_atrab.setToolTipText("Fecha de fin de recepción");
				ftxf_fecha_fin_atrab.setEnabled(false);
				ftxf_fecha_fin_atrab.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ftxf_acepta_rev_trab = new JCheckBox();
				ftxf_acepta_rev_trab.setText("Acepta revisón de Trabajos");
				ftxf_acepta_rev_trab.setHorizontalTextPosition(SwingConstants.LEFT);
			}
			{
				lb_act_al = new JLabel();
				lb_act_al.setText("al");
			}
			{
				ftxf_fecha_ver_fin = new JFormattedTextField();
				ftxf_fecha_ver_fin.setText("00/00/00");
				ftxf_fecha_ver_fin.setEnabled(false);
				ftxf_fecha_ver_fin.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ftxf_fecha_acepta_fin = new JFormattedTextField();
				ftxf_fecha_acepta_fin.setText("00/00/00");
				ftxf_fecha_acepta_fin.setEnabled(false);
				ftxf_fecha_acepta_fin.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				lb_al = new JLabel();
				lb_al.setText("al");
				lb_al.setEnabled(false);
			}
			{
				ftxf_fecha_not_aut = new JFormattedTextField();
				ftxf_fecha_not_aut.setText("00/00/00");
				ftxf_fecha_not_aut.setEnabled(false);
				ftxf_fecha_not_aut.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				lb_fecha_not_aut = new JLabel();
				lb_fecha_not_aut.setText("Fecha de notificación a Autores:");
				lb_fecha_not_aut.setEnabled(false);
			}
			{
				lb_fecha_ver_fin = new JLabel();
				lb_fecha_ver_fin.setText("Fecha de versión final:");
				lb_fecha_ver_fin.setEnabled(false);
			}
			{
				lb_fecha_acepta_fin = new JLabel();
				lb_fecha_acepta_fin.setText("Fecha de aceptación final:");
				lb_fecha_acepta_fin.setEnabled(false);
			}
			{
				lb_fecha_ini_act = new JLabel();
				lb_fecha_ini_act.setText("Fechas de Actividad:");
			}
			{
				lb_fecha_recep = new JLabel();
				lb_fecha_recep.setText("Fecha de recepción");
				lb_fecha_recep.setEnabled(false);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(ftxf_fecha_fin_act, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				    .addComponent(ftxf_fecha_ini_act, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_fecha_ini_act, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_act_al, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(chb_acepta_trab, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(ftxf_fecha_ini_atrab, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_fecha_recep, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(ftxf_fecha_fin_atrab, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_al, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(13)
				.addComponent(ftxf_acepta_rev_trab, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(ftxf_fecha_not_aut, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_fecha_not_aut, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(ftxf_fecha_ver_fin, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_fecha_ver_fin, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(ftxf_fecha_acepta_fin, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_fecha_acepta_fin, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)));
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lb_fecha_ini_act, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
				                .addComponent(ftxf_fecha_ini_act, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(chb_acepta_trab, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
				                .addGap(13)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(lb_act_al, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(8)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lb_al, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 162, Short.MAX_VALUE))
				            .addComponent(ftxf_fecha_fin_act, GroupLayout.Alignment.LEADING, 0, 179, Short.MAX_VALUE)))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(ftxf_acepta_rev_trab, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
				        .addComponent(ftxf_fecha_fin_atrab, 0, 153, Short.MAX_VALUE)))
				.addGroup(thisLayout.createSequentialGroup()
				    .addGap(31)
				    .addGroup(thisLayout.createParallelGroup()
				        .addGroup(thisLayout.createSequentialGroup()
				            .addGroup(thisLayout.createParallelGroup()
				                .addComponent(lb_fecha_acepta_fin, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
				                .addComponent(lb_fecha_ver_fin, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
				                .addComponent(lb_fecha_not_aut, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
				            .addGroup(thisLayout.createParallelGroup()
				                .addComponent(ftxf_fecha_acepta_fin, GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)
				                .addComponent(ftxf_fecha_ver_fin, GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)
				                .addComponent(ftxf_fecha_not_aut, GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)))
				        .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				            .addComponent(lb_fecha_recep, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
				            .addComponent(ftxf_fecha_ini_atrab, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
				            .addGap(0, 191, Short.MAX_VALUE)))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
