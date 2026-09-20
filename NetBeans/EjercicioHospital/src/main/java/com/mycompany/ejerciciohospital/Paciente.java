package com.mycompany.ejerciciohospital;

public class Paciente {
    private String nombre;
    private int edad;
    private String motivo_consulta;
    private Medico medico; // Agregación: Conoce a su médico[cite: 1]
    
    public Paciente(String nombre, int edad, String motivo_consulta, Medico medico){
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Error, el nombre del paciente no puede estar vacío");
        }
        if (edad <= 0){
            throw new IllegalArgumentException("Error, la edad debe ser mayor a 0");
        }
        if (medico == null){
            throw new IllegalArgumentException("Error, el paciente debe tener un médico asignado");
        }
        
        this.nombre = nombre;
        this.edad = edad;
        this.motivo_consulta = motivo_consulta;
        this.medico = medico;                
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getMotivo_consulta() { return motivo_consulta; }
    public void setMotivo_consulta(String motivo_consulta) { this.motivo_consulta = motivo_consulta; }
    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }

    public void mostrarPaciente(){
        System.out.println("Paciente: " + getNombre());
        System.out.println("edad: " + getEdad());
        System.out.println("motivo de consulta: " + motivo_consulta);
        System.out.println("medico que atendio: " + medico.getNombre());
        System.out.println("Hospital que atendio: " + medico.getHospital().getNombre());
    }
}