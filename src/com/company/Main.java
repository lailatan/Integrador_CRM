package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
CRM para la gestión de ventas en una empresa

Se requiere un sistema que permita registrar una oportunidad de negocio.
En cada oportunidad se debe anotar el nombre de la empresa, el nombre del contacto, su cargo, el producto o servicio ofrecido
y si acepta una llamada de seguimiento. Además, registrar fecha de contacto inicial y
si se le brindó un precio de referencia y en ese caso, indicar monto. Debe registrar un estado.

Notas: El sistema va a tener muchos vendedores.
Cada vendedor debería tener muchas oportunidades de negocio.

 */
public class Main {

    public static void main(String[] args) {

        Negocio servicioTV = new Negocio();

        Cliente cliente1 = new Cliente("Jose Perez","33333333","SportMax","Gerente de Compras");
        Cliente cliente2 = new Cliente("Maria Perez","55555333","Imagine SA","Analista Compras");
        Cliente cliente3 = new Cliente("Adrian Sosa","21234366","Imagine SA","Gerente Marketing");

        Vendedor vendedor1=new Vendedor("Martin", "12121212");
        List<Item> items = new ArrayList<>();
        items.add(new Item(2,servicioTV.getElementos().get(1)));

        vendedor1.agregarOportunidad(new Oportunidad("Inicial",cliente1,items,
                true, LocalDate.now(),200.0));

        List<Item> items2 = new ArrayList<>();
        items2.add(new Item(3,servicioTV.getElementos().get(1)));
        items2.add(new Item(3,servicioTV.getElementos().get(3)));
        vendedor1.agregarOportunidad(new Oportunidad("Inicial",cliente2,items2,
                false, LocalDate.now(),null));

        List<Item> items3 = new ArrayList<>();
        items3.add(new Item(1,servicioTV.getElementos().get(0)));
        items3.add(new Item(2,servicioTV.getElementos().get(1)));
        items3.add(new Item(3,servicioTV.getElementos().get(2)));
        vendedor1.agregarOportunidad(new Oportunidad("Inicial",cliente3,items3,
                true, LocalDate.now(),150.0));

        servicioTV.agragarVendedor(vendedor1);

        vendedor1.mostrarDatosConOportunidades();
    }
}
