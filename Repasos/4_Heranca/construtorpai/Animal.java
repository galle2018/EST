package br.edu.ifsul.construtorpai;


public class Animal {

    public Animal(String nome) {
        this.nome = nome;
        System.out.println("Nome: "+this.nome);
    }

    
    public String nome;
    
    
    public void comer(){
        
        System.out.println("Comendo");              
    
    }
}
