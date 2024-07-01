/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula04;

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
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString(){
     
        return " Nome: "+ this.nome+
                " Idade: " + this.idade;
    } 
    
}
