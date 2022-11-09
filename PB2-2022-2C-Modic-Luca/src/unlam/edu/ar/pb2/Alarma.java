package unlam.edu.ar.pb2;
import java.util.ArrayList;
import java.util.TreeSet;

public class Alarma {

	
	private TreeSet <Usuario> usuariosValidos;
	private TreeSet <Accion> acciones;
	private Integer id;
	private String codigoDeActivacion;
	private String codigoDeConfiguracion;
	private String nombre;
	private TreeSet <Sensor> sensores;
	private ArrayList <Accion> accionesRealizadas;

	public Alarma(Integer id, String codigoDeActivacion, String codigoDeConfiguracion, String nombre) {
		this.id = id;
		this.codigoDeActivacion = codigoDeActivacion;
		this.codigoDeConfiguracion = codigoDeConfiguracion;
		this.nombre = nombre;
		this.usuariosValidos =  new TreeSet <Usuario>();
		this.acciones = new TreeSet <Accion>();
		this.sensores = new TreeSet <Sensor>();
		this.accionesRealizadas = new ArrayList<Accion>();
	}


	
	
}
