package br.edu.ifsul.interfaces;

public class MensagemEmail  implements  IMensagem{

    @Override
    public void enviar() {
        System.out.println("Mensagem com número:"+numero);
    }
    
}
