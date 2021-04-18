package br.edu.ifsul.interfaces;

public class Test {

    public static void main(String[] args) {

        IMensagem mensagem = new Mensagem();
        mensagem.enviar();;

        mensagem = new MensagemEmail();
        mensagem.enviar();

    }

}
