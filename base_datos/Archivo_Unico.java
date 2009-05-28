package base_datos;

public class Archivo_Unico {
	private static Archivo A = new Archivo();
	
	public static Archivo getArchivo(){
		return A;
	}
	
	private Archivo_Unico(){
		
	}
}
