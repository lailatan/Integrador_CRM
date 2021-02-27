package com.company;

public class Tecnico extends Persona{

    public Tecnico(String nombre, String telefono) {
        super(nombre, telefono);
    }

    @Override
    public void mostrarDatos()  {
        System.out.printf("%20s" , nombre);
    }

}
