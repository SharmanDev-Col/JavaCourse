/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author marlo
 */
public class Cuenta {
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;
    
    public Cuenta (String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }
    
    public void Depositar(double cantidad){
        saldo+=cantidad;
        //Saldo = saldo + cantidad;
        System.out.println("El saldo actual despues del deposito es: " + cantidad);
        System.out.println("");
        
    }
    
    public void Depositar(double cantidad, double bono){
        saldo += cantidad + bono;
        System.out.println("El saldo de la cuenta despues del deposito " + cantidad + "y el bono de: " + bono + saldo);
    
    }
    
    public void Retirar(double cantidad){
        if (cantidad <= saldo){
            saldo-=cantidad;
            System.out.println(" el saldo actual despues del retiro es" + saldo);
        }
        else {
            System.out.println("Error, fondos insuficientes");
        
        }
    }
        
    public void mostrarInformacion(){
        System.out.println("el numero de la cuenta es: " + numeroCuenta);
        System.out.println("el titular de la cuenta es:" + titular);
        System.out.println("el saldo es: " + saldo);
    }
    
    
}
