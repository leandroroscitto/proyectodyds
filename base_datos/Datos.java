package base_datos;

import java.util.ArrayList;

import java.io.*;

import javax.swing.JOptionPane;

import datos.Elemento_Serializable;

public class Datos implements Serializable {

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
