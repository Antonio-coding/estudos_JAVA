//conferir Resultado
package lista02.exercicio02;
import java.util.Scanner;

public class Exercicio02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação ax^2 + bx + c = 0:");

        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta >= 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes da equação são:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("A equação não tem solução no conjunto dos reais.");
        }

        scanner.close();
    }
}


