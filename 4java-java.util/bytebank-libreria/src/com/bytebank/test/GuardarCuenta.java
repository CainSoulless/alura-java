package com.bytebank.test;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.bytebank.modelo.Cuenta;

public class GuardarCuenta {
    Cuenta[] cuentas = new Cuenta[10];
    int indice = 0;

    public void adicionarCuenta(Cuenta cuenta) {
        cuentas[indice] = cuenta;
        indice++;
    }
    
    public void imprimirLista() {
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta); 
        }
    }

    public Cuenta obtener(int indice) {
        return this.cuentas[indice];
    }
}
