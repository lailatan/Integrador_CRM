package com.company;

import java.util.ArrayList;
import java.util.List;

public class Negocio {
    private List<Vendedor> vendedores;
    private List<Elemento> elementos ;

    public Negocio() {
        this.vendedores = new ArrayList<>() ;
        inicializarElementos();
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void agragarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    private void inicializarElementos(){
        Tecnico tecnico1=new Tecnico("Adrián","11111111");
        Tecnico tecnico2=new Tecnico("Eduardo","22222222");

        elementos = new ArrayList<>();
        elementos.add(new Producto("BaseLed32","Base para TV Led 32' ",200.0 ));
        elementos.add(new Producto("BaseLed48","Base para TV Led 48' ",400.0 ));
        elementos.add(new Servicio("ColocacionLedPared","Colocación de TV Led en Pared",200.0,2,tecnico1));
        elementos.add(new Servicio("ColocacionLedTecho","Colocación de TV Led colgando del techo",300.0,2,tecnico2));
    }

}
