import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cotacao, dolar, real;
        String continuar = "S";

        System.out.print("Digite a cotação do dólar: ");
        cotacao = scanner.nextDouble();

        while (continuar.equalsIgnoreCase("S")) {

            System.out.print("Digite o valor em dólar: ");
            dolar = scanner.nextDouble();

            real = dolar * cotacao;

            System.out.println("Valor em reais: R$ " + real);

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next();
        }

        scanner.close();
    }
}