package interfaces;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import datos.Persona;

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
public class dlg_seleccionar_cargo extends javax.swing.JDialog {
	public JPanel pnl_botones;
	public JButton btn_registrar_pers;
	public JTable tbl_personas;
	public JLabel lb_selec_resp;
	public JScrollPane sp_tabla;
	public JButton btn_cancelar;
	public JButton btn_agregar_resp;

	public frm_abm_actividades Parent;
	public pnl_atrib_act Parent2;

	{
		// Set Look & Feel
		try {
			javax.swing.UIManager
					.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public dlg_seleccionar_cargo(frm_abm_actividades frame, pnl_atrib_act paa) {
		super();
		Parent = frame;
		Parent2 = paa;
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(
					(JComponent) getContentPane());
			getContentPane().setLayout(thisLayout);
			this.setTitle("Registro de Personas");
			this.setMinimumSize(new java.awt.Dimension(565, 205));
			this.setPreferredSize(new java.awt.Dimension(565, 205));
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					thisWindowClosing(evt);
				}

				public void windowActivated(WindowEvent evt) {
					thisWindowActivated(evt);
				}
			});
			{
				pnl_botones = new JPanel();
				FlowLayout pnl_botonesLayout = new FlowLayout();
				pnl_botones.setLayout(pnl_botonesLayout);
				{
					btn_agregar_resp = new JButton();
					pnl_botones.add(btn_agregar_resp);
					btn_agregar_resp.setText("Seleccionar");
					btn_agregar_resp.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_agregar_respActionPerformed(evt);
						}
					});
				}
				{
					btn_registrar_pers = new JButton();
					pnl_botones.add(btn_registrar_pers);
					btn_registrar_pers.setText("Registrar Persona");
					btn_registrar_pers.setEnabled(false);
				}
				{
					btn_cancelar = new JButton();
					pnl_botones.add(btn_cancelar);
					btn_cancelar.setText("Cancelar");
					btn_cancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_cancelarActionPerformed(evt);
						}
					});
				}
			}
			{
				sp_tabla = new JScrollPane();
				sp_tabla.setBorder(BorderFactory
						.createBevelBorder(BevelBorder.LOWERED));
				sp_tabla.setAutoscrolls(true);
				{
					TableModel tbl_personasModel = new DefaultTableModel(
							new String[] { "Nombre", "Apellido", "E-mail" }, 0);
					tbl_personas = new JTable();
					sp_tabla.setViewportView(tbl_personas);
					// tbl_personas.setModel(tbl_personasModel);
					tbl_personas.setPreferredSize(new java.awt.Dimension(529,
							86));
					tbl_personas.getTableHeader().setEnabled(true);
					tbl_personas.getTableHeader().setFocusable(true);
				}
			}
			{
				lb_selec_resp = new JLabel();
				lb_selec_resp.setText("Seleccionar Persona a Cargo:");
				lb_selec_resp.setSize(265, 27);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap().addComponent(lb_selec_resp,
							GroupLayout.PREFERRED_SIZE, 21,
							GroupLayout.PREFERRED_SIZE).addComponent(sp_tabla,
							0, 108, Short.MAX_VALUE).addComponent(pnl_botones,
							GroupLayout.PREFERRED_SIZE, 37,
							GroupLayout.PREFERRED_SIZE).addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap().addGroup(
							thisLayout.createParallelGroup().addGroup(
									GroupLayout.Alignment.LEADING,
									thisLayout.createSequentialGroup()
											.addComponent(lb_selec_resp,
													GroupLayout.PREFERRED_SIZE,
													188,
													GroupLayout.PREFERRED_SIZE)
											.addGap(0, 390, Short.MAX_VALUE))
									.addComponent(sp_tabla,
											GroupLayout.Alignment.LEADING, 0,
											578, Short.MAX_VALUE).addComponent(
											pnl_botones,
											GroupLayout.Alignment.LEADING, 0,
											578, Short.MAX_VALUE))
					.addContainerGap());
			pack();
			this.setSize(565, 205);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Carga la lista de Personas registradas
	private void cargarResponsables() {
		ArrayList responsables = sys.Sistema.D.lista_personas;

		int cant = responsables.size();
		Persona p = null;
		TableModel tbl_personasModel = new DefaultTableModel(new String[] {
				"Nombre", "Apellido", "E-mail" }, responsables.size());
		tbl_personas.setModel(tbl_personasModel);
		tbl_personas.setPreferredSize(new Dimension(tbl_personas.getWidth(),
				16 * responsables.size()));
		for (int i = 0; i < cant; i++) {
			p = (Persona) responsables.get(i);
			tbl_personas.setValueAt(p.getNombre(), i, 0);
			tbl_personas.setValueAt(p.getApellido(), i, 1);
			tbl_personas.setValueAt(p.getEmail(), i, 2);
		}
	}
	
	private void actualizarPersonaCargo(){
		ArrayList responsables = sys.Sistema.D.lista_personas;
		int cant = responsables.size();
		
		if (cant<1){
			JOptionPane.showMessageDialog(this, "No existen personas registradas en el sistema.");
		}else{
			int fila=tbl_personas.getSelectedRow();
			if (fila<0){
				JOptionPane.showMessageDialog(this, "No se seleccionó ninguna persona.");
			}else{
				Parent2.setPersonaCargo((Persona)responsables.get(fila));
				Parent.setEnabled(true);
				setVisible(false);
			}
		}
	}

	private void thisWindowActivated(WindowEvent evt) {
		System.out.println("this.windowActivated, event=" + evt);
		cargarResponsables();
	}

	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosing, event=" + evt);
		Parent.setEnabled(true);
	}

	private void btn_agregar_respActionPerformed(ActionEvent evt) {
		System.out.println("btn_agregar_resp.actionPerformed, event="+evt);
		actualizarPersonaCargo();
	}
	
	private void btn_cancelarActionPerformed(ActionEvent evt) {
		System.out.println("btn_cancelar.actionPerformed, event="+evt);
		Parent.setEnabled(true);
		setVisible(false);
	}
}
