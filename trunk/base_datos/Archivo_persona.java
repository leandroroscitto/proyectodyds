package base_datos;

import java.util.ArrayList;

import datos.Persona;

public class Archivo_persona extends Archivo{
	
	
	public Archivo_persona(){
		Nombre = "Personas";		
	}
	
	public void insertarPersona(Persona p){
		super.insertarElemento(p);
	}
	
	public Persona recuperar_persona(int clave){
		return (Persona)(super.recuperarElemento(clave));		
	}
	
	public ArrayList obtenerListaPersonas(){
		return super.obtenerLista();
	}

}
