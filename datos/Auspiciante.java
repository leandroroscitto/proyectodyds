package datos;

import java.io.Serializable;

public class Auspiciante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
