package Tipos_Variaveis_Arrays;

public class ConversaoDeTipos_Casting {

    public static void main(String[] args) {

        //convertion
        int total = 900;

        long maximo = total;

        // casting
        char x = 'A';

        int cast = (int) x;

        System.out.println(cast+" (codigo del caracter A)");

        double b = 900.55569;

        cast = (int) b;

        System.out.println(cast+" (valor entero del double b = 900.55569)");

    }

}
