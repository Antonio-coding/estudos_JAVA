package lista02.exercicio06;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        int litros = scanner.nextInt();

        System.out.print("Digite o tipo de combustível (E - etanol, G - gasolina): ");
        char tipo = scanner.next().charAt(0);

        double precoGasolina = 4.02;
        double precoEtanol = 3.24;
        double valorAPagar = 0;

        if (tipo == 'E' || tipo == 'e') {
            if (litros <= 20) {
                valorAPagar = litros * precoEtanol * 0.97; // Desconto de 3%
            } else {
                valorAPagar = litros * precoEtanol * 0.95; // Desconto de 5%
            }
        } else if (tipo == 'G' || tipo == 'g') {
            if (litros <= 20) {
                valorAPagar = litros * precoGasolina * 0.96; // Desconto de 4%
            } else {
                valorAPagar = litros * precoGasolina * 0.94; // Desconto de 6%
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }

        System.out.println("Valor a ser pago: R$ " + valorAPagar);

        scanner.close();
    }
}
