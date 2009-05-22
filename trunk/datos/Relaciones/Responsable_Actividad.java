package datos.Relaciones;

import datos.Elemento_Serializable;

public class Responsable_Actividad extends Elemento_Serializable{
	
	private int Actividad_id;
	private int Persona_id;
	
	public Responsable_Actividad(int a_id, int p_id){
		Actividad_id = a_id;
		Persona_id = p_id;
	}

	public int getActividad_id() {
		return Actividad_id;
	}

	public void setActividad_id(int actividad_id) {
		Actividad_id = actividad_id;
	}

	public int getPersona_id() {
		return Persona_id;
	}

	public void setPersona_id(int persona_id) {
		Persona_id = persona_id;
	}

}
