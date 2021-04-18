package br.edu.ifsul.interfaces;



public class DependencyInjection {
    
    private IMensagem mensagem;

    public DependencyInjection(IMensagem mensagem) {
        this.mensagem = mensagem;
    }
    
    public void doWork(String workName){
        System.out.println("Doing: "+workName);
        mensagem.enviar();    
    }
    
    
    
    
}
