package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {
    private List<Oportunidad> oportunidades;

    public Vendedor(String nombre, String telefono) {
        super(nombre, telefono);
        oportunidades = new ArrayList<>();
    }

    public List<Oportunidad> getLeads() {
        return oportunidades;
    }

    public void agregarOportunidad(Oportunidad oportunidad){
        oportunidades.add(oportunidad);
    }

    public void eliminarOportunidad(Oportunidad oportunidad){
        oportunidades.remove(oportunidad);
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("%20s%20s" , nombre,telefono);
    }

    public void mostrarDatosConOportunidades() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vendedor: " + nombre + " - Telefono: " + telefono);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Cantidad de Oportunidades generadas: " + oportunidades.size());
        Oportunidad.mostrarDatosTitulos();
        for (Oportunidad l: oportunidades) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            l.mostrarDatos();
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
