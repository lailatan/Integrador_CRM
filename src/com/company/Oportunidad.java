package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Oportunidad {
    private String estado;
    private Cliente contacto;
    private List<Item> itemsOfrecidos;
    private Boolean aceptaSeguimiento;
    private LocalDate fechaPrimerContacto;
    private Double precioReferencia;

    public Oportunidad(String estado, Cliente contacto, List<Item> itemsOfrecidos, Boolean aceptaSeguimiento, LocalDate fechaPrimerContacto, Double precioReferencia) {
        this.estado = estado;
        this.contacto = contacto;
        this.itemsOfrecidos = itemsOfrecidos;
        this.aceptaSeguimiento = aceptaSeguimiento;
        this.fechaPrimerContacto = fechaPrimerContacto;
        this.precioReferencia = precioReferencia;
    }


    public String getEstado() {
        return estado;
    }

    public List<Item> getElementosOfrecidos() {
        return itemsOfrecidos;
    }

    public void agregarItemOfrecido(Item item){
        Item itemExistente=buscarItemenlaOportunidad(item);
        if (itemExistente!=null) itemExistente.agregarCantidad(item.getCantidad());
        else this.itemsOfrecidos.add(item);
    }

    private Item buscarItemenlaOportunidad(Item item) {
        for (Item i:itemsOfrecidos){
        if (i.getElemento().equals(item.getElemento())) return i;
    }
        return null;
}

    public void eliminarItemOfrecido(Item item) {
        this.itemsOfrecidos.remove(item);
    }

    public void modificarItemOfrecido(Item item,Integer cantidad) {
        item.setCantidad(cantidad);
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
        System.out.printf("%-12s%-12s%-11s%-10s%-20s" , "Seguimiento","Fecha", "Referencia","Cantidad","Elemento");
        System.out.println();
    }

    public void mostrarDatos() {
        Boolean primerItem = true;
        System.out.printf("%-20s" ,estado);
        contacto.mostrarDatos();
        System.out.printf("%-12s%-12s%-11s" , (aceptaSeguimiento==true)?"Si":"No",
                fechaPrimerContacto.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                (precioReferencia==null)?"No":precioReferencia.toString());
        for (Item i:itemsOfrecidos) {
            if (primerItem) {
                System.out.printf("%-10d%-20s", i.getCantidad(), i.getElemento().getNombre());
                primerItem=false;
            } else
                System.out.println();
                System.out.printf("%-135s%-10d%-20s", "", i.getCantidad(), i.getElemento().getNombre());
        }


    }
}
