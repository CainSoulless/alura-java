package br.com.alura.model;

import java.util.ArrayList;

import java.util.List;
public class Ejemplo6 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 10, new ArrayList<>());
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));
        curso1.addAula(new Aula("Inmutable"));

        List<Aula> aulaList = curso1.getAulaList();
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        int tiempo = 0;
        for (Curso curso : cursos) {
            tiempo += curso.getHoras(); 
        }
        System.out.println(tiempo);
    } 
}
