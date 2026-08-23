
package com.mycompany.ejercicioprimerojava;

public class Estudiante {
    String nombre;
    int edad;
    Carrera carrera;
    
    //constructores
    public Estudiante(String nombre, int edad, Carrera carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("carrera: " + carrera.nombre);
    }    
}
