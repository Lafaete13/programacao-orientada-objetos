/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.constutores;

/**
 *
 * @author dariopintor
 */
public class Carro {
    String modelo, placa;
    int ano;
    
    
    Carro(){
        System.out.print("Meu coonstrutor");
    }
     
   public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;      
    }
   
   public Carro(int ano, String modelo){
        this.modelo = modelo;
        this.ano = ano;      
    }
   
    
    Carro(String modelo, int ano, String placa){
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    
    @Override
    public String toString(){
        return "Modelo: "+this.modelo + "Ano: "+this.ano +"Placa"+ this.placa;
    }
    
}
