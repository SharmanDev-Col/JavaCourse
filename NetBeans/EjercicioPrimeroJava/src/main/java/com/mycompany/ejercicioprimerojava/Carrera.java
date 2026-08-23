/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioprimerojava;

/**
 *
 * @author marlo
 */
public class Carrera {
    String nombre;
    int semestre;
    Universidad universidad;
    
    //constructor
    public Carrera(String nombre, int semestre,Universidad universidad){
        this.nombre = nombre;
        this.semestre = semestre;
        this.universidad = universidad;
    }
    
    public void mostrar(){
        System.out.println("nombre: " + nombre);
        System.out.println("semestre;: " + semestre);
        System.out.println("Universidad: " + universidad.nombre);
    }
    
}
