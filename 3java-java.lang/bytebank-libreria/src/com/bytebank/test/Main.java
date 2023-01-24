package com.bytebank.test;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaCorriente(1, 9);
        cuenta.deposita(200);
        System.out.println(cuenta.getSaldo());
        
    }    
}