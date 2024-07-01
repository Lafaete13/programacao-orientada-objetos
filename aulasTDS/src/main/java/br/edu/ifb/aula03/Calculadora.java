/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula03;

/**
 *
 * @author dariopintor
 */
public class Calculadora {
    float numero1, numero2;
    
    //metodo sem retorno e sem parâmetro
    public void mensagem(){
        System.out.println("Calculando");
    }
    
    //método com parâmetro e com retorno
    public float somar(float num1, float num2){
        mensagem();
        this.numero1 = num1;
        this.numero2 = num2;
        float soma = this.numero1 + this.numero2;
        return soma;
    }
    
    //método com parâmetro e com retorno
     public float multiplicar(float num1, float num2){
         mensagem();
        this.numero1 = num1;
        this.numero2 = num2;
        float mult = this.numero1 * this.numero2;
        return mult;
    }
    
}
