package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(22, 33);
        cc1.deposita((300));

        Cuenta cc2 = new CuentaCorriente(22, 44);
        cc2.deposita((400));

        Cuenta cc3 = new CuentaCorriente(22, 55);
        cc3.deposita((50));

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc3);
        lista.add(cc1);
        lista.add(cc2);

        System.out.println("Antes de ordenado");
        printSaldos(lista);

        System.out.println("Despues de ordenado");
        // Estas dos lineas se puede optimizar
        // Comparator<Cuenta> comparator = new OrdenaNumeroCuenta();
        // lista.sort(comparator);
        // lista.sort(new OrdenaNumeroCuenta());
        // printSaldos(lista);


        // En versiones mas antiguas se podria hacer de la siguiente
        // forma:
        // Comparator<Cuenta> comparatorNombreTitular = new OrdenaNombreTitular();
        // lista.sort(comparatorNombreTitular);

        // Clase anonima
        lista.sort(new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta c1, Cuenta c2) {
                return Integer.compare(c1.getNumero(), c2.getNumero());
            }
        });
        Collections.sort(lista, new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta c1, Cuenta c2) {
                return c1.getTitular().getNombre()
                    .compareTo(c2.getTitular().getNombre());
            }
        });
        printSaldos(lista);

        Collections.sort(lista);
        System.out.println("Despues de ordenar por orden natural");
        printSaldos(lista);
    }    
    public static void printSaldos(List<Cuenta> list) {
        for (Cuenta cuenta : list) {
            System.out.println(cuenta); 
        }
    }
}