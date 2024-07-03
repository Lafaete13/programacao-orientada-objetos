/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.interfaces;

/**
 *
 * @author dariopintor
 */
public class Pix implements Pagamento{

    @Override
    public void processarPagamento(double quantia) {
        System.out.println("Processando pagamento com Pix no valor de R$: " + quantia);
    }

    @Override
    public void emetirRecibo(String detalhes) {
     System.out.println("Recibo de pagamamento no pix: " + detalhes);
    }
    
}