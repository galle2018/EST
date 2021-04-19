package Heranca.referencia;

public class Teste {

    public static void main(String[] args) {

    	System.out.println("1");
        Animal animal = new Animal();
        animal.comer();       
        
        System.out.println("\n2");
        Animal animal2 = new Cachorro();
        animal2.comer();       
        
        System.out.println("\n3");
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.latir();          
        
    }
    
}
