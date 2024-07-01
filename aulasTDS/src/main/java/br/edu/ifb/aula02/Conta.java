/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula02;

/**
 *
 * @author dariopintor
 */
public class Conta {
    String nome;
    String tipo;
    int numero; 
    float saldo;
    
    public void sacar( float valor){
    this.saldo = this.saldo - valor;
    }
    
    public void depositar( float valor){
    this.saldo = this.saldo + valor;
    }
}
