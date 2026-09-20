/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcialprimercorte;

//Marlon Arley Jaimes Torres
//Johan Alexis Jurado Solano

/**
 *
 * @author marlo
 */
public class ParcialPrimerCorte {

    public static void main(String[] args) {
    Concesionario concesionario1 = null;
    Vehiculo vehiculo1 = null;
    Vehiculo vehiculo2 = null;
    Cliente cliente1 = null;
    Cliente cliente2 = null;
    
    try {    
        concesionario1 = new Concesionario("Renova Autos", "bucaramanga", 2);    
    } catch (IllegalArgumentException e){
        System.out.println("Error " + e.getMessage());
    }
    
    try {    
        vehiculo1 = new Vehiculo("HKM 907", "HYUNDAI", 20000000, concesionario1);    
    } catch (IllegalArgumentException e){
        System.out.println("Error " + e.getMessage());
    }
    
    try {    
        vehiculo2 = new Vehiculo("SST 902", "Renault", 25000000, concesionario1);    
    } catch (IllegalArgumentException e){
        System.out.println("Error " + e.getMessage());
    }
    
    try {    
        cliente1 = new Cliente("Camilo", "1098821998", 25, vehiculo1);
        cliente1.mostrarCliente();
    } catch (IllegalArgumentException e){
        System.out.println("Error " + e.getMessage());
    }
    
    try {    
        cliente2 = new Cliente("Logan", "1988200029", 30, vehiculo2);
        cliente2.mostrarCliente();
    } catch (IllegalArgumentException e){
        System.out.println("Error " + e.getMessage());
    }
}
}
                
