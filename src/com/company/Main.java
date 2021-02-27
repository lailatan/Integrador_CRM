package com.company;

import java.time.LocalDate;

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

        Vendedor vendedor1=new Vendedor("Martin", "12121212");
        vendedor1.agregarLead(new Lead("Inicial",cliente1,servicioTV.getElementos().get(1),
                true, LocalDate.now(),200.0));
        vendedor1.agregarLead(new Lead("Inicial",cliente2,servicioTV.getElementos().get(3),
                false, LocalDate.now(),null));

        servicioTV.agragarVendedor(vendedor1);

        vendedor1.mostrarDatosConLeads();
    }
}
