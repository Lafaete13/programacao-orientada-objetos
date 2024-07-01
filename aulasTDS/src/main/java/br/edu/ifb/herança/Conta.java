/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.herança;

/**
 *
 * @author dariopintor
 */
public class Conta {
    String numero;
    double saldo;
    //construtor da classe Conta
    Conta(String numero){
        this.numero = numero;
    }
    
    void depositar(double valor){
        this.saldo = this.saldo +valor;
    }
    
    void sacar(double valor){
        this.saldo = this.saldo - valor;
    }
    
    double getSaldo(){
        return this.saldo;
    }
    
    String getNumero(){
        return this.numero;
    }
}
