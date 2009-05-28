package datos;

import java.util.ArrayList;

public class Evento extends Elemento_Serializable {

	private int ID;
	private String Nombre;
	private String Organizador;

	// LISTA DE ACTIVIDADES ASOCIADAS
	private ArrayList Lista_Act_Asociadas;

	public Evento(int i, String n, String p) {
		ID = i;
		Nombre = n;
		Organizador = p;
		Lista_Act_Asociadas = new ArrayList();
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

}
