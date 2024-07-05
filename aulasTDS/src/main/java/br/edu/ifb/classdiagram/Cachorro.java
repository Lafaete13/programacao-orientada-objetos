/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.classdiagram;

/**
 *
 * @author dariopintor
 */
public class Cachorro extends Animal {
    private String raca;
    private Dono dono;

    public Cachorro(String raca, Dono dono, String nome, int idade) {
        super(nome, idade);
        this.raca = raca;
        this.dono = dono;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public void fazerSom(){
        super.fazerSom();
        System.out.println("Au! Au!");
    }

    @Override
    public String toString() {
        return super.toString() + "Cachorro{" + "raca = " + raca + ", dono = " + dono.getNome() + '}';
    }
    
    
}
