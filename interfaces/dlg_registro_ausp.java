package interfaces;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import datos.Auspiciante;
import datos.Persona;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

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
public class dlg_registro_ausp extends javax.swing.JDialog {
	public JPanel pnl_lst_ausp;
	public JList lst_auspiciantes;
	public JTextField txf_tipo_ausp;
	public JLabel lb_arancel;
	public JButton btn_canelar;
	public JButton btn_agregar_ausp;
	public JLabel lb_tipo_ausp;
	public JTextField txf_arancel;
	public JButton btn_crear_ausp;
	public JPanel pnl_botones;
	public JPanel pnl_datos_ausp;
	
	// Componentes
	private pnl_lista_auspicios Parent;
	private JScrollPane jScrollPane1;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	public dlg_registro_ausp(pnl_lista_auspicios P) {
		super();
		Parent = P;
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
				getContentPane().setLayout(thisLayout);
				this.setTitle("Registro de Auspicios");
				this.setResizable(false);
				this.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent evt) {
						thisWindowClosing(evt);
					}
				});
				{
					pnl_lst_ausp = new JPanel();
					AnchorLayout pnl_lst_auspLayout = new AnchorLayout();
					pnl_lst_ausp.setLayout(pnl_lst_auspLayout);
					pnl_lst_ausp.setBorder(BorderFactory.createTitledBorder("Lista de Auspiciantes"));
					pnl_lst_ausp.setAutoscrolls(true);
					{
						btn_crear_ausp = new JButton();
						pnl_lst_ausp.add(btn_crear_ausp, new AnchorConstraint(751, 99, 10, 101, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
						btn_crear_ausp.setText("Crear Auspiciante");
						btn_crear_ausp.setPreferredSize(new java.awt.Dimension(144, 28));
					}
					{
						jScrollPane1 = new JScrollPane();
						pnl_lst_ausp.add(jScrollPane1, new AnchorConstraint(115, 7, 711, 5, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_ABS));
						jScrollPane1.setPreferredSize(new java.awt.Dimension(334, 90));
						{
							ListModel lst_auspiciantesModel = 
								new DefaultComboBoxModel(
										new String[] {  });
							lst_auspiciantes = new JList();
							jScrollPane1.setViewportView(lst_auspiciantes);
							lst_auspiciantes.setModel(lst_auspiciantesModel);										        
							lst_auspiciantes.setPreferredSize(new java.awt.Dimension(334, 90));
							lst_auspiciantes.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

						}
					}
				}
				{
					pnl_datos_ausp = new JPanel();
					GroupLayout pnl_datos_auspLayout = new GroupLayout((JComponent)pnl_datos_ausp);
					pnl_datos_ausp.setLayout(pnl_datos_auspLayout);
					{
						txf_tipo_ausp = new JTextField();
					}
					{
						txf_arancel = new JTextField();
					}
					{
						lb_tipo_ausp = new JLabel();
						lb_tipo_ausp.setText("Tipo de Auspicio:");
					}
					{
						lb_arancel = new JLabel();
						lb_arancel.setText("Arancel ($):");
					}
					pnl_datos_auspLayout.setHorizontalGroup(pnl_datos_auspLayout.createSequentialGroup()
						.addContainerGap(34, 34)
						.addGroup(pnl_datos_auspLayout.createParallelGroup()
						    .addComponent(lb_tipo_ausp, GroupLayout.Alignment.LEADING, 0, 115, Short.MAX_VALUE)
						    .addComponent(lb_arancel, GroupLayout.Alignment.LEADING, 0, 115, Short.MAX_VALUE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnl_datos_auspLayout.createParallelGroup()
						    .addComponent(txf_tipo_ausp, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
						    .addComponent(txf_arancel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
						.addContainerGap());
					pnl_datos_auspLayout.setVerticalGroup(pnl_datos_auspLayout.createSequentialGroup()
						.addGroup(pnl_datos_auspLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(txf_tipo_ausp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(lb_tipo_ausp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnl_datos_auspLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(txf_arancel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(lb_arancel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(27, 27));
				}
				
					
				
				{
					pnl_botones = new JPanel();
					{
						btn_agregar_ausp = new JButton();
						pnl_botones.add(btn_agregar_ausp);
						btn_agregar_ausp.setText("Agregar Auspicio");
						btn_agregar_ausp.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								btn_agregar_auspActionPerformed(evt);
							}
						});
					}
					{
						btn_canelar = new JButton();
						pnl_botones.add(btn_canelar);
						btn_canelar.setText("Cancelar");
					}
				}
					thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
						.addComponent(pnl_lst_ausp, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(pnl_datos_ausp, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnl_botones, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE));
					thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
						.addComponent(pnl_lst_ausp, GroupLayout.Alignment.LEADING, 0, 344, Short.MAX_VALUE)
						.addComponent(pnl_datos_ausp, GroupLayout.Alignment.LEADING, 0, 344, Short.MAX_VALUE)
						.addComponent(pnl_botones, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE));
			}
			pack();
			this.setSize(352, 271);
			mostrarListaAuspiciantes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void mostrarListaAuspiciantes(){
		DefaultListModel modelo = new DefaultListModel();
		
		ArrayList lista_auspiciantes = sys.Sistema.D.lista_auspiciantes;
		
		int cant = lista_auspiciantes.size();		
		for (int i = 0; i< cant; i++){			
			modelo.addElement(((Auspiciante)lista_auspiciantes.get(i)).getNombre());			
		}	
		lst_auspiciantes.setModel(modelo);	
	}
	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosing, event="+evt);
		Parent.setEnabled(true);
		Parent.requestFocus();
		setVisible(false);
	}
	
	private void btn_agregar_auspActionPerformed(ActionEvent evt) {
		System.out.println("btn_agregar_ausp.actionPerformed, event="+evt);
		int i = lst_auspiciantes.getSelectedIndex();
		if (i == -1){
			JOptionPane.showMessageDialog(null, "Seleccione un auspiciante de la lista");
		}else{
				String tipo = txf_tipo_ausp.getText();
			
		}
	}

}
