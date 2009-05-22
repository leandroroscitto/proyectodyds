package datos.Relaciones;

import java.awt.Event;

import datos.Elemento_Serializable;

public class Auspicio extends Elemento_Serializable{

	private int Evento_id;
	private int Auspiciante_id;
	private String Tipo;
	private float Arancel;
	
	public Auspicio(int e_id, int a_id, String t, float a){
		Evento_id = e_id;
		Auspiciante_id = a_id;
		Tipo = t;
		Arancel = a;		
	}

	public float getArancel() {
		return Arancel;
	}

	public void setArancel(float arancel) {
		Arancel = arancel;
	}

	public int getAuspiciante_id() {
		return Auspiciante_id;
	}

	public void setAuspiciante_id(int auspiciante_id) {
		Auspiciante_id = auspiciante_id;
	}

	public int getEvento_id() {
		return Evento_id;
	}

	public void setEvento_id(int evento_id) {
		Evento_id = evento_id;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
}
