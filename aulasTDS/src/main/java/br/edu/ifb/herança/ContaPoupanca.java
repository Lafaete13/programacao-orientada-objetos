/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.herança;

/**
 *
 * @author dariopintor
 */
public class ContaPoupanca extends Conta {
    double taxaJuros;
    
    ContaPoupanca (String numero, double taxaJuros){
        super(numero);
        this.taxaJuros = taxaJuros;
    }
    
    void aplicarJuros(){
        
    }
    
    double getTaxaJuros(){
        return taxaJuros;
    }
}
