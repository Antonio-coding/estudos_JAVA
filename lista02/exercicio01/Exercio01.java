package lista02.exercicio01;

import java.util.Scanner;

public class Exercio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de identificação do estudante: ");
        int idEstudante = scanner.nextInt();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a media dos exerceios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (nota1 + 2 * nota2 + 3 * nota3 + mediaExercicios) / 7;
        String conceito;

        if (mediaAproveitamento >= 9.0 && mediaAproveitamento <= 10.0) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento <= 9.0) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento <= 7.5) {
            conceito = "C";
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento <= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Número de identificação do estudante: " + idEstudante);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B")) {
            System.out.println("Parabens voce foi APROVADO ");
        } else if (conceito.equals("C") || conceito.equals("D")) {
            System.out.println("Voce esta de recupeção");
        } else {
            System.out.println("Voce está reprovado");
        }
        ;
        scanner.close();
    };
}
