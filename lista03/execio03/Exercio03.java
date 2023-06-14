package lista03.execio03;

import java.util.Scanner;

public class Exercio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int primeiroNumero = scanner.nextInt();

        if (primeiroNumero >= 1 && primeiroNumero <= 10) {
            System.out.println(" Digite o numero de multipolicação" + primeiroNumero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = primeiroNumero * i;
                System.out.println(primeiroNumero + "x" + i + " Resultado :" + resultado);
            }
        } else {System.out.println("o Numero que voce diigitou esta invalido ");}
        ;

        scanner.close();
    }
}

// Escreva um programa que imprima a tabuada (de 1 a 10). O usuário deve digitar
// o número
// (de 1 a 10) para o qual deseja ver a tabuada.