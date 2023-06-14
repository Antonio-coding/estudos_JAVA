package lista03.exercio05;

import java.util.Scanner;
public class Exercio05 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                double salario, somaSalario = 0, maiorSalario = 0;
                int numFilhos, totalHabitantes = 0, totalSalarioMenor150 = 0, totalFilhos = 0;

                System.out.println("Digite os dados dos habitantes:");
                while (true) {
                    System.out.print("Salário (digite um valor negativo para encerrar): ");
                    salario = scanner.nextDouble();
                    if (salario < 0) {
                        break;
                    }
                    System.out.print("Número de filhos: ");
                    numFilhos = scanner.nextInt();

                    totalHabitantes++;
                    somaSalario += salario;
                    totalFilhos += numFilhos;

                    if (salario > maiorSalario) {
                        maiorSalario = salario;
                    }

                    if (salario < 150.0) {
                        totalSalarioMenor150++;
                    }
                }

                double mediaSalario = somaSalario / totalHabitantes;
                double mediaFilhos = (double) totalFilhos / totalHabitantes;
                double percentualSalarioMenor150 = (double) totalSalarioMenor150 / totalHabitantes * 100;

                System.out.printf("Média de salário da população: R$ %.2f\n", mediaSalario);
                System.out.printf("Média do número de filhos: %.1f\n", mediaFilhos);
                System.out.printf("Maior salário dos habitantes: R$ %.2f\n", maiorSalario);
                System.out.printf("Percentual de pessoas com salário menor que R$ 150,00: %.1f%%\n", percentualSalarioMenor150);
    }
}