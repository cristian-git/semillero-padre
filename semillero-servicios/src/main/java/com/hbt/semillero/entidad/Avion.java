package com.hbt.semillero.entidad;

import com.hbt.semillero.Enum.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculo;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

public class Avion extends Vehiculo implements AccionesVehiculoInterface{

	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 700;
	}

	@Override
	public Long obtenerPesoMaximoCarga() {
		// TODO Auto-generated method stub
		return 50L;
	}

	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEnum) throws Exception {
		// TODO Auto-generated method stub
		if (getTipoVehivulo().getIdentificador() == (tipoVehiculoEnum.getIdentificador())) {
			System.out.print("El vehiculo si es del mismo tipo");
			return true;
		} else {
			throw new Exception("El tipo de vehiculo asignado es erroneo, debe ser AEREO");
		}
	}

}
