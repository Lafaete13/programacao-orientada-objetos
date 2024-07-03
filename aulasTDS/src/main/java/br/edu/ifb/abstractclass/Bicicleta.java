/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.abstractclass;

/**
 *
 * @author dariopintor
 */
public class Bicicleta extends Veiculo{
    public Bicicleta (String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo");
    
}
     @Override
     public String mostrarDetalhes(){          
        return  "Detalhes da bicicleta: \n" + super.mostrarDetalhes();
    }
}
