/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.variaveis;

/**
 *
 * @author dariopintor
 */
public class TestarUsuariosOnline {
   
    public static void main(String[] args) {
        UsuarioOnline usuario1 = new UsuarioOnline ();
        usuario1.inicializar("Brasília, ", "12h00");
      
        System.out.println("Quantidade online: "+ UsuarioOnline.totalUsuariosOline);
        
        UsuarioOnline usuario2 = new UsuarioOnline ();
        usuario2.inicializar("Belém ", "13h00");
        System.out.println("Quantidade online: "+  UsuarioOnline.totalUsuariosOline);
    }
}
