package unlam.edu.ar.pb2;

public class Usuario {

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Integer dni;
	private String nombre;
	
	public Usuario(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	
	
}
