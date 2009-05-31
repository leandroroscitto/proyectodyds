package datos;

import java.io.Serializable;

public class Caracter_Participacion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String Nombre;
	
	public Caracter_Participacion(int i, String n){
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

}
