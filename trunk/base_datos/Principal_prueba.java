package base_datos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import datos.Persona;
import datos.Evento;

public class Principal_prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Datos D = new Datos();
		D.lista_personas = new ArrayList();
		D.lista_eventos = new ArrayList();

		Archivo A = Archivo_Unico.getArchivo();

		Persona p1 = new Persona(1, "Pepe", "Gonzales", "35669785",
				"pepe@gmail.com");
		Persona p2 = new Persona(2, "Carlos", "Perez", "23467412",
				"carlos@gmail.com");
		Persona p3 = new Persona(3, "Juan", "Gutierrez", "12456789",
				"juan@gmail.com");
		Persona p4 = new Persona(4, "Luis", "Martinez", "32654987",
				"luis@gmail.com");
		Persona p5 = new Persona(5, "Pancho", "Lopez", "34612879",
				"pancho@gmail.com");

		D.lista_personas.add(p1);
		D.lista_personas.add(p2);
		D.lista_personas.add(p3);
		D.lista_personas.add(p4);
		D.lista_personas.add(p5);

		Evento e1 = new Evento(1, "Nombre 1", p1);
		Evento e2 = new Evento(2, "Nombre 2", p2);
		Evento e3 = new Evento(3, "Nombre 3", p3);
		Evento e4 = new Evento(4, "Nombre 4", p4);
		Evento e5 = new Evento(5, "Nombre 5", p5);

		D.lista_eventos.add(e1);
		D.lista_eventos.add(e2);
		D.lista_eventos.add(e3);
		D.lista_eventos.add(e4);
		D.lista_eventos.add(e5);

		//Closign
		A.setDatos(D);
		A.GuardarLista();
		//---

		//Open
		A.AbrirLista();
		D = A.getDatos();
		//---
		
		int i;

		System.out.println(((Evento)(D.lista_eventos.get(0))).getOrganizador().getApellido());
		for (i = 0; i < D.lista_personas.size(); i++) {
			System.out.println(((Persona) D.lista_personas.get(i)).getNombre());
		}

	}
}
