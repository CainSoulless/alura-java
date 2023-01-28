package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejemplo2 {
    public static void main(String[] args) {
        String curso1 = "Historia";
        String curso2 = "Geometria";
        String curso3 = "Fisima";
        String curso4 = "Quimica";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        // System.out.println(cursos);

        // Collections.sort(cursos);
        // System.out.println(cursos);

        // Collections.sort(cursos, Collections.reverseOrder());
        // System.out.println(cursos);

        cursos.sort(Comparator.reverseOrder());
        System.out.println(cursos);
        
    } 
}
