package com.bytebank.test;
import java.util.Arrays;
import com.bytebank.modelo.*;

public class GuardarObjetos {
    Object[] listaObjetos = new Object[10];
    int indice = 0;

    // public void adicionarObjeto(Object obj) {
    //     if (listaObjetos[10] == null) {
    //         listaObjetos = Arrays.copyOf(listaObjetos, listaObjetos.length + 1);
    //         listaObjetos[listaObjetos.length + 1] = obj;
    //     }
    // }

    public void adicionarObjeto(Object obj) {
        this.listaObjetos[indice] = obj;
        indice++;
    }

    public void imprimirLista() {
        for (Object object : listaObjetos) {
            System.out.println(object); 
        }
    }
}

