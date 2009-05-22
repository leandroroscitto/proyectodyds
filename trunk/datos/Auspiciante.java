package datos;

public class Auspiciante extends Elemento_Serializable{

	private int ID;
	private String Nombre;
	private String Telefono;
	
	public Auspiciante(int i, String n, String t){
		ID = i;
		Nombre = n;
		Telefono = t;
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

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
}
