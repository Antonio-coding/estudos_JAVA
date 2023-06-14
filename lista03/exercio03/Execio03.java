package lista03.exercio03;

import java.util.Scanner;

public class Execio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo a ser fatorado: ");
        int numero = scanner.nextInt();
        int fatorial = calcularFatorial(numero);

        if (fatorial != -1) {
            System.out.printf("%d! = %d\n", numero, fatorial);

           
        } else {
             System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
        }
        ;
 scanner.close();
    }

    public static int calcularFatorial(int numero) {
        if (numero >= 0) {
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        } else {
            return -1;
        }

    }
}
