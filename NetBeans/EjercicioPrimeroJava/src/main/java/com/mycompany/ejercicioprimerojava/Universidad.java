/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioprimerojava;

/**
 *
 * @author marlo
 */
public class Universidad {
    String nombre;
    String ciudad;
    
    //constructor
    public Universidad(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
        
    }
    
    public void mostrar(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Ciudad: " + ciudad);
            
    }
    
}
