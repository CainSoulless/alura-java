package br.com.alura.model;

public class Aula {
    private String nombre;
    private int horas;

    public Aula(String nombre) {
        this.nombre = nombre;
    }

    public Aula(String nombre, int horas) {
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
        return this.nombre;
    }
}
