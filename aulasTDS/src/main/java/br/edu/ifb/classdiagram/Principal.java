/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.classdiagram;

/**
 *
 * @author dariopintor
 */
public class Principal {
    public static void main(String[] args) {
        Dono dono1 = new Dono ("Pedro");
        Gato gato1 = new Gato("Marrone", 5);
        Cachorro cachorro1 = new Cachorro("Labrador",dono1, "Rex", 8 );
        dono1.adicionarCachorro(cachorro1);
        dono1.adicionarGato(gato1);
        System.out.println(dono1.toString());
        
        Veterinario vet = new Veterinario ();
        vet.exanimarAnimal(cachorro1);
           
        
    }
    }

