/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciohospital;
import java.util.ArrayList; 

/**
 *
 * @author marlo
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private ArrayList<Medico> medicos;
    
    public Hospital(String nombre, String ciudad){
        
        if (nombre == null || nombre.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nombre de hospital no puede estar vacio");
        }
        
        if (ciudad == null || nombre.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nombre de la ciudad del hospital no puede estar vacio");
        }
        
        this.nombre = nombre;
        this.ciudad = ciudad;
        medicos = new ArrayList<>();
    
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
    
    public void agregarMedico(Medico medico){
        if (medico == null){
            throw new IllegalArgumentException("El medico no puede ser nulo");
        }  medicos.add(medico);      
    }
    
     public void mostrarMedicos(){
        System.out.println("Medicos del hospital " + nombre + ":");
        
        for (Medico medico : medicos){
            System.out.println("-" + medico.getNombre());}
     } 
    
    public void mostrar(){
        System.out.println("nombre: " + getNombre());
        System.out.println("ciudad: " + getCiudad());
    }
}
