/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.abstractclass;

/**
 *
 * @author dariopintor
 */
public class Carro extends Veiculo {

    public Carro(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
    }

    @Override
    public String mostrarDetalhes() {
        return "Detalhes do carro: \n" + super.mostrarDetalhes();
    }

}
