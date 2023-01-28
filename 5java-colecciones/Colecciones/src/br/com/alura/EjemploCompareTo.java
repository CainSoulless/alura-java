package br.com.alura;
import br.com.alura.model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.model.Curso;

public class EjemploCompareTo {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        Curso curso2 = new Curso("Javascript", 10);
        Curso curso3 = new Curso("Python", 40);
        Curso curso4 = new Curso("Go", 60);

        ArrayList<Curso> lista = new ArrayList<>();
        lista.add(curso1);
        lista.add(curso2);
        lista.add(curso3);
        lista.add(curso4);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Curso::getNombre));
    } 
}
