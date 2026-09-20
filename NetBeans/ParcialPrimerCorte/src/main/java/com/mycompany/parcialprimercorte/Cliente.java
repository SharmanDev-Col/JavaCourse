/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialprimercorte;

/**
 *
 * @author marlo
 */
public class Cliente {
    private String nombre;
    private String documento;
    private int edad;
    private Vehiculo vehiculo;
    
    public Cliente (String nombre, String documento, int edad, Vehiculo vehiculo){
    
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nombre del cliente no puede estar vacio");
        }
        
        if (documento== null || documento.trim().isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo documento del cliente no puede estar vacio");
        }
        
        if (edad < 18){
            throw new IllegalArgumentException(
            "Error, la edad del cliente debe ser mayor de 18 años");
        }
        
        if (vehiculo == null){
            throw new IllegalArgumentException("Error, debes elegir un vehiculo para el cliente");
        }
        
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void mostrarCliente(){
    
        System.out.println("nombre del cliente: " + getNombre());
        System.out.println("documento del cliente: " + getDocumento());
        System.out.println("edad del cliente: " + getEdad());
        System.out.println("vehiculo del cliente: " + getVehiculo().getMarca());
        
    }
    
}
