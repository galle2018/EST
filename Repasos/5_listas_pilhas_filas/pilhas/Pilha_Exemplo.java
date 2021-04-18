/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

import java.util.Stack;

/**
 *
 * @author silvi
 */
public class Pilha_Exemplo {
    
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();
        
        stack.push("Cliente 1");
        stack.push("Cliente 2");
        stack.push("Cliente 3");
        
        System.out.println(stack.toString());
        
        // Similar to top
        String cliente = stack.peek();
        
        System.out.println(cliente);
        
        System.out.println(stack.toString());
        
        cliente = stack.pop();
        
        System.out.println(cliente);
        
        System.out.println(stack.toString());
        
        System.out.println(stack.size());
        
        System.out.println(stack.isEmpty());
                
    }
    
}
