package unlam.edu.ar.pb2;

public class SensorDuplicadoException extends Exception {

	private String mensaje;
	
	public SensorDuplicadoException(String mensaje){
		this.mensaje = mensaje;
	}
	
}
