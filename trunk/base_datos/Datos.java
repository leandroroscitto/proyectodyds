package base_datos;

import java.io.Serializable;
import java.util.ArrayList;

public class Datos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArrayList lista_personas;

	public ArrayList lista_eventos;

	public ArrayList lista_auspiciantes;

	public ArrayList lista_actividades;

	public ArrayList lista_caracter_participacion;

	public Datos() {
		lista_actividades= new ArrayList();
		lista_auspiciantes= new ArrayList();
		lista_caracter_participacion= new ArrayList();
		lista_eventos= new ArrayList();
		lista_personas= new ArrayList();
	}

}
