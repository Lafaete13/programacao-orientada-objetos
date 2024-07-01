/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.herança;

/**
 *
 * @author dariopintor
 */
public class Cachorro extends Animal {

   
    void latir() {
        super.comer();
        System.out.println("O cachorro está latindo");
    }
}
