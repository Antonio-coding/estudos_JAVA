package lista02.exercicio07;
import java.util.Scanner;



public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto = 0;
        double totalAPagar = total;

        if (quantidade <= 5) {
            desconto = total * 0.02; // Desconto de 2%
        } else if (quantidade <= 10) {
            desconto = total * 0.03; // Desconto de 3%
        } else {
            desconto = total * 0.05; // Desconto de 5%
        }

        totalAPagar = total - desconto;

        System.out.println("Descrição do produto: " + descricao);
        System.out.println("Quantidade adquirida: " + quantidade);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + totalAPagar);

        scanner.close();
    }
}

