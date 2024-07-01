/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.herança;

/**
 *
 * @author dariopintor
 */
public class ContaCorrente extends Conta {
    double limite;
    
    ContaCorrente (String numero, double limite){
        super(numero);
        this.limite = limite;
    }
    
    void sacar(double valor){
        super.sacar(valor);
    }
    
    double getLimite(){
        return limite;
    }
}
