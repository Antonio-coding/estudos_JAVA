package lista03.exercicio01;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de estudantes: ");
        int numeroEstudantes = scanner.nextInt();

        double somaNotas = 0;
        int estudantesValidos = 0;

        for (int i = 1; i <= numeroEstudantes; i++) {
            System.out.print("Digite a nota do estudante " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                estudantesValidos++;
            } else {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                i--; // Decrementa o contador para repetir a leitura da mesma posição
            }
        }

        double media = somaNotas / estudantesValidos;

        System.out.println("Média aritmética das notas: " + media);

        scanner.close();
    }
}
