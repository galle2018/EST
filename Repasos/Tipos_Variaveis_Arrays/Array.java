package Tipos_Variaveis_Arrays;

public class Array {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 900;
        numeros[4] = 800;

        System.out.println("Array numeros\n"+numeros[0]+" / "+numeros[4]);

        System.out.println("\nArray valores");
        int[] valores = {1, 2, 3, 4, 5};

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}
