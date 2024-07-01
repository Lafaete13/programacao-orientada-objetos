/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula03;

/**
 *
 * @author dariopintor
 */
public class PrincipalCalculadora {
    
    public static void outraMensagem() {
        System.out.println("Outra mensagem");
    }
    public static void main (String args []) {
        outraMensagem();
        Calculadora calc1 = new Calculadora ();
        calc1.mensagem();
        System.out.println(calc1.somar(2, 5));
        System.out.println("Soma: "+ calc1.somar(7, 5));
        System.out.println("Soma:"+ calc1.somar(90, 5));
       
    }
}
