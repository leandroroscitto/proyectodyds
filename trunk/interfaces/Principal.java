package interfaces;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import datos.Actividad;
import datos.Auspiciante;
import datos.Evento;

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
public class Principal extends javax.swing.JFrame {

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

	private JTabbedPane pestaña_principal;

	private JPanel pnl_detalles_botones_eventos;

	private JPanel pnl_detalles;

	private JButton btn_crear_evento;

	private JPanel pnl_seleccion_evento;

	private JList lst_actividades;

	private JComboBox box_eventos;

	private JPanel pnl_lista_actividades;

	private JLabel lbl_DFechaF_Act_info;

	private JLabel lbl_DFechaI_Act_info;

	private JLabel lbl_DPAcargo_info;

	private JLabel lbl_DNombre_Act_info;

	private JLabel lbl_DFecha_Fin_Act;

	private JLabel lbl_DFecha_Ini_Act;

	private JLabel lbl_DPerCargo;

	private JLabel lbl_DNom_Act;

	private JButton btn_asignar_recursos;

	private JButton btn_modificar_actividad;

	private JButton btn_eliminar_actividad;

	private JButton btn_crear_actividad;

	private JPanel pnl_botones_actividades;

	private JPanel pnl_detalles_actividades;

	private JPanel pnl_detalles_botones_actividades;

	private JPanel pnl_evento_actividades;

	private JButton btn_modificar_evento;

	private JButton btn_eliminar_evento;

	private JPanel pnl_botones;

	private JList lst_eventos;

	private JPanel pnl_lista_eventos;

	private JPanel pnl_auspiciantes;

	private JPanel pnl_lista_auspiciantes;

	private JList lst_auspiciantes;

	private JButton btn_modificar_auspiciante;

	private JButton btn_eliminar_auspiciante;

	private JButton btn_crear_auspiciante;

	private JScrollPane jScrollPane2;

	private JScrollPane jScrollPane1;

	private JPanel pnl_actividades;

	private JPanel pnl_eventos;

	private JLabel lbl_D_Auspiciantes_Telefono_Info;

	private JLabel lbl_D_Auspiciantes_Nombre_Info;

	private JLabel lbl_D_Auspiciantes_Telefono;

	private JLabel lbl_D_Auspiciantes_Nombre;

	private JPanel pnl_Detalles_Auspiciantes;

	private JLabel lbl_D_Event_FechaFin_Info;

	private JLabel lbl_D_Event_Organizador;

	private JLabel lbl_D_Event_FechaFin;

	private JLabel lbl_D_Event_FechaIni;

	private JLabel lbl_D_Event_Nombre;

	private JLabel lbl_D_Event_Nombre_Info;

	private JLabel lbl_D_Event_FechaIni_Info;

	private JLabel lbl_D_Event_Organizador_Info;

	// Ventanas utilizadas
	private frm_abm_actividades abm_act;

	private frm_abm_eventos abm_event;

	private void Iniciar_comp() {
		abm_act = new frm_abm_actividades(this);
		abm_event = new frm_abm_eventos(this);
	}

	/**
	 * Auto-generated main method to display this JFrame
	 */

	public Principal() {
		super();
		Iniciar_comp();
		initGUI();

	}

	private void initGUI() {
		try {
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setTitle("Principal");
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					thisWindowClosing(evt);
				}
			});
			{
				pestaña_principal = new JTabbedPane();
				getContentPane().add(pestaña_principal, BorderLayout.CENTER);
				pestaña_principal.setPreferredSize(new java.awt.Dimension(529,
						366));
				{
					pnl_eventos = new JPanel();
					GridLayout pnl_eventosLayout = new GridLayout(1, 1);
					pnl_eventosLayout.setHgap(5);
					pnl_eventosLayout.setVgap(5);
					pnl_eventosLayout.setColumns(1);
					pnl_eventos.setLayout(pnl_eventosLayout);
					pestaña_principal
							.addTab("Eventos", null, pnl_eventos, null);

					{
						pnl_lista_eventos = new JPanel();
						BorderLayout pnl_lista_eventosLayout = new BorderLayout();
						pnl_lista_eventosLayout.setHgap(10);
						pnl_lista_eventosLayout.setVgap(10);
						pnl_eventos.add(pnl_lista_eventos);
						pnl_lista_eventos.setLayout(pnl_lista_eventosLayout);
						pnl_lista_eventos.setName("Evento");
						pnl_lista_eventos
								.setPreferredSize(new java.awt.Dimension(246,
										204));
						pnl_lista_eventos.setBorder(BorderFactory
								.createTitledBorder(null, "Eventos",
										TitledBorder.CENTER,
										TitledBorder.DEFAULT_POSITION));
						{
							ListModel lst_eventosModel = new DefaultComboBoxModel(
									new String[] {});
							lst_eventos = new JList();
							pnl_lista_eventos.add(lst_eventos,
									BorderLayout.CENTER);
							lst_eventos.setVisibleRowCount(10);
							lst_eventos.setBorder(BorderFactory
									.createBevelBorder(BevelBorder.LOWERED));
							lst_eventos.addMouseListener(new MouseAdapter() {
								public void mouseClicked(MouseEvent evt) {
									lst_eventosMouseClicked(evt);
								}
							});
						}
					}
					{
						pnl_detalles_botones_eventos = new JPanel();
						pnl_eventos.add(pnl_detalles_botones_eventos);
						GridLayout pnl_detalleLayout = new GridLayout(2, 1);
						pnl_detalleLayout.setHgap(5);
						pnl_detalleLayout.setVgap(5);
						pnl_detalleLayout.setColumns(1);
						pnl_detalleLayout.setRows(2);
						pnl_detalles_botones_eventos
								.setLayout(pnl_detalleLayout);
						pnl_detalles_botones_eventos
								.setPreferredSize(new java.awt.Dimension(170,
										344));
						{
							pnl_detalles = new JPanel();
							// TableLayout pnl_detallesLayout = new
							// TableLayout(new double[][] {{TableLayout.FILL,
							// TableLayout.FILL, TableLayout.FILL,
							// TableLayout.FILL}, {TableLayout.FILL,
							// TableLayout.FILL, TableLayout.FILL,
							// TableLayout.FILL}});
							pnl_detalles.setLayout(null);
							// pnl_detalles.setLayout(pnl_detallesLayout);
							pnl_detalles_botones_eventos.add(pnl_detalles);
							pnl_detalles
									.setPreferredSize(new java.awt.Dimension(
											152, 80));
							pnl_detalles.setBorder(BorderFactory
									.createTitledBorder(null, "Detalles",
											TitledBorder.CENTER,
											TitledBorder.DEFAULT_POSITION));
							{
								lbl_D_Event_Nombre = new JLabel();
								pnl_detalles.add(lbl_D_Event_Nombre, "0, 0");
								lbl_D_Event_Nombre.setText("Nombre:");
								lbl_D_Event_Nombre.setBounds(5, 26, 48, 16);
							}
							{
								lbl_D_Event_FechaIni = new JLabel();
								pnl_detalles.add(lbl_D_Event_FechaIni, "0, 1");
								lbl_D_Event_FechaIni
										.setText("Fecha de Inicio:");
								lbl_D_Event_FechaIni.setBounds(5, 70, 87, 16);
							}
							{
								lbl_D_Event_FechaFin = new JLabel();
								pnl_detalles.add(lbl_D_Event_FechaFin);
								lbl_D_Event_FechaFin.setText("Fecha de Fin:");
								lbl_D_Event_FechaFin.setBounds(5, 92, 123, 16);
							}
							{
								lbl_D_Event_Organizador = new JLabel();
								pnl_detalles.add(lbl_D_Event_Organizador);
								lbl_D_Event_Organizador.setText("Organizador:");
								lbl_D_Event_Organizador
										.setBounds(5, 48, 73, 16);
							}
							{
								lbl_D_Event_Nombre_Info = new JLabel();
								pnl_detalles.add(lbl_D_Event_Nombre_Info);
								lbl_D_Event_Nombre_Info.setText(" ");
								lbl_D_Event_Nombre_Info.setBounds(105, 26, 144,
										16);
							}
							{
								lbl_D_Event_Organizador_Info = new JLabel();
								pnl_detalles.add(lbl_D_Event_Organizador_Info);
								lbl_D_Event_Organizador_Info.setText(" ");
								lbl_D_Event_Organizador_Info.setBounds(105, 48,
										144, 16);
							}
							{
								lbl_D_Event_FechaIni_Info = new JLabel();
								pnl_detalles.add(lbl_D_Event_FechaIni_Info);
								lbl_D_Event_FechaIni_Info.setText(" ");
								lbl_D_Event_FechaIni_Info.setBounds(104, 69,
										145, 16);
							}
							{
								lbl_D_Event_FechaFin_Info = new JLabel();
								pnl_detalles.add(lbl_D_Event_FechaFin_Info);
								lbl_D_Event_FechaFin_Info.setText(" ");
								lbl_D_Event_FechaFin_Info.setBounds(104, 92,
										144, 16);
							}
						}
						/*
						 * { pnl_detalles = new JPanel(); FlowLayout
						 * pnl_detallesLayout = new FlowLayout();
						 * pnl_detalles.setLayout(pnl_detallesLayout);
						 * pnl_detalles_botones_eventos.add(pnl_detalles);
						 * pnl_detalles .setPreferredSize(new
						 * java.awt.Dimension( 152, 80));
						 * pnl_detalles.setBorder(BorderFactory
						 * .createTitledBorder(null, "Detalles",
						 * TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION)); }
						 */
						{
							pnl_botones = new JPanel();
							GroupLayout pnl_botonesLayout = new GroupLayout(
									(JComponent) pnl_botones);
							pnl_detalles_botones_eventos.add(pnl_botones);
							pnl_botones.setLayout(pnl_botonesLayout);
							{
								btn_crear_evento = new JButton();
								btn_crear_evento.setText("Crear Evento");
								btn_crear_evento.setSize(150, 35);
								btn_crear_evento
										.addMouseListener(new MouseAdapter() {
											public void mouseClicked(
													MouseEvent evt) {
												btn_crear_eventoMouseClicked(evt);
											}
										});
							}
							{
								btn_eliminar_evento = new JButton();
								btn_eliminar_evento.setText("Eliminar Evento");
								btn_eliminar_evento.setSize(150, 35);
								btn_eliminar_evento
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												btn_eliminar_eventoActionPerformed(evt);
											}
										});
							}
							{
								btn_modificar_evento = new JButton();
								btn_modificar_evento
										.setText("Modificar Evento");
								btn_modificar_evento.setSize(150, 35);
								btn_modificar_evento
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												btn_modificar_eventoActionPerformed(evt);
											}
										});
							}
							pnl_botonesLayout
									.setHorizontalGroup(pnl_botonesLayout
											.createSequentialGroup()
											.addContainerGap()
											.addGroup(
													pnl_botonesLayout
															.createParallelGroup()
															.addComponent(
																	btn_crear_evento,
																	GroupLayout.Alignment.LEADING,
																	0,
																	236,
																	Short.MAX_VALUE)
															.addComponent(
																	btn_modificar_evento,
																	GroupLayout.Alignment.LEADING,
																	0,
																	236,
																	Short.MAX_VALUE)
															.addComponent(
																	btn_eliminar_evento,
																	GroupLayout.Alignment.LEADING,
																	0,
																	236,
																	Short.MAX_VALUE))
											.addContainerGap());
							pnl_botonesLayout
									.setVerticalGroup(pnl_botonesLayout
											.createSequentialGroup()
											.addContainerGap()
											.addComponent(btn_crear_evento,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(
													LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(btn_modificar_evento,
													GroupLayout.PREFERRED_SIZE,
													26,
													GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(
													LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(btn_eliminar_evento,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addContainerGap(54,
													Short.MAX_VALUE));
						}
					}
				}
				{
					pnl_actividades = new JPanel();
					pestaña_principal.addTab("Actividades", null,
							pnl_actividades, null);
					GridLayout pnl_actividadesLayout = new GridLayout(1, 2);
					pnl_actividadesLayout.setHgap(5);
					pnl_actividadesLayout.setVgap(5);
					pnl_actividadesLayout.setColumns(2);
					pnl_actividades.setLayout(pnl_actividadesLayout);
					{
						pnl_evento_actividades = new JPanel();
						pnl_actividades.add(pnl_evento_actividades);
						BorderLayout jPanel1Layout = new BorderLayout();
						pnl_evento_actividades
								.setPreferredSize(new java.awt.Dimension(227,
										344));
						pnl_evento_actividades.setLayout(jPanel1Layout);
						pnl_evento_actividades.setName("Evento");
						{
							pnl_seleccion_evento = new JPanel();
							CardLayout pnl_seleccion_eventoLayout = new CardLayout();
							pnl_seleccion_evento
									.setLayout(pnl_seleccion_eventoLayout);
							pnl_evento_actividades.add(pnl_seleccion_evento,
									BorderLayout.NORTH);
							pnl_seleccion_evento
									.setPreferredSize(new java.awt.Dimension(
											225, 46));
							pnl_seleccion_evento.setBorder(BorderFactory
									.createTitledBorder(null, "Evento",
											TitledBorder.LEADING,
											TitledBorder.DEFAULT_POSITION));
							// pnl_seleccion_evento.setTabTitle("");
							{
								ComboBoxModel box_eventosModel = new DefaultComboBoxModel();
								box_eventos = new JComboBox();
								pnl_seleccion_evento.add(box_eventos,
										"box_eventos");
								box_eventos.setModel(box_eventosModel);
								box_eventos
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												box_eventosActionPerformed(evt);
											}
										});
							}
						}
						{
							pnl_lista_actividades = new JPanel();
							BorderLayout pnl_lista_actividadesLayout = new BorderLayout();
							pnl_lista_actividades
									.setLayout(pnl_lista_actividadesLayout);
							pnl_evento_actividades.add(pnl_lista_actividades,
									BorderLayout.CENTER);
							pnl_lista_actividades.setBorder(BorderFactory
									.createTitledBorder(null, "Actividades",
											TitledBorder.CENTER,
											TitledBorder.DEFAULT_POSITION));
							pnl_lista_actividades
									.setPreferredSize(new java.awt.Dimension(
											225, 288));
							{
								jScrollPane1 = new JScrollPane();
								pnl_lista_actividades.add(jScrollPane1,
										BorderLayout.CENTER);
								jScrollPane1
										.setPreferredSize(new java.awt.Dimension(
												249, 266));
								{
									DefaultListModel lst_actividadesModel = new DefaultListModel();
									lst_actividades = new JList();
									jScrollPane1
											.setViewportView(lst_actividades);
									lst_actividades
											.setModel(lst_actividadesModel);
									lst_actividades
											.setBorder(BorderFactory
													.createBevelBorder(BevelBorder.LOWERED));
									lst_actividades
											.addMouseListener(new MouseAdapter() {
												public void mouseClicked(
														MouseEvent evt) {
													lst_actividadesMouseClicked(evt);
												}
											});
								}
							}
						}
					}
					{
						pnl_detalles_botones_actividades = new JPanel();
						pnl_actividades.add(pnl_detalles_botones_actividades);
						GridLayout jPanel2Layout = new GridLayout(2, 1);
						jPanel2Layout.setHgap(5);
						jPanel2Layout.setVgap(5);
						jPanel2Layout.setColumns(1);
						jPanel2Layout.setRows(2);
						pnl_detalles_botones_actividades
								.setPreferredSize(new java.awt.Dimension(227,
										344));
						pnl_detalles_botones_actividades
								.setLayout(jPanel2Layout);
						{
							pnl_detalles_actividades = new JPanel();
							GroupLayout jPanel3Layout = new GroupLayout(
									(JComponent) pnl_detalles_actividades);
							pnl_detalles_botones_actividades
									.add(pnl_detalles_actividades);
							pnl_detalles_actividades
									.setPreferredSize(new java.awt.Dimension(
											152, 80));
							pnl_detalles_actividades.setBorder(BorderFactory
									.createTitledBorder(null, "Detalles",
											TitledBorder.CENTER,
											TitledBorder.DEFAULT_POSITION));
							pnl_detalles_actividades.setLayout(jPanel3Layout);
							{
								lbl_DNom_Act = new JLabel();
								lbl_DNom_Act.setText("Nombre:");
							}
							{
								lbl_DPerCargo = new JLabel();
								lbl_DPerCargo.setText("Persona a cargo:");
							}
							{
								lbl_DFecha_Ini_Act = new JLabel();
								lbl_DFecha_Ini_Act.setText("Fecha de Inicio:");
							}
							{
								lbl_DFecha_Fin_Act = new JLabel();
								lbl_DFecha_Fin_Act.setText("Fecha de Fin:");
							}
							{
								lbl_DNombre_Act_info = new JLabel();
								lbl_DNombre_Act_info.setSize(144, 16);
							}
							{
								lbl_DPAcargo_info = new JLabel();
								lbl_DPAcargo_info.setSize(144, 16);
							}
							{
								lbl_DFechaI_Act_info = new JLabel();
								lbl_DFechaI_Act_info.setSize(144, 16);
							}
							{
								lbl_DFechaF_Act_info = new JLabel();
								lbl_DFechaF_Act_info.setSize(144, 16);
							}
							jPanel3Layout
									.setHorizontalGroup(jPanel3Layout
											.createSequentialGroup()
											.addGroup(
													jPanel3Layout
															.createParallelGroup()
															.addComponent(
																	lbl_DPerCargo,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	105,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(
																	lbl_DFecha_Ini_Act,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	105,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(
																	lbl_DFecha_Fin_Act,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	105,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(
																	lbl_DNom_Act,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	105,
																	GroupLayout.PREFERRED_SIZE))
											.addGroup(
													jPanel3Layout
															.createParallelGroup()
															.addComponent(
																	lbl_DPAcargo_info,
																	GroupLayout.Alignment.LEADING,
																	0,
																	144,
																	Short.MAX_VALUE)
															.addComponent(
																	lbl_DFechaI_Act_info,
																	GroupLayout.Alignment.LEADING,
																	0,
																	144,
																	Short.MAX_VALUE)
															.addComponent(
																	lbl_DFechaF_Act_info,
																	GroupLayout.Alignment.LEADING,
																	0,
																	144,
																	Short.MAX_VALUE)
															.addComponent(
																	lbl_DNombre_Act_info,
																	GroupLayout.Alignment.LEADING,
																	0,
																	144,
																	Short.MAX_VALUE)));
							jPanel3Layout
									.setVerticalGroup(jPanel3Layout
											.createSequentialGroup()
											.addGroup(
													jPanel3Layout
															.createParallelGroup()
															.addComponent(
																	lbl_DNombre_Act_info,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	16,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(
																	lbl_DNom_Act,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(
													LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(
													jPanel3Layout
															.createParallelGroup()
															.addComponent(
																	lbl_DPAcargo_info,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	16,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(
																	lbl_DPerCargo,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(
													LayoutStyle.ComponentPlacement.UNRELATED)
											.addGroup(
													jPanel3Layout
															.createParallelGroup()
															.addComponent(
																	lbl_DFechaI_Act_info,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	16,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(
																	lbl_DFecha_Ini_Act,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(
													LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(
													jPanel3Layout
															.createParallelGroup()
															.addComponent(
																	lbl_DFechaF_Act_info,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	16,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(
																	lbl_DFecha_Fin_Act,
																	GroupLayout.Alignment.LEADING,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE))
											.addContainerGap(52, 52));
						}
						{
							pnl_botones_actividades = new JPanel();
							GroupLayout jPanel4Layout = new GroupLayout(
									(JComponent) pnl_botones_actividades);
							pnl_detalles_botones_actividades
									.add(pnl_botones_actividades);
							pnl_botones_actividades.setLayout(jPanel4Layout);
							{
								btn_crear_actividad = new JButton();
								btn_crear_actividad.setText("Crear Actividad");
								btn_crear_actividad.setSize(150, 35);
								btn_crear_actividad
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												btn_crear_actividadActionPerformed(evt);
											}
										});
							}
							{
								btn_eliminar_actividad = new JButton();
								btn_eliminar_actividad
										.setText("Eliminar Actividad");
								btn_eliminar_actividad
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												btn_eliminar_actividadActionPerformed(evt);
											}
										});
								btn_eliminar_actividad.setSize(150, 35);
							}
							{
								btn_modificar_actividad = new JButton();
								btn_modificar_actividad
										.setText("Modificar Actividad");
								btn_modificar_actividad
										.addActionListener(new ActionListener() {
											public void actionPerformed(
													ActionEvent evt) {
												btn_modificar_actividadActionPerformed(evt);
											}
										});
								btn_modificar_actividad.setSize(150, 35);
							}
							{
								btn_asignar_recursos = new JButton();
								btn_asignar_recursos
										.setText("Asignar Recursos");
								btn_asignar_recursos.setSize(150, 35);
								btn_asignar_recursos.setEnabled(false);
							}
							jPanel4Layout
									.setHorizontalGroup(jPanel4Layout
											.createSequentialGroup()
											.addContainerGap()
											.addGroup(
													jPanel4Layout
															.createParallelGroup()
															.addComponent(
																	btn_crear_actividad,
																	GroupLayout.Alignment.LEADING,
																	0,
																	205,
																	Short.MAX_VALUE)
															.addComponent(
																	btn_eliminar_actividad,
																	GroupLayout.Alignment.LEADING,
																	0,
																	205,
																	Short.MAX_VALUE)
															.addComponent(
																	btn_modificar_actividad,
																	GroupLayout.Alignment.LEADING,
																	0,
																	205,
																	Short.MAX_VALUE)
															.addComponent(
																	btn_asignar_recursos,
																	GroupLayout.Alignment.LEADING,
																	0,
																	205,
																	Short.MAX_VALUE))
											.addContainerGap());
							jPanel4Layout
									.setVerticalGroup(jPanel4Layout
											.createSequentialGroup()
											.addContainerGap()
											.addComponent(btn_crear_actividad,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(
													LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(
													btn_modificar_actividad,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(
													LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(
													btn_eliminar_actividad,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(
													LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(btn_asignar_recursos,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addContainerGap(17,
													Short.MAX_VALUE));
						}
					}
				}
				{
					pnl_auspiciantes = new JPanel();
					pnl_auspiciantes.setLayout(null);
					pestaña_principal.addTab("Auspiciantes", null,
							pnl_auspiciantes, null);
					pnl_auspiciantes.setPreferredSize(new java.awt.Dimension(
							459, 303));
					{
						pnl_lista_auspiciantes = new JPanel();
						pnl_auspiciantes.add(pnl_lista_auspiciantes);
						pnl_lista_auspiciantes.setBounds(0, 0, 261, 338);
						pnl_lista_auspiciantes.setBorder(BorderFactory
								.createTitledBorder("Auspiciantes"));
						{
							jScrollPane2 = new JScrollPane();
							pnl_lista_auspiciantes.add(jScrollPane2);
							jScrollPane2
									.setPreferredSize(new java.awt.Dimension(
											245, 306));
							{
								ListModel lst_auspiciantesModel = new DefaultComboBoxModel(
										new String[] { "Item One", "Item Two" });
								lst_auspiciantes = new JList();
								jScrollPane2.setViewportView(lst_auspiciantes);
								lst_auspiciantes
										.setModel(lst_auspiciantesModel);
								lst_auspiciantes.setBounds(157, 272, 228, 301);
								lst_auspiciantes
										.addMouseListener(new MouseAdapter() {
											public void mouseClicked(
													MouseEvent evt) {
												lst_auspiciantesMouseClicked(evt);
											}
										});
							}
						}
						// pnl_lista_auspiciantes.setTabTitle("");
					}
					{
						btn_crear_auspiciante = new JButton();
						pnl_auspiciantes.add(btn_crear_auspiciante);
						btn_crear_auspiciante.setText("Crear Auspiciante");
						btn_crear_auspiciante.setBounds(273, 200, 240, 28);
						btn_crear_auspiciante.setEnabled(false);
					}
					{
						btn_eliminar_auspiciante = new JButton();
						pnl_auspiciantes.add(btn_eliminar_auspiciante);
						btn_eliminar_auspiciante
								.setText("Eliminar Auspiciante");
						btn_eliminar_auspiciante.setBounds(273, 239, 240, 28);
						btn_eliminar_auspiciante.setEnabled(false);
					}
					{
						btn_modificar_auspiciante = new JButton();
						pnl_auspiciantes.add(btn_modificar_auspiciante);
						btn_modificar_auspiciante
								.setText("Modificar Auspiciante");
						btn_modificar_auspiciante.setBounds(273, 278, 240, 26);
						btn_modificar_auspiciante.setEnabled(false);
					}
					{
						pnl_Detalles_Auspiciantes = new JPanel();
						GroupLayout pnl_Detalles_AuspiciantesLayout = new GroupLayout(
								(JComponent) pnl_Detalles_Auspiciantes);
						pnl_Detalles_Auspiciantes
								.setLayout(pnl_Detalles_AuspiciantesLayout);
						pnl_auspiciantes.add(pnl_Detalles_Auspiciantes);
						pnl_Detalles_Auspiciantes.setBounds(267, 0, 251, 171);
						pnl_Detalles_Auspiciantes.setBorder(BorderFactory
								.createTitledBorder(null, "Detalles:",
										TitledBorder.CENTER,
										TitledBorder.DEFAULT_POSITION));
						{
							lbl_D_Auspiciantes_Nombre = new JLabel();
							lbl_D_Auspiciantes_Nombre.setText("Nombre:");
						}
						{
							lbl_D_Auspiciantes_Nombre_Info = new JLabel();
							lbl_D_Auspiciantes_Nombre_Info.setText(" ");
						}
						{
							lbl_D_Auspiciantes_Telefono_Info = new JLabel();
							lbl_D_Auspiciantes_Telefono_Info.setText(" ");
						}
						{
							lbl_D_Auspiciantes_Telefono = new JLabel();
							lbl_D_Auspiciantes_Telefono.setText("Telefono:");
						}
						pnl_Detalles_AuspiciantesLayout
								.setHorizontalGroup(pnl_Detalles_AuspiciantesLayout
										.createSequentialGroup()
										.addGap(6)
										.addGroup(
												pnl_Detalles_AuspiciantesLayout
														.createParallelGroup()
														.addComponent(
																lbl_D_Auspiciantes_Telefono,
																GroupLayout.Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE,
																55,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																GroupLayout.Alignment.LEADING,
																pnl_Detalles_AuspiciantesLayout
																		.createSequentialGroup()
																		.addComponent(
																				lbl_D_Auspiciantes_Nombre,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				7)))
										.addGroup(
												pnl_Detalles_AuspiciantesLayout
														.createParallelGroup()
														.addComponent(
																lbl_D_Auspiciantes_Nombre_Info,
																GroupLayout.Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE,
																180,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																GroupLayout.Alignment.LEADING,
																pnl_Detalles_AuspiciantesLayout
																		.createSequentialGroup()
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				lbl_D_Auspiciantes_Telefono_Info,
																				0,
																				174,
																				Short.MAX_VALUE))));
						pnl_Detalles_AuspiciantesLayout
								.setVerticalGroup(pnl_Detalles_AuspiciantesLayout
										.createSequentialGroup()
										.addGroup(
												pnl_Detalles_AuspiciantesLayout
														.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
														.addComponent(
																lbl_D_Auspiciantes_Nombre,
																GroupLayout.Alignment.BASELINE,
																0, 24,
																Short.MAX_VALUE)
														.addComponent(
																lbl_D_Auspiciantes_Nombre_Info,
																GroupLayout.Alignment.BASELINE,
																0, 19,
																Short.MAX_VALUE))
										.addGroup(
												pnl_Detalles_AuspiciantesLayout
														.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
														.addComponent(
																lbl_D_Auspiciantes_Telefono,
																GroupLayout.Alignment.BASELINE,
																GroupLayout.PREFERRED_SIZE,
																19,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lbl_D_Auspiciantes_Telefono_Info,
																GroupLayout.Alignment.BASELINE,
																GroupLayout.PREFERRED_SIZE,
																18,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(102, 102));
					}
				}
			}
			pack();
			ActualizarCampos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Carga el combobox en la pestaña de Actividades con los Eventos del
	// Sistema.
	private void cargarEventosCB() {
		int i;
		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;

		box_eventos.removeAllItems();
		for (i = 0; i < lista_eventos.size(); i++) {
			box_eventos.addItem(((Evento) (lista_eventos.get(i))).getNombre());
		}
		if (lista_eventos.size() > 0) {
			box_eventos.setSelectedIndex(0);
		}
	}

	// Carga la lista de actividades segun el evento seleccionado en el combo
	// box.
	private void cargarActividadesLst() {
		int i;
		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;

		int ievtselec = box_eventos.getSelectedIndex();
		Evento EvtSelec = null;
		if (ievtselec >= 0) {
			EvtSelec = (Evento) lista_eventos.get(ievtselec);
		}

		if (EvtSelec != null) {
			DefaultListModel mdl_list_act = (DefaultListModel) lst_actividades
					.getModel();
			mdl_list_act.removeAllElements();

			for (i = 0; i < EvtSelec.cant_Acts_Asociadas(); i++) {
				mdl_list_act
						.addElement(((Actividad) (EvtSelec.get_Actividad(i)))
								.getNombre());
			}
			lst_actividades.setSelectedIndex(0);
			mostrarDetallesAct();
		}
	}

	// Muestra los detalles de una actividad
	private void mostrarDetallesAct() {
		ArrayList lista_actividades = sys.Sistema.D.lista_actividades;
		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;

		int ievtselec = box_eventos.getSelectedIndex();
		int iactsel = lst_actividades.getSelectedIndex();
		Evento EvtSelec = null;
		if (ievtselec >= 0) {
			EvtSelec = (Evento) lista_eventos.get(ievtselec);
		}

		if (EvtSelec != null) {
			Actividad ActSelec = null;
			if (iactsel >= 0) {
				ActSelec = (Actividad) EvtSelec.get_Actividad(iactsel);
			}

			if (ActSelec != null) {
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				lbl_DNombre_Act_info.setText(ActSelec.getNombre());
				lbl_DPAcargo_info.setText(ActSelec.getPersona_a_cargo()
						.getNombre()
						+ " " + ActSelec.getPersona_a_cargo().getApellido());
				lbl_DFechaI_Act_info.setText(dateFormat.format(ActSelec
						.getFecha_Inicio()));
				lbl_DFechaF_Act_info
						.setText(dateFormat.format(ActSelec.getFecha_Fin()));
			} else {
				lbl_DNombre_Act_info.setText("");
				lbl_DPAcargo_info.setText("");
				lbl_DFechaI_Act_info.setText("");
				lbl_DFechaF_Act_info.setText("");
			}
		}

	}

	// Cargar Eventos en la pestaña de Eventos
	private void cargarEventosLst() {
		int i;
		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;

		// DefaultListModel mdl_list_evt = (DefaultListModel)
		// lst_eventos.getModel();
		// mdl_list_evt.removeAllElements();
		DefaultListModel model = new DefaultListModel();

		for (i = 1; i < lista_eventos.size(); i++) {

			// mdl_list_evt.addElement(((Evento)
			// (lista_eventos.get(i))).getNombre());
			model.addElement(((Evento) (lista_eventos.get(i))).getNombre());
		}

		// lst_eventos.setModel(mdl_list_evt);
		lst_eventos.setModel(model);

	}

	// Muestra los Detalles de un Evento seleccionado en la Lista de Eventos
	private void mostrarDetallesEventos() {
		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;
		int seleccion = lst_eventos.getSelectedIndex() + 1;
		Evento EvtSelec = null;
		if (seleccion >= 0) {
			EvtSelec = (Evento) lista_eventos.get(seleccion);
		}

		if (EvtSelec != null) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			lbl_D_Event_Nombre_Info.setText(EvtSelec.getNombre());
			lbl_D_Event_Organizador_Info.setText(EvtSelec.getOrganizador());
			lbl_D_Event_FechaIni_Info.setText(dateFormat.format(EvtSelec
					.getFecha_Inicio()));
			lbl_D_Event_FechaFin_Info.setText(dateFormat.format(EvtSelec
					.getFecha_Fin()));

		} else {
			lbl_D_Event_Nombre_Info.setText(" ");
			lbl_D_Event_Organizador_Info.setText(" ");
			lbl_D_Event_FechaIni_Info.setText(" ");
			lbl_D_Event_FechaFin_Info.setText(" ");
		}

	}

	private void mostrarListaAuspiciantes() {
		DefaultListModel modelo = new DefaultListModel();

		ArrayList lista_auspiciantes = sys.Sistema.D.lista_auspiciantes;
		modelo.removeAllElements();
		int cant = lista_auspiciantes.size();
		for (int i = 0; i < cant; i++) {
			modelo.addElement(((Auspiciante) lista_auspiciantes.get(i))
					.getNombre());
		}
		lst_auspiciantes.setModel(modelo);
	}

	// Muestra los Detalles de un Auspiciante seleccionado en la Lista de
	// Auspiciantes
	private void mostrarDetallesAuspiciantes() {
		ArrayList lista_auspiciantes = sys.Sistema.D.lista_auspiciantes;
		int seleccion = lst_auspiciantes.getSelectedIndex();
		Auspiciante AusSelec = null;
		if (seleccion >= 0) {
			AusSelec = (Auspiciante) lista_auspiciantes.get(seleccion);
		}

		if (AusSelec != null) {
			lbl_D_Auspiciantes_Nombre_Info.setText(AusSelec.getNombre());
			lbl_D_Auspiciantes_Telefono_Info.setText(AusSelec.getTelefono());
		} else {
			lbl_D_Auspiciantes_Nombre_Info.setText("");
			lbl_D_Auspiciantes_Telefono_Info.setText("");
		}
	}

	public void ActualizarCampos() {
		cargarEventosCB();
		cargarEventosLst();
		cargarActividadesLst();
		mostrarDetallesAct();
		mostrarListaAuspiciantes();
	}

	// Crear un evento nuevo
	private void btn_crear_eventoMouseClicked(MouseEvent evt) {
		System.out.println("btn_crear_evento.mouseClicked, event=" + evt);
		abm_event.setVisible(true);
		setEnabled(false);
	}

	// Modificar Un Evento seleccionado de la lista
	private void btn_modificar_eventoActionPerformed(ActionEvent evt) {
		System.out
				.println("btn_modificar_evento.actionPerformed, event=" + evt);
		int i = lst_eventos.getSelectedIndex();
		if (i == -1) {
			JOptionPane.showMessageDialog(null,
					"Debe seleccionar un evento de la lista de Eventos");
		} else {
			Evento e = (Evento) sys.Sistema.D.lista_eventos.get(i + 1);
			abm_event.modificarEvento(e);
			abm_event.setVisible(true);
			setEnabled(false);
		}
	}

	// Reasigna las Actividades
	private void ReasignarActividades(Evento E1, Evento E2) {
		int i = 0;
		for (i = 0; i < E1.cant_Acts_Asociadas(); i++) {
			Actividad A = E1.get_Actividad(i);
			A.setEvtAsociado(E2);
		}
	}

	// Eliminar un evento
	private void btn_eliminar_eventoActionPerformed(ActionEvent evt) {
		System.out.println("btn_eliminar_evento.actionPerformed, event=" + evt);
		int i = lst_eventos.getSelectedIndex();
		if (i == -1) {
			JOptionPane.showMessageDialog(null,
					"Debe seleccionar un Evento de la lista de Eventos");
		} else {
			Evento E = (Evento) sys.Sistema.D.lista_eventos.get(i + 1);
			Evento SinEvt = (Evento) sys.Sistema.D.lista_eventos.get(0);
			ReasignarActividades(E, SinEvt);
			sys.Sistema.D.lista_eventos.remove(i + 1);
			ActualizarCampos();
			JOptionPane.showMessageDialog(null,
					"El Evento fue eliminado del sistema");
		}
	}

	private void box_eventosActionPerformed(ActionEvent evt) {
		System.out.println("box_eventos.actionPerformed, event=" + evt);
		cargarActividadesLst();
	}

	private void lst_actividadesMouseClicked(MouseEvent evt) {
		System.out.println("lst_actividades.mouseClicked, event=" + evt);
		mostrarDetallesAct();
	}

	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosing, event=" + evt);
		sys.Sistema.GuardarDatos();
	}

	private Actividad getActSeleccion() {
		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;

		int ievtselec = box_eventos.getSelectedIndex();
		int iactsel = lst_actividades.getSelectedIndex();
		Evento EvtSelec = null;
		if (ievtselec >= 0) {
			EvtSelec = (Evento) lista_eventos.get(ievtselec);
		}

		if (EvtSelec != null) {
			Actividad ActSelec = null;
			if (iactsel >= 0) {
				ActSelec = (Actividad) EvtSelec.get_Actividad(iactsel);
				return ActSelec;
			}
		}
		return null;
	}

	private void btn_crear_actividadActionPerformed(ActionEvent evt) {
		System.out.println("btn_crear_actividad.actionPerformed, event=" + evt);
		abm_act.setearCreacion();
		abm_act.setVisible(true);
		setEnabled(false);
	}

	private void btn_modificar_actividadActionPerformed(ActionEvent evt) {
		System.out.println("btn_modificar_actividad.actionPerformed, event="
				+ evt);

		ArrayList lista_eventos = sys.Sistema.D.lista_eventos;

		int ievtselec = box_eventos.getSelectedIndex();
		int iactsel = lst_actividades.getSelectedIndex();
		Evento EvtSelec = null;
		if (ievtselec >= 0) {
			EvtSelec = (Evento) lista_eventos.get(ievtselec);
		}

		if (EvtSelec != null) {
			Actividad ActSelec = null;
			if (iactsel >= 0) {
				ActSelec = (Actividad) EvtSelec.get_Actividad(iactsel);
				abm_act.setearModificacion(ActSelec);
				abm_act.setVisible(true);
				setEnabled(true);
			} else {
				JOptionPane.showMessageDialog(null,
						"Seleccione una actividad primero.");
			}
		}
	}

	private void btn_eliminar_actividadActionPerformed(ActionEvent evt) {
		System.out.println("btn_eliminar_actividad.actionPerformed, event="
				+ evt);

		Actividad ActSelec = getActSeleccion();

		if (ActSelec != null) {
			int opcion = JOptionPane.showConfirmDialog(this,
					"¿Está seguro que desea borrar la actividad?",
					"Eliminación definitiva", JOptionPane.YES_NO_OPTION);
			if (opcion == 0) {
				ActSelec.getEvtAsociado().desasociar_Act(ActSelec);
				sys.Sistema.D.lista_actividades.remove(ActSelec);
				cargarActividadesLst();
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Seleccione una actividad primero.");
		}
	}

	private void lst_auspiciantesMouseClicked(MouseEvent evt) {
		System.out.println("lst_auspiciantes.mouseClicked, event=" + evt);
		mostrarDetallesAuspiciantes();
	}

	private void lst_eventosMouseClicked(MouseEvent evt) {
		System.out.println("lst_eventos.mouseClicked, event=" + evt);
		mostrarDetallesEventos();
	}

}
