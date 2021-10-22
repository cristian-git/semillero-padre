package com.hbt.semillero.entidad;


import com.hbt.semillero.Enum.EstadoEnum;
import com.hbt.semillero.Enum.TematicaEnum;
import com.hbt.semillero.Enum.TipoVehiculoEnum;
import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "COMIC")
public class Comic implements Serializable {

    private static  final long serialVersionUID= 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "COMIC_SCID_GENERATOR",sequenceName = "SEQ_COMIC")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="COMIC_SCID_GENERATOR")
    @Column(name = "SCID")
    private Long id ;

    @Column(name = "SCNOMBRE")
    private String nombre;

    @Column(name = "SCEDITORIAL")
    private String editorial;

    @Column(name = "SCTEMATICA")
    @Enumerated(value = EnumType.STRING)
    private TematicaEnum tematicaEnum;

    @Column(name = "SCCOLECCION")
    private String coleccion;

    @Column(name = "SCNUMEROPAGINAS")
    private Integer numeroPaginas;

    @Column(name = "SCPRECIO")
    private BigDecimal precio;

    @Column(name = "SCAUTORES")
    private String autores;

    @Column(name = "SCCOLOR")
    private Boolean color;

    @Column(name = "SCFECHA_VENTA")
    private LocalDate fechaVenta;

    @Column(name = "SCESTADO")
    @Enumerated(value = EnumType.STRING)
    private EstadoEnum estado;

    @Column(name = "SCCANTIDAD")
    private Integer cantidad;


    public EstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }

    public TematicaEnum getTematicaEnum() {
        return tematicaEnum;
    }

    public Comic() {
    }

    public Comic(EstadoEnum estado) {
        this.estado = estado;
    }

    public void setTematicaEnum(TematicaEnum tematicaEnum) {
        this.tematicaEnum = tematicaEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Boolean getColor() {
        return color;
    }

    public void setColor(Boolean color) {
        this.color = color;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


}
