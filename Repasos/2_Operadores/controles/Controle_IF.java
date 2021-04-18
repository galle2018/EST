package br.edu.ifsul.controles;

public class Controle_IF {

    public static void main(String[] args) {

        int a = 100;
        int b = 100;

        if (a == b) {
            System.out.println("Iguais.");
        } else {
            System.out.println("Diferentes.");
        }

        if (a == b) {
            System.out.println("Iguais.");
        } else if (a > b) {
            System.out.println("Maior A.");
        } else {
            System.out.println("Maior B.");
        }
    }

}
