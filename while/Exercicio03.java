import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor, total = 0;
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {

            System.out.print("Digite o valor do produto: ");
            valor = scanner.nextDouble();

            total += valor;

            System.out.print("Deseja adicionar outro produto? (S/N): ");
            resposta = scanner.next();
        }

        System.out.println("Valor total: R$ " + total);

        scanner.close();
    }
}