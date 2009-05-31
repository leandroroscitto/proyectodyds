package interfaces;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import datos.Actividad;
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
public class pnl_caract_part_aceptados extends javax.swing.JPanel {

	public static final long serialVersionUID = 1L;
	public JList lst_caracter_part;
	public JButton btn_quitar_car;
	public JButton btn_modificar_car;
	public JButton btn_agregar_car;
	public JPanel pnl_botones_caracter_part;

	private JFrame Parent;
	public ArrayList lista_dcaract_part;
	private JScrollPane jScrollPane1;
	private dlg_det_carac_part dcp;

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
		frame.getContentPane().add(new pnl_caract_part_aceptados());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public pnl_caract_part_aceptados() {
		super();
		initGUI();
		Iniciar_componentes();
	}

	private void Iniciar_componentes() {
		lista_dcaract_part = new ArrayList();
		dcp = new dlg_det_carac_part(Parent, this);
	}

	public pnl_caract_part_aceptados(JFrame p) {
		super();
		Parent = p;
		initGUI();
		Iniciar_componentes();
	}

	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(475, 145));
			this
					.setBorder(BorderFactory
							.createTitledBorder("Caracteres de Participación aceptados"));
			this.setMinimumSize(new java.awt.Dimension(475, 145));
			{
				jScrollPane1 = new JScrollPane();
				this.add(jScrollPane1, new AnchorConstraint(25, 15, 50, 15,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS));
				jScrollPane1.setPreferredSize(new java.awt.Dimension(445, 70));
				jScrollPane1.setWheelScrollingEnabled(true);
				jScrollPane1.setEnabled(true);
				jScrollPane1.setOpaque(true);
				jScrollPane1.getHorizontalScrollBar().setEnabled(true);
				jScrollPane1.getHorizontalScrollBar().setVisible(true);
				{
					lst_caracter_part = new JList();
					jScrollPane1.setViewportView(lst_caracter_part);
					lst_caracter_part.setModel(new DefaultListModel());
					lst_caracter_part.setPreferredSize(new java.awt.Dimension(
							427, 111));
					lst_caracter_part.setBorder(BorderFactory
							.createBevelBorder(BevelBorder.LOWERED));
				}
			}
			{
				pnl_botones_caracter_part = new JPanel();
				this.add(pnl_botones_caracter_part, new AnchorConstraint(800,
						15, 5, 15, AnchorConstraint.ANCHOR_NONE,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS));
				FlowLayout pnl_botones_lst_ausLayout = new FlowLayout();
				pnl_botones_lst_ausLayout.setHgap(15);
				pnl_botones_caracter_part
						.setPreferredSize(new java.awt.Dimension(445, 39));
				pnl_botones_caracter_part.setLayout(pnl_botones_lst_ausLayout);
				{
					btn_agregar_car = new JButton();
					pnl_botones_caracter_part.add(btn_agregar_car);
					btn_agregar_car.setText("Agregar Caracter");
					btn_agregar_car.setPreferredSize(new java.awt.Dimension(
							135, 26));
					btn_agregar_car.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_agregar_carActionPerformed(evt);
						}
					});
				}
				{
					btn_modificar_car = new JButton();
					pnl_botones_caracter_part.add(btn_modificar_car);
					btn_modificar_car.setText("Modificar Caracter");
					btn_modificar_car.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_modificar_carActionPerformed(evt);
						}
					});
					btn_modificar_car.setPreferredSize(new java.awt.Dimension(
							140, 26));
				}
				{
					btn_quitar_car = new JButton();
					pnl_botones_caracter_part.add(btn_quitar_car);
					btn_quitar_car.setText("Quitar Caracter");
					btn_quitar_car.setPreferredSize(new java.awt.Dimension(125,
							26));
					btn_quitar_car.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_quitar_carActionPerformed(evt);
						}
					});
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean pertenece(Detalle_CP dcp, ArrayList A) {
		boolean resultado = false;
		int tam = A.size();
		int i = 0;
		while ((i < tam) && (!resultado)) {
			if (dcp.getCp() == ((Detalle_CP) A.get(i)).getCp()) {
				resultado = true;
			} else {
				i++;
			}
		}
		return resultado;
	}

	private void mostrarLista() {
		int cant = lista_dcaract_part.size();
		Detalle_CP dcp = null;
		ListModel lst_caracter_partModel = lst_caracter_part.getModel();
		lst_caracter_part.setModel(lst_caracter_partModel);
		lst_caracter_part.setPreferredSize(new Dimension(lst_caracter_part
				.getWidth(), 16 * lista_dcaract_part.size()));
		((DefaultListModel) lst_caracter_partModel).clear();
		for (int i = 0; i < cant; i++) {
			dcp = (Detalle_CP) lista_dcaract_part.get(i);
			((DefaultListModel) lst_caracter_partModel).add(i, dcp.getCp()
					.getNombre());
		}
	}

	public boolean agregar_a_lista(Detalle_CP dcp) {
		boolean result;
		if (pertenece(dcp, lista_dcaract_part)) {
			result = false;
		} else {
			lista_dcaract_part.add(dcp);
			result = true;
			mostrarLista();
		}
		return result;
	}

	// Se utiliza durante la creacion, para borrar los datos contenidos del uso
	// anterior
	public void setearCreacion() {
		((DefaultListModel) lst_caracter_part.getModel()).removeAllElements();
		lista_dcaract_part.clear();
	}

	public void setearModificacion(Actividad act) {
		int i;

		Detalle_CP dcp;
		
		((DefaultListModel) lst_caracter_part.getModel()).removeAllElements();
		lista_dcaract_part.clear();

		for (i = 0; i < act.cant_CarcPartAcep(); i++) {
			// lo clona para que no se modifique el original
			dcp = act.getDCarcPartAcep(i);
			agregar_a_lista(new Detalle_CP(null, dcp.getCp(), dcp.isEsEval(),
					dcp.isEmiteCert(), dcp.getMonto(), dcp.getPorcentMinAsist()));
		}
	}

	private void btn_agregar_carActionPerformed(ActionEvent evt) {
		System.out.println("btn_agregar_car.actionPerformed, event=" + evt);
		dcp.setearCreacion();
		dcp.setVisible(true);
		Parent.setEnabled(false);
	}

	private void btn_modificar_carActionPerformed(ActionEvent evt) {
		System.out.println("btn_modificar_car.actionPerformed, event=" + evt);
		int i = lst_caracter_part.getSelectedIndex();
		if (i == -1) {
			JOptionPane.showMessageDialog(null,
					"Seleccione un caracter de la lista");
		} else {
			Detalle_CP detallecp = (Detalle_CP) lista_dcaract_part.get(i);
			dcp.setearModificacion(detallecp);
			dcp.setVisible(true);
			Parent.setEnabled(false);
		}
	}

	private void btn_quitar_carActionPerformed(ActionEvent evt) {
		System.out.println("btn_quitar_car.actionPerformed, event=" + evt);
		int i = lst_caracter_part.getSelectedIndex();
		if (i == -1) {
			JOptionPane.showMessageDialog(null,
					"Seleccione un caracter de la lista");
		} else {
			lista_dcaract_part.remove(i);
			mostrarLista();
		}

	}

}
