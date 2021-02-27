package com.company;

public class Cliente extends Persona {
    private String empresa;
    private String cargo;

    public Cliente(String nombre, String telefono, String empresa, String cargo) {
        super(nombre, telefono);
        this.empresa = empresa;
        this.cargo = cargo;
    }


    public String getEmpresa() {
        return empresa;
    }

    public String getCargo() {
        return cargo;
    }
    @Override
    public void mostrarDatos() {
        System.out.printf("%20s%20s%20s%20s" , nombre,empresa, cargo,telefono);
    }

    public static void mostrarDatosTitulo() {
        System.out.printf("%20s%20s%20s%20s" , "Nombre","Empresa", "Cargo","Telefono");
    }
}

