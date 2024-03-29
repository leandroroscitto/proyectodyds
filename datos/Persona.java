package datos;

import java.io.Serializable;

public class Persona implements Serializable {
	//private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String Nombre;

	private String Apellido;

	private String DNI;

	private String Email;

	public Persona(String N, String A, String D, String E) {

		Nombre = N;
		Apellido = A;
		DNI = D;
		Email = E;
	}
	

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dni) {
		DNI = dni;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
