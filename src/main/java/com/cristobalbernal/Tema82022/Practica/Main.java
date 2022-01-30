package com.cristobalbernal.Tema82022.Practica;

public class Main {
    public static void main(String[] args) {
        Personas personas = new Personas("Pepe",19,"Española");
        System.out.println(personas.getNombre());
        personas.setNombre("Mario");
        System.out.println(personas.getNombre());
    }
}
