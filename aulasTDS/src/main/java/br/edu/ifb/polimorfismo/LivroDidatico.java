/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.polimorfismo;

/**
 *
 * @author dariopintor
 */
public class LivroDidatico extends Livro {
    private String disciplina;
    public LivroDidatico (String titulo, String autor, int anoPublicacao, String disciplina){
        super(titulo, autor, anoPublicacao);
        this.disciplina = disciplina;        
    }
    
    @Override
    public String descricaoLivro(){
        return super.descricaoLivro() + "Disciplina: " + this.disciplina;
    }
}
