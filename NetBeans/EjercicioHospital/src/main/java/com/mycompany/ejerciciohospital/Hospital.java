package com.mycompany.ejerciciohospital;
import java.util.ArrayList; 

public class Hospital {
    private String nombre;
    private String ciudad;
    private ArrayList<Medico> medicos;
    
    public Hospital(String nombre, String ciudad){
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nombre de hospital no puede estar vacio");
        }
        
        // CORRECCIÓN: Aquí decía 'nombre.trim().isEmpty()'
        if (ciudad == null || ciudad.trim().isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo ciudad del hospital no puede estar vacio");
        }
        
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.medicos = new ArrayList<>(); // Agregación[cite: 2]
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    
    public void agregarMedico(Medico medico){
        if (medico == null){
            throw new IllegalArgumentException("El medico no puede ser nulo");
        }  
        medicos.add(medico);      
    }
    
    public void mostrarMedicos(){
        System.out.println("Medicos del hospital " + nombre + ":");
        for (Medico medico : medicos){ // Ciclo for para recorrer la lista[cite: 2]
            System.out.println("-" + medico.getNombre());
        }
    } 
    
    public void mostrar(){
        System.out.println("nombre: " + getNombre());
        System.out.println("ciudad: " + getCiudad());
    }
}