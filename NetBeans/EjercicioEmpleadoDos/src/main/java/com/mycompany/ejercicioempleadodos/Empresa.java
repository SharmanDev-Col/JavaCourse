/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioempleadodos;

/**
 *
 * @author marlo
 */
public class Empresa {
    //String nombre;
    //String nit;
    //String ciudad;
    private String nombre; 
    private String nit;
    private String ciudad;
    
    public Empresa(String nombre, String nit, String ciudad) {
        
        if (nombre == null || nombre.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nombre de empresa no puede estar vacio");
        }
        
        if (nit == null || nit.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nit de empresa no puede estar vacio");
        }
        
        if (ciudad == null || ciudad.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el el campo ciudad no puede estar vacio");
        }
        
        this.nombre = nombre;
        this.nit = nit;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
 
    
    public void mostrar(){
        System.out.println("nombre : " + getNombre());//renombrar a getNombre
        System.out.println("nit: " + getNit());
        System.out.println("ciudad: " + getCiudad());
    
    }
    
}
