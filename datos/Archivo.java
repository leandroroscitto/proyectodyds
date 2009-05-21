package datos;

import java.util.ArrayList;

import java.io.*;

public abstract class Archivo {
	
	private ArrayList lista;
	protected String Nombre;	

	
	public Archivo(){
		lista = new ArrayList();
	}
	//< OPERACIONES DE MANEJO DE ARCHIVOS >	
	
	protected void insertarElemento(Elemento_Serializable ele){
		lista.add(0, ele);
	}
	
	/**
	 * Recupera un Elemento de la lista partir de su clave.
	 * @param c entero, clave del elemento que se quiere devolver.
	 * @return boolean, rotorna el elemento en caso que lo encuentre y 
	 * null caso contrario
	 */
	public Elemento_Serializable recuperarElemento (int c)
	{
		int pos = 0;	
		boolean encontre;
		Elemento_Serializable u;		
		if (!this.lista.isEmpty()){
		    u = (Elemento_Serializable) this.lista.get(pos);
		    encontre = ( u.getClave() == c);		    
		    while ( (!encontre) && ((pos+1) < lista.size()) )	      		
		    {   	
		    	pos++;
		    	u = (Elemento_Serializable) this.lista.get(pos);
		    	encontre = ( u.getClave() == c); 
		    	
		    }
              		  
         if (encontre)
        	 return u;
        	 else return null;
		}
		else return null;
        	 
		    
	}	
	
	
	
	/**
     *Lee desde el archivo "Nombre.dat" la lista almacenada y 
     *la carga para ser utilizada.
     */
	
    public void AbrirLista(){
      File file;    
      ObjectInputStream obj;
     
     try {     
      file = new File(Nombre+".dat");   
      obj = new ObjectInputStream(new FileInputStream(file));
      lista = (ArrayList)obj.readObject();
      obj.close();
     }
     catch(FileNotFoundException e){
    
     }
     catch(IOException e){
         
     }
     catch(ClassNotFoundException e){
         
     } 
    }
    
    
    
    /**
     *Guarda en el archivo "CLIENTES.dat" la lista de usuarios.
     **/
    public void GuardarLista(){
      ObjectOutputStream obj;      
    try {      	   	
           obj=new ObjectOutputStream(new FileOutputStream(Nombre+".dat"));
           obj.writeObject(lista);
           obj.close();      
     
    }
     
    catch(FileNotFoundException e){
     //mostrar dialogos con el mensaje de error   
    }
    catch(IOException e){
        
    }   
   }	
	
	

}
