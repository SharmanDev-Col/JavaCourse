/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciohospital;

/**
 *
 * @author marlo
 */
public class Paciente {
    private String nombre;
    private int edad;
    private String motivo_consulta;
    private Medico medico;
    
    public Paciente(String nombre, int edad, String motivo_consulta, Medico medico){
        this.nombre = nombre;
        this.edad = edad;
        this.motivo_consulta = motivo_consulta;
        this.medico = medico;               
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    



    public void mostrarPaciente(){
        System.out.println("Paciente: " + getNombre());
        System.out.println("edad: " + getEdad());
        System.out.println("motivo de consulta: " + motivo_consulta);
        System.out.println("medico que atendio: " + medico.getNombre());
        System.out.println("Hospital que atendio: " + medico.getHospital().getNombre());
    }
    
    
    
}
