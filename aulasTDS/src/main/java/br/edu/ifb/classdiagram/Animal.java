/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.classdiagram;

/**
 *
 * @author dariopintor
 */
public abstract class Animal implements AcoesAnimais {
    
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void fazerSom(){
        System.out.println("Um animal fazendo som: ");
    }
    @Override
    public void comer() {
        
    }

    @Override
    public void dormir() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", idade=" + idade + '}';
    }
    
    
}
