package br.com.alura.model;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ejemplo5 {
    public static void main(String[] args) {
        for (List<Integer> lista : listas) {
            final String nombreImplementado = lista.getClass().getSimpleName();            

            //add
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                lista.add(i);
            }
            long fin = System.currentTimeMillis();
            long duracion = fin - inicio;
            System.out.println(nombreImplementado + " add: " + duracion);

            //get
            inicio = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                lista.get(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombreImplementado + " get: " + duracion);

            //remove
            inicio = System.currentTimeMillis();
            for (int i = 99999; i > 100000; i--){
                lista.remove(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombreImplementado + " remove: " + duracion);
        }   
    }

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());

        }
    };
    
}
