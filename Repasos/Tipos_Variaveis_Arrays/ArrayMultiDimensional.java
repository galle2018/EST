package Tipos_Variaveis_Arrays;

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
        
        //agregado por mi --------------------------------------
        System.out.println("numeros");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
              System.out.print(numeros[i][j]+" ");             
            }
            System.out.println("");
        }
        
        System.out.println("\nnumeros2");
        
        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2[i].length; j++) {
              System.out.print(numeros2[i][j]+" ");             
            }
            System.out.println("");
        }
        
        System.out.println("\nSoma total: "+total);
      //agregado por mi --------------------------------------
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
