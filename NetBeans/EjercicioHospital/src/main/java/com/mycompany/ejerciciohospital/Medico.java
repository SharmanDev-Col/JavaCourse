package com.mycompany.ejerciciohospital;
import java.util.ArrayList;

public class Medico {
    private String nombre;
    private String especialidad;
    private Hospital hospital; // Agregación de lo general a lo específico[cite: 1]
    private ArrayList<Paciente> pacientes; // Falta esta agregación[cite: 1, 2]
    
    public Medico(String nombre, String especialidad, Hospital hospital){
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Error, el nombre del médico no puede estar vacío");
        }
        if (hospital == null){
            throw new IllegalArgumentException("Error, el médico debe pertenecer a un hospital");
        }
        
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.hospital = hospital;
        this.pacientes = new ArrayList<>(); // Inicializamos la lista
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public Hospital getHospital() { return hospital; }
    public void setHospital(Hospital hospital) { this.hospital = hospital; }
    
    // Método para agregar pacientes a este médico[cite: 1]
    public void agregarPaciente(Paciente paciente){
        if(paciente == null){
            throw new IllegalArgumentException("El paciente no puede ser nulo");
        }
        pacientes.add(paciente);
    }
    
    public void mostrar(){
        System.out.println("medico: " + getNombre());
        System.out.println("especialidad " + getEspecialidad());
        System.out.println("Hospital: " + hospital.getNombre());
    }
}