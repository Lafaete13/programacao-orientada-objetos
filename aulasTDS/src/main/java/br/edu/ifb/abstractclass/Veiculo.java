/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.abstractclass;

/**
 *
 * @author dariopintor
 */
public abstract class Veiculo {
    private String modelo;
    private String marca;

    public Veiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public abstract void mover();
    
    public String mostrarDetalhes(){
       return "Modelo: "+ this.modelo + ", Marca: " + this.marca;
    }
    
}
