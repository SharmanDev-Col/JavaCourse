package com.mycompany.ejerciciohospital;

public class EjercicioHospital {

    public static void main(String[] args) {
        Hospital hospital1 = null;
        Medico medico1 = null;
        Medico medico2 = null;
        Medico medico3 = null;
        Paciente paciente1 = null;
        Paciente paciente2 = null;
        Paciente paciente3 = null;
        
        try {
            hospital1 = new Hospital("Chicamocha", "Bucaramanga");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
         
        try {
            medico1 = new Medico("Juan", "Neurologo", hospital1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            medico2 = new Medico("Antonio", "Psicologo", hospital1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            medico3 = new Medico("Andres", "Urologo", hospital1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // --- AGREGACIÓN: Añadir médicos al hospital ---
        if (hospital1 != null) {
            if (medico1 != null) hospital1.agregarMedico(medico1);
            if (medico2 != null) hospital1.agregarMedico(medico2);
            if (medico3 != null) hospital1.agregarMedico(medico3);
            System.out.println("-> Médicos registrados en el hospital exitosamente.\n");
        }
        
        try {
            paciente1 = new Paciente("Sebas", 18, "Problema hormonal", medico1);
            
            // --- AGREGACIÓN: Añadir paciente a la lista del médico ---
            if (medico1 != null) {
                medico1.agregarPaciente(paciente1);
            }
            
            paciente1.mostrarPaciente();
            System.out.println("------------------------------");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());   
        }
        
        try {
            paciente2 = new Paciente("Johan", 19, "Esquizofrenia", medico2);
            
            // --- AGREGACIÓN: Añadir paciente a la lista del médico ---
            if (medico2 != null) {
                medico2.agregarPaciente(paciente2);
            }
            
            paciente2.mostrarPaciente();
            System.out.println("------------------------------");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());   
        }
        
        try {
            paciente3 = new Paciente("Kevin", 24, "Impotencia sexual", medico3);
            
            // --- AGREGACIÓN: Añadir paciente a la lista del médico ---
            if (medico3 != null) {
                medico3.agregarPaciente(paciente3);
            }
            
            paciente3.mostrarPaciente();
            System.out.println("------------------------------");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());   
        }
        
        System.out.println("\n--- LISTA GENERAL DEL HOSPITAL ---");
        // Verificamos que el hospital exista para evitar errores
        if (hospital1 != null) { 
            hospital1.mostrarMedicos();
        }
        
        System.out.println("\n--- LISTA DE PACIENTES EN MEDICO 1---");
        if (medico1 != null) {
            medico1.mostrarPacientes();
        }
        
        System.out.println("\n--- LISTA DE PACIENTES EN MEDICO 2---");
        if (medico2 != null) {
            medico2.mostrarPacientes();
        }
        
        System.out.println("\n--- LISTA DE PACIENTES EN MEDICO 3---");
        if (medico3 != null) {
            medico3.mostrarPacientes();
        }
    }
}