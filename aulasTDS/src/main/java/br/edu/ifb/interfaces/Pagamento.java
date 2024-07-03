/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifb.interfaces;

/**
 *
 * @author dariopintor
 */
public interface Pagamento {
    void processarPagamento(double quantia);
    void emetirRecibo(String detalhes);
}
