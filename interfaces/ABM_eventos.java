package interfaces;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.SwingUtilities;

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
public class ABM_eventos extends javax.swing.JFrame {

	{
		// Set Look & Feel
		try {
			javax.swing.UIManager
					.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JPanel pnl_atributos;

	private JPanel pnl_responsables;

	private JLabel lb_fecha_fin_e;

	private JButton btn_cancelar_e;

	private JButton btn_aceptar_e;

	private JButton jButton3;

	private JButton btn_agregar_aus;

	private JButton jButton1;

	private JList lst_auspicios;

	private JPanel pnl_auspicios;

	private JButton btn_quitar_r;

	private JButton btn_agregar_r;

	private JList lst_responsables;

	private JFormattedTextField jFormattedTextField2;

	private JFormattedTextField jFormattedTextField1;

	private JTextField jTextField1;

	private JTextField txt_nombre_e;

	private JLabel lb_fecha_ini_e;

	private JLabel lb_organizador;

	private JLabel lb_nombre;

	private JPanel pnl_botones;

	private JFrame Parent;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ABM_eventos inst = new ABM_eventos(null);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public ABM_eventos(JFrame P) {
		super();
		Parent = P;
		initGUI();
		final WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				super.windowClosing(arg0);
				Parent.setEnabled(true);
			}
		};
		this.addWindowListener(wa);
	}

	private void initGUI() {
		try {
			BoxLayout thisLayout = new BoxLayout(getContentPane(),
					javax.swing.BoxLayout.Y_AXIS);
			getContentPane().setLayout(thisLayout);
			this.setTitle("ABM Eventos");
			this.setPreferredSize(new java.awt.Dimension(493, 529));
			this.setMinimumSize(new java.awt.Dimension(493, 530));
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				pnl_atributos = new JPanel();
				GroupLayout pnl_atributosLayout = new GroupLayout(
						(JComponent) pnl_atributos);
				pnl_atributos.setLayout(pnl_atributosLayout);
				getContentPane().add(pnl_atributos);
				pnl_atributos
						.setPreferredSize(new java.awt.Dimension(399, 123));
				pnl_atributos.setSize(399, 123);
				pnl_atributos
						.setMaximumSize(new java.awt.Dimension(32767, 123));
				pnl_atributos.setMinimumSize(new java.awt.Dimension(399, 123));
				{
					lb_nombre = new JLabel();
					lb_nombre.setText("Nombre:");
				}
				{
					lb_organizador = new JLabel();
					lb_organizador.setText("Organizador:");
				}
				{
					lb_fecha_ini_e = new JLabel();
					lb_fecha_ini_e.setText("Fecha de inicio de Evento:");
				}
				{
					jFormattedTextField1 = new JFormattedTextField();
					jFormattedTextField1.setText("12/12/12");
				}
				{
					jFormattedTextField2 = new JFormattedTextField();
					jFormattedTextField2.setText("12/12/12");
				}
				{
					lb_fecha_fin_e = new JLabel();
					lb_fecha_fin_e.setText("Fecha de fin de Evento:");
				}
				{
					txt_nombre_e = new JTextField();
				}
				{
					jTextField1 = new JTextField();
				}
				pnl_atributosLayout
						.setHorizontalGroup(pnl_atributosLayout
								.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										pnl_atributosLayout
												.createParallelGroup()
												.addComponent(
														lb_fecha_fin_e,
														GroupLayout.Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE,
														152,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lb_nombre,
														GroupLayout.Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE,
														152,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lb_organizador,
														GroupLayout.Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE,
														152,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lb_fecha_ini_e,
														GroupLayout.Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE,
														152,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										pnl_atributosLayout
												.createParallelGroup()
												.addGroup(
														GroupLayout.Alignment.LEADING,
														pnl_atributosLayout
																.createSequentialGroup()
																.addComponent(
																		jFormattedTextField1,
																		GroupLayout.PREFERRED_SIZE,
																		72,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(
																		0,
																		139,
																		Short.MAX_VALUE))
												.addGroup(
														GroupLayout.Alignment.LEADING,
														pnl_atributosLayout
																.createSequentialGroup()
																.addComponent(
																		jFormattedTextField2,
																		GroupLayout.PREFERRED_SIZE,
																		72,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(
																		0,
																		139,
																		Short.MAX_VALUE))
												.addComponent(
														txt_nombre_e,
														GroupLayout.Alignment.LEADING,
														0, 211, Short.MAX_VALUE)
												.addComponent(
														jTextField1,
														GroupLayout.Alignment.LEADING,
														0, 211, Short.MAX_VALUE))
								.addContainerGap());
				pnl_atributosLayout
						.setVerticalGroup(pnl_atributosLayout
								.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										pnl_atributosLayout
												.createParallelGroup(
														GroupLayout.Alignment.BASELINE)
												.addComponent(
														txt_nombre_e,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lb_nombre,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										pnl_atributosLayout
												.createParallelGroup(
														GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField1,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lb_organizador,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										pnl_atributosLayout
												.createParallelGroup(
														GroupLayout.Alignment.BASELINE)
												.addComponent(
														jFormattedTextField1,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lb_fecha_ini_e,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										pnl_atributosLayout
												.createParallelGroup(
														GroupLayout.Alignment.BASELINE)
												.addComponent(
														jFormattedTextField2,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														21,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lb_fecha_fin_e,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addContainerGap());
			}
			{
				pnl_responsables = new JPanel();
				GroupLayout pnl_responsablesLayout = new GroupLayout(
						(JComponent) pnl_responsables);
				pnl_responsables.setLayout(pnl_responsablesLayout);
				getContentPane().add(pnl_responsables);
				pnl_responsables.setBorder(BorderFactory
						.createTitledBorder("Lista de Responsables"));
				pnl_responsables.setPreferredSize(new java.awt.Dimension(399,
						165));
				pnl_responsables.setSize(399, 300);
				{
					ListModel lst_responsablesModel = new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
					lst_responsables = new JList();
					lst_responsables.setModel(lst_responsablesModel);
					lst_responsables.setBorder(BorderFactory
							.createBevelBorder(BevelBorder.LOWERED));
				}
				{
					btn_agregar_r = new JButton();
					btn_agregar_r.setText("Agregar Responsable");
					btn_agregar_r.setFont(new java.awt.Font("Dialog", 0, 12));
				}
				{
					btn_quitar_r = new JButton();
					btn_quitar_r.setText("Quitar Responsable");
					btn_quitar_r.setFont(new java.awt.Font("Dialog", 0, 12));
				}
				pnl_responsablesLayout
						.setHorizontalGroup(pnl_responsablesLayout
								.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										pnl_responsablesLayout
												.createParallelGroup()
												.addComponent(
														lst_responsables,
														GroupLayout.Alignment.LEADING,
														0, 451, Short.MAX_VALUE)
												.addGroup(
														GroupLayout.Alignment.LEADING,
														pnl_responsablesLayout
																.createSequentialGroup()
																.addGap(53)
																.addComponent(
																		btn_agregar_r,
																		GroupLayout.PREFERRED_SIZE,
																		165,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		btn_quitar_r,
																		GroupLayout.PREFERRED_SIZE,
																		165,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(
																		0,
																		57,
																		Short.MAX_VALUE)))
								.addContainerGap());
				pnl_responsablesLayout.setVerticalGroup(pnl_responsablesLayout
						.createSequentialGroup().addComponent(lst_responsables,
								GroupLayout.PREFERRED_SIZE, 94,
								GroupLayout.PREFERRED_SIZE).addPreferredGap(
								LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(
								pnl_responsablesLayout.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
										.addComponent(btn_agregar_r,
												GroupLayout.Alignment.BASELINE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btn_quitar_r,
												GroupLayout.Alignment.BASELINE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(7));
			}
			{
				pnl_auspicios = new JPanel();
				getContentPane().add(pnl_auspicios);
				GroupLayout jPanel1Layout = new GroupLayout(
						(JComponent) pnl_auspicios);
				pnl_auspicios
						.setPreferredSize(new java.awt.Dimension(399, 166));
				pnl_auspicios.setBorder(BorderFactory
						.createTitledBorder("Lista de Auspicios"));
				pnl_auspicios.setLayout(jPanel1Layout);
				pnl_auspicios.setSize(399, 300);
				{
					ListModel jList1Model = new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
					lst_auspicios = new JList();
					lst_auspicios.setModel(jList1Model);
					lst_auspicios.setBorder(BorderFactory
							.createBevelBorder(BevelBorder.LOWERED));
				}
				{
					jButton1 = new JButton();
					jButton1.setText("Quitar Auspicio");
					jButton1.setFont(new java.awt.Font("Arial", 0, 12));
				}
				{
					btn_agregar_aus = new JButton();
					btn_agregar_aus.setText("Agregar Auspicio");
					btn_agregar_aus.setFont(new java.awt.Font("Arial", 0, 12));
				}
				{
					jButton3 = new JButton();
					jButton3.setText("Modificar Auspicio");
					jButton3.setFont(new java.awt.Font("Arial", 0, 12));
				}
				jPanel1Layout
						.setHorizontalGroup(jPanel1Layout
								.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										jPanel1Layout
												.createParallelGroup()
												.addGroup(
														GroupLayout.Alignment.LEADING,
														jPanel1Layout
																.createSequentialGroup()
																.addComponent(
																		btn_agregar_aus,
																		GroupLayout.PREFERRED_SIZE,
																		144,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(22)
																.addComponent(
																		jButton3,
																		GroupLayout.PREFERRED_SIZE,
																		134,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(
																		0,
																		26,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jButton1,
																		GroupLayout.PREFERRED_SIZE,
																		122,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(
																		0,
																		0,
																		Short.MAX_VALUE))
												.addComponent(
														lst_auspicios,
														GroupLayout.Alignment.LEADING,
														0, 448, Short.MAX_VALUE))
								.addContainerGap());
				jPanel1Layout.setVerticalGroup(jPanel1Layout
						.createSequentialGroup().addComponent(lst_auspicios,
								GroupLayout.PREFERRED_SIZE, 94,
								GroupLayout.PREFERRED_SIZE).addPreferredGap(
								LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								jPanel1Layout.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
										.addComponent(btn_agregar_aus,
												GroupLayout.Alignment.BASELINE,
												GroupLayout.PREFERRED_SIZE, 26,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButton3,
												GroupLayout.Alignment.BASELINE,
												GroupLayout.PREFERRED_SIZE, 26,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButton1,
												GroupLayout.Alignment.BASELINE,
												GroupLayout.PREFERRED_SIZE, 26,
												GroupLayout.PREFERRED_SIZE))
						.addContainerGap());
			}
			{
				pnl_botones = new JPanel();
				GroupLayout pnl_botonesLayout = new GroupLayout(
						(JComponent) pnl_botones);
				pnl_botones.setLayout(pnl_botonesLayout);
				getContentPane().add(pnl_botones);
				pnl_botones.setPreferredSize(new java.awt.Dimension(485, 50));
				{
					btn_aceptar_e = new JButton();
					btn_aceptar_e.setText("Aceptar");
				}
				{
					btn_cancelar_e = new JButton();
					btn_cancelar_e.setText("Cancelar");
					btn_cancelar_e.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							btn_cancelar_eMouseClicked(evt);
						}
					});
				}
				pnl_botonesLayout.setHorizontalGroup(pnl_botonesLayout
						.createSequentialGroup().addContainerGap(119, 119)
						.addComponent(btn_aceptar_e,
								GroupLayout.PREFERRED_SIZE, 116,
								GroupLayout.PREFERRED_SIZE).addPreferredGap(
								LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(btn_cancelar_e,
								GroupLayout.PREFERRED_SIZE, 116,
								GroupLayout.PREFERRED_SIZE).addContainerGap(
								123, Short.MAX_VALUE));
				pnl_botonesLayout.linkSize(SwingConstants.HORIZONTAL,
						new Component[] { btn_cancelar_e, btn_aceptar_e });
				pnl_botonesLayout.setVerticalGroup(pnl_botonesLayout
						.createSequentialGroup().addContainerGap().addGroup(
								pnl_botonesLayout.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
										.addComponent(btn_aceptar_e,
												GroupLayout.Alignment.BASELINE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btn_cancelar_e,
												GroupLayout.Alignment.BASELINE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addContainerGap());
				pnl_botonesLayout.linkSize(SwingConstants.VERTICAL,
						new Component[] { btn_cancelar_e, btn_aceptar_e });
			}
			pack();
			this.setSize(493, 529);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void btn_cancelar_eMouseClicked(MouseEvent evt) {
		System.out.println("btn_cancelar_e.mouseClicked, event=" + evt);
		setVisible(false);
		Parent.setEnabled(true);
		Parent.requestFocus();
	}
}
