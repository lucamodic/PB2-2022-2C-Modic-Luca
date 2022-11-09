package unlam.edu.ar.pb2;

import java.util.ArrayList;

public class Administrador extends Usuario {
	
	public Administrador(Integer dni, String nombre) {
		super(dni, nombre);
	}
	
	public Boolean agregarAlarma(Alarma alarma, Central central) {
		central.getAlarmasRegistradas().add(alarma);
		return true;
	}

	public Boolean agregarUsuario(Usuario usuario, Central central) {
		central.getUsuarios().add(usuario);
		return true;
	}

	public void agregarUsuarioAUnaAlarma(int dniUsuarioAAgregar, int idAlarma, String codigoConfiguracionAlarma, Central central) throws AlarmaNoRegistrada,  UsuarioNoRegistrado, CodigoAlarmaIncorrectoException{
		central.buscarAlarma(idAlarma, codigoConfiguracionAlarma);
		central.registrarUsuarioEnAlarma(idAlarma, codigoConfiguracionAlarma, dniUsuarioAAgregar);
	}

	public Boolean agregarSensorALaAlarma(int idAlarma, Sensor sensor, String codigoActivacion, int idUsuarioConfigurador, Central central) throws AlarmaNoRegistrada, CodigoAlarmaIncorrectoException, SensorDuplicadoException {
		central.buscarAlarma(idAlarma, codigoActivacion);
		if(central.buscarUsuarioConfigurador(idUsuarioConfigurador)){
			if(!central.sensorEnAlarma(sensor, idAlarma, codigoActivacion)){
				central.agregarSensorAAlarma(sensor, idAlarma, codigoActivacion);
				return true;
			}
		};
		return false;
	}

}
