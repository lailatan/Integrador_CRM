package com.company;

public abstract class Persona {
    protected String nombre;
    protected String telefono;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarDatos();
}
