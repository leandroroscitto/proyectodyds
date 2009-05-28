package datos;

public class Evento extends Elemento_Serializable{
	
	private int ID;
	private String Nombre;
	private Persona Organizador; //Corregir por String	
	
	public Evento(int i, String n, Persona p){
		ID = i;
		Nombre = n;
		Organizador = p;
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

	public Persona getOrganizador() {
		return Organizador;
	}

	public void setOrganizador(Persona organizador) {
		Organizador = organizador;
	}

}
