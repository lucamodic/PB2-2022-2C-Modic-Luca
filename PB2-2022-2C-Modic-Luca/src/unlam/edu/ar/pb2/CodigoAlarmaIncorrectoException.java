package unlam.edu.ar.pb2;

public class CodigoAlarmaIncorrectoException extends Exception {

private String mensaje;
	
	public CodigoAlarmaIncorrectoException(String mensaje){
		this.mensaje = mensaje;
	}
	
}
