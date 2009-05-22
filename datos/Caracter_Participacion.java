package datos;

public class Caracter_Participacion extends Elemento_Serializable{
	
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
