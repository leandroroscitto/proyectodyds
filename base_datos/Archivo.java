package base_datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import datos.Evento;

public class Archivo {

	// < OPERACIONES DE MANEJO DE ARCHIVOS >

	private Datos dat;

	Archivo() {
	}

	public void setDatos(Datos d) {
		dat = d;
	}

	public Datos getDatos() {
		return dat;
	}

	public boolean AbrirLista() {
		File file;
		ObjectInputStream obj;

		try {
			file = new File("Datos.dat");
			obj = new ObjectInputStream(new FileInputStream(file));
			dat = (Datos) obj.readObject();
			obj.close();
		} catch (FileNotFoundException e) {
			return CrearArchivo();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"No se pudo accceder al archivo");
			return false;
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"Error interno (Clase no encontrada)");
			return false;
		}
		return true;
	}

	private boolean CrearArchivo() {
		File file;

		file = new File("Datos.dat");
		if (!file.exists()) {
			try {
				file.createNewFile();
				InicializarDatos();
				GuardarLista();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null,
						"No se pudo crear el archivo");
				return false;
			}
		}
		return true;
	}

	private void InicializarDatos() {
		dat = new Datos();

		Evento evt = new Evento("Sin Evento", "", new Date("2009/01/01"),
				new Date("2900/01/01"), new ArrayList());
		dat.lista_eventos.add(evt);
	}

	/**
	 * 
	 */
	public void GuardarLista() {
		ObjectOutputStream obj;
		try {
			obj = new ObjectOutputStream(new FileOutputStream(
					"Datos.dat"));
			obj.writeObject(dat);
			obj.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se encontró el archivo");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se pudo acceder a el archivo");
		}
	}

}
