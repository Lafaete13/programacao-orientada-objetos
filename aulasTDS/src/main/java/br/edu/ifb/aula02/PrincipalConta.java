/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula02;

/**
 *
 * @author dariopintor
 */
public class PrincipalConta {
    
    public  static void main (String args []){
        Conta conta1 = new Conta();
        conta1.nome = "João silva";
        conta1.numero = 12456;
        conta1.depositar(1000);
        
        Conta conta2 = new Conta();
        conta1.nome = "Maria Oliveira";
        conta1.numero = 65431;
        conta1.depositar(2000);
        
        Conta conta3 = new Conta();
        conta1.nome = "Maria Oliveira";
        conta1.numero = 65431;
        conta1.depositar(2000);
    }
}
