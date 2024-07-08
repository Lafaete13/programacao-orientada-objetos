/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.arraylist;

import java.util.ArrayList;

/**
 *
 * @author dariopintor
 */
public class ExemploArrayList {

    public static void addArrayList(ArrayList<String> lista) {
        lista.add("Leite");
        lista.add("Pão");
        lista.add("Café");
        lista.add("Cebola");
        lista.add("Café");
    }

    public static void showArrayList(ArrayList<String> lista) {
        System.out.println(lista);
    }

     public static void removeArrayList(ArrayList<String> lista, String elemento) {
        lista.remove(elemento);
        
    }
     
      public static void getArrayList(ArrayList<String> lista, int indice) {
        
          System.out.println(lista.get(indice));
        
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        addArrayList(arrayList);
        showArrayList(arrayList);
          System.out.println("Tamanho: " + arrayList.size());
        removeArrayList(arrayList, "Leite");
        showArrayList(arrayList);
        getArrayList(arrayList,0);
        System.out.println("Tamanho: " + arrayList.size());

    }
}

