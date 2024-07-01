/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.constutores;

/**
 *
 * @author dariopintor
 */
public class TestarCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro("Ford", 2002);
        Carro c3 = new Carro("Ford", 2002, "SDFAS-ED");
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
