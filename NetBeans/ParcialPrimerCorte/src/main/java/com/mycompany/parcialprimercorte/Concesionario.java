/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialprimercorte;

/**
 *
 * @author marlo
 */
public class Concesionario {
    private String nombre;
    private String ciudad;
    private int numeroSedes;
    
    public Concesionario (String nombre, String ciudad, int numeroSedes){
    
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nombre de consesionario no puede estar vacio");
        }
        
        if (ciudad == null || ciudad.trim().isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo ciudad de consesionario no puede estar vacio");
        }
        
        if (numeroSedes <= 0){
            throw new IllegalArgumentException("Error, el numero de sesdes no puede ser menor a 0");
        }
        
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroSedes = numeroSedes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }
    
    public void mostrarConcesionario(){
    
    System.out.println("nombre del concesionario: " + getNombre());
    System.out.println("ciudad del concesionario: " + getCiudad());
    System.out.println("numero de sedes del concesionario: " + getNumeroSedes());

    }
}
