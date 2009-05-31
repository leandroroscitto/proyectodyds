package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import datos.Actividad;
import datos.Evento;
import datos.Persona;
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
public class frm_abm_actividades extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	private pnl_atrib_act pnl_atrib_act1;

	private pnl_botones_ac pnl_botones_ac1;

	private pnl_lista_responsables pnl_lista_responsables1;

	private pnl_caract_part_aceptados pnl_caract_part_aceptados1;

	private pnl_fechas_act pnl_fechas_act1;

	// Componentes
	private Principal Parent;

	private dlg_det_carac_part dcpart;

	private dlg_seleccionar_cargo dsc;

	private boolean creacionswitch;

	private Actividad actmod;

	public Persona PaCargo;

	private void Iniciar_comp() {
		dsc = new dlg_seleccionar_cargo(this, pnl_atrib_act1);
	}

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
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frm_abm_actividades inst = new frm_abm_actividades(null);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public frm_abm_actividades(Principal P) {
		super();
		Parent = P;
		initGUI();
		Iniciar_comp();
	}

	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setPreferredSize(new java.awt.Dimension(498, 649));
			this.setMinimumSize(new java.awt.Dimension(0, 0));
			this.setTitle("ABM Actividades");
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					thisWindowClosing(evt);
				}
			});
			{
				pnl_atrib_act1 = new pnl_atrib_act(this);
				getContentPane().add(
						pnl_atrib_act1,
						new AnchorConstraint(5, 5, 385, 5,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_NONE,
								AnchorConstraint.ANCHOR_ABS));
				pnl_atrib_act1
						.setPreferredSize(new java.awt.Dimension(611, 99));
			}
			{
				pnl_fechas_act1 = new pnl_fechas_act();
				getContentPane().add(
						pnl_fechas_act1,
						new AnchorConstraint(108, 5, 431, 5,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_NONE,
								AnchorConstraint.ANCHOR_ABS));
				pnl_fechas_act1.setPreferredSize(new java.awt.Dimension(480,
						186));
				pnl_fechas_act1.lb_fecha_recep.setEnabled(false);
				pnl_fechas_act1.dtc_fecha_ini_atrab.setEnabled(false);
				pnl_fechas_act1.dtc_fecha_fin_atrab.setEnabled(false);
				pnl_fechas_act1.dtc_fecha_not_aut.setEnabled(false);
				pnl_fechas_act1.lb_fecha_not_aut.setEnabled(false);
				pnl_fechas_act1.lb_fecha_ver_fin.setEnabled(false);
				pnl_fechas_act1.dtc_fecha_ver_final.setEnabled(false);
				pnl_fechas_act1.lb_fecha_acepta_fin.setEnabled(false);
				pnl_fechas_act1.dtc_fecha_acept_fin.setEnabled(false);
				pnl_fechas_act1.chb_acepta_rev_trab.setEnabled(false);
			}
			{
				pnl_caract_part_aceptados1 = new pnl_caract_part_aceptados(this);
				getContentPane().add(
						pnl_caract_part_aceptados1,
						new AnchorConstraint(300, 5, 685, 5,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_REL,
								AnchorConstraint.ANCHOR_ABS));
				pnl_caract_part_aceptados1
						.setPreferredSize(new java.awt.Dimension(480, 126));
			}
			{
				pnl_lista_responsables1 = new pnl_lista_responsables(this);
				getContentPane().add(
						pnl_lista_responsables1,
						new AnchorConstraint(695, 5, 52, 5,
								AnchorConstraint.ANCHOR_REL,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS));
				pnl_lista_responsables1
						.setPreferredSize(new java.awt.Dimension(480, 138));
			}
			{
				pnl_botones_ac1 = new pnl_botones_ac();
				getContentPane().add(
						pnl_botones_ac1,
						new AnchorConstraint(921, 5, 0, 5,
								AnchorConstraint.ANCHOR_NONE,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS,
								AnchorConstraint.ANCHOR_ABS));
				pnl_botones_ac1
						.setPreferredSize(new java.awt.Dimension(507, 46));
				pnl_botones_ac1.btn_acepta
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btn_aceptaActionPerformed(evt);
							}
						});
				pnl_botones_ac1.btn_cancelar
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btn_cancelarActionPerformed(evt);
							}
						});
			}
			pack();
			this.setSize(498, 649);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setearCreacion() {
		creacionswitch = true;

		pnl_atrib_act1.setearCreacion();
		pnl_fechas_act1.setearCreacion();
		pnl_caract_part_aceptados1.setearCreacion();
		pnl_lista_responsables1.setearCreacion();
	}

	public void setearModificacion(Actividad Act) {
		creacionswitch = false;
		actmod = Act;

		pnl_atrib_act1.setearModificacion(Act);
		pnl_fechas_act1.setearModificacion(Act);
		pnl_caract_part_aceptados1.setearModificacion(Act);
		pnl_lista_responsables1.setearModificacion(Act);
	}

	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosing, event=" + evt);
		this.setVisible(false);
		Parent.setEnabled(true);
		Parent.requestFocus();
	}

	private boolean ValidarDatos() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		boolean valido = true;
		valido = (pnl_atrib_act1.validardatos() && valido);
		valido = (pnl_fechas_act1.validarDatos() && valido);
		if (pnl_lista_responsables1.lista_responsables.size() == 0) {
			JOptionPane.showMessageDialog(null,
					"Ingrese por lo menos un responsable de la actividad.");
			valido = false;
		}

		String nombre;
		Persona percargo;
		Evento evtasig;
		boolean acept, evalt;
		Date fini, ffin, finir, ffinr, fna, fvf, faf;

		nombre = pnl_atrib_act1.getNombre();
		percargo = pnl_atrib_act1.getPersonaCargo();
		evtasig = pnl_atrib_act1.getEvento();

		fini = pnl_fechas_act1.getFechaIniAct();
		ffin = pnl_fechas_act1.getFechaFinAct();
		finir = pnl_fechas_act1.getFechaIniTra();
		ffinr = pnl_fechas_act1.getFechaFinTra();
		fvf = pnl_fechas_act1.getFechaVerFin();
		fna = pnl_fechas_act1.getFechaNotAut();
		faf = pnl_fechas_act1.getFechaAcepFin();
		acept = pnl_fechas_act1.getAcepTrab();
		evalt = pnl_fechas_act1.getRevTrab();

		// control de fechas entre la act y el evt
		Date evtini = evtasig.getFecha_Inicio();
		Date evtfin = evtasig.getFecha_Fin();
		if (valido && evtini.after(fini)) {
			JOptionPane
					.showMessageDialog(
							null,
							"La fecha de inicio de la actividad debe ser posterior a la de inicio del evento ("
									+ dateFormat.format(evtini) + ")");
			valido = false;
		}
		if (valido && ffin.after(evtfin)) {
			JOptionPane.showMessageDialog(null,
					"La fecha de fin de la actividad debe ser anterior a la de fin del evento ("
							+ dateFormat.format(evtfin) + ")");
			valido = false;
		}
		if (valido && evalt) {
			if (evtini.after(fna) || evtini.after(fvf) || evtini.after(faf)) {
				JOptionPane
						.showMessageDialog(
								null,
								"Las fechas de notificación a autores, versión final y aceptación final debe ser posteriores a la de inicio del evento ("
										+ dateFormat.format(evtfin) + ")");
				valido = false;
			}
		}
		return valido;
	}

	private void btn_cancelarActionPerformed(ActionEvent evt) {
		System.out
				.println("pnl_botones_ac1.btn_cancelar.actionPerformed, event="
						+ evt);
		this.setVisible(false);
		Parent.setEnabled(true);
		Parent.requestFocus();
	}

	private boolean existeNombre(String n, ArrayList L) {
		int i;
		int cant = L.size();
		Actividad act;

		for (i = 0; i < cant; i++) {
			act = (Actividad) L.get(i);
			if (act.getNombre().compareTo(n) == 0) {
				return true;
			}
		}
		return false;
	}

	private boolean existeNombreExcep(String n, String en, ArrayList L) {
		int i;
		int cant = L.size();
		Actividad act;

		for (i = 0; i < cant; i++) {
			act = (Actividad) L.get(i);
			if (act.getNombre().compareTo(n) == 0) {
				if (act.getNombre().compareTo(en) != 0) {
					return true;
				}
			}
		}
		return false;
	}

	private void btn_aceptaActionPerformed(ActionEvent evt) {
		System.out.println("pnl_botones_ac1.btn_acepta.actionPerformed, event="
				+ evt);

		boolean valido = ValidarDatos();

		if (valido) {
			String nombre;
			Persona percargo;
			Evento evtasig;
			boolean acept, evalt;
			Date fini, ffin, finir, ffinr, fna, fvf, faf;

			nombre = pnl_atrib_act1.getNombre();
			percargo = pnl_atrib_act1.getPersonaCargo();
			evtasig = pnl_atrib_act1.getEvento();

			fini = pnl_fechas_act1.getFechaIniAct();
			ffin = pnl_fechas_act1.getFechaFinAct();
			finir = pnl_fechas_act1.getFechaIniTra();
			ffinr = pnl_fechas_act1.getFechaFinTra();
			fvf = pnl_fechas_act1.getFechaVerFin();
			fna = pnl_fechas_act1.getFechaNotAut();
			faf = pnl_fechas_act1.getFechaAcepFin();
			acept = pnl_fechas_act1.getAcepTrab();
			evalt = pnl_fechas_act1.getRevTrab();

			if (creacionswitch) {
				if (!existeNombre(nombre, sys.Sistema.D.lista_actividades)) {

					Actividad act = new Actividad(0, nombre, percargo, evtasig,
							fini, ffin);

					act.setFecha_Recep_Ini(finir);
					act.setFecha_Recep_Fin(ffinr);
					act.setFecha_Version_Final(fvf);
					act.setFecha_Not_Autores(fna);
					act.setFecha_Acep_Final(faf);
					act.setAcepta_Trabajos(acept);
					act.setTrabajos_Eval(evalt);

					ArrayList l_dcp, l_per;

					l_dcp = pnl_caract_part_aceptados1.lista_dcaract_part;
					l_per = pnl_lista_responsables1.lista_responsables;

					int i;
					for (i = 0; i < l_dcp.size(); i++) {
						act.agregarDCarcPartAcep((Detalle_CP) l_dcp.get(i));
					}

					for (i = 0; i < l_per.size(); i++) {
						act.agregarResp((Persona) l_per.get(i));
					}

					sys.Sistema.D.lista_actividades.add(act);

					Parent.ActualizarCampos();
					Parent.setEnabled(true);
					setVisible(false);

				} else {
					JOptionPane.showMessageDialog(null,
							"Ya existe una Actividad con ese nombre.");
				}

			} else {

				if (!existeNombreExcep(nombre, actmod.getNombre(),
						sys.Sistema.D.lista_actividades)) {
					// es una modificacion
					actmod.setNombre(nombre);
					actmod.setPersona_a_cargo(percargo);
					actmod.setEvtAsociado(evtasig);
					actmod.setFecha_Inicio(fini);
					actmod.setFecha_Fin(ffin);

					actmod.setFecha_Recep_Ini(finir);
					actmod.setFecha_Recep_Fin(ffinr);
					actmod.setFecha_Version_Final(fvf);
					actmod.setFecha_Not_Autores(fna);
					actmod.setFecha_Acep_Final(faf);
					actmod.setAcepta_Trabajos(acept);
					actmod.setTrabajos_Eval(evalt);

					ArrayList l_dcp, l_per;

					l_dcp = pnl_caract_part_aceptados1.lista_dcaract_part;
					l_per = pnl_lista_responsables1.lista_responsables;

					// vacia las listas originales
					actmod.limpiarCarcPartAcep();
					actmod.limpiarResp();

					int i;
					for (i = 0; i < l_dcp.size(); i++) {
						actmod.agregarDCarcPartAcep((Detalle_CP) l_dcp.get(i));
					}

					for (i = 0; i < l_per.size(); i++) {
						actmod.agregarResp((Persona) l_per.get(i));
					}

					Parent.ActualizarCampos();
					Parent.setEnabled(true);
					setVisible(false);

				}
				else
				{
					JOptionPane.showMessageDialog(null,
							"Ya existe una Actividad con ese nombre.");
				}
			}

		}
	}
}
