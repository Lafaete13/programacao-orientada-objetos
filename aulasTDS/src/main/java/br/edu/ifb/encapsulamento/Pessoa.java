/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.encapsulamento;

/**
 *
 * @author dariopintor
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public void setNome(String nome){
        
        this.nome = nome;
    }
    
     public void setIdade(int idade){
        this.idade = idade;
    }
     
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    @Override
    public String toString(){
   
        return "Nome: " + this.nome + ", Idade: " + this.getIdade();
    }
}
