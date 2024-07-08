/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.excecoes;

/**
 *
 * @author dariopintor
 */


public class ContaBancaria {
    private double saldo;
    ContaBancaria (double saldoInicial){
        this.saldo = saldoInicial;
    }
    
    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor> this.saldo){
            throw new SaldoInsuficienteException ("Saldo insuficiente" + this.saldo);
        }
        this.saldo = this.saldo - valor;
    }
    

    public double getSaldo() {
        return saldo;
    }
}
