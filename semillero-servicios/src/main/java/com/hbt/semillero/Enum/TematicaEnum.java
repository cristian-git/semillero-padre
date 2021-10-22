package com.hbt.semillero.Enum;

public enum TematicaEnum {
	AVENTURAS("enum.tematica.aventuras"),
	BELICO("enum.tematica.belico"),
	DEPORTIVO("enum.tematica.deportivo"),
	FANTASTICO("enum.tematica.fantastico"),
	CIENCIA_FICCION("enum.tematica.cienciaficcion"),
	HISTORICO("enum.tematica.historico"),
	HORROR("enum.tematica.horror");

	/**
	 * Atributo que contiene la clave del mensaje para la internacionalizacion
	 */
	private String codigoMensaje;

	/**
	 * Constructor que recibe como parametro el codigo del mensaje
	 *
	 * @param codigoMensaje, Clave del mensaje para para internacionalizacion
	 */
	TematicaEnum(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	/**
	 * Metodo que retorna el valor del atributo
	 *
	 * @return cadena con el codigo del mensaje
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}

}
