package datos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import datos.Relaciones.Detalle_CP;

public class Actividad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String Nombre;
	private Persona Persona_a_cargo;
	private Evento EvtAsociado;
	private ArrayList Lista_CDPart_Aceptados;
	private ArrayList Lista_Responsables;
	private Date Fecha_Inicio;
	private Date Fecha_Fin;
	private boolean Acepta_Trabajos;
	private boolean Trabajos_Eval;
	private Date Fecha_Recep_Ini;
	private Date Fecha_Recep_Fin;
	private Date Fecha_Not_Autores;
	private Date Fecha_Version_Final;
	private Date Fecha_Acep_Final;

	public Actividad(int i, String n, Persona p, Evento e, Date fini, Date ffin) {
		ID = i;
		Nombre = n;
		Persona_a_cargo = p;
		EvtAsociado = e;
		EvtAsociado.asociar_Act(this);

		Fecha_Inicio = fini;
		Fecha_Fin = ffin;

		Lista_CDPart_Aceptados = new ArrayList();
		Lista_Responsables = new ArrayList();
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Persona getPersona_a_cargo() {
		return Persona_a_cargo;
	}

	public void setPersona_a_cargo(Persona persona_a_cargo) {
		Persona_a_cargo = persona_a_cargo;
	}

	public Evento getEvtAsociado() {
		return EvtAsociado;
	}

	public void setEvtAsociado(Evento evtAsociado) {
		// Primero desasocia la actividad del evento en la que estaba y la
		// asocia al nuevo.
		if (evtAsociado != EvtAsociado)
		{
		EvtAsociado.desasociar_Act(this);
		EvtAsociado = evtAsociado;
		EvtAsociado.asociar_Act(this);
		}
	}

	public Date getFecha_Inicio() {
		return Fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}

	public Date getFecha_Fin() {
		return Fecha_Fin;
	}

	public void setFecha_Fin(Date fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}

	public boolean isAcepta_Trabajos() {
		return Acepta_Trabajos;
	}

	public void setAcepta_Trabajos(boolean acepta_Trabajos) {
		Acepta_Trabajos = acepta_Trabajos;
	}

	public boolean isTrabajos_Eval() {
		return Trabajos_Eval;
	}

	public void setTrabajos_Eval(boolean trabajos_Eval) {
		Trabajos_Eval = trabajos_Eval;
	}

	public Date getFecha_Recep_Ini() {
		return Fecha_Recep_Ini;
	}

	public void setFecha_Recep_Ini(Date fecha_Recep_Ini) {
		Fecha_Recep_Ini = fecha_Recep_Ini;
	}

	public Date getFecha_Recep_Fin() {
		return Fecha_Recep_Fin;
	}

	public void setFecha_Recep_Fin(Date fecha_Recep_Fin) {
		Fecha_Recep_Fin = fecha_Recep_Fin;
	}

	public Date getFecha_Not_Autores() {
		return Fecha_Not_Autores;
	}

	public void setFecha_Not_Autores(Date fecha_Not_Autores) {
		Fecha_Not_Autores = fecha_Not_Autores;
	}

	public Date getFecha_Version_Final() {
		return Fecha_Version_Final;
	}

	public void setFecha_Version_Final(Date fecha_Version_Final) {
		Fecha_Version_Final = fecha_Version_Final;
	}

	public Date getFecha_Acep_Final() {
		return Fecha_Acep_Final;
	}

	public void setFecha_Acep_Final(Date fecha_Acep_Final) {
		Fecha_Acep_Final = fecha_Acep_Final;
	}

	public void agregarResp(Persona P) {
		Lista_Responsables.add(P);
	}

	public void quitarResp(Persona P) {
		Lista_Responsables.remove(P);
	}

	public Persona getResponsable(int i) {
		if (Lista_Responsables.size() > i) {
			return ((Persona) (Lista_Responsables.get(i)));
		} else {
			System.out
					.println("Fuera de rango en lista de personas responsables.");
			return null;
		}
	}

	public int cant_Responsables() {
		return Lista_Responsables.size();
	}
	
	public void limpiarResp(){
		Lista_Responsables.clear();
	}

	public void agregarDCarcPartAcep(Detalle_CP dcp) {
		Lista_CDPart_Aceptados.add(dcp);
		dcp.setAct(this);
	}
	
	public void quitarDCarcPartAcep(Detalle_CP dcp){
		Lista_CDPart_Aceptados.remove(dcp);
	}

	public Detalle_CP getDCarcPartAcep(int i) {
		if (Lista_CDPart_Aceptados.size() > i) {
			return ((Detalle_CP) (Lista_CDPart_Aceptados.get(i)));
		} else {
			System.out
					.println("Fuera de rango en lista de detalles de los caracters de participacion aceptados.");
			return null;
		}
	}

	public int cant_CarcPartAcep() {
		return Lista_CDPart_Aceptados.size();
	}
	
	public void limpiarCarcPartAcep(){
		Lista_CDPart_Aceptados.clear();
	}

}
