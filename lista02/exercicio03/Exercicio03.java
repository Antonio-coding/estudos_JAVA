package lista02.exercicio03;
import java.util.Scanner;

public class Exercicio03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("a) Soma");
        System.out.println("b) Diferença");
        System.out.println("c) Multiplicação");
        System.out.println("d) Divisão");
        System.out.println("e) Resto da Divisão");
        System.out.println("f) Potência");
        System.out.println("g) Raiz Quadrada");
        System.out.print("Opção: ");
        char opcao = scanner.next().charAt(0);

        double resultado;

        switch (opcao) {
            case 'a':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 'b':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 'c':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 'd':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            case 'e':
                if (numero2 != 0) {
                    resultado = numero1 % numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            case 'f':
                resultado = Math.pow(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 'g':
                if (numero2 >= 0) {
                    resultado = Math.sqrt(numero2);
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: não é possível calcular a raiz quadrada de um número negativo!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}


