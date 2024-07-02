/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.polimorfismo;

/**
 *
 * @author dariopintor
 */
public class TestarPolimorfismo {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora ();
        
        System.out.println("Soma: " + calc1.somar(2.5, 2.5));
        System.out.println("Soma: " + calc1.somar(1, 2.5));
        System.out.println("Soma: " + calc1.somar(2.5, 2.5, 2.5));
    }
}
