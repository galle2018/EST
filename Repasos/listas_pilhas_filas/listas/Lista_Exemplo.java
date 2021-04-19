
package listas_pilhas_filas.listas;

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
        System.out.println("1er lista");
        System.out.println(lista_exemplo.toString());
                
        lista_exemplo.add(1, 102);
        System.out.println("\nAdd item en pos 1");
        System.out.println(lista_exemplo.toString());
        
        System.out.println("\nTamaño actual");
        System.out.println(lista_exemplo.size());
        
        System.out.println("\nComprobando si isEmty");
        System.out.println(lista_exemplo.isEmpty());
        
        System.out.println("\nMostrando elemento posicion 1");
        System.out.println(lista_exemplo.get(1));
        
        System.out.println("\nMostrando la lista actual");
        System.out.println(lista_exemplo.toString());
        
        //System.out.println(lista_exemplo.get(5));
        
        lista_exemplo.set(1, 500);
        System.out.println("\nCambiando item pos 1");
        System.out.println(lista_exemplo.toString());
        
        lista_exemplo.remove(2);
        System.out.println("\nRemovido item pos 2");
        System.out.println(lista_exemplo.toString());
        
        
        //------------------------------------------------------
        System.out.println("--------------------------------");
        
        List<Integer> lista_generics_example = new ArrayList<>();
        
        lista_generics_example.add(100);
        
        lista_generics_example.add(0, 101);
        
        System.out.println("\nMostrando lista de numeros");
        System.out.println(lista_generics_example.toString());
        
        Integer value = lista_generics_example.get(0);
        
        System.out.println("\nMostrando solo item pos 0");
        System.out.println(value);
        
        lista_generics_example.remove(1);
        System.out.println("\nRemovido el item pos 1");
        System.out.println(lista_generics_example.toString());
        
    }
    
    
    
    
    
    
    
}
