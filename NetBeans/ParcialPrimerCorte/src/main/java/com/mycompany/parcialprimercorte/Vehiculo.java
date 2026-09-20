/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialprimercorte;

/**
 *
 * @author marlo
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private double precio;
    private Concesionario concesionario;
    
    public Vehiculo (String placa, String marca, double precio, Concesionario concesionario){
    
        if (placa == null || placa.trim().isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo placa de vehiculo no puede estar vacio");
        }
        
        if (marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo marca de vehiculo no puede estar vacio");
        }
        
        if (precio <= 0){
            throw new IllegalArgumentException(
            "Error, el campo precio de vehiculo es invalido");
        }
        
        if (concesionario == null){
            throw new IllegalArgumentException("Error, el vehiculo debe pertenecer a un concesionario");
        }
        
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
        this.concesionario = concesionario;
    
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }
    
    public void mostrarVehiculo(){
    
        System.out.println("placa del vehiculo: " + getPlaca());
        System.out.println("marca del vehiculo: " + getMarca());
        System.out.println("precio del vehiculo: " + getPrecio());
        System.out.println("concesionario del vehiculo: " + getConcesionario().getNombre());
        
    }
    
}
