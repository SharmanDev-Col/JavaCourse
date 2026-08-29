/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioempleadodos;

/**
 *
 * @author marlo
 */
public class Empleado {
    String nombre;
    String documento;
    float salario;
    Departamento departamento;
    
    public Empleado(String nombre, String documento, float salario, Departamento departamento){
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
        this.departamento = departamento;
    }
    
    public void mostrar(){
        System.out.println("nombre: " + nombre);
        System.out.println("documento: " + documento);
        System.out.println("salario: " + salario);
        System.out.println("Departamento: " + departamento.nombre);
        System.out.println("empresa: " + departamento.empresa.getNombre());
        
    }
}
