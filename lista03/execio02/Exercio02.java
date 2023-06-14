package lista03.execio02;

import java.util.Scanner;

public class Exercio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 50;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        for (int i = 1 ;i<=number; i++){
            System.out.println("Digite um valor: ");    
            int value = scanner.nextInt();  
            if (value > maiorValor){
                maiorValor=value;               
            }if (value < menorValor){
                menorValor=value;}
            }
            System.out.println("O maior valor digitado foi: " + maiorValor);
            System.out.println("O menor valor digitado foi: " + menorValor);
        
        scanner.close();
}}
