package datos;

import java.util.ArrayList;
import java.util.Date;

public class Evento extends Elemento_Serializable {

	private static int id_actual = 0;
	
	private int ID;
	private String Nombre;
	private String Organizador;
	private Date Fecha_Inicio;
	private Date Fecha_Fin;
	

	//LISTA DE RESPONSABLES ASOCIADA
	private ArrayList Lista_Resp_Asociadas;
	//LISTA DE AUSPICIOS ASOCIADA
	private ArrayList Lista_Ausp_Asociadas;
	// LISTA DE ACTIVIDADES ASOCIADAS
	private ArrayList Lista_Act_Asociadas;

	public Evento(String n, String p,Date f_ini , Date f_fin,ArrayList L) {
		ID = id_actual;
		Nombre = n;
		Organizador = p;
		Fecha_Inicio = f_ini;
		Fecha_Fin = f_fin;
		Lista_Act_Asociadas = new ArrayList();
		Lista_Resp_Asociadas = L;
		Lista_Ausp_Asociadas = new ArrayList();
		id_actual++;
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

	public String getOrganizador() {
		return Organizador;
	}

	public void setOrganizador(String organizador) {
		Organizador = organizador;
	}
	
	public void asociar_Act(Actividad A){
		Lista_Act_Asociadas.add(A);
	}
	
	public void desasociar_Act(Actividad A){
		Lista_Act_Asociadas.remove(A);
	}
	
	public Actividad get_Actividad(int i){
		if (Lista_Act_Asociadas.size()>i){
			return ((Actividad)(Lista_Act_Asociadas.get(i)));
		}else{
			System.out.println("Fuera de rango en lista de actividades asociadas.");
			return null;
		}
	}	
	
	public int cant_Acts_Asociadas(){
		return Lista_Act_Asociadas.size();
	}

	public Date getFecha_Fin() {
		return Fecha_Fin;
	}

	public void setFecha_Fin(Date fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}

	public Date getFecha_Inicio() {
		return Fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}

	public ArrayList getLista_Ausp_Asociadas() {
		return Lista_Ausp_Asociadas;
	}

	public void setLista_Ausp_Asociadas(ArrayList lista_Ausp_Asociadas) {
		Lista_Ausp_Asociadas = lista_Ausp_Asociadas;
	}

	public ArrayList getLista_Resp_Asociadas() {
		return Lista_Resp_Asociadas;
	}

	public void setLista_Resp_Asociadas(ArrayList lista_Resp_Asociadas) {
		Lista_Resp_Asociadas = lista_Resp_Asociadas;
	}

	public ArrayList getLista_Act_Asociadas() {
		return Lista_Act_Asociadas;
	}

	public void setLista_Act_Asociadas(ArrayList lista_Act_Asociadas) {
		Lista_Act_Asociadas = lista_Act_Asociadas;
	}

}
