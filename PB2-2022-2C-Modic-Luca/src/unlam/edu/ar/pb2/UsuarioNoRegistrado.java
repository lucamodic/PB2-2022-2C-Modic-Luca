package unlam.edu.ar.pb2;

public class UsuarioNoRegistrado extends Exception {

	private String mensaje;
	
	public UsuarioNoRegistrado(String mensaje){
		this.mensaje = mensaje;
	}
	
}
