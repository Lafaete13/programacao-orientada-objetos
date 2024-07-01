/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.variaveis;

/**
 *
 * @author dariopintor
 */
public class UsuarioOnline {
    static int totalUsuariosOline;
    String local;
    String horaDeAcesso;
    
    void inicializar(String local, String horaDeAcesso){
        this.local = local;
        this.horaDeAcesso = horaDeAcesso;
        UsuarioOnline.totalUsuariosOline++;
        System.out.println(exibirInformacoes());
    }
    
    String exibirInformacoes(){
        String informacoes = "Local: " + local + "Hora de acesso: " 
                + horaDeAcesso;
       return informacoes;
        
    }
    
    static int getTotalOnline(){
        
        return totalUsuariosOline;
    }
    
}
