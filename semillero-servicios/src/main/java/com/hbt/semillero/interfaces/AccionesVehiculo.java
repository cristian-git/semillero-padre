package com.hbt.semillero.interfaces;

import com.hbt.semillero.Enum.TipoVehiculoEnum;

public abstract class AccionesVehiculo {
	
	public abstract int obtenerVelocidadMaxima();
	
	public abstract Long obtenerPesoMaximoCarga();
	
	public abstract boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEnum) throws Exception;
	
	public void acelerar(){
		System.out.print("El vehiculo ha acelerado");
			
	}

}
