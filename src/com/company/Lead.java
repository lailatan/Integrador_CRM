package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lead {
    private String estado;
    private Cliente contacto;
    private Item itemOfrecido;
    private Boolean aceptaSeguimiento;
    private LocalDate fechaPrimerContacto;
    private Double precioReferencia;

    public Lead(String estado, Cliente contacto, Item itemOfrecido, Boolean aceptaSeguimiento, LocalDate fechaPrimerContacto, Double precioReferencia) {
        this.estado = estado;
        this.contacto = contacto;
        this.itemOfrecido = itemOfrecido;
        this.aceptaSeguimiento = aceptaSeguimiento;
        this.fechaPrimerContacto = fechaPrimerContacto;
        this.precioReferencia = precioReferencia;
    }


    public String getEstado() {
        return estado;
    }

    public Item getElementoOfrecido() {
        return itemOfrecido;
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
        System.out.printf("%-20s" , "Estado");
        Cliente.mostrarDatosTitulo();
        System.out.printf("%-10s%-20s%-12s%-12s%-10s" , "Cantidad","Item","Seguimiento",
                "Fecha", "Referencia");
        System.out.println();
    }

    public void mostrarDatos() {
        System.out.printf("%-20s" ,estado);
        contacto.mostrarDatos();
        System.out.printf("%-10d%-20s%-12s%-12s%-10s" , itemOfrecido.getCantidad(),itemOfrecido.getElemento().getNombre(),
                (aceptaSeguimiento==true)?"Si":"No",
                fechaPrimerContacto.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                (precioReferencia==null)?"No":precioReferencia.toString());
    }
}
