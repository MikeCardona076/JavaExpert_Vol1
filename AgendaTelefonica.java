package telefonica;

public class AgendaTelefonica {
	private String nombre;
	private String telefono;
	
	//CONSTRUCTOR 
	public AgendaTelefonica(){
		nombre = "Miguel";
		telefono = "762199652";
	}
	
	//..............................................................//
	
	//SETTERS 
	public void SetNombre(String setNombre) {
		this.nombre = setNombre;
	}
	
	public void SetTelefono(String setTelefono) {
		this.telefono = setTelefono;
	}
	
	//..............................................................//
	
	//GETTERS 
	
	public String GetNombre() {
		return nombre;
	}
	
	public String GetTelefono() {
		return telefono;
	}




}
