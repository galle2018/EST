/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author silvi
 */
public class Lista_Exemplo {
        
    public static void main(String[] args) {
        
        
        List lista_exemplo = new ArrayList();
        
        lista_exemplo.add(100);
        
        lista_exemplo.add(1, "Alberto da Costa");
        
        System.out.println(lista_exemplo.toString());
                
        lista_exemplo.add(1, 102);
        
        System.out.println(lista_exemplo.toString());
        
        System.out.println(lista_exemplo.size());
        
        System.out.println(lista_exemplo.isEmpty());
        
        System.out.println(lista_exemplo.get(1));
        
        System.out.println(lista_exemplo.toString());
        
        //System.out.println(lista_exemplo.get(5));
        
        lista_exemplo.set(1, 500);
        
        System.out.println(lista_exemplo.toString());
        
        lista_exemplo.remove(2);
        
        System.out.println(lista_exemplo.toString());
        
        
        //------------------------------------------------------
        System.out.println("--------------------------------");
        
        List<Integer> lista_generics_example = new ArrayList<>();
        
        lista_generics_example.add(100);
        
        lista_generics_example.add(0, 101);
        
        System.out.println(lista_generics_example.toString());
        
        Integer value = lista_generics_example.get(0);
        
        System.out.println(value);
        
        lista_generics_example.remove(1);
        
        System.out.println(lista_generics_example.toString());
        
    }
    
    
    
    
    
    
    
}
