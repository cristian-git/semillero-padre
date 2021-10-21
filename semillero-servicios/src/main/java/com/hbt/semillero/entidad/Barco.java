package com.hbt.semillero.entidad;

import com.hbt.semillero.Enum.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

public class Barco extends Vehiculo implements AccionesVehiculoInterface{

	private String NombreCapitan;
	private String PuertoLlegada;
	
	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 400;
	}
	@Override
	public Long obtenerPesoMaximoCarga() {
		// TODO Auto-generated method stub
		return 1000L;
	}
	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEnum) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	public String getNombreCapitan() {
		return NombreCapitan;
	}
	public void setNombreCapitan(String nombreCapitan) {
		NombreCapitan = nombreCapitan;
	}
	public String getPuertoLlegada() {
		return PuertoLlegada;
	}
	public void setPuertoLlegada(String puertoLlegada) {
		PuertoLlegada = puertoLlegada;
	}
	
	
	
}
