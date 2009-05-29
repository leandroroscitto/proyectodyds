package base_datos;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import datos.Actividad;
import datos.Auspiciante;
import datos.Persona;
import datos.Evento;
import datos.Relaciones.Auspicio;

public class Principal_prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Datos D = new Datos();
		
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
		
		Auspiciante a1 = new Auspiciante(1,"Asupiciante 1","111111");
		Auspiciante a2 = new Auspiciante(2,"Asupiciante 2","222222");
		Auspiciante a3 = new Auspiciante(3,"Asupiciante 3","333333");
		Auspiciante a4 = new Auspiciante(4,"Asupiciante 4","444444");
		Auspiciante a5 = new Auspiciante(5,"Asupiciante 5","555555");
		Auspiciante a6 = new Auspiciante(6,"Asupiciante 6","666666");
		Auspiciante a7 = new Auspiciante(7,"Asupiciante 7","777777");
		Auspiciante a8 = new Auspiciante(8,"Asupiciante 8","888888");
		Auspiciante a9 = new Auspiciante(9,"Asupiciante 9","999999");

		D.lista_personas.add(p1);
		D.lista_personas.add(p2);
		D.lista_personas.add(p3);
		D.lista_personas.add(p4);
		D.lista_personas.add(p5);
		
		D.lista_auspiciantes.add(a1);
		D.lista_auspiciantes.add(a2);
		D.lista_auspiciantes.add(a3);
		D.lista_auspiciantes.add(a4);
		D.lista_auspiciantes.add(a5);
		D.lista_auspiciantes.add(a6);
		D.lista_auspiciantes.add(a7);
		D.lista_auspiciantes.add(a8);
		D.lista_auspiciantes.add(a9);

		Evento e1 = new Evento(1, "Nombre 1", "Organizador 1");
		Evento e2 = new Evento(2, "Nombre 2", "Organizador 2");
		Evento e3 = new Evento(3, "Nombre 3", "Organizador 3");
		Evento e4 = new Evento(4, "Nombre 4", "Organizador 4");
		Evento e5 = new Evento(5, "Nombre 5", "Organizador 5");
		
		D.lista_eventos.add(e1);
		D.lista_eventos.add(e2);
		D.lista_eventos.add(e3);
		D.lista_eventos.add(e4);
		D.lista_eventos.add(e5);
		
		Actividad act1 = new Actividad(0,"Act 1",p1,e2,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act2 = new Actividad(1,"Act 2",p2,e2,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act3 = new Actividad(2,"Act 3",p3,e3,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act4 = new Actividad(3,"Act 4",p4,e4,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act5 = new Actividad(4,"Act 5",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		
		Actividad act6 = new Actividad(4,"Act 6",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act7 = new Actividad(4,"Act 7",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act8 = new Actividad(4,"Act 8",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act9 = new Actividad(4,"Act 9",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act10 = new Actividad(4,"Act 10",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act11 = new Actividad(4,"Act 11",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act12= new Actividad(4,"Act 12",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act13= new Actividad(4,"Act 12",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act14= new Actividad(4,"Act 12",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act15= new Actividad(4,"Act 12",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act16= new Actividad(4,"Act 12",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act17= new Actividad(4,"Act 12",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act18= new Actividad(4,"Act 12",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		Actividad act19= new Actividad(4,"Act 12",p5,e5,new Date(2009,10,23),new Date(2009,10,24));
		
		D.lista_actividades.add(act1);
		D.lista_actividades.add(act2);
		D.lista_actividades.add(act3);
		D.lista_actividades.add(act4);
		D.lista_actividades.add(act5);
		
		act1.agregarResp(p2);
		
		//D = new Datos();

		// Closign
		A.setDatos(D);
		A.GuardarLista();
		// ---

		// Open
		A.AbrirLista();
		D = A.getDatos();
		// ---
		
		int i;
		
		for (i = 0; i < D.lista_auspiciantes.size(); i++) {
			System.out.println(((Auspiciante) D.lista_auspiciantes.get(i)).getNombre());
		}

	}
}
