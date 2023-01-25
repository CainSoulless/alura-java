package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;

public class TestGuardarObjeto {
    public static void main(String[] args) {
        GuardarObjetos listaObjetos = new GuardarObjetos();
        String nombre = "Rodrigo";
        CuentaAhorros ca = new CuentaAhorros(2, 5);
        
        listaObjetos.adicionarObjeto(nombre);
        listaObjetos.adicionarObjeto(ca);
        listaObjetos.imprimirLista();
    } 
}
