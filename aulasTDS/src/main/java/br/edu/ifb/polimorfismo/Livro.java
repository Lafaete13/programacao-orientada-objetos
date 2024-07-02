/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.polimorfismo;

/**
 *
 * @author dariopintor
 */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String descricaoLivro(){
        return "Título: " +this.titulo +", Autor: " + this.autor 
                + ", Ano de publicação: " + this.anoPublicacao;
    }
}
