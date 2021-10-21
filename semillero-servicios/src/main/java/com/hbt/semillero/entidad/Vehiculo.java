package com.hbt.semillero.entidad;

import java.math.BigDecimal;

import com.hbt.semillero.Enum.TipoVehiculoEnum;

public class Vehiculo {

	private String color;
	private TipoVehiculoEnum TipoVehivulo;
	private int numeroLlantas;
	private int numeroAsientos;
	private boolean requiereLicencia;
	private BigDecimal precio;
	
	
	
	public Vehiculo(){
		//Constructor Vacio
	}
	
	public Vehiculo(String color, int precio) {
		super();
		this.color = color;
		this.precio = new BigDecimal(precio)  ;
	}


	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public TipoVehiculoEnum getTipoVehivulo() {
		return TipoVehivulo;
	}

	public void setTipoVehivulo(TipoVehiculoEnum tipoVehivulo) {
		TipoVehivulo = tipoVehivulo;
	}

	public int getNumeroLlantas() {
		return numeroLlantas;
	}
	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}
	public int getNumeroAsientos() {
		return numeroAsientos;
	}
	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}
	public boolean isRequiereLicencia() {
		return requiereLicencia;
	}
	public void setRequiereLicencia(boolean requiereLicencia) {
		this.requiereLicencia = requiereLicencia;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", TipoVehivulo=" + TipoVehivulo + ", numeroLlantas=" + numeroLlantas
				+ ", numeroAsientos=" + numeroAsientos + ", requiereLicencia=" + requiereLicencia + ", precio=" + precio
				+ "]";
	}
	 
}
