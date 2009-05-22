package datos.Relaciones;

import datos.Elemento_Serializable;

public class Responsable_Evento extends Elemento_Serializable{
	
	private int Evento_id;
	private int Persona_id;
	
	public Responsable_Evento(int e_id, int p_id){
		Evento_id = e_id;
		Persona_id = p_id;
	}

	public int getEvento_id() {
		return Evento_id;
	}

	public void setEvento_id(int evento_id) {
		Evento_id = evento_id;
	}

	public int getPersona_id() {
		return Persona_id;
	}

	public void setPersona_id(int persona_id) {
		Persona_id = persona_id;
	}

}
