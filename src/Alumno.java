
public class Alumno {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private String email;
	
	// CONSTRUCTOR
	public Alumno() 
	{
		
	}
	
	// CONSTRUCTOR CON PARAMETROS
	
	public Alumno(String _dni, String _nombre, String _apellidos, String _email) {
		
		this.dni = _dni;
		this.nombre = _nombre;
		this.apellidos = _apellidos;
		this.email = _email;
		
	}
	
	//Getter DNI
	public String getDni() {
		return this.dni;
	}
	
	//Setter DNI
	public void setDni(String _dni) {
		this.dni = _dni;
	}
	
	//Getter NOMBRE
	public String getNombre() {
		return this.nombre;
	}
	
	//Setter NOMBRE
	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}
	
	//Getter APELLIDOS
	public String getApellidos() {
		return this.apellidos;
	}
		
	//Setter APELLIDOS
	public void setApellidos(String _apellidos) {
		this.apellidos = _apellidos;
	}
	
	//Getter EMAIL
	public String getEmail() {
		return this.email;
	}
	
	//Setter EMAIL
	public void setEmail(String _email) {
		this.email = _email;
	}
}
