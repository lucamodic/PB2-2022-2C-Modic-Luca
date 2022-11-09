package unlam.edu.ar.pb2;
import java.util.ArrayList;
import java.util.TreeSet;

public class Alarma {

	
	private ArrayList <Usuario> usuariosValidos;
	private ArrayList <Accion> acciones;
	private Integer id;
	private String codigoDeActivacion;
	private String codigoDeConfiguracion;
	private String nombre;
	private ArrayList <Sensor> sensores;
	private ArrayList <Accion> accionesRealizadas;

	public Alarma(Integer id, String codigoDeActivacion, String codigoDeConfiguracion, String nombre) {
		this.id = id;
		this.codigoDeActivacion = codigoDeActivacion;
		this.codigoDeConfiguracion = codigoDeConfiguracion;
		this.nombre = nombre;
		this.usuariosValidos =  new ArrayList <Usuario>();
		this.acciones = new ArrayList <Accion>();
		this.sensores = new ArrayList <Sensor>();
		this.accionesRealizadas = new ArrayList<Accion>();
	}

	public ArrayList<Usuario> getUsuariosValidos() {
		return usuariosValidos;
	}

	public void setUsuariosValidos(ArrayList<Usuario> usuariosValidos) {
		this.usuariosValidos = usuariosValidos;
	}

	public ArrayList<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(ArrayList<Accion> acciones) {
		this.acciones = acciones;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoDeActivacion() {
		return codigoDeActivacion;
	}

	public void setCodigoDeActivacion(String codigoDeActivacion) {
		this.codigoDeActivacion = codigoDeActivacion;
	}

	public String getCodigoDeConfiguracion() {
		return codigoDeConfiguracion;
	}

	public void setCodigoDeConfiguracion(String codigoDeConfiguracion) {
		this.codigoDeConfiguracion = codigoDeConfiguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

	public ArrayList<Accion> getAccionesRealizadas() {
		return accionesRealizadas;
	}

	public void setAccionesRealizadas(ArrayList<Accion> accionesRealizadas) {
		this.accionesRealizadas = accionesRealizadas;
	}
	
	
}
