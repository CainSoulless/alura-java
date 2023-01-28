package br.com.alura;
import br.com.modelo.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejemplo3 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 10, new ArrayList<>());
        curso1.addClase(new Clase("ArrayList"));
        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos);
    } 
}
