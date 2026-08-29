/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioempleadodos;

/**
 *
 * @author marlo
 */
public class Departamento {
    String nombre;
    String codigo;
    Empresa empresa;
    
    public Departamento(String nombre, String codigo, Empresa empresa){
    this.nombre = nombre;
    this.codigo = codigo;
    this.empresa = empresa;
    }
    
    public void mostrar(){
        System.out.println("nombre: " + nombre);
        System.out.println("codigo: " + codigo);
        System.out.println("empresa: " + empresa.getNombre());
    
    }
    
}
