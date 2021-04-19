package listas_pilhas_filas.pilhas;

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
        
        System.out.println("1era pilha:");
        System.out.println(stack.toString());
        
        
        System.out.println("\n2da pilha:");
        // Similar to top
        String cliente = stack.peek();
        System.out.println(cliente);
        
        System.out.println("\n3ra pilha:");
        System.out.println(stack.toString());
        
        System.out.println("\n4ta pilha:");
        cliente = stack.pop();//visualiza y elimina
        System.out.println(cliente);
        
        System.out.println("\n5ta pilha:");
        System.out.println(stack.toString());
        
        System.out.println("\nTamanho pilha:");
        System.out.println(stack.size());
        
        System.out.println("\nPilha vacia?:");
        System.out.println(stack.isEmpty());
        
        stack.removeAllElements();//vacio la pila
        System.out.println("\nRemovi todos los elementos. Pilha vacia?:");
        System.out.println(stack.isEmpty());
        
                
    }
    
}
