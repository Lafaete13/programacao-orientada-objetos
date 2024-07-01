/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula02;

/**
 *
 * @author dariopintor
 */
public class PrincipalProduto {
    public static void main (String args []){
        //criando a referência e instanciando um objeto
        Produto produto1 = new Produto();
        //populando meu objeto produto1
        produto1.nome = "Sabonete";
        produto1.preco = 2.50;
        produto1.qEstoque = 100;
        produto1.alteraPreco(2.30);
        produto1.alteraQEstoque(99);
        
        //mostrando os valores do objeto produto1
        System.out.println("Nome do produto: " +produto1.mostrarNome());
        System.out.println("Preço do produto: " +produto1.preco);
        System.out.println("Quantidade em estoque: " +produto1.qEstoque);
         
        //criar  a referencia
        Produto produto2;
        //instanciando o objeto
        produto2 = new Produto();
        //populando meu objeto produto2
        produto2.nome = "Feijão";
        produto2.preco = 10;
        produto2.qEstoque = 100;
        produto2.alteraQEstoque(99);
        
          //mostrando os valores do objeto produto1
        System.out.println("Nome do produto: " +produto2.mostrarNome());
        System.out.println("Preço do produto: " +produto2.preco);
        System.out.println("Quantidade em estoque: " +produto2.qEstoque);
        
    }
}
