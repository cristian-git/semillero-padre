package com.hbt.semillero.Enum;

public enum TipoVehiculoEnum {
	TERRESTRE("Terrestre",1),
	ACUATICO("Acuatico",2),
	AEREO("Aereo",3);

	private String tipo;
	private int identificador;

	TipoVehiculoEnum(String tipo, int identificador) {
		this.tipo = tipo;
		this.identificador = identificador;
	}

	public String getTipo() {
		return tipo;
	}

	public int getIdentificador() {
		return identificador;
	}
	
	
}
