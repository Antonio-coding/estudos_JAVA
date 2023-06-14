package lista03.exercio05;

import java.util.Scanner;
public class Exercio05Corrigido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaRenda = 0;
        int somaFilhos = 0;
        double maiorSalario = 0;
        int habitantes = 0;
        int habitantesRendaMenor200 = 0;

        System.out.println("Digite a renda e o número de filhos de cada família (digite um salário negativo para encerrar):");

        while (true) {
            System.out.print("Renda da família: R$ ");
            double renda = scanner.nextDouble();

            if (renda < 0) {
                break;
            }

            System.out.print("Número de filhos: ");
            int filhos = scanner.nextInt();

            somaRenda += renda;
            somaFilhos += filhos;
            habitantes++;

            if (renda < 200) {
                habitantesRendaMenor200++;
            }

            if (renda > maiorSalario) {
                maiorSalario = renda;
            }
        }

        double rendaMedia = somaRenda / habitantes;
        double mediaFilhos = (double) somaFilhos / habitantes;
        double percentualRendaMenor200 = (double) habitantesRendaMenor200 / habitantes * 100;

        System.out.println("\nResultados:");
        System.out.println("Renda média da população: R$ " + rendaMedia);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário dos habitantes: R$ " + maiorSalario);
        System.out.printf("Percentual de habitantes com renda menor que R$ 200,00: %.2f%%\n", percentualRendaMenor200);

        scanner.close();
    }
}


