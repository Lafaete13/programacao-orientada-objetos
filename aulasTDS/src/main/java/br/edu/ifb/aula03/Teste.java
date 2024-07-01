/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula03;

/**
 *
 * @author dariopintor
 */
public class Teste {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println(" Valor inicial "+ numero);
        PassagemPorValor objetoValor = new PassagemPorValor ();
        objetoValor.incrementaValor(numero);
        System.out.println(" Valor final "+ numero);

    Contador objetoContador = new Contador();
    PassagemPorReferencia objetoRef =  new PassagemPorReferencia ();
    System.out.println(" Valor inicial " + objetoContador.valor);
    objetoRef.incrementaValor(objetoContador);
    System.out.println(" Valor Final " + objetoContador.valor);
    
    
    }
}
