package Operadores;

import java.util.Scanner;

public class Controle_SWITCH {

    public static void main(String[] args) {

        //int valor = 3;
    	int valor;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Elija uma opcion (0-3)");
    	valor=input.nextInt();

        switch (valor) {
            case 0:
                System.out.println("Opcion 0 elegida");
                break;
            case 1:
                System.out.println("Opcion 1 elegida");
                break;
            case 2: {
                System.out.println("Valor:");
                System.out.println("2 elegido");
                break;
            }
            case 3:
                System.out.println("Opcion 3 elegida");
                break;
            default:
                System.out.println("Não encontrado");
        }

    }

}
