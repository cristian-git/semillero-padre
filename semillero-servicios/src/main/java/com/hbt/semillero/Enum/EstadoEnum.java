package com.hbt.semillero.Enum;

/**
 * <b>Descripción:<b> tipos de estado aceptados por un comic
 *
 * @author Cristian Quiñones
 * @version
 */
public enum EstadoEnum {

    ACTIVO("activo",1),
    INACTIVO("inactivo",2);

    /**
     * Atributo que contiene la clave del mensaje para la internacionalizacion
     */
    private String codigoMensaje;
    private int identificador;
    /**
     * Constructor que recibe como parametro el codigo del mensaje
     *
     * @param codigoMensaje, Clave del mensaje para para internacionalizacion
     */

    private EstadoEnum(String codigoMensaje, int identificador) {
        this.codigoMensaje = codigoMensaje;
        this.identificador = identificador;
    }
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    public int getIdentificador() {
        return identificador;
    }

}
