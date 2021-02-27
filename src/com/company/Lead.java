package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lead {
    private String estado;
    private Cliente contacto;
    private Elemento elementoOfrecido;
    private Boolean aceptaSeguimiento;
    private LocalDate fechaPrimerContacto;
    private Double precioReferencia;

    public Lead(String estado, Cliente contacto, Elemento elementoOfrecido, Boolean aceptaSeguimiento, LocalDate fechaPrimerContacto, Double precioReferencia) {
        this.estado = estado;
        this.contacto = contacto;
        this.elementoOfrecido = elementoOfrecido;
        this.aceptaSeguimiento = aceptaSeguimiento;
        this.fechaPrimerContacto = fechaPrimerContacto;
        this.precioReferencia = precioReferencia;
    }


    public String getEstado() {
        return estado;
    }

    public Elemento getElementoOfrecido() {
        return elementoOfrecido;
    }

    public Boolean getAceptaSeguimiento() {
        return aceptaSeguimiento;
    }

    public LocalDate getFechaPrimerContacto() {
        return fechaPrimerContacto;
    }

    public Double getPrecioReferencia() {
        return precioReferencia;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void mostrarDatosTitulos() {
        System.out.printf("%20s" , "Estado");
        Cliente.mostrarDatosTitulo();
        System.out.printf("%20s%12s%12s%10s" , "Elemento","Seguimiento",
                "Fecha", "Referencia");
        System.out.println();
    }

    public void mostrarDatos() {
        System.out.printf("%20s" ,estado);
        contacto.mostrarDatos();
        System.out.printf("%20s%12s%12s%10s" , elementoOfrecido.getNombre(),(aceptaSeguimiento==true)?"Si":"No",
                fechaPrimerContacto.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                (precioReferencia==null)?"No":precioReferencia.toString());
    }
}
