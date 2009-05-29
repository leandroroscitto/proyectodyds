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
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;


import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import datos.Evento;
import datos.Persona;

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
public class pnl_lista_responsables extends javax.swing.JPanel {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	
	public static final long serialVersionUID = 1L;
	public JList lst_responsables;
	public JButton btn_agregar_resp;
	public JButton btn_quitar_resp;
	public JPanel pnl_botones_lst_resp;

	private JFrame Parent;
	public ArrayList lista_responsables = new ArrayList();
		
	
	public pnl_lista_responsables(){
		super();
		initGUI();
	}
	
	public pnl_lista_responsables(JFrame P) {
		super();		
		Parent = P;
		initGUI();
	}
	
	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(410, 175));
			this.setBorder(BorderFactory.createTitledBorder("Lista de Responsables"));
			this.setMinimumSize(new java.awt.Dimension(410, 175));
			{
				ListModel lst_responsablesModel = 
					new DefaultComboBoxModel(
							new String[] { });
				lst_responsables = new JList();
				this.add(lst_responsables, new AnchorConstraint(25, 15, 48, 15, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				lst_responsables.setModel(lst_responsablesModel);
				lst_responsables.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				lst_responsables.setPreferredSize(new java.awt.Dimension(380, 92));
			}
			{
				pnl_botones_lst_resp = new JPanel();
				this.add(pnl_botones_lst_resp, new AnchorConstraint(800, 13, 5, 17, AnchorConstraint.ANCHOR_NONE, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				FlowLayout pnl_botones_lst_respLayout = new FlowLayout();
				pnl_botones_lst_respLayout.setAlignOnBaseline(true);
				pnl_botones_lst_respLayout.setHgap(15);
				pnl_botones_lst_resp.setLayout(pnl_botones_lst_respLayout);
				pnl_botones_lst_resp.setPreferredSize(new java.awt.Dimension(380, 37));
				{
					btn_agregar_resp = new JButton();
					pnl_botones_lst_resp.add(btn_agregar_resp);
					btn_agregar_resp.setText("Agregar Responsable");
					btn_agregar_resp.setPreferredSize(new java.awt.Dimension(172, 26));				
					btn_agregar_resp.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_agregar_respActionPerformed(evt);
						}
					});

				}
				{
					btn_quitar_resp = new JButton();
					btn_quitar_resp.setLayout(null);
					pnl_botones_lst_resp.add(btn_quitar_resp);
					btn_quitar_resp.setText("Quitar Responsable");
					btn_quitar_resp.setPreferredSize(new java.awt.Dimension(172, 26));
					btn_quitar_resp.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btn_quitar_respActionPerformed(evt);
						}
					});
				}
				
			}
			mostrarLista();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean pertenece(Persona p, ArrayList A){
		boolean resultado = false;
		int tam = A.size();
		int i = 0;
		while ((i<tam) && (!resultado)){
			if (p == ((Persona)A.get(i))){
				resultado = true;
			}else{i++;}
		}
		return resultado;		
	}
	
	
	//Muestra la lista de responsables en la interfaz
	public void mostrarLista(){	
		DefaultListModel modelo = new DefaultListModel();
		
		int cant = lista_responsables.size();
		
		for (int i = 0; i< cant; i++){			
			modelo.addElement(((Persona)lista_responsables.get(i)).getNombre());			
		}	
		lst_responsables.setModel(modelo);		
	}

	
	// devuelve true si se pudo agregar a la lista y false si ya existe
	// ese responsable en la lista 
	
	public boolean agregar_a_lista(Persona p){
		boolean result; 
		if (pertenece(p, lista_responsables)){
			result = false;
		}else{
			lista_responsables.add(p);
			result = true;
			mostrarLista();
		}
		return result;
	}	
	
	private void btn_agregar_respActionPerformed(ActionEvent evt) {
		System.out.println("btn_agregar_resp.actionPerformed, event="+evt);
		
		dlg_reg_resp dlg_responsables = new dlg_reg_resp(this);
		
		dlg_responsables.setVisible(true);
		
		
		
		
		
	}
	
	private void btn_quitar_respActionPerformed(ActionEvent evt) {
		System.out.println("btn_quitar_resp.actionPerformed, event="+evt);
		int i = lst_responsables.getSelectedIndex();
		if (i == -1){
			JOptionPane.showMessageDialog(null, "Seleccione un responsable de la lista");			
		}else{
			lista_responsables.remove(i);
			mostrarLista();
		}
		
		
	}

}
