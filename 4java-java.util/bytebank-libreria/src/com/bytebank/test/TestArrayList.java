package com.bytebank.test;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.Cuenta;

public class TestArrayList {
    public static void main(String[] args) {
        /* List<Cuenta> es usado en vez de LinkedList<Cuenta>
         * porque List es una interfez mas generica, y en caso
         * de que la estrucuta de datos deba ser cambiada a futuro,
         * no sera afectada mas lineas de codigos mas que la siguiente:
         */
        List<Cuenta> lista = new LinkedList<>(); 
        Cuenta cc = new CuentaCorriente(1, 3);
        Cuenta cc2 = new CuentaCorriente(0, 4);

        lista.add(cc);
        lista.add(cc2);
        
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta); 
        }

        // Comparacion hecha por referencia
        if (lista.contains(cc)) {
            System.out.println("Si");
        }
    }
}
