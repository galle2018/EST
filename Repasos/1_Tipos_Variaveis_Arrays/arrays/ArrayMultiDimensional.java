package br.edu.ifsul.arrays;

/**
 *
 * @author silviogn
 */
public class ArrayMultiDimensional {

    public static void main(String[] args) {

        int[][] numeros = new int[5][2];

        int[][] numeros2 = new int[5][2];

        popularValores(numeros);

        popularValores(numeros2);

        int total = somaTotal(numeros) + somaTotal(numeros2);

    }

    public static void popularValores(int[][] valores) {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = i + j;
            }
        }
    }

    public static int somaTotal(int[][] valores) {
        int total = 0;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                total += valores[i][j];
            }
        }
        return total;
    }
}
