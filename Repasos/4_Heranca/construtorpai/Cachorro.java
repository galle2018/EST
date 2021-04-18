package br.edu.ifsul.construtorpai;



public class Cachorro extends  Animal{

    public String cor;
    
    
    public Cachorro(String nome, String cor) {
        super(nome);
        this.cor = cor;
        System.out.println("Cor: "+this.cor);
    }
    
    
    public void latir(){
        System.out.println("Latindo");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro Comendo");
    }
    
    public void comerLatir(){
        super.comer();
        
        this.comer();
        
        comer();
        
        
        this.latir();
        
        latir();
        
    }
    
}
