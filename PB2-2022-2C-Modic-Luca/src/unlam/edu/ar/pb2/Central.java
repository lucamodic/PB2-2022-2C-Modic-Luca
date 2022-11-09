package unlam.edu.ar.pb2;

import java.util.ArrayList;

public class Central {

	private String nombre;
	private ArrayList<Alarma> alarmasRegistradas;
	private ArrayList<Usuario> usuarios;
	
	public Central(String nombre) {
		this.nombre = nombre;
		this.alarmasRegistradas = new ArrayList<Alarma>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Alarma> getAlarmasRegistradas() {
		return alarmasRegistradas;
	}

	public void setAlarmasRegistradas(ArrayList<Alarma> alarmasRegistradas) {
		this.alarmasRegistradas = alarmasRegistradas;
	}

	public Boolean buscarAlarma(int idAlarma, String codigoConfiguracionAlarma) throws AlarmaNoRegistrada, CodigoAlarmaIncorrectoException {
		for(Alarma alarma : alarmasRegistradas){
			if (alarma.getId() == idAlarma){
				if(alarma.getCodigoDeConfiguracion().equals(codigoConfiguracionAlarma)){
					return true;
				}
				throw new CodigoAlarmaIncorrectoException("El codigo de la alarma es incorrecto");
			}	
		}
		throw new AlarmaNoRegistrada("La alarma no esta registrada");
	}

	public Boolean buscarUsuario(int dniUsuarioAAgregar) throws UsuarioNoRegistrado {
		for(Usuario usuario: usuarios){
			if (usuario.getDni() == dniUsuarioAAgregar){
				return true;
			}
		}
		throw new UsuarioNoRegistrado("No esta registrado el usuario");
	}
	
	public Usuario retornarUsuario(int dniUsuarioAAgregar) throws UsuarioNoRegistrado {
		for(Usuario usuario: usuarios){
			if (usuario.getDni() == dniUsuarioAAgregar){
				return usuario;
			}
		}
		throw new UsuarioNoRegistrado("No esta registrado el usuario");
	}

	public void registrarUsuarioEnAlarma(int idAlarma, String codigoConfiguracionAlarma, int dniUsuarioAAgregar) throws UsuarioNoRegistrado {
		for(Alarma alarma : alarmasRegistradas){
			if (alarma.getId() == idAlarma && alarma.getCodigoDeConfiguracion() == codigoConfiguracionAlarma){
				alarma.getUsuariosValidos().add(this.retornarUsuario(dniUsuarioAAgregar));	
			}
		}
	}

	public Boolean buscarUsuarioConfigurador(int idUsuarioConfigurador) {
		Configurador configurador = new Configurador(0, "0");
		for(Usuario usuario: usuarios){
			if (usuario.getDni() == idUsuarioConfigurador && usuario.getClass().equals(configurador.getClass())){
				return true;
			}
		}
		return false;
	}

	public void agregarSensorAAlarma(Sensor sensor, int idAlarma, String codigo) {
		for(Alarma alarma : alarmasRegistradas){
			if (alarma.getId() == idAlarma && alarma.getCodigoDeConfiguracion().equals(codigo)){
				alarma.getSensores().add(sensor);
			}
		}
		
	}

	public boolean sensorEnAlarma(Sensor sensor, int idAlarma, String codigoActivacion) throws SensorDuplicadoException {
	
		for(Alarma alarma : alarmasRegistradas){
			if (alarma.getId() == idAlarma && alarma.getCodigoDeConfiguracion().equals(codigoActivacion)){
				for(Sensor sensore : alarma.getSensores()){
					if(sensore.equals(sensor)){
						throw new SensorDuplicadoException("Sensor duplicado");
					}
				}
			}
		}
		return false;
	}
	
	public Alarma retornarAlarma(int idAlarma, String codigoConfiguracion) throws AlarmaNoRegistrada, CodigoAlarmaIncorrectoException {
			for(Alarma alarma : alarmasRegistradas){
				if (alarma.getId() == idAlarma){
					if(alarma.getCodigoDeConfiguracion().equals(codigoConfiguracion)){
						return alarma;
					}
					throw new CodigoAlarmaIncorrectoException("El codigo de la alarma es incorrecto");
				}	
			}
			throw new AlarmaNoRegistrada("La alarma no esta registrada");
		}

}
