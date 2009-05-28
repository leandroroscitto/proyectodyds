package base_datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Archivo {

	// < OPERACIONES DE MANEJO DE ARCHIVOS >

	private Datos dat;

	Archivo() {
	}

	public void setDatos(Datos d){
		dat=d;
	}
	
	public Datos getDatos(){
		return dat;
	}

	public void AbrirLista() {
		File file;
		ObjectInputStream obj;

		try {
			file = new File("Archivos/Datos.dat");
			obj = new ObjectInputStream(new FileInputStream(file));
			dat = (Datos) obj.readObject();
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO: Si no encuentra el archivo, lo crea e inicializa todas las listas.
			JOptionPane.showMessageDialog(null, "No se encontró el archivo");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"No se pudo accceder al archivo");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"Error interno (Clase no encontrada)");
		}
	}

	/**
	 * 
	 */
	public void GuardarLista() {
		ObjectOutputStream obj;
		try {
			obj = new ObjectOutputStream(new FileOutputStream(
					"Archivos/Datos.dat"));
			obj.writeObject(dat);
			obj.close();

		}

		catch (FileNotFoundException e) {
			// mostrar dialogos con el mensaje de error
		} catch (IOException e) {

		}
	}

}
