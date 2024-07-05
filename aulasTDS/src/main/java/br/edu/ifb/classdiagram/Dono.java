/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.classdiagram;

import java.util.ArrayList;

/**
 *
 * @author dariopintor
 */
public class Dono {
    private String nome;
    private ArrayList<Cachorro> cachorro;
    private ArrayList<Gato> gato;

    public Dono(String nome) {
        this.nome = nome;
        this.cachorro = new ArrayList<>();  // Inicializa a lista de cachorros
        this.gato = new ArrayList<>();      // Inicializa a lista de gatos
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void removerCachorro(Cachorro cachorro) {
        this.cachorro.remove(cachorro);
    }

    public void adicionarCachorro(Cachorro cachorro) {
        this.cachorro.add(cachorro);
    }

    public void adicionarGato(Gato gato){
        this.gato.add(gato);
    }
    
    public void removerGato(Gato gato){
        this.gato.remove(gato);
    }

    @Override
    public String toString() {
        return "Dono{" + "nome=" + nome + ", cachorro=" + cachorro.toString() + ", gato=" + gato.toString() + '}';
    }
    
    
}
