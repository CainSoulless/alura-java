package br.com.alura;
import br.com.alura.model.Curso;
import br.com.alura.model.Aula;
import java.util.ArrayList;

public class Ejemplo3 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 10);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getAulaList());
    } 
}
