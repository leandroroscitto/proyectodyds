package datos;

public class Actividad extends Elemento_Serializable{
	
	private int ID;
	private String Nombre;
	private Persona Persona_a_cargo;

	public Actividad(int i, String n){
		ID = i;
		Nombre = n;		
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
}
