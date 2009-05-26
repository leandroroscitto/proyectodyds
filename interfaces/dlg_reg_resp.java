package interfaces;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
public class dlg_reg_resp extends javax.swing.JDialog {
	public JLabel lb_selec_resp;
	public JTable tbl_personas;
	public JScrollPane sp_tabla;
	public JButton btn_cancelar;
	public JButton btn_registrar_pers;
	public JButton btn_agregar_resp;
	public JPanel pnl_botones;
	
	// Componentes
	private JFrame Parent;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
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
				dlg_reg_resp inst = new dlg_reg_resp(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public dlg_reg_resp(JFrame P) {
		super();
		Parent =P;
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
				getContentPane().setLayout(thisLayout);
				this.setTitle("Registro de Responsables");
				this.setPreferredSize(new java.awt.Dimension(565, 205));
				this.setResizable(false);
				this.setMinimumSize(new java.awt.Dimension(565, 205));
				this.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent evt) {
						thisWindowClosing(evt);
					}
				});
				{
					lb_selec_resp = new JLabel();
					lb_selec_resp.setText("Seleccionar Responsable:");
					lb_selec_resp.setSize(265, 27);
				}
				{
					sp_tabla = new JScrollPane();
					sp_tabla.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
					{
						TableModel tbl_personasModel = 
							new DefaultTableModel(new String[] { "Nombre", "Apellido", "E-mail" },8);
						tbl_personas = new JTable();
						sp_tabla.setViewportView(tbl_personas);
						tbl_personas.setModel(tbl_personasModel);
						tbl_personas.setPreferredSize(new java.awt.Dimension(389, 128));
					}
				}
				{
					pnl_botones = new JPanel();
					FlowLayout pnl_botonesLayout = new FlowLayout();
					pnl_botones.setLayout(pnl_botonesLayout);
					{
						btn_agregar_resp = new JButton();
						pnl_botones.add(btn_agregar_resp);
						btn_agregar_resp.setText("Agregar Responsable");
					}
					{
						btn_registrar_pers = new JButton();
						pnl_botones.add(btn_registrar_pers);
						btn_registrar_pers.setText("Registrar Persona");
					}
					{
						btn_cancelar = new JButton();
						pnl_botones.add(btn_cancelar);
						btn_cancelar.setText("Cancelar");
					}
				}
					thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
						.addComponent(lb_selec_resp, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(sp_tabla, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnl_botones, 0, 41, Short.MAX_VALUE));
					thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
						.addGap(8)
						.addGroup(thisLayout.createParallelGroup()
						    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
						        .addComponent(lb_selec_resp, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
						        .addGap(0, 365, Short.MAX_VALUE))
						    .addComponent(sp_tabla, GroupLayout.Alignment.LEADING, 0, 531, Short.MAX_VALUE)
						    .addComponent(pnl_botones, GroupLayout.Alignment.LEADING, 0, 531, Short.MAX_VALUE))
						.addContainerGap());
			}
			pack();
			this.setSize(565, 205);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosing, event="+evt);
		Parent.setEnabled(true);
		Parent.requestFocus();
		setVisible(false);
	}

}
