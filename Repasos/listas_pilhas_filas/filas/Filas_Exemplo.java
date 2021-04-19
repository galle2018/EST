package listas_pilhas_filas.filas;

import java.util.Queue;
/**
 *
 * @author silvio
 */
public class Filas_Exemplo {
    
    public static void main(String[] args) {
        
        Queue<Integer> queue = new IfsulQueue<>();
        
        queue.add(1200);
        queue.add(1300);
        queue.add(1400);
        
        System.out.println(queue.toString());
              
        Integer value = queue.element();
        
        Integer value2 = queue.remove();
        
        System.out.println(queue.toString());
        
    }
    
}
