/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.herança;

/**
 *
 * @author dariopintor
 */
public class TestarContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente ("23403-c", 2000);
        ContaPoupanca cp =  new ContaPoupanca("23403-p", 0.3);
        
        System.out.println(" Limite conta corrente: "+cc.getLimite());
        System.out.println("Numero da conta: "+cc.getNumero());
        
        System.out.println("Taxa de jutos da conta poupança: "+cp.getTaxaJuros());
        System.out.println("Numero da conta poupança: " + cp.getNumero());
    }
}
