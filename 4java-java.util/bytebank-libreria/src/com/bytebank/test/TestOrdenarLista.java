package com.bytebank.test;

import java.util.ArrayList;
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
        Comparator<Cuenta> comparator = new OrdenaNumeroCuenta();
        lista.sort(comparator);
        printSaldos(lista);

        Comparator<Cuenta> comparatorNombreTitular = new OrdenaNombreTitular();
        lista.sort(comparatorNombreTitular);
        printSaldos(lista);
    }    
    public static void printSaldos(List<Cuenta> list) {
        for (Cuenta cuenta : list) {
            System.out.println(cuenta); 
        }
    }
}

class OrdenaNumeroCuenta implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta c1, Cuenta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }

}
class OrdenaNombreTitular implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getTitular().getNombre()
            .compareTo(o2.getTitular().getNombre());
    }

}