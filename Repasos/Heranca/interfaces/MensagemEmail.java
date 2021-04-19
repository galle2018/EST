package Heranca.interfaces;

public class MensagemEmail  implements  IMensagem{

    @Override
    public void enviar() {
        System.out.println("\nMensagem com numero: "+numero);
    }
    
}
