import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;

        do {

            System.out.print("Digite um número (-1 para sair): ");
            numero = scanner.nextInt();

            if (numero != -1 && numero > maior) {
                maior = numero;
            }

        } while (numero != -1);

        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}