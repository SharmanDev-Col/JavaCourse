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
    private String nombre;
    private String documento;
    private float salario;
    private Departamento departamento;
    /*private Empresa empresa;*/
    
    public Empleado(String nombre, String documento, float salario, Departamento departamento /*Empresa empresa*/){
        
        if (nombre == null || nombre.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo nombre no puede estar vacio");
        }
        
        if (documento == null || documento.trim() .isEmpty()){
            throw new IllegalArgumentException(
            "Error, el campo documento no puede estar vacio");
        }
        
        if (salario < 0){
            throw new IllegalArgumentException(
            "Error, el campo salario no puede ser negativo");
        }
        
        if (departamento == null){
            throw new IllegalArgumentException(
            "Error, el departamento no puede estar vacio");
        }
        
        /*if (empresa == null){
            throw new IllegalArgumentException(
            "Error, la empresa no puede estar vacio");
        }*/
        
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
        this.departamento = departamento;
        /*this.empresa = empresa;*/
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    /*
    public Empresa getEmpresa() {
        return empresa;
    }
    
    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }
    
    */
    public void mostrar(){
        System.out.println("nombre: " + nombre);
        System.out.println("documento: " + documento);
        System.out.println("salario: " + salario);
        System.out.println("Departamento: " + departamento.getNombre());
        System.out.println("empresa: " + departamento.getEmpresa().getNombre());
        
    }
}
