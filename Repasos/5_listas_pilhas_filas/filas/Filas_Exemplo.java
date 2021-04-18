/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;

import java.util.Queue;

/**
 *
 * @author silvi
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
