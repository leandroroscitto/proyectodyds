package interfaces;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.ListModel;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

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

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JTabbedPane pestaña_principal;
	private JPanel pnl_detalle_botones_eventos;
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

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		Principal inst = new Principal();
		inst.setVisible(true);
	}
	
	public Principal() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Principal");
			{
				pestaña_principal = new JTabbedPane();
				getContentPane().add(pestaña_principal, BorderLayout.CENTER);
				pestaña_principal.setPreferredSize(new java.awt.Dimension(465, 370));
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
							lst_eventos.setModel(lst_eventosModel);
							lst_eventos.setLayoutOrientation(JList.VERTICAL_WRAP);
							lst_eventos.setVisibleRowCount(10);
							lst_eventos.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
						}
					}
					{
						pnl_detalle_botones_eventos = new JPanel();
						pnl_eventos.add(pnl_detalle_botones_eventos);
						GridLayout pnl_detalleLayout = new GridLayout(2, 1);
						pnl_detalleLayout.setHgap(5);
						pnl_detalleLayout.setVgap(5);
						pnl_detalleLayout.setColumns(1);
						pnl_detalleLayout.setRows(2);
						pnl_detalle_botones_eventos.setLayout(pnl_detalleLayout);
						pnl_detalle_botones_eventos.setPreferredSize(new java.awt.Dimension(170, 344));
						{
							pnl_detalles = new JPanel();
							FlowLayout pnl_detallesLayout = new FlowLayout();
							pnl_detalles.setLayout(pnl_detallesLayout);
							pnl_detalle_botones_eventos.add(pnl_detalles);
							pnl_detalles
								.setPreferredSize(new java.awt.Dimension(
									152,
									80));
							pnl_detalles.setBorder(BorderFactory.createTitledBorder(null, "Detalles", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
						}
						{
							pnl_botones = new JPanel();
							FlowLayout pnl_botonesLayout = new FlowLayout();
							pnl_botonesLayout.setAlignOnBaseline(true);
							pnl_botonesLayout.setHgap(150);
							pnl_botonesLayout.setVgap(10);
							pnl_detalle_botones_eventos.add(pnl_botones);
							pnl_botones.setLayout(pnl_botonesLayout);
							{
								btn_crear_evento = new JButton();
								pnl_botones.add(btn_crear_evento);
								btn_crear_evento.setText("Crear Evento");
								btn_crear_evento.setPreferredSize(new java.awt.Dimension(150, 35));
								btn_crear_evento.setMinimumSize(new java.awt.Dimension(34,24));
								btn_crear_evento.setMaximumSize(new java.awt.Dimension(100,10));
								btn_crear_evento.setSize(150, 35);
							}
							{
								btn_eliminar_evento = new JButton();
								pnl_botones.add(btn_eliminar_evento);
								btn_eliminar_evento.setText("Eliminar Evento");
								btn_eliminar_evento.setPreferredSize(new java.awt.Dimension(150, 35));
								btn_eliminar_evento.setMinimumSize(new java.awt.Dimension(34,24));
								btn_eliminar_evento.setMaximumSize(new java.awt.Dimension(100,10));
								btn_eliminar_evento.setSize(150, 35);
							}
							{
								btn_modificar_evento = new JButton();
								pnl_botones.add(btn_modificar_evento);
								btn_modificar_evento.setText("Modificar Evento");
								btn_modificar_evento.setPreferredSize(new java.awt.Dimension(150, 35));
								btn_modificar_evento.setMinimumSize(new java.awt.Dimension(34,24));
								btn_modificar_evento.setMaximumSize(new java.awt.Dimension(100,10));
								btn_modificar_evento.setSize(150, 35);
							}
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
						pnl_evento_actividades.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
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
							pnl_lista_actividades.setBorder(BorderFactory
								.createTitledBorder("Actividades"));
							pnl_lista_actividades
								.setPreferredSize(new java.awt.Dimension(
									225,
									288));
							{
								ListModel jList1Model = new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
								ListModel lst_actividadesModel = new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
								lst_actividades = new JList();
								pnl_lista_actividades.add(
									lst_actividades,
									BorderLayout.CENTER);
								lst_actividades.setModel(lst_actividadesModel);
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
							FlowLayout jPanel4Layout = new FlowLayout();
							jPanel4Layout.setHgap(150);
							jPanel4Layout.setVgap(10);
							jPanel4Layout.setAlignOnBaseline(true);
							pnl_detalles_botones_actividades.add(pnl_botones_actividades);
							pnl_botones_actividades.setLayout(jPanel4Layout);
							{
								btn_crear_actividad = new JButton();
								pnl_botones_actividades.add(btn_crear_actividad);
								btn_crear_actividad.setText("Crear Evento");
								btn_crear_actividad.setMinimumSize(new java.awt.Dimension(
									34,
									24));
								btn_crear_actividad.setMaximumSize(new java.awt.Dimension(
									100,
									10));
								btn_crear_actividad
									.setPreferredSize(new java.awt.Dimension(
										150,
										35));
								btn_crear_actividad.setSize(150, 35);
							}
							{
								btn_eliminar_actividad = new JButton();
								pnl_botones_actividades.add(btn_eliminar_actividad);
								btn_eliminar_actividad.setText("Eliminar Evento");
								btn_eliminar_actividad.setMinimumSize(new java.awt.Dimension(
									34,
									24));
								btn_eliminar_actividad.setMaximumSize(new java.awt.Dimension(
									100,
									10));
								btn_eliminar_actividad
									.setPreferredSize(new java.awt.Dimension(
										150,
										35));
								btn_eliminar_actividad.setSize(150, 35);
							}
							{
								btn_modificar_actividad = new JButton();
								pnl_botones_actividades.add(btn_modificar_actividad);
								btn_modificar_actividad.setText("Modificar Evento");
								btn_modificar_actividad.setMinimumSize(new java.awt.Dimension(
									34,
									24));
								btn_modificar_actividad.setMaximumSize(new java.awt.Dimension(
									100,
									10));
								btn_modificar_actividad
									.setPreferredSize(new java.awt.Dimension(
										150,
										35));
								btn_modificar_actividad.setSize(150, 35);
							}
							{
								btn_asignar_recursos = new JButton();
								pnl_botones_actividades.add(btn_asignar_recursos);
								btn_asignar_recursos.setText("Asignar Recursos");
								btn_asignar_recursos.setMinimumSize(new java.awt.Dimension(
									34,
									24));
								btn_asignar_recursos.setMaximumSize(new java.awt.Dimension(
									100,
									10));
								btn_asignar_recursos
									.setPreferredSize(new java.awt.Dimension(
										150,
										35));
								btn_asignar_recursos.setSize(150, 35);
							}
						}
					}
				}
				{
					pnl_auspiciantes = new JPanel();
					pestaña_principal.addTab("Auspiciantes", null, pnl_auspiciantes, null);
				}
			}
			pack();
			this.setSize(473, 444);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
