package com.hbt.semillero.interfaces;

import com.hbt.semillero.Enum.TipoVehiculoEnum;

public interface AccionesVehiculoInterface {
	
	public  int obtenerVelocidadMaxima();
	
	public  Long obtenerPesoMaximoCarga();
	
	public  boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEnum) throws Exception;
	
	public default void acelerar(){
		System.out.print("El vehiculo ha acelerado");
			
	}
}
