package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {
    private List<Lead> leads;

    public Vendedor(String nombre, String telefono) {
        super(nombre, telefono);
        leads = new ArrayList<>();
    }

    public List<Lead> getLeads() {
        return leads;
    }

    public void agregarLead(Lead lead){
        leads.add(lead);
    }

    public void eliminarLead(Lead lead){
        leads.remove(lead);
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("%20s%20s" , nombre,telefono);
    }

    public void mostrarDatosConLeads() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vendedor: " + nombre + " - Telefono: " + telefono);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Cantidad de Oportunidades generadas: " + leads.size());
        Lead.mostrarDatosTitulos();
        for (Lead l:leads) {
            l.mostrarDatos();
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
