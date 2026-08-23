/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioprimerojava;

/**
 *
 * @author marlo
 */
public class EjercicioPrimeroJava {

    public static void main(String[] args) {
        Universidad universidad1 = new Universidad("Universidad industrial de colombia", "Floridablanca");
        Universidad universidad2 = new Universidad("Universitaria Tecnologica de Santander", "Bucaramanga");
        Carrera carrera1 = new Carrera("Ingenieria de sistemas", 2, universidad1);
        Carrera carrera2 = new Carrera("Biologia", 3, universidad2);
        Estudiante estudiante1 = new Estudiante("Marlon Jaimes", 27, carrera1);
        Estudiante estudiante2 = new Estudiante("Johan", 19, carrera2);
        //carrera carrera1 = new carrera("Ingenieria de sistemas", 2, universidad1);
        //Universidad universidad2 = 
        
        /*estudiante1.nombre = "Marlon Jaimes";
        estudiante1.edad = 27; */
        
        estudiante1.mostrar();
        estudiante2.mostrar();
        
        //carrera1.mostrar();
        
    }
}
