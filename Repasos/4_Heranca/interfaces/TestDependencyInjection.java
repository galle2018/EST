package br.edu.ifsul.interfaces;

public class TestDependencyInjection {

    public static void main(String[] args) {
        
        IMensagem mensagem = new Mensagem();
        
        DependencyInjection dep = new DependencyInjection(mensagem);
        dep.doWork("Comprando presentes");
        
        
        System.out.println();
        
        mensagem = new MensagemEmail();        
        dep = new DependencyInjection(mensagem);
        dep.doWork("Comprando presentes");
        
        
        
        
        
        
        
    }
    
}
