/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.polimorfismo;

/**
 *
 * @author dariopintor
 */
public class TestarLivro {
    public static void main(String[] args) {
        Livro livro1 =  new Livro("A volta","João Maria", 2022);
        System.out.println(livro1.descricaoLivro());
        
        LivroDidatico livrodt = new LivroDidatico("Química Geral ","Maria da Glória", 2022, "Química");
        System.out.println(livrodt.descricaoLivro());
       
    }
}
