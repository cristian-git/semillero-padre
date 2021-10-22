package com.hbt.semillero.rest;

import java.math.BigDecimal;

import com.hbt.semillero.Enum.TipoVehiculoEnum;
import com.hbt.semillero.entidad.Avion;
import com.hbt.semillero.entidad.Barco;
import com.hbt.semillero.entidad.Bicicleta;
import com.hbt.semillero.entidad.Vehiculo;

public class CreacionVehiculoRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo Vehi = new Vehiculo("Verde",200000);
		Vehi.setColor("red");
		Vehi.setNumeroAsientos(4);
		Vehi.setNumeroLlantas(4);
		Vehi.setPrecio(new BigDecimal(600000000));
		Vehi.setRequiereLicencia(true);
		Vehi.setTipoVehivulo(TipoVehiculoEnum.TERRESTRE);
		
		
		Barco barco1 = new Barco();
		barco1.setColor("naranja");
		barco1.setNumeroAsientos(45);
		barco1.setNumeroLlantas(0);
		barco1.setPrecio(new BigDecimal(900000000));
		barco1.setRequiereLicencia(true);
		barco1.setTipoVehivulo(TipoVehiculoEnum.ACUATICO);
		
		Bicicleta bici = new Bicicleta();
		
		Avion av = new Avion();
		
		av.setTipoVehivulo(TipoVehiculoEnum.AEREO);
		
		try {
			av.determinarTipoVehiculo(TipoVehiculoEnum.AEREO);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println(Vehi.toString());
		System.out.println(barco1.toString());
		System.out.println("Velocidad Barco : "+barco1.obtenerVelocidadMaxima());
		System.out.println("Velocidad Bicicleta : "+bici.obtenerVelocidadMaxima());
		barco1.acelerar();
		bici.acelerar();
	}



}
