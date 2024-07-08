/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.excecoes;

import javax.swing.JOptionPane;

/**
 *
 * @author dariopintor
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        try {
            System.out.println("Elemento 5: " + vetor[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Você esta tentando acessar"
                    + "uma posição no array que não existe");
        }
    }
}
