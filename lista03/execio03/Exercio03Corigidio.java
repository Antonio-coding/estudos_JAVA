package lista03.execio03;
import java.util.Scanner;

public class Exercio03Corigidio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 10: ");
        int numero = scanner.nextInt();
        
        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabuada do número " + numero + ":");
            
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 10.");
        }
        
        scanner.close();
    }
}

