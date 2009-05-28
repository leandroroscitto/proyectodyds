package sys;

import datos.Evento;
import datos.Persona;
import base_datos.Archivo;
import base_datos.Archivo_Unico;
import base_datos.Datos;
import interfaces.Principal;

public class Sistema {

	//Parametros
	
	public static Datos D;
	
	public static void main(String[] args) {		
		
		Archivo A = Archivo_Unico.getArchivo();		
		A.AbrirLista();		
		
		D = A.getDatos();		
		
		
		
		Principal inst = new Principal();
		inst.setVisible(true);
		inst.setEnabled(true);		
	}

}
