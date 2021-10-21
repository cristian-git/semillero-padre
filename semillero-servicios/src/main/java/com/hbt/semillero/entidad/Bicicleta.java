package com.hbt.semillero.entidad;

import com.hbt.semillero.Enum.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

public class Bicicleta extends Vehiculo implements AccionesVehiculoInterface {
	private String tipoBicicleta;
	private Boolean usoChalecoReflector;
	
	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Long obtenerPesoMaximoCarga() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEnum) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	public Boolean getUsoChalecoReflector() {
		return usoChalecoReflector;
	}
	public void setUsoChalecoReflector(Boolean usoChalecoReflector) {
		this.usoChalecoReflector = usoChalecoReflector;
	}
	
	

}
