/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.encapsulamento;

/**
 *
 * @author dariopintor
 */
public class TestarPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        p1.setNome("Pedro");
        p1.setIdade(18);
        System.out.println("Dados da pessoa " + p1.toString());
    }
}
