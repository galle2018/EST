import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

    public static int[] numeros = new int[Principal.database.size()];

    public static void buscar(){

        Scanner in = new Scanner(System.in);
        System.out.println("\nBuqueda por produtos utilizando busca binária" +
                "\n---------------------------------------------\n");
        System.out.println("Por favor ingrese o codigo do produto a buscar:");
        int codigo=in.nextInt();

         if(binarySearch(numeros, codigo)) {
            System.out.println("\nProduto econtrado!!!");
            mostrarProduto(codigo);
        }
        else System.out.println("Produto nao econtrado");

    }//fim buscar

    public static boolean binarySearch(int[] numbers, int numberToSearch) {
        int size = numbers.length;  // Número de elementos
        int middle = size/2;        // Mitad del array

        System.out.println("Size: " + size);
        System.out.println("Middle: " + middle);
        System.out.println("Array: " + Arrays.toString(numbers));

        if (numbers[middle] == numberToSearch) return true;

        else if (numbers[middle] > numberToSearch)//toma del inicio hasta la mitad
            return binarySearch(Arrays.copyOfRange(numbers,0,middle),numberToSearch);

        else if (numbers[middle] < numberToSearch)//toma de la mitad hasta el final
            return binarySearch(Arrays.copyOfRange(numbers,middle,numbers.length),numberToSearch);

        else if (size == 1) return false;

        else return false;

    }//fim binarySearch


    public static void mostrarProduto(int cod){
        System.out.println("Id: " + Principal.database.get(cod-1).getId()
                + "\nNome: " + Principal.database.get(cod-1).getName()
                + "\nPrice: " + Principal.database.get(cod-1).getPrice()
                + "\nStock: " + Principal.database.get(cod-1).getStockList()
                + "\n");
    }//fim mostrarProduto


}
