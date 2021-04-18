package br.edu.ifsul.controles;

public class Controle_BREAK_CONTINUE {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int x : nums) {
            sum += x;

            if (sum == 6) {
                break;
            }
        }
        System.out.println("Soma: " + sum);

        for (int x : nums) {

            if (x == 3) {
                continue;
            }

            sum += x;
        }

        System.out.println("Soma: " + sum);
    }
}
