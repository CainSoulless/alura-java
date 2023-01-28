package br.com.alura;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private int horas;

    public Curso(String nombre, int horas, ArrayList arrayList) {
        this.nombre = nombre;
        this.horas = horas;
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
    @Override
    public String toString() {
        return this.nombre + this.horas;
    }
}
