package com.maven.proyecto.entidades.Impl;

import com.maven.proyecto.entidades.Entrenador;
import java.util.Scanner;

public class EntrenadorImpl extends Persona implements Entrenador {

    int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public Entrenador crearEntrenador(Scanner scanner) {

        System.out.println("\nIngresar nombre del entrenador");
        System.out.println("\n---------------------------------");
        this.setNombre(scanner.nextLine());
        System.out.println("\nIngresar apellido del entrenador");
        this.setApellido(scanner.nextLine());
        System.out.println("\nIngresar edad del entrenador");
        this.edad = Integer.parseInt(scanner.nextLine());
        return this;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + super.getNombre() + ',' + "apellido=" + super.getApellido() + ',' + "edad="
                + this.edad + '}';
    }

}
