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
    private String nombre;
    private String codigo;
    private Empresa empresa;
    
    public Departamento(String nombre, String codigo, Empresa empresa){
        
        if (nombre == null || nombre.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nombre no puede estar vacio");
        }
        
        if (codigo == null || codigo.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo codigo no puede estar vacio");
        }
        
        if (empresa == null){
            throw new IllegalArgumentException(
            "Error, el campo empresa no puede ser nulo");
        }
        
    this.nombre = nombre;
    this.codigo = codigo;
    this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
    public void mostrar(){
        System.out.println("nombre: " + getNombre());
        System.out.println("codigo: " + getCodigo());
        System.out.println("empresa: " + empresa.getNombre());
    
    }
    
}
