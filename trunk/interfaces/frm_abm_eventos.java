package interfaces;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import sun.awt.WindowClosingListener;


import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.org.apache.bcel.internal.generic.LSTORE;
import com.toedter.calendar.JDateChooser;

import datos.Evento;
import datos.Persona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;



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
public class frm_abm_eventos extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
	private static final long serialVersionUID = 1L;
	private pnl_botones_ac pnl_botones_ac1;
	private pnl_atrib_evt pnl_atrib_evt1;
	private pnl_lista_auspicios pnl_lista_auspicios1;
	private pnl_lista_responsables pnl_lista_responsables1;
	
	private Evento evento_a_modificar = null;
	
	// Componentes
	private Principal Parent;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frm_abm_eventos inst = new frm_abm_eventos(null);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public frm_abm_eventos(Principal P) {
		super();
		Parent = P;
		initGUI();
	}

	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			this.setTitle("ABM Eventos");
			this.setPreferredSize(new java.awt.Dimension(495, 530));
			this.setMinimumSize(new java.awt.Dimension(495, 530));
			this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt){					
					Parent.setEnabled(true);
					Parent.requestFocus();
					limpiar_datos();	
					thisWindowClosing(evt);
				}
			});
			{
				pnl_botones_ac1 = new pnl_botones_ac();
				getContentPane().add(pnl_botones_ac1, new AnchorConstraint(850, 5, 5, 5, AnchorConstraint.ANCHOR_NONE, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				pnl_botones_ac1.setPreferredSize(new java.awt.Dimension(477, 51));
				pnl_botones_ac1.btn_cancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btn_cancelarActionPerformed(evt);
					}
				});
				pnl_botones_ac1.btn_acepta.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btn_aceptaActionPerformed(evt);
					}
				});
			}
			{
				pnl_atrib_evt1 = new pnl_atrib_evt();
				getContentPane().add(pnl_atrib_evt1, new AnchorConstraint(5, 5, 259, 5, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_NONE, AnchorConstraint.ANCHOR_ABS));
				pnl_atrib_evt1.setPreferredSize(new java.awt.Dimension(477, 116));
				pnl_atrib_evt1.dtc_fecha_ini_evt.setDateFormatString("dd-MM-yy");
				pnl_atrib_evt1.dtc_fecha_fin_evt.setDateFormatString("dd-MM-yy");
				pnl_atrib_evt1.dtc_fecha_ini_evt.setToolTipText("");
			}
			{
				pnl_lista_responsables1 = new pnl_lista_responsables(this);
				getContentPane().add(pnl_lista_responsables1, new AnchorConstraint(127, 5, 546, 5, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_ABS));
				pnl_lista_responsables1.setPreferredSize(new java.awt.Dimension(477, 172));
				pnl_lista_responsables1.setMinimumSize(new java.awt.Dimension(210, 224));
			}
			{
				pnl_lista_auspicios1 = new pnl_lista_auspicios();
				getContentPane().add(pnl_lista_auspicios1, new AnchorConstraint(568, 5, 62, 5, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				pnl_lista_auspicios1.setPreferredSize(new java.awt.Dimension(477, 175));
			}
			pack();
			
			this.setSize(495, 575);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void limpiar_datos(){
		pnl_atrib_evt1.txf_nombre_evt.setText("");
		pnl_atrib_evt1.txf_organizador_evt.setText("");
		pnl_atrib_evt1.dtc_fecha_ini_evt.setDate(null);
		pnl_atrib_evt1.dtc_fecha_fin_evt.setDate(null);
		pnl_lista_responsables1.lista_responsables = new ArrayList();
		pnl_lista_responsables1.mostrarLista();
		pnl_lista_auspicios1.lista_auspicios = new ArrayList();
		pnl_lista_auspicios1.mostrarLista();
	}
	
	//dado un evento, carga los datos en la interfaz para que el 
	//usuario pueda modificarlo
	public void modificarEvento(Evento e){
		pnl_atrib_evt1.txf_nombre_evt.setText(e.getNombre());
		pnl_atrib_evt1.txf_organizador_evt.setText(e.getOrganizador());
		pnl_atrib_evt1.dtc_fecha_ini_evt.setDate(e.getFecha_Inicio());
		pnl_atrib_evt1.dtc_fecha_fin_evt.setDate(e.getFecha_Fin());
		pnl_lista_responsables1.lista_responsables = e.getLista_Resp_Asociadas(); 
		pnl_lista_responsables1.mostrarLista();
		pnl_lista_auspicios1.lista_auspicios = e.getLista_Ausp_Asociadas();
		pnl_lista_auspicios1.mostrarLista();		
		evento_a_modificar = e;
	}
	
	
	
	
	
	private void thisWindowClosing(WindowEvent evt) {
		System.out.println("this.windowClosed, event="+evt);
		this.setVisible(false);
		Parent.setEnabled(true);
		Parent.requestFocus();
	}
	
	private void btn_aceptaActionPerformed(ActionEvent evt) {
		System.out.println("pnl_botones_ac1.btn_acepta.actionPerformed, event="+evt);
		
		if (pnl_atrib_evt1.txf_nombre_evt.getText().compareTo("") == 0){
			JOptionPane.showConfirmDialog(null,"Ingrese el nombre del Evento","Mensaje de Error", JOptionPane.CLOSED_OPTION);
		}else if (pnl_atrib_evt1.txf_organizador_evt.getText().compareTo("") == 0){
			  	  JOptionPane.showConfirmDialog(null,"Ingrese el organizador del Evento","Mensaje de Error", JOptionPane.CLOSED_OPTION);
			  }else{ 	
				  	Date d_actual = new Date();		
				  	Date d_ini = pnl_atrib_evt1.dtc_fecha_ini_evt.getDate();
				  	Date d_fin = pnl_atrib_evt1.dtc_fecha_fin_evt.getDate();		
				  	if (d_ini == null){
				  		JOptionPane.showConfirmDialog(null,"Fecha de Inicio del Evento Incorrecta","Mensaje de Error", JOptionPane.CLOSED_OPTION);		
				  	}else if(d_fin == null){
				  		     JOptionPane.showConfirmDialog(null,"Fecha de Finalizacion del Evento Incorrecta","Mensaje de Error", JOptionPane.CLOSED_OPTION);
				  		  }else if (d_ini.compareTo(d_fin) > 0){
							        JOptionPane.showConfirmDialog(null,"Fecha de inicio menor que la fecha de finalizacion","Mensaje de Error", JOptionPane.CLOSED_OPTION );
				  		  		}else if (pnl_lista_responsables1.lista_responsables.isEmpty()){
				  		  				JOptionPane.showConfirmDialog(null,"Debe ingresar al menos un responsable","Mensaje de Error", JOptionPane.CLOSED_OPTION);
				  		  		      }else{ 	    
				  		  		    	  if (evento_a_modificar == null){
				  		  		    		  evento_a_modificar = new Evento(pnl_atrib_evt1.txf_nombre_evt.getText(),pnl_atrib_evt1.txf_organizador_evt.getText(),d_ini, d_fin,pnl_lista_responsables1.lista_responsables);
     			  		  		    		  evento_a_modificar.setLista_Ausp_Asociadas(pnl_lista_auspicios1.lista_auspicios);
     			  		  		    		  sys.Sistema.D.lista_eventos.add(evento_a_modificar);
         			  		  		    	  JOptionPane.showConfirmDialog(null,"El Evento fue creado exitosamente","Mensaje de Exito", JOptionPane.CLOSED_OPTION);
				  		  		    	  }else{
				  		  		    		  evento_a_modificar.setNombre(pnl_atrib_evt1.txf_nombre_evt.getText());
				  		  		    		  evento_a_modificar.setOrganizador(pnl_atrib_evt1.txf_organizador_evt.getText());
				  		  		    		  evento_a_modificar.setFecha_Inicio(d_ini);
				  		  		    		  evento_a_modificar.setFecha_Fin(d_fin);
				  		  		    		  evento_a_modificar.setLista_Resp_Asociadas(pnl_lista_responsables1.lista_responsables);
				  		  		    		  evento_a_modificar.setLista_Ausp_Asociadas(pnl_lista_auspicios1.lista_auspicios);
    				  		  		    	  JOptionPane.showConfirmDialog(null,"El Evento fue modificado exitosamente","Mensaje de Exito", JOptionPane.CLOSED_OPTION);
				  		  		    	  }		  		  		    	  
				  		  		    	  
				  		  		    	  
				  		  		    	  Parent.ActualizarCampos();				  		  		    	  
				  		  		    	  this.setVisible(false);
				  		  		    	  Parent.setEnabled(true);
				  		  		    	  Parent.requestFocus();
				  		  		    	  limpiar_datos();
				  		  		      }
				  		  		}
	}
	
	private void btn_cancelarActionPerformed(ActionEvent evt) {
		System.out.println("pnl_botones_ac1.btn_cancelar.actionPerformed, event="+evt);
		this.setVisible(false);		
		Parent.setEnabled(true);
		Parent.requestFocus();
		limpiar_datos();	
	}
}
