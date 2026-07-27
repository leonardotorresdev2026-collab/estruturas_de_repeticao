import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int x = rnd.nextInt(100);
        int numero;

        do {

            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero < x) {
                System.out.println("MAIOR");
            } else if (numero > x) {
                System.out.println("MENOR");
            }

        } while (numero != x);

        System.out.println("Parabéns! Você acertou!");

        scanner.close();
    }
}