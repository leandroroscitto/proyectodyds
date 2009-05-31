package sys;

import interfaces.Principal;
import base_datos.Archivo;
import base_datos.Archivo_Unico;
import base_datos.Datos;
import datos.Evento;

public class Sistema {

	// Parametros

	public static Datos D;
	private static Archivo A = Archivo_Unico.getArchivo();

	public static void main(String[] args) {
		if (A.AbrirLista()) {
			D = A.getDatos();
			Principal inst = new Principal();
			inst.setVisible(true);
			inst.setEnabled(true);
			MostrarTodosEventos();
		}
	}

	public static void MostrarTodosEventos()
	{
		int cant = D.lista_eventos.size();
		for (int i = 0; i < cant; i++)
		{
			System.out.println(((Evento) D.lista_eventos.get(i)).getNombre());
		}
	}
	// Guarda los datos
	public static void GuardarDatos() {
		A.setDatos(D);
		A.GuardarLista();
	}

}
