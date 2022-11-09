package unlam.edu.ar.pb2;

public class AlarmaNoRegistrada extends Exception {

	private String mensaje;
	
	public AlarmaNoRegistrada(String mensaje){
		this.mensaje = mensaje;
	}
	
}
