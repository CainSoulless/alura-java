package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestGuardarCuenta {
    public static void main(String[] args) {
        GuardarCuenta listaCuentas = new GuardarCuenta();
        Cuenta cc = new CuentaCorriente(3,5);
        listaCuentas.adicionarCuenta(cc);
        System.out.println(listaCuentas.obtener(0));
    } 
}
