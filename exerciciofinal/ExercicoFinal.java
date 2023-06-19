package exerciciofinal;

import java.util.Scanner;

public class ExercicoFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante[] estudantes = new Estudante[20];

        while (true) {
            System.out.println("---- MENU ----");
            System.out.println("a) Cadastrar médias dos estudantes");
            System.out.println("b) Número de estudantes com conceitos A e B");
            System.out.println("c) Número de estudantes com conceitos C e D");
            System.out.println("d) Número de estudantes com conceito abaixo de D");
            System.out.println("e) Número de estudantes com conceito acima de B");
            System.out.println("f) Sair do programa");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    cadastrarMedias(estudantes, scanner);
                    System.out.println("Médias dos estudantes cadastradas com sucesso.");
                    break;
                case "b":
                    int countAB = contarConceitosAB(estudantes);
                    System.out.println("Número de estudantes com conceitos A e B: " + countAB);
                    break;
                case "c":
                    int countCD = contarConceitosCD(estudantes);
                    System.out.println("Número de estudantes com conceitos C e D: " + countCD);
                    break;
                case "d":
                    int countAbaixoD = contarConceitoAbaixoD(estudantes);
                    System.out.println("Número de estudantes com conceito abaixo de D: " + countAbaixoD);
                    break;
                case "e":
                    int countAcimaB = contarConceitoAcimaB(estudantes);
                    System.out.println("Número de estudantes com conceito acima de B: " + countAcimaB);
                    break;
                case "f":
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");
                    break;
            }
        }
    }

    static void cadastrarMedias(Estudante[] estudantes, Scanner scanner) {
        for (int i = 0; i < estudantes.length; i++) {
            System.out.println("Estudante " + (i + 1));
            System.out.print("Número de identificação: ");
            String identificacao = scanner.nextLine();
            System.out.print("Nota 1: ");
            float nota1 = lerNota(scanner);
            System.out.print("Nota 2: ");
            float nota2 = lerNota(scanner);
            System.out.print("Nota 3: ");
            float nota3 = lerNota(scanner);
            System.out.print("Média dos exercícios: ");
            float mediaExercicios = lerNota(scanner);

            float mediaAproveitamento = (nota1 + 2 * nota2 + 3 * nota3 + mediaExercicios) / 7;
            String conceito = calcularConceito(mediaAproveitamento);

            estudantes[i] = new Estudante(identificacao, conceito);
        }
    }

    static float lerNota(Scanner scanner) {
        float nota;
        while (true) {
            try {
                nota = Float.parseFloat(scanner.nextLine());
                if (nota >= 0.0 && nota <= 10.0) {
                    break;
                } else {
                    System.out.println("Digite uma nota no intervalo de 0.0 a 10.0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor numérico válido");
            }
        }
        return nota;
    }

    static int contarConceitosAB(Estudante[] estudantes) {
        int count = 0;
        for (Estudante estudante : estudantes) {
            if (estudante.getConceito().equals("A") || estudante.getConceito().equals("B")) {
                count++;
            }
        }
        return count;
    }

    static int contarConceitosCD(Estudante[] estudantes) {
        int count = 0;
        for (Estudante estudante : estudantes) {
            if (estudante.getConceito().equals("C") || estudante.getConceito().equals("D")) {
                count++;
            }
        }
        return count;
    }

    static int contarConceitoAbaixoD(Estudante[] estudantes) {
        int count = 0;
        for (Estudante estudante : estudantes) {
            if (estudante.getConceito().equals("E")) {
                count++;
            }
        }
        return count;
    }

    static int contarConceitoAcimaB(Estudante[] estudantes) {
        int count = 0;
        for (Estudante estudante : estudantes) {
            if (estudante.getConceito().equals("A") || estudante.getConceito().equals("B")) {
                continue;
            }
            count++;
        }
        return count;
    }

    static String calcularConceito(float mediaAproveitamento) {
        if (mediaAproveitamento >= 9.0 && mediaAproveitamento <= 10.0) {
            return "A";
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            return "B";
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            return "C";
        } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
            return "D";
        } else {
            return "E";
        }
    }
}

class Estudante {
    private String identificacao;
    private String conceito;

    public Estudante(String identificacao, String conceito) {
        this.identificacao = identificacao;
        this.conceito = conceito;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public String getConceito() {
        return conceito;
    }
}
