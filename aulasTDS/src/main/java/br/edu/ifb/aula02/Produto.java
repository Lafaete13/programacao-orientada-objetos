/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula02;

/**
 *
 * @author dariopintor
 */
public class Produto {
     String nome;
     double preco;
     int qEstoque;
    
     void alteraPreco(double novoPreco){
        this.preco = novoPreco;
    }
    
     void alteraQEstoque(int novaAquantidaEstoque){
        this.qEstoque = novaAquantidaEstoque;
    }
    
     String mostrarNome(){
        return this.nome;
    }
}
