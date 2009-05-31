package interfaces;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.BevelBorder;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import datos.Relaciones.Auspicio;

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
public class pnl_lista_auspicios extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	{
		// Set Look & Feel
		try {
			javax.swing.UIManager
					.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JList lst_auspicios;

	public JButton btn_quitar_aus;

	public JButton btn_modificar_aus;

	public JButton btn_agregar_aus;

	public JPanel pnl_botones_lst_aus;

	public ArrayList lista_auspicios = new ArrayList();

	public int modificar = -1;

	private JFrame Parent;

	public pnl_lista_auspicios(JFrame P) {
		super();
		Parent = P;
		initGUI();
	}

	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(475, 145));
			this.setBorder(BorderFactory
					.createTitledBorder("Lista de Auspicios"));
			AnchorLayout thisLayout = new AnchorLayout();
			this.setLayout(thisLayout);
			this.setMinimumSize(new java.awt.Dimension(475, 145));
			this.setSize(475, 145);
			{
				ListModel lst_auspiciosModel = new DefaultComboBoxModel(
						new String[] {});
				lst_auspicios = new JList();
				this.add(lst_auspicios, new AnchorConstraint(25, 15, 48, 15,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS));
				lst_auspicios.setModel(lst_auspiciosModel);
				lst_auspicios
						.setPreferredSize(new java.awt.Dimension(445, 102));
				lst_auspicios.setBorder(BorderFactory
						.createBevelBorder(BevelBorder.LOWERED));
			}
			{
				pnl_botones_lst_aus = new JPanel();
				FlowLayout pnl_botones_lst_ausLayout = new FlowLayout();
				pnl_botones_lst_ausLayout.setHgap(15);
				pnl_botones_lst_aus.setLayout(pnl_botones_lst_ausLayout);
				this.add(pnl_botones_lst_aus, new AnchorConstraint(800, 15, 5,
						15, AnchorConstraint.ANCHOR_NONE,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS,
						AnchorConstraint.ANCHOR_ABS));
				pnl_botones_lst_aus.setPreferredSize(new java.awt.Dimension(
						445, 37));
				{
					btn_agregar_aus = new JButton();
					pnl_botones_lst_aus.add(btn_agregar_aus);
					btn_agregar_aus.setText("Agregar Auspicio");
					btn_agregar_aus.setPreferredSize(new java.awt.Dimension(
							135, 26));
					btn_agregar_aus.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_agregar_ausActionPerformed(evt);
						}
					});
				}
				{
					btn_modificar_aus = new JButton();
					pnl_botones_lst_aus.add(btn_modificar_aus);
					btn_modificar_aus.setText("Modificar Auspicio");
					btn_modificar_aus.setPreferredSize(new java.awt.Dimension(
							140, 26));
					btn_modificar_aus.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_modificar_ausActionPerformed(evt);
						}
					});
				}
				{
					btn_quitar_aus = new JButton();
					pnl_botones_lst_aus.add(btn_quitar_aus);
					btn_quitar_aus.setText("Quitar Auspicio");
					btn_quitar_aus.setPreferredSize(new java.awt.Dimension(125,
							26));
					btn_quitar_aus.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_quitar_ausActionPerformed(evt);
						}
					});
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mostrarLista() {
		DefaultListModel modelo = new DefaultListModel();

		int cant = lista_auspicios.size();
		Auspicio a;
		for (int i = 0; i < cant; i++) {
			a = (Auspicio) lista_auspicios.get(i);
			String n_auspiciante = a.getAuspiciante().getNombre();
			String n_tipo = a.getTipo();
			float n_arancel = a.getArancel();
			modelo.addElement(n_auspiciante + " " + n_tipo + " " + n_arancel);
		}
		lst_auspicios.setModel(modelo);
	}

	private void btn_agregar_ausActionPerformed(ActionEvent evt) {
		System.out.println("btn_agregar_aus.actionPerformed, event="+evt);
		
		dlg_registro_ausp dlg_auspicions = new dlg_registro_ausp(this,Parent);
		dlg_auspicions.mostrarListaAuspiciantes(null);
		dlg_auspicions.btn_agregar_ausp.setText("Agregar Auspicio");
		dlg_auspicions.setVisible(true);
		Parent.setEnabled(false);
	}

	private void btn_modificar_ausActionPerformed(ActionEvent evt) {
		System.out.println("btn_modificar_aus.actionPerformed, event=" + evt);
		int i = lst_auspicios.getSelectedIndex();
		if (i == -1) {
			JOptionPane.showMessageDialog(null,
					"Seleccione un Auspicio de la lista");
		} else {
			modificar = i;
			Auspicio a = (Auspicio) lista_auspicios.get(i);
			dlg_registro_ausp dlg_auspicions = new dlg_registro_ausp(this,Parent);
			dlg_auspicions.mostrarListaAuspiciantes(a);
			dlg_auspicions.btn_agregar_ausp.setText("Modificar Auspicio");
			dlg_auspicions.setVisible(true);
			Parent.setEnabled(false);
		}
	}

	private void btn_quitar_ausActionPerformed(ActionEvent evt) {
		System.out.println("btn_quitar_aus.actionPerformed, event=" + evt);
		// TODO add your code for btn_quitar_aus.actionPerformed
		int i = lst_auspicios.getSelectedIndex();
		if (i == -1) {
			JOptionPane.showMessageDialog(null,
					"No ha seleccionado ningun auspicio para eliminar");
		} else {

			int i2 = JOptionPane.showConfirmDialog(null,
					"Realmente quiere eliminar el Auspicio?",
					"Eliminar Auspicio", JOptionPane.YES_NO_OPTION);
			if (i2 == 0) {
				lista_auspicios.remove(i);
				mostrarLista();
			}

		}
	}

}
