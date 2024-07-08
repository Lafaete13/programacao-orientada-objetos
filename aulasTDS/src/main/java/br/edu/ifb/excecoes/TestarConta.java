/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.excecoes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dariopintor
 */
public class TestarConta {
    public static void main(String[] args) {
                    ContaBancaria conta1 = new ContaBancaria (500);
                   double valorSaque = 600;
        try {
            conta1.sacar(valorSaque);
            System.out.println("Saldo atual "+ conta1.getSaldo());
        } catch (SaldoInsuficienteException ex) {
            JOptionPane.showMessageDialog(null, ex + "Você tem R$" 
                    +conta1.getSaldo() + " E está tentado sacer R$ " + valorSaque );
        }
    }
}
