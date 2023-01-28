package br.com.alura;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import br.com.alura.model.Curso;

public class Ejemplo5 {
    private static final String List = null;

    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia", 31);
        Curso curso2 = new Curso("Fisica", 40);
        Curso curso3 = new Curso("Algebra", 50);
        Curso curso4 = new Curso("Lenguaje", 10);
        Curso curso5 = new Curso("Musica", 30);
        Curso curso6 = new Curso("Historial", 30);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);

        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).collect(Collectors.toList());
    }
}
