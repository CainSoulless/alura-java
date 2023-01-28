package br.com.alura;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo6 {
    public static void main(String[] args) {
        String nombre1 = "Luis Miguel";
        String nombre2 = "Pepe Holgue";
        String nombre3 = "Juan Letu";
        String nombre4 = "Fernando Herrera";
        String nombre5 = "Franco Palillo";
        String nombre6 = "Ricardo Hernandez";

        Set<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(nombre1);
        listaAlumnos.add(nombre2);
        listaAlumnos.add(nombre3);
        listaAlumnos.add(nombre4);
        listaAlumnos.add(nombre5);
        listaAlumnos.add(nombre6);
            
        // for (String alumno: listaAlumnos) {
        //     System.out.println(alumno);
        // }
        boolean value = listaAlumnos.contains("Fernando Herrera");

        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(value);
        System.out.println(max);
        listaAlumnos.removeIf(alumno -> "Fernando Herrera".equalsIgnoreCase(alumno));
    }
}
