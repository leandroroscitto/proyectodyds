package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.toedter.calendar.JDateChooser;

import datos.Actividad;

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
public class pnl_fechas_act extends javax.swing.JPanel {

	public static final long serialVersionUID = 1L;
	public JDateChooser dtc_fecha_ini_act;
	public JLabel lb_fecha_acepta_fin;
	public JLabel lb_fecha_ver_fin;
	public JDateChooser dtc_fecha_acept_fin;
	public JLabel lb_fecha_not_aut;
	public JLabel lb_fecha_recep;
	public JLabel lb_fecha_ini_act;
	public JCheckBox chb_acepta_rev_trab;
	public JDateChooser dtc_fecha_ini_atrab;
	public JDateChooser dtc_fecha_fin_act;
	public JCheckBox chb_acepta_trab;
	public JDateChooser dtc_fecha_ver_final;
	public JDateChooser dtc_fecha_not_aut;
	public JDateChooser dtc_fecha_fin_atrab;

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
	 * Auto-generated main method to display this JPanel inside a new JFrame.
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
			GroupLayout thisLayout = new GroupLayout((JComponent) this);
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(456, 181));
			{
				chb_acepta_trab = new JCheckBox();
				chb_acepta_trab.setText("Acepta presentación de Trabajos");
				chb_acepta_trab.setHorizontalTextPosition(SwingConstants.LEFT);
				chb_acepta_trab.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						chb_acepta_trabActionPerformed(evt);
					}
				});
			}
			{
				chb_acepta_rev_trab = new JCheckBox();
				chb_acepta_rev_trab.setText("Acepta revisón de Trabajos");
				chb_acepta_rev_trab
						.setHorizontalTextPosition(SwingConstants.LEFT);
				chb_acepta_rev_trab.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						chb_acepta_rev_trabActionPerformed(evt);
					}
				});
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
			thisLayout
					.setVerticalGroup(thisLayout
							.createSequentialGroup()
							.addGroup(
									thisLayout
											.createParallelGroup()
											.addGroup(
													GroupLayout.Alignment.LEADING,
													thisLayout
															.createSequentialGroup()
															.addComponent(
																	lb_fecha_ini_act,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(
																	LayoutStyle.ComponentPlacement.RELATED))
											.addComponent(
													dtc_fecha_ini_act,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													dtc_fecha_fin_act,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(chb_acepta_trab,
									GroupLayout.PREFERRED_SIZE,
									GroupLayout.PREFERRED_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup()
											.addGroup(
													GroupLayout.Alignment.LEADING,
													thisLayout
															.createSequentialGroup()
															.addComponent(
																	lb_fecha_recep,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(
																	LayoutStyle.ComponentPlacement.RELATED))
											.addComponent(
													dtc_fecha_ini_atrab,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													dtc_fecha_fin_atrab,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addComponent(chb_acepta_rev_trab,
									GroupLayout.PREFERRED_SIZE,
									GroupLayout.PREFERRED_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup()
											.addGroup(
													GroupLayout.Alignment.LEADING,
													thisLayout
															.createSequentialGroup()
															.addComponent(
																	lb_fecha_not_aut,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(
																	LayoutStyle.ComponentPlacement.RELATED))
											.addComponent(
													dtc_fecha_not_aut,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup()
											.addComponent(
													dtc_fecha_ver_final,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE)
											.addGroup(
													GroupLayout.Alignment.LEADING,
													thisLayout
															.createSequentialGroup()
															.addComponent(
																	lb_fecha_ver_fin,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(
																	LayoutStyle.ComponentPlacement.RELATED)))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup()
											.addGroup(
													GroupLayout.Alignment.LEADING,
													thisLayout
															.createSequentialGroup()
															.addComponent(
																	lb_fecha_acepta_fin,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(
																	LayoutStyle.ComponentPlacement.RELATED))
											.addComponent(
													dtc_fecha_acept_fin,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE)));
			thisLayout
					.setHorizontalGroup(thisLayout
							.createParallelGroup()
							.addGroup(
									thisLayout
											.createParallelGroup()
											.addGroup(
													thisLayout
															.createSequentialGroup()
															.addGroup(
																	thisLayout
																			.createParallelGroup()
																			.addGroup(
																					GroupLayout.Alignment.LEADING,
																					thisLayout
																							.createSequentialGroup()
																							.addComponent(
																									lb_fecha_ini_act,
																									GroupLayout.PREFERRED_SIZE,
																									132,
																									GroupLayout.PREFERRED_SIZE)
																							.addComponent(
																									dtc_fecha_ini_act,
																									GroupLayout.PREFERRED_SIZE,
																									158,
																									GroupLayout.PREFERRED_SIZE))
																			.addGroup(
																					GroupLayout.Alignment.LEADING,
																					thisLayout
																							.createSequentialGroup()
																							.addComponent(
																									chb_acepta_trab,
																									GroupLayout.PREFERRED_SIZE,
																									246,
																									GroupLayout.PREFERRED_SIZE)
																							.addGap(
																									44)))
															.addPreferredGap(
																	LayoutStyle.ComponentPlacement.RELATED)
															.addGroup(
																	thisLayout
																			.createParallelGroup()
																			.addComponent(
																					dtc_fecha_fin_atrab,
																					GroupLayout.Alignment.LEADING,
																					GroupLayout.PREFERRED_SIZE,
																					160,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(
																					dtc_fecha_fin_act,
																					GroupLayout.Alignment.LEADING,
																					GroupLayout.PREFERRED_SIZE,
																					159,
																					GroupLayout.PREFERRED_SIZE)))
											.addGroup(
													GroupLayout.Alignment.LEADING,
													thisLayout
															.createSequentialGroup()
															.addComponent(
																	chb_acepta_rev_trab,
																	GroupLayout.PREFERRED_SIZE,
																	315,
																	GroupLayout.PREFERRED_SIZE)
															.addGap(
																	0,
																	141,
																	Short.MAX_VALUE)))
							.addGroup(
									thisLayout
											.createSequentialGroup()
											.addGap(31)
											.addGroup(
													thisLayout
															.createParallelGroup()
															.addGroup(
																	thisLayout
																			.createSequentialGroup()
																			.addGroup(
																					thisLayout
																							.createParallelGroup()
																							.addComponent(
																									lb_fecha_acepta_fin,
																									GroupLayout.Alignment.LEADING,
																									GroupLayout.PREFERRED_SIZE,
																									198,
																									GroupLayout.PREFERRED_SIZE)
																							.addComponent(
																									lb_fecha_ver_fin,
																									GroupLayout.Alignment.LEADING,
																									GroupLayout.PREFERRED_SIZE,
																									198,
																									GroupLayout.PREFERRED_SIZE)
																							.addComponent(
																									lb_fecha_not_aut,
																									GroupLayout.Alignment.LEADING,
																									GroupLayout.PREFERRED_SIZE,
																									198,
																									GroupLayout.PREFERRED_SIZE))
																			.addGroup(
																					thisLayout
																							.createParallelGroup()
																							.addGroup(
																									thisLayout
																											.createSequentialGroup()
																											.addComponent(
																													dtc_fecha_ver_final,
																													GroupLayout.PREFERRED_SIZE,
																													144,
																													GroupLayout.PREFERRED_SIZE))
																							.addGroup(
																									thisLayout
																											.createSequentialGroup()
																											.addComponent(
																													dtc_fecha_not_aut,
																													GroupLayout.PREFERRED_SIZE,
																													144,
																													GroupLayout.PREFERRED_SIZE))
																							.addGroup(
																									thisLayout
																											.createSequentialGroup()
																											.addComponent(
																													dtc_fecha_acept_fin,
																													GroupLayout.PREFERRED_SIZE,
																													144,
																													GroupLayout.PREFERRED_SIZE)))
																			.addGap(
																					0,
																					0,
																					Short.MAX_VALUE))
															.addGroup(
																	GroupLayout.Alignment.LEADING,
																	thisLayout
																			.createSequentialGroup()
																			.addComponent(
																					lb_fecha_recep,
																					GroupLayout.PREFERRED_SIZE,
																					121,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(
																					dtc_fecha_ini_atrab,
																					GroupLayout.PREFERRED_SIZE,
																					138,
																					GroupLayout.PREFERRED_SIZE)
																			.addGap(
																					0,
																					83,
																					Short.MAX_VALUE)))
											.addContainerGap(83, 83)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setearCreacion() {
		dtc_fecha_ini_act.setDate(null);
		dtc_fecha_fin_act.setDate(null);
		dtc_fecha_ini_atrab.setDate(null);
		dtc_fecha_fin_atrab.setDate(null);
		dtc_fecha_not_aut.setDate(null);
		dtc_fecha_ver_final.setDate(null);
		dtc_fecha_acept_fin.setDate(null);
	}

	public void setearModificacion(Actividad act) {
		dtc_fecha_ini_act.setDate(act.getFecha_Inicio());
		dtc_fecha_fin_act.setDate(act.getFecha_Fin());
		dtc_fecha_ini_atrab.setDate(act.getFecha_Recep_Ini());
		dtc_fecha_fin_atrab.setDate(act.getFecha_Recep_Fin());
		dtc_fecha_not_aut.setDate(act.getFecha_Not_Autores());
		dtc_fecha_ver_final.setDate(act.getFecha_Version_Final());
		dtc_fecha_acept_fin.setDate(act.getFecha_Acep_Final());
	}

	public Date getFechaIniAct() {
		return dtc_fecha_ini_act.getDate();
	}

	public Date getFechaFinAct() {
		return dtc_fecha_fin_act.getDate();
	}

	public Date getFechaIniTra() {
		return dtc_fecha_ini_atrab.getDate();
	}

	public Date getFechaFinTra() {
		return dtc_fecha_fin_atrab.getDate();
	}

	public Date getFechaNotAut() {
		return dtc_fecha_not_aut.getDate();
	}
	public Date getFechaVerFin() {
		return dtc_fecha_ver_final.getDate();
	}
	public Date getFechaAcepFin() {
		return dtc_fecha_acept_fin.getDate();
	}
	
	public boolean getAcepTrab(){
		return chb_acepta_trab.isSelected();
	}
	
	public boolean getRevTrab(){
		return chb_acepta_rev_trab.isSelected();
	}

	public boolean validarDatos() {
		boolean finiaval = (dtc_fecha_ini_act.getDate() != null);
		boolean ffinaval = (dtc_fecha_fin_act.getDate() != null);

		boolean validar;

		validar = (finiaval && ffinaval);
		if (!validar) {
			JOptionPane
					.showMessageDialog(null,
							"Seleccione o ingrese las fechas de inicio y fin de la actividad.");
		} else {
			if (dtc_fecha_ini_act.getDate().after(dtc_fecha_fin_act.getDate())) {
				JOptionPane
						.showMessageDialog(
								null,
								"La fecha de inicio de la actividad debe ser anterior o igual a la de finalización.");
				validar = false;
			} else {
				if (chb_acepta_trab.isSelected()) {
					boolean finiatval = (dtc_fecha_ini_atrab.getDate() != null);
					boolean ffinatval = (dtc_fecha_fin_atrab.getDate() != null);
					validar = (validar && finiatval && ffinatval);
					if (!validar) {
						JOptionPane
								.showMessageDialog(null,
										"Seleccione o ingrese las fechas de inicio y fin de recepción de trabajos.");
					} else {
						if (dtc_fecha_ini_atrab.getDate().after(
								dtc_fecha_fin_atrab.getDate())) {
							JOptionPane
									.showMessageDialog(
											null,
											"La fecha de inicio de aceptación de trabajos debe ser anterior o igual a la de finalización.");
							validar = false;
						} else {
							if (chb_acepta_rev_trab.isSelected()) {
								boolean fnotaval = (dtc_fecha_not_aut.getDate() != null);
								boolean fverfval = (dtc_fecha_ver_final
										.getDate() != null);
								boolean fafval = (dtc_fecha_acept_fin.getDate() != null);
								validar = (validar && fnotaval && fverfval && fafval);
								if (!validar) {
									JOptionPane
											.showMessageDialog(null,
													"Seleccione o ingrese las fechas de notificación, versión y aceptación final.");
								}
							}
						}
					}
				}
			}
		}
		return validar;
	}

	private void chb_acepta_rev_trabActionPerformed(ActionEvent evt) {
		System.out
				.println("pnl_fechas_act1.chb_acepta_rev_trab.actionPerformed, event="
						+ evt);
		boolean acept_revi_trab = chb_acepta_rev_trab.isSelected();

		dtc_fecha_not_aut.setEnabled(acept_revi_trab);
		lb_fecha_not_aut.setEnabled(acept_revi_trab);
		lb_fecha_ver_fin.setEnabled(acept_revi_trab);
		dtc_fecha_ver_final.setEnabled(acept_revi_trab);
		lb_fecha_acepta_fin.setEnabled(acept_revi_trab);
		dtc_fecha_acept_fin.setEnabled(acept_revi_trab);
	}

	private void chb_acepta_trabActionPerformed(ActionEvent evt) {
		System.out
				.println("pnl_fechas_act1.chb_acepta_trab.actionPerformed, event="
						+ evt);
		boolean acept_pres_trab = chb_acepta_trab.isSelected();
		boolean acept_revi_trab = false;
		chb_acepta_rev_trab.setSelected(false);

		lb_fecha_recep.setEnabled(acept_pres_trab);
		dtc_fecha_ini_atrab.setEnabled(acept_pres_trab);
		dtc_fecha_fin_atrab.setEnabled(acept_pres_trab);
		chb_acepta_rev_trab.setEnabled(acept_pres_trab);

		dtc_fecha_not_aut.setEnabled(acept_pres_trab && acept_revi_trab);
		lb_fecha_not_aut.setEnabled(acept_pres_trab && acept_revi_trab);
		lb_fecha_ver_fin.setEnabled(acept_pres_trab && acept_revi_trab);
		dtc_fecha_ver_final.setEnabled(acept_pres_trab && acept_revi_trab);
		lb_fecha_acepta_fin.setEnabled(acept_pres_trab && acept_revi_trab);
		dtc_fecha_acept_fin.setEnabled(acept_pres_trab && acept_revi_trab);
	}

}
