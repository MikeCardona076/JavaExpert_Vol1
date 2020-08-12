package telefonica;
import java.util.HashMap; // import the HashMap class
import java.util.Scanner;

public class Telefono extends AgendaTelefonica{
	
    static HashMap<String, String> agenda = new HashMap<String, String>();
    static Scanner nuevotelefono = new Scanner(System.in);
    static AgendaTelefonica nuevousuario;
    static String nombre, telefono;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void AgregarTelefono(){
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
   
            agenda.put("England", "London");
		
	}

}
