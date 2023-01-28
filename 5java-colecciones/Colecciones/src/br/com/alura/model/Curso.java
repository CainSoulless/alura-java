package br.com.alura.model;

import java.util.Collections;
import java.util.List;

public class Curso {
    private String nombre;
    private int horas;
    private List<Aula> aulaList;

    public Curso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public Curso(String nombre, int horas, List<Aula> aulaList) {
        this.nombre = nombre;
        this.horas = horas;
        this.aulaList = aulaList;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList);
    }

    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public void addAula(Aula aula) {
        System.out.println(aula.toString());
        this.aulaList.add(aula);
    }

    @Override
    public String toString() {
        return this.nombre + this.horas;
    }
}
