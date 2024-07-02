/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.polimorfismo;

/**
 *
 * @author dariopintor
 */
public class Cachorro extends Animal{
    
    @Override
    public void fazerSom() {
        System.out.println("Latindo");
    }
    
    public void cacar() {
        System.out.println("Caçando");
    }
}
