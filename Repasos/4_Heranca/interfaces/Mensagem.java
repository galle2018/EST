package br.edu.ifsul.interfaces;

public class Mensagem implements IMensagem{

    @Override
    public void enviar() {        
        System.out.println("Mensagem padrão");
    }

    

    
}
