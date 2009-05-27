package base_datos;

import java.util.ArrayList;

import datos.Evento;

public class Archivo_Evento extends Archivo{

		
	public Archivo_Evento(){
		Nombre = "Eventos";		
	}
	
	public Evento primerEvento(){
		return (Evento) super.primerElemento();
	}
	
	public Evento siguienteEvento(){
		return (Evento) super.siguienteElemento();
	}
	
	public void insertarEvento(Evento e){
		super.insertarElemento(e);
	}
	
	public Evento recuperar_Evento(int clave){
		return (Evento)(super.recuperarElemento(clave));		
	}
	
	public ArrayList obtenerListaEventos(){
		return super.obtenerLista();
	}
	
	public int cantidadEventos(){
		return cantElementos();
	}
}
