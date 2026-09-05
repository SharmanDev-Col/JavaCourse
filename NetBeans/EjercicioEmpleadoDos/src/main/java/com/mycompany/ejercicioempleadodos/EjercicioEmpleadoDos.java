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
        Empresa empresa1 = new Empresa("Concentrix", "2099892811", "Bucaramanga");
        Empresa empresa2 = new Empresa("Teleperformance", "676544570", "Bogota");
        Empresa empresa3 = new Empresa("Foundever", "2876543509", "Barranquilla");
        Departamento departamento1 = new Departamento("Soporte Tecnico", "203344", empresa1);
        Departamento departamento2 = new Departamento("Recursos Humanos", "235544", empresa2);
        Departamento departamento3 = new Departamento("Ingenieria", "984433", empresa3);
        Empleado empleado1 = new Empleado("Marlon", "1098821998", 2100000, departamento1);
        Empleado empleado2 = new Empleado("Johan", "198832997", 2500000, departamento2);
        Empleado empleado3 = new Empleado("Sebastian", "1999834455", 5000000, departamento3);
       
        
        
        empleado1.mostrar();
        System.out.println("----------------------------");
        empleado2.mostrar();
        System.out.println("----------------------------");
        empleado3.mostrar();
        System.out.println("----------------------------------------------------");
        departamento1.mostrar();
        System.out.println("----------------------------");        
        departamento2.mostrar();
        System.out.println("----------------------------");
        departamento3.mostrar();
        System.out.println("----------------------------------------------------");
        empresa1.mostrar();
        System.out.println("----------------------------");
        empresa2.mostrar();
        System.out.println("----------------------------");
        empresa3.mostrar();
    }
}
