package com.bytebank.test;
import java.util.ArrayList;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.Cuenta;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList(); 
        Cuenta cc = new CuentaCorriente(1, 3);
        Cuenta cc2 = new CuentaCorriente(0, 4);

        lista.add(cc);
        lista.add(cc2);
        
    }
}
