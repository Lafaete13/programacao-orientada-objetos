/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.classdiagram;

/**
 *
 * @author dariopintor
 */
public class Gato extends Animal {
    
    public Gato (String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void fazerSom(){
        super.fazerSom();
        System.out.println("Miua!");
    }
    
}
