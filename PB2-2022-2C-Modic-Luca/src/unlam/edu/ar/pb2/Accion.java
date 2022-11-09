package unlam.edu.ar.pb2;

public class Accion {

	private Integer id;
	private Alarma alarmaQueUsa;
	private Usuario usuarioQueUsa;
	private String fecha;
	private TipoDeOperacion operacion;
	
	public Accion(Integer id, Alarma alarmaQueUsa, Usuario usuarioQueUsa, String fecha, TipoDeOperacion operacion) {
		this.id = id;
		this.alarmaQueUsa = alarmaQueUsa;
		this.usuarioQueUsa = usuarioQueUsa;
		this.fecha = fecha;
		this.operacion = operacion;
	}
	
	
}
