/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.abstractclass;

/**
 *
 * @author dariopintor
 */
public class TestarVeiculo {

    public static void main(String[] args) {
        // Criando instâncias de Carro e Bicicleta
        Veiculo carro = new Carro("Modelo S", "Tesla");
        Veiculo bicicleta = new Bicicleta("Mountain Bike", "Caloi");

        // Chamando métodos mover e mostrarDetalhes para Carro
        carro.mover();
        System.out.println(carro.mostrarDetalhes());

        // Chamando métodos mover e mostrarDetalhes para Bicicleta
        bicicleta.mover();
        System.out.println(bicicleta.mostrarDetalhes());
    }

}
