package datos.Relaciones;

import java.awt.Event;
import java.io.Serializable;

import datos.Auspiciante;


public class Auspicio implements Serializable {
	
	private Auspiciante A;
	private String Tipo;
	private float Arancel;
	
	public Auspicio(Auspiciante aus, String t, float a){		
		A = aus;
		Tipo = t;
		Arancel = a;		
	}

	public float getArancel(){
		return Arancel;
	}

	public void setArancel(float arancel){
		Arancel = arancel;
	}

	public Auspiciante getAuspiciante() {
		return A;
	}

	public void setAuspiciante(Auspiciante aus) {
		A = aus;
	}
	

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
}
