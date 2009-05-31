package interfaces;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import datos.Actividad;
import datos.Evento;
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
public class pnl_atrib_act extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	public JLabel lb_nombre;

	public JLabel lb_acargo;

	public JLabel lb_asignado;

	public JLabel lb_nombre_acargo;

	public JButton bt_acargo;

	public JComboBox cb_acargo;

	public JTextField txf_nombre;

	// Componentes
	private Persona PersonaCargo;

	private frm_abm_actividades Parent;

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
		frame.getContentPane().add(new pnl_atrib_act(null));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public pnl_atrib_act() {
		super();
		initGUI();
	}

	public pnl_atrib_act(frm_abm_actividades p) {
		super();
		Parent = p;
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
				txf_nombre = new JTextField();
			}
			{
				ComboBoxModel cb_acargoModel = new DefaultComboBoxModel(
						new String[] { "Item One", "Item Two" });
				cb_acargo = new JComboBox();
				cb_acargo.setModel(cb_acargoModel);
				cb_acargo.setFont(new java.awt.Font("Dialog", 0, 12));
				cb_acargo.setSize(258, 28);
			}
			{
				bt_acargo = new JButton();
				bt_acargo.setText("Seleccionar");
				bt_acargo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						bt_acargoActionPerformed(evt);
					}
				});
			}
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(lb_asignado, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_acargo, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_nombre, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(cb_acargo, GroupLayout.Alignment.LEADING, 0, 348, Short.MAX_VALUE)
				    .addComponent(txf_nombre, GroupLayout.Alignment.LEADING, 0, 348, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(lb_nombre_acargo, 0, 184, Short.MAX_VALUE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE)
				        .addComponent(bt_acargo, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))));
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(txf_nombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_nombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(bt_acargo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_acargo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_nombre_acargo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(cb_acargo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lb_asignado, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)));
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {bt_acargo, cb_acargo, txf_nombre});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Setea todos los campos para la creacion
	public void setearCreacion() {
		txf_nombre.setText("");
		lb_nombre_acargo.setText("<<Nombre>>");
		cargarEventosCB();
	}

	public void setearModificacion(Actividad act) {
		txf_nombre.setText(act.getNombre());
		setPersonaCargo(act.getPersona_a_cargo());

		cargarEventosCB();
		cb_acargo.setSelectedItem(act.getEvtAsociado().getNombre());
	}

	public boolean validardatos() {
		boolean nomval = (!txf_nombre.getText().isEmpty());
		boolean percargval = (PersonaCargo != null);
		boolean evtval = (cb_acargo.getSelectedIndex() >= 0);

		if (!nomval) {
			JOptionPane.showMessageDialog(null,
					"El nombre de la actividad no puede ser vacío.");
		}
		if (!percargval) {
			JOptionPane.showMessageDialog(null,
					"Se debe seleccionar una persona a cargo de la actividad.");
		}
		if (!evtval) {
			JOptionPane
					.showMessageDialog(null,
							"Se debe seleccionar un evento asignado o la opcion <Sin Evento>.");
		}
		return (nomval && percargval && evtval);
	}

	public void setPersonaCargo(Persona p) {
		PersonaCargo = p;
		lb_nombre_acargo.setText(PersonaCargo.getNombre() + " "
				+ PersonaCargo.getApellido());
	}

	public Persona getPersonaCargo() {
		return PersonaCargo;
	}

	public String getNombre() {
		return txf_nombre.getText();
	}

	public Evento getEvento() {
		int i;
		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;

		i = cb_acargo.getSelectedIndex();
		return ((Evento) lista_eventos.get(i));
	}

	// Carga la lista de eventos en el combobox de "Asignado al ..."
	public void cargarEventosCB() {
		int i;
		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;

		cb_acargo.removeAllItems();
		for (i = 0; i < lista_eventos.size(); i++) {
			cb_acargo.addItem(((Evento) (lista_eventos.get(i))).getNombre());
		}
	}

	private void bt_acargoActionPerformed(ActionEvent evt) {
		System.out.println("bt_acargo.actionPerformed, event=" + evt);

		dlg_seleccionar_cargo dsc = new dlg_seleccionar_cargo(Parent, this);

		dsc.setVisible(true);
		Parent.setEnabled(false);
	}
}
