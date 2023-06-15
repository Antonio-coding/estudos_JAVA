package lista02.exercicio01;
import java.util.Scanner;

public class Exercio01Corrigido {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de identificação do estudante: ");
        int identificacao = scanner.nextInt();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (nota1 + 2 * nota2 + 3 * nota3 + mediaExercicios) / 7;

        String conceito;
        if (mediaAproveitamento >= 9.0 && mediaAproveitamento <= 10.0) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            conceito = "C";
        } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Número de identificação do estudante: " + identificacao);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        } else if (conceito.equals("D")) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}

    

