package datos;

public class Archivo_persona extends Archivo{
	
	
	public Archivo_persona(){
		Nombre = "Persona";		
	}
	
	public void inserterPersona(Persona p){
		super.insertarElemento(p);
	}
	
	public Persona recuperar_persona(int clave){
		return (Persona)(super.recuperarElemento(clave));
		
	}
	
	public static void main(String[] args) {
		Persona p1 = new Persona(1,"Pepe","Gonzales","35669785","pepe@gmail.com");
		Persona p2 = new Persona(2,"Carlos","Perez","23467412","carlos@gmail.com");
		Persona p3 = new Persona(3,"Juan","Gutierrez","12456789","juan@gmail.com");
		Persona p4 = new Persona(4,"Luis","Martinez","32654987","luis@gmail.com");
		Persona p5 = new Persona(5,"Pancho","Lopez","34612879","pancho@gmail.com");
		
		Archivo_persona arch_personas = new Archivo_persona();
		
		arch_personas.inserterPersona(p1);
		arch_personas.inserterPersona(p2);
		arch_personas.inserterPersona(p3);
		arch_personas.inserterPersona(p4);
		arch_personas.inserterPersona(p5);
		
		arch_personas.GuardarLista();
		
		arch_personas.AbrirLista();
		
		Persona p = arch_personas.recuperar_persona(2);
		
		System.out.print(p.getApellido());
		
		
		
		
		

	}

}
