/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciohospital;

/**
 *
 * @author marlo
 */
public class Medico {
    private String nombre;
    private String especialidad;
    private Hospital hospital;
    
    public Medico(String nombre, String especialidad, Hospital hospital){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.hospital = hospital;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
    public void mostrar(){
        System.out.println("medico: " + getNombre());
        System.out.println("especialidad " + getEspecialidad());
        System.out.println("Hospital: " + hospital.getNombre());
    }
}
