/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula03;

/**
 *
 * @author dariopintor
 */

class Contador{
    int valor = 10;
}

public class PassagemPorReferencia {
    
    void incrementaValor(Contador contador){
        contador.valor++;
    }
}
