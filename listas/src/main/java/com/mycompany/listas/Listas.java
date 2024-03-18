
package com.mycompany.listas;

import java.util.ArrayList;


public class Listas {

    public static void main(String[] args) {
        String[] names = new String[5]; //array tradicional
        ArrayList<String> list = new ArrayList<>(); //casting <> array ajustable
        
        list.add("Hola");
        list.add("mundo");
        list.add("cruel");
        
        list.set(1, "gente"); //set método para remplazar valores de la lista. primero la posición y luego el elemento
        list.remove(2); //remove elimina
        System.out.println(list.get(0)); //get imprime
        System.out.println(list.contains("Hola"));
        
        System.out.println("Tamaño de la lista: " + list.size());
        System.out.println("¿Está vacia? " + list.isEmpty()); //isEmpty método para detectar que el array esta vacío
        System.out.println("Valores de la lista: " + list);
        
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i)); 
        }
        
        for (String item: list){
            System.out.println(item);
        }
    }
}
