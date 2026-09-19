/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciohospital;

/**
 *
 * @author marlo
 */
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
        
            System.out.println(
                "Error: " + e.getMessage());
        }
         
        try {
        
            medico1 = new Medico("Juan", "Neurologo", hospital1);
            
        } catch (IllegalArgumentException e) {
        
            System.out.println(
                "Error: " + e.getMessage());
        }
        
        try {
        
            medico2 = new Medico("Antonio", "Psicologo", hospital1);
            
        } catch (IllegalArgumentException e) {
        
            System.out.println(
                "Error: " + e.getMessage());
        }
        
        try {
        
            medico3 = new Medico("Andres", "Urologo", hospital1);
            
        } catch (IllegalArgumentException e) {
        
            System.out.println(
                "Error: " + e.getMessage());
        }
        
        //agregar medicos al hospital
        if (hospital1 != null){}
        
        Paciente paciente1 = new Paciente("Sebas", 18, "Problema hormonal", medico1);
        Paciente paciente2 = new Paciente("Johan", 19, "Esquizofrenia", medico2);
        Paciente paciente3 = new Paciente("Kevin", 24, "Impotencia sexual", medico3);
    
    
        paciente1.mostrarPaciente();
        System.out.println("------------------------------");
        paciente2.mostrarPaciente();
        System.out.println("------------------------------");
        paciente3.mostrarPaciente();
    }
   
}
