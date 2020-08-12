package telefonica;
import java.util.HashMap; // import the HashMap class
import java.util.Scanner;

public class Telefono extends AgendaTelefonica{
	
    static HashMap<String, String> agenda = new HashMap<String, String>();
    static Scanner nuevotelefono = new Scanner(System.in);
    static AgendaTelefonica nuevousuario;
    static int eleccion;
    static String nombre, telefono, buscar_nombre, eliminar_nombre;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			
			System.out.println("Escoge una opción: " +
					"\n 1. Agregar contacto " +
				    "\n 2. Buscar contacto" +
				    "\n 3. Eliminar contacto" +
				    "\n 4. Eliminar agenda" +
				    "\n 5. Salir" );
					
					eleccion = nuevotelefono.nextInt();
					nuevotelefono.nextLine();
					
					if(eleccion == 1) {
						AgregarTelefono();
					}
					if(eleccion == 2) {
						BuscarTelefono();
					}
					if(eleccion == 3) {
						EliminarTelefono();
					}
					if(eleccion == 4) {
						EliminarAgenda();
					}
					
					
					
		}
		while(eleccion != 5);


	}
	
	public static  void AgregarTelefono(){
		int llave, i;
		do {
            System.out.println("Cuantos numeros vamos a registrar: ");
            llave = nuevotelefono.nextInt();
            nuevotelefono.nextLine(); //limpiar el intro
			
		}
		while(llave < 0);
		
        for(i =1; i <= llave; i++){
            
            System.out.println("Ingresar nombre");
            nombre = nuevotelefono.nextLine();
    
            System.out.println("\n Ingresar Telefono");
            telefono = nuevotelefono.nextLine();
            nuevousuario = new AgendaTelefonica();
            nuevousuario.SetNombre(nombre);
            nuevousuario.SetTelefono(telefono);
            agenda.put(nuevousuario.GetNombre(),nuevousuario.GetTelefono());
	
	    }
	}
	
	public static void BuscarTelefono(){
        System.out.println("Buscar contacto: ");
        buscar_nombre = nuevotelefono.nextLine();
        System.out.println(agenda.get(buscar_nombre));
		
	}
	
	public static void EliminarTelefono(){
		System.out.println(agenda);
        System.out.println("Eliminar contacto: ");
        eliminar_nombre = nuevotelefono.nextLine();
        System.out.println(agenda.remove(eliminar_nombre));
        System.out.println(agenda);
		
	}
	
	public static void EliminarAgenda(){
		System.out.println(agenda);
        agenda.clear();
        System.out.println("La agenda se eliminó: ");
        System.out.println(agenda);
		
	}

}
