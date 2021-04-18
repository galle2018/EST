package br.edu.ifsul.controles;

public class Controle_SWITCH {

    public static void main(String[] args) {

        int valor = 1;

        switch (valor) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2: {
                System.out.println("Valor:");
                System.out.println("2");
                break;
            }
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Não encontrado");
        }

    }

}
