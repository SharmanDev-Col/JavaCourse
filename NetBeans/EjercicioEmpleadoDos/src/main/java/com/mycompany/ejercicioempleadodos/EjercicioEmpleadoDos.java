/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioempleadodos;

/**
 *
 * @author marlo
 */
public class EjercicioEmpleadoDos {

    public static void main(String[] args) {
        Empresa empresa1 = null;
        Empresa empresa2 = null;
        Empresa empresa3 = null;
        Departamento departamento1 = null;
        Departamento departamento2 = null;
        Departamento departamento3 = null;
        Empleado empleado1 = null;
        Empleado empleado2 = null;
        Empleado empleado3 = null;
        
        try {
        
            empresa1 = new Empresa("", "2099892811", "Bucaramanga");
            //empresa1.mostrar();
        
        } catch (IllegalArgumentException e) {
        
            System.out.println(
                "Error: " + e.getMessage());
        }

        try {
            
            empresa2 = new Empresa("Teleperformance", "676544570", "Bogota");
            //empresa2.mostrar();
                    
        } catch (IllegalArgumentException e) {
                
                System.out.println(
                    "Error: " + e.getMessage());
                }
        
        try {
        
            empresa3 = new Empresa("Foundever", "2876543509", "Barranquilla");
            //empresa3.mostrar();
        
        } catch (IllegalArgumentException e){
                
                System.out.println(
                    "Error " + e.getMessage());
                
                }
        
        try {
        
            departamento1 = new Departamento("Soporte Tecnico", "203344", empresa1);
            //departamento1.mostrar();
        
        } catch (IllegalArgumentException e){
                
                System.out.println(
                    "Error " + e.getMessage());
                
                }
        
        try {
        
            departamento2 = new Departamento("Recursos Humanos", "235544", empresa2);
            //departamento2.mostrar();
        
        } catch (IllegalArgumentException e){
                
                System.out.println(
                    "Error " + e.getMessage());
                
                }
        
        try {
        
            departamento3 = new Departamento("Ingenieria", "984433", empresa3);
            //departamento3.mostrar();
        
        } catch (IllegalArgumentException e){
                
                System.out.println(
                    "Error " + e.getMessage());
                
                }
        
        try {
        
            empleado1 = new Empleado("Marlon", "1098821998", 2100000, departamento1);
            empleado1.mostrar();
            
        } catch (IllegalArgumentException e){
                
                System.out.println(
                    "Error " + e.getMessage());
                
                }
        
        try {
        
            empleado2 = new Empleado("Johan", "198832997", 2500000, departamento2);
            empleado2.mostrar();
        
        } catch (IllegalArgumentException e){
                
                System.out.println(
                    "Error " + e.getMessage());
                
                }
        
        try {
        
            empleado3 = new Empleado("Sebastian", "1999834455", 5000000, departamento3);
            empleado3.mostrar();
        
        } catch (IllegalArgumentException e){
                
                System.out.println(
                    "Error " + e.getMessage());
                
                }
        
        //Empresa empresa1 = new Empresa("Concentrix", "2099892811", "Bucaramanga");
        //Empresa empresa2 = new Empresa("Teleperformance", "676544570", "Bogota");
        //Empresa empresa3 = new Empresa("Foundever", "2876543509", "Barranquilla");
        //Departamento departamento1 = new Departamento("Soporte Tecnico", "203344", empresa1);
        //Departamento departamento2 = new Departamento("Recursos Humanos", "235544", empresa2);
        //Departamento departamento3 = new Departamento("Ingenieria", "984433", empresa3);
        //Empleado empleado1 = new Empleado("Marlon", "1098821998", 2100000, departamento1);
        //Empleado empleado2 = new Empleado("Johan", "198832997", 2500000, departamento2);
        //Empleado empleado3 = new Empleado("Sebastian", "1999834455", 5000000, departamento3);
       
        
        
        

    }
}
