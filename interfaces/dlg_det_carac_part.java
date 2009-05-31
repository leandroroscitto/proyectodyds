package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import datos.Caracter_Participacion;
import datos.Relaciones.Detalle_CP;

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
public class dlg_det_carac_part extends javax.swing.JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JComboBox cb_carc_part;
	public JFormattedTextField ftxf_arancel;
	public JCheckBox cbx_e_cert;
	private JButton btn_cancelar;
	private JButton btn_aceptar;
	private JPanel jPanel1;
	public JLabel lb_porcent;
	public JLabel lb_arancel;
	public JLabel lb_carac_part;
	public JSpinner sp_porcent;
	public JCheckBox cbx_eva;

	// Componentes
	private JFrame Parent;
	private pnl_caract_part_aceptados Parent2;
	private boolean crearswitch;
	private Detalle_CP dcarpmod;

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

	public dlg_det_carac_part() {
		super();
		initGUI();
	}

	public dlg_det_carac_part(JFrame P) {
		super();
		Parent = P;
		initGUI();
	}

	public dlg_det_carac_part(JFrame P, pnl_caract_part_aceptados P2) {
		super();
		Parent = P;
		Parent2 = P2;
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(
					(JComponent) getContentPane());
			getContentPane().setLayout(thisLayout);
			this.setTitle("Detalles de Caracter de Participación");
			this.setResizable(false);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					thisWindowClosing(evt);
				}
			});
			{
				ComboBoxModel cb_carc_partModel = new DefaultComboBoxModel(
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
				jPanel1 = new JPanel();
				{
					btn_aceptar = new JButton();
					jPanel1.add(btn_aceptar);
					btn_aceptar.setText("Aceptar");
					btn_aceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_aceptarActionPerformed(evt);
						}
					});
				}
				{
					btn_cancelar = new JButton();
					jPanel1.add(btn_cancelar);
					btn_cancelar.setText("Cancelar");
					btn_cancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_cancelarActionPerformed(evt);
						}
					});
				}
			}
			{
				SpinnerListModel sp_porcentModel = new SpinnerListModel(
						new String[] { "0", "10", "20", "30", "40", "50", "60",
								"70", "80", "90", "100" });
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
					.addGap(8).addGroup(
							thisLayout.createParallelGroup(
									GroupLayout.Alignment.BASELINE)
									.addComponent(cb_carc_part,
											GroupLayout.Alignment.BASELINE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(lb_carac_part,
											GroupLayout.Alignment.BASELINE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(
							thisLayout.createParallelGroup(
									GroupLayout.Alignment.BASELINE)
									.addComponent(ftxf_arancel,
											GroupLayout.Alignment.BASELINE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(lb_arancel,
											GroupLayout.Alignment.BASELINE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(cbx_eva, GroupLayout.PREFERRED_SIZE,
							GroupLayout.PREFERRED_SIZE,
							GroupLayout.PREFERRED_SIZE).addPreferredGap(
							LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(cbx_e_cert, GroupLayout.PREFERRED_SIZE,
							GroupLayout.PREFERRED_SIZE,
							GroupLayout.PREFERRED_SIZE).addPreferredGap(
							LayoutStyle.ComponentPlacement.RELATED).addGroup(
							thisLayout.createParallelGroup(
									GroupLayout.Alignment.BASELINE)
									.addComponent(sp_porcent,
											GroupLayout.Alignment.BASELINE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(lb_porcent,
											GroupLayout.Alignment.BASELINE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE,
											GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jPanel1, 0, 32, Short.MAX_VALUE));
			thisLayout
					.setHorizontalGroup(thisLayout
							.createParallelGroup()
							.addComponent(jPanel1,
									GroupLayout.Alignment.LEADING, 0, 322,
									Short.MAX_VALUE)
							.addGroup(
									thisLayout
											.createSequentialGroup()
											.addPreferredGap(
													jPanel1,
													lb_porcent,
													LayoutStyle.ComponentPlacement.INDENT)
											.addGroup(
													thisLayout
															.createParallelGroup()
															.addGroup(
																	GroupLayout.Alignment.LEADING,
																	thisLayout
																			.createSequentialGroup()
																			.addComponent(
																					lb_porcent,
																					GroupLayout.PREFERRED_SIZE,
																					203,
																					GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(
																					LayoutStyle.ComponentPlacement.UNRELATED)
																			.addComponent(
																					sp_porcent,
																					GroupLayout.PREFERRED_SIZE,
																					52,
																					GroupLayout.PREFERRED_SIZE)
																			.addGap(
																					0,
																					25,
																					Short.MAX_VALUE))
															.addGroup(
																	thisLayout
																			.createSequentialGroup()
																			.addGroup(
																					thisLayout
																							.createParallelGroup()
																							.addComponent(
																									lb_arancel,
																									GroupLayout.Alignment.LEADING,
																									GroupLayout.PREFERRED_SIZE,
																									165,
																									GroupLayout.PREFERRED_SIZE)
																							.addComponent(
																									lb_carac_part,
																									GroupLayout.Alignment.LEADING,
																									GroupLayout.PREFERRED_SIZE,
																									165,
																									GroupLayout.PREFERRED_SIZE)
																							.addGroup(
																									GroupLayout.Alignment.LEADING,
																									thisLayout
																											.createSequentialGroup()
																											.addComponent(
																													cbx_eva,
																													GroupLayout.PREFERRED_SIZE,
																													161,
																													GroupLayout.PREFERRED_SIZE)
																											.addPreferredGap(
																													LayoutStyle.ComponentPlacement.RELATED))
																							.addGroup(
																									GroupLayout.Alignment.LEADING,
																									thisLayout
																											.createSequentialGroup()
																											.addComponent(
																													cbx_e_cert,
																													GroupLayout.PREFERRED_SIZE,
																													161,
																													GroupLayout.PREFERRED_SIZE)
																											.addPreferredGap(
																													LayoutStyle.ComponentPlacement.RELATED)))
																			.addPreferredGap(
																					LayoutStyle.ComponentPlacement.RELATED,
																					12,
																					Short.MAX_VALUE)
																			.addGroup(
																					thisLayout
																							.createParallelGroup()
																							.addGroup(
																									GroupLayout.Alignment.LEADING,
																									thisLayout
																											.createSequentialGroup()
																											.addComponent(
																													ftxf_arancel,
																													GroupLayout.PREFERRED_SIZE,
																													52,
																													GroupLayout.PREFERRED_SIZE)
																											.addGap(
																													69))
																							.addComponent(
																									cb_carc_part,
																									GroupLayout.Alignment.LEADING,
																									GroupLayout.PREFERRED_SIZE,
																									121,
																									GroupLayout.PREFERRED_SIZE))))
											.addContainerGap(12, 12)));
			pack();
			this.setSize(330, 214);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setearCreacion() {
		crearswitch = true;

		cargarCP();
		ftxf_arancel.setText("0.0");
		cbx_eva.setSelected(false);
		cbx_e_cert.setSelected(false);
		sp_porcent.setValue("0");
		sp_porcent.getEditor().setEnabled(false);
	}

	public void setearModificacion(Detalle_CP dcp) {
		crearswitch = false;
		dcarpmod = dcp;

		cb_carc_part.removeAllItems();
		cb_carc_part.addItem(dcp.getCp().getNombre());
		cb_carc_part.setEnabled(false);

		ftxf_arancel.setText(String.valueOf(dcp.getMonto()));
		cbx_eva.setSelected(dcp.isEsEval());
		cbx_e_cert.setSelected(dcp.isEmiteCert());
		sp_porcent.setValue(String.valueOf(dcp.getPorcentMinAsist()));
	}

	private void cargarCP() {
		int i;
		ArrayList lista_cp = sys.Sistema.D.lista_caracter_participacion;

		cb_carc_part.setEnabled(true);
		cb_carc_part.removeAllItems();
		for (i = 0; i < lista_cp.size(); i++) {
			cb_carc_part.addItem(((Caracter_Participacion) (lista_cp.get(i)))
					.getNombre());
		}
		if (lista_cp.size() > 0) {
			cb_carc_part.setSelectedIndex(0);
		}
	}

	private boolean validarCampos() {
		if (cb_carc_part.getSelectedIndex() < 0) {
			JOptionPane.showMessageDialog(null,
					"No existe un caracter de participación seleccionado.");
			return false;
		}
		try {
			float monto = Float.parseFloat(ftxf_arancel.getText());
			if (monto < 0) {return(false);}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"El monto ingresado no es un numero válido.");
			return false;
		}
		try {
			float asist = Float.parseFloat((String) sp_porcent.getValue());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"El porcentaje mínimo no es válido.");
			return false;
		}
		return true;
	}

	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosing, event=" + evt);
		Parent.setEnabled(true);
		setVisible(false);
	}

	private void btn_aceptarActionPerformed(ActionEvent evt) {
		System.out.println("btn_aceptar.actionPerformed, event=" + evt);
		if (crearswitch) {
			if (validarCampos()) {
				ArrayList lista_cp = sys.Sistema.D.lista_caracter_participacion;
				int icarp;
				Caracter_Participacion cp;
				float monto;
				int asist;
				boolean eval, cert;

				icarp = cb_carc_part.getSelectedIndex();
				cp = (Caracter_Participacion) lista_cp.get(icarp);
				monto = Float.parseFloat(ftxf_arancel.getText());
				asist = Integer.parseInt((String) sp_porcent.getValue());
				eval = cbx_eva.isSelected();
				cert = cbx_e_cert.isSelected();

				Detalle_CP dcp = new Detalle_CP(null, cp, eval, cert, monto,
						asist);
				if (!Parent2.agregar_a_lista(dcp)) {
					JOptionPane
							.showMessageDialog(null,
									"Ya existe el detalle de caracter de participación.");
				} else {
					Parent.setEnabled(true);
					setVisible(false);
				}
			}
		} else {
			// es una modificacion
			if (validarCampos()) {
				float monto;
				int asist;
				boolean eval, cert;

				monto = Float.parseFloat(ftxf_arancel.getText());
				asist = Integer.parseInt((String) sp_porcent.getValue());
				eval = cbx_eva.isSelected();
				cert = cbx_e_cert.isSelected();
				
				dcarpmod.setMonto(monto);
				dcarpmod.setPorcentMinAsist(asist);
				dcarpmod.setEsEval(eval);
				dcarpmod.setEmiteCert(cert);
				
				Parent.setEnabled(true);
				setVisible(false);
			}
		}

	}

	private void btn_cancelarActionPerformed(ActionEvent evt) {
		Parent.setEnabled(true);
		setVisible(false);
	}

}
