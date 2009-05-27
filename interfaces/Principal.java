package interfaces;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import datos.Evento;

import base_datos.Archivo_Evento;

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
public class Principal extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private Archivo_Evento eventos = new Archivo_Evento();

	private JTabbedPane pestaña_principal;
	private JPanel pnl_detalles_botones_eventos;
	private JPanel pnl_detalles;
	private JButton btn_crear_evento;
	private JPanel pnl_seleccion_evento;
	private JList lst_actividades;
	private JComboBox box_eventos;
	private JPanel pnl_lista_actividades;
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
	private JPanel pnl_actividades;
	private JPanel pnl_eventos;
	
	// Ventanas utilizadas
	private frm_abm_actividades abm_act;
	private frm_abm_eventos abm_event;
	
	private void Iniciar_comp(){
		abm_act=new frm_abm_actividades(this);
		abm_event= new frm_abm_eventos(this);
	}
	
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		Principal inst = new Principal();
		inst.setVisible(true);
		inst.setEnabled(true);
	}
	
	public Principal() {
		super();
		Iniciar_comp();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setTitle("Principal");
			{
				pestaña_principal = new JTabbedPane();
				getContentPane().add(pestaña_principal, BorderLayout.CENTER);
				pestaña_principal.setPreferredSize(new java.awt.Dimension(529, 366));
				{
					pnl_eventos = new JPanel();
					GridLayout pnl_eventosLayout = new GridLayout(1, 1);
					pnl_eventosLayout.setHgap(5);
					pnl_eventosLayout.setVgap(5);
					pnl_eventosLayout.setColumns(1);
					pnl_eventos.setLayout(pnl_eventosLayout);
					pestaña_principal.addTab("Eventos", null, pnl_eventos, null);
					{
						pnl_lista_eventos = new JPanel();
						BorderLayout pnl_lista_eventosLayout = new BorderLayout();
						pnl_lista_eventosLayout.setHgap(10);
						pnl_lista_eventosLayout.setVgap(10);
						pnl_eventos.add(pnl_lista_eventos);
						pnl_lista_eventos.setLayout(pnl_lista_eventosLayout);
						pnl_lista_eventos.setName("Evento");
						pnl_lista_eventos.setPreferredSize(new java.awt.Dimension(246, 204));
						pnl_lista_eventos.setBorder(BorderFactory.createTitledBorder(null, "Eventos", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
						{
							ListModel lst_eventosModel = new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
							lst_eventos = new JList();
							pnl_lista_eventos.add(lst_eventos, BorderLayout.CENTER);
							lst_eventos.setVisibleRowCount(10);
							lst_eventos.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
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
						pnl_detalles_botones_eventos.setLayout(pnl_detalleLayout);
						pnl_detalles_botones_eventos.setPreferredSize(new java.awt.Dimension(170, 344));
						{
							pnl_detalles = new JPanel();
							FlowLayout pnl_detallesLayout = new FlowLayout();
							pnl_detalles.setLayout(pnl_detallesLayout);
							pnl_detalles_botones_eventos.add(pnl_detalles);
							pnl_detalles
								.setPreferredSize(new java.awt.Dimension(
									152,
									80));
							pnl_detalles.setBorder(BorderFactory.createTitledBorder(null, "Detalles", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
						}
						{
							pnl_botones = new JPanel();
							GroupLayout pnl_botonesLayout = new GroupLayout((JComponent)pnl_botones);
							pnl_detalles_botones_eventos.add(pnl_botones);
							pnl_botones.setLayout(pnl_botonesLayout);
							{
								btn_crear_evento = new JButton();
								btn_crear_evento.setText("Crear Evento");
								btn_crear_evento.setSize(150, 35);
								btn_crear_evento.addMouseListener(new MouseAdapter() {
									public void mouseClicked(MouseEvent evt) {
										btn_crear_eventoMouseClicked(evt);
									}
								});
							}
							{
								btn_eliminar_evento = new JButton();
								btn_eliminar_evento.setText("Eliminar Evento");
								btn_eliminar_evento.setSize(150, 35);
							}
							{
								btn_modificar_evento = new JButton();
								btn_modificar_evento.setText("Modificar Evento");
								btn_modificar_evento.setSize(150, 35);
							}
					pnl_botonesLayout.setHorizontalGroup(pnl_botonesLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(pnl_botonesLayout.createParallelGroup()
								    .addComponent(btn_crear_evento, GroupLayout.Alignment.LEADING, 0, 236, Short.MAX_VALUE)
								    .addComponent(btn_modificar_evento, GroupLayout.Alignment.LEADING, 0, 236, Short.MAX_VALUE)
								    .addComponent(btn_eliminar_evento, GroupLayout.Alignment.LEADING, 0, 236, Short.MAX_VALUE))
								.addContainerGap());
					pnl_botonesLayout.setVerticalGroup(pnl_botonesLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(btn_crear_evento, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btn_modificar_evento, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btn_eliminar_evento, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(54, Short.MAX_VALUE));
						}
					}
				}
				{
					pnl_actividades = new JPanel();
					pestaña_principal.addTab("Actividades", null, pnl_actividades, null);
					GridLayout pnl_actividadesLayout = new GridLayout(1, 2);
					pnl_actividadesLayout.setHgap(5);
					pnl_actividadesLayout.setVgap(5);
					pnl_actividadesLayout.setColumns(2);
					pnl_actividades.setLayout(pnl_actividadesLayout);
					{
						pnl_evento_actividades = new JPanel();
						pnl_actividades.add(pnl_evento_actividades);
						BorderLayout jPanel1Layout = new BorderLayout();
						pnl_evento_actividades.setPreferredSize(new java.awt.Dimension(227, 344));
						pnl_evento_actividades.setLayout(jPanel1Layout);
						pnl_evento_actividades.setName("Evento");
						{
							pnl_seleccion_evento = new JPanel();
							CardLayout pnl_seleccion_eventoLayout = new CardLayout();
							pnl_seleccion_evento.setLayout(pnl_seleccion_eventoLayout);
							pnl_evento_actividades.add(pnl_seleccion_evento, BorderLayout.NORTH);
							pnl_seleccion_evento.setPreferredSize(new java.awt.Dimension(225, 46));
							pnl_seleccion_evento.setBorder(BorderFactory.createTitledBorder(null, "Evento", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION));
							{
								ComboBoxModel box_eventosModel = new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
								box_eventos = new JComboBox();
								pnl_seleccion_evento.add(box_eventos, "box_eventos");
								box_eventos.setModel(box_eventosModel);
							}
						}
						{
							pnl_lista_actividades = new JPanel();
							BorderLayout pnl_lista_actividadesLayout = new BorderLayout();
							pnl_lista_actividades.setLayout(pnl_lista_actividadesLayout);
							pnl_evento_actividades.add(pnl_lista_actividades, BorderLayout.CENTER);
							pnl_lista_actividades.setBorder(BorderFactory.createTitledBorder(null, "Actividades", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
							pnl_lista_actividades
								.setPreferredSize(new java.awt.Dimension(
									225,
									288));
							{
								ListModel lst_actividadesModel = new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
								lst_actividades = new JList();
								pnl_lista_actividades.add(
									lst_actividades,
									BorderLayout.CENTER);
								lst_actividades.setModel(lst_actividadesModel);
								lst_actividades.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
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
						pnl_detalles_botones_actividades.setPreferredSize(new java.awt.Dimension(227, 344));
						pnl_detalles_botones_actividades.setLayout(jPanel2Layout);
						{
							pnl_detalles_actividades = new JPanel();
							FlowLayout jPanel3Layout = new FlowLayout();
							pnl_detalles_botones_actividades.add(pnl_detalles_actividades);
							pnl_detalles_actividades.setPreferredSize(new java.awt.Dimension(
								152,
								80));
							pnl_detalles_actividades.setBorder(BorderFactory.createTitledBorder(
								null,
								"Detalles",
								TitledBorder.CENTER,
								TitledBorder.DEFAULT_POSITION));
							pnl_detalles_actividades.setLayout(jPanel3Layout);
						}
						{
							pnl_botones_actividades = new JPanel();
							GroupLayout jPanel4Layout = new GroupLayout((JComponent)pnl_botones_actividades);
							pnl_detalles_botones_actividades.add(pnl_botones_actividades);
							pnl_botones_actividades.setLayout(jPanel4Layout);
							{
								btn_crear_actividad = new JButton();
								btn_crear_actividad.setText("Crear Actividad");
								btn_crear_actividad.setSize(150, 35);
								btn_crear_actividad.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent evt) {
										btn_crear_actividadActionPerformed(evt);
									}
								});
							}
							{
								btn_eliminar_actividad = new JButton();
								btn_eliminar_actividad.setText("Eliminar Actividad");
								btn_eliminar_actividad.setSize(150, 35);
							}
							{
								btn_modificar_actividad = new JButton();
								btn_modificar_actividad.setText("Modificar Actividad");
								btn_modificar_actividad.setSize(150, 35);
							}
							{
								btn_asignar_recursos = new JButton();
								btn_asignar_recursos.setText("Asignar Recursos");
								btn_asignar_recursos.setSize(150, 35);
							}
					jPanel4Layout.setHorizontalGroup(jPanel4Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel4Layout.createParallelGroup()
								    .addComponent(btn_crear_actividad, GroupLayout.Alignment.LEADING, 0, 205, Short.MAX_VALUE)
								    .addComponent(btn_eliminar_actividad, GroupLayout.Alignment.LEADING, 0, 205, Short.MAX_VALUE)
								    .addComponent(btn_modificar_actividad, GroupLayout.Alignment.LEADING, 0, 205, Short.MAX_VALUE)
								    .addComponent(btn_asignar_recursos, GroupLayout.Alignment.LEADING, 0, 205, Short.MAX_VALUE))
								.addContainerGap());
					jPanel4Layout.setVerticalGroup(jPanel4Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(btn_crear_actividad, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btn_modificar_actividad, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btn_eliminar_actividad, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btn_asignar_recursos, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(17, Short.MAX_VALUE));
						}
					}
				}
				{
					pnl_auspiciantes = new JPanel();
					pestaña_principal.addTab("Auspiciantes", null, pnl_auspiciantes, null);
				}
			}
			pack();
			cargarEventos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void cargarEventos(){
		DefaultListModel modelo = new DefaultListModel();
		
		eventos.AbrirLista();
		Evento e = eventos.primerEvento(); 
		e = eventos.primerEvento();
		while (e != null){
			modelo.addElement(e.getNombre());
			e = eventos.siguienteEvento();
		}				  
		lst_eventos.setModel(modelo);		
	}
	
	
	private void btn_crear_eventoMouseClicked(MouseEvent evt) {
		System.out.println("btn_crear_evento.mouseClicked, event="+evt);
		abm_event.setVisible(true);		
		setEnabled(false);
	}
	
	private void btn_crear_actividadActionPerformed(ActionEvent evt) {
		System.out.println("btn_crear_actividad.actionPerformed, event="+evt);
		abm_act.setVisible(true);
		setEnabled(false);
	}

}
