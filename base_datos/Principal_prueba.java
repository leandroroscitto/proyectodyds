package base_datos;

import datos.Persona;
import datos.Evento;

public class Principal_prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p1 = new Persona(1,"Pepe","Gonzales","35669785","pepe@gmail.com");
		Persona p2 = new Persona(2,"Carlos","Perez","23467412","carlos@gmail.com");
		Persona p3 = new Persona(3,"Juan","Gutierrez","12456789","juan@gmail.com");
		Persona p4 = new Persona(4,"Luis","Martinez","32654987","luis@gmail.com");
		Persona p5 = new Persona(5,"Pancho","Lopez","34612879","pancho@gmail.com");
		
		Archivo_persona arch_personas = new Archivo_persona();
		
		arch_personas.insertarPersona(p1);
		arch_personas.insertarPersona(p2);
		arch_personas.insertarPersona(p3);
		arch_personas.insertarPersona(p4);
		arch_personas.insertarPersona(p5);
		
		arch_personas.GuardarLista();		
		
		
		Evento e1 = new Evento(1,"Nombre 1",p1);
		Evento e2 = new Evento(2,"Nombre 2",p2);
		Evento e3 = new Evento(3,"Nombre 3",p3);
		Evento e4 = new Evento(4,"Nombre 4",p4);
		Evento e5 = new Evento(5,"Nombre 5",p5);
		
		Archivo_Evento arch_eventos = new Archivo_Evento();
		
		arch_eventos.insertarEvento(e1);
		arch_eventos.insertarEvento(e2);
		arch_eventos.insertarEvento(e3);
		arch_eventos.insertarEvento(e4);
		arch_eventos.insertarEvento(e5);
		
		arch_eventos.GuardarLista();
		
		arch_eventos.AbrirLista();
		Evento p = arch_eventos.primerEvento();
		
		while (p != null){
			System.out.print(p.getNombre());
			System.out.println();
			p = arch_eventos.siguienteEvento();
			
		}
		
		
		

	}
}
