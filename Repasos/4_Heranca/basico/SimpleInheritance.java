/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.basico;

/**
 *
 * @author silviogn
 */
public class SimpleInheritance {

    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();
        
        superOb.i = 10; 
        superOb.j = 20;
        
        superOb.showij();
        System.out.println();
        
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        
        subOb.showij();
        subOb.showk();
        subOb.sum();
    }
}

