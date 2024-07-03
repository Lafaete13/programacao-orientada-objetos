/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.interfaces;

/**
 *
 * @author dariopintor
 */
public class TestarPagamento {
    public static void main(String[] args) {
        Pagamento ppix = new Pix ();
        ppix.processarPagamento(200);
        ppix.emetirRecibo("Compra de livros");
    }
}
