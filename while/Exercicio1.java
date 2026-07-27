import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = -1;

        while (numero != 0) {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();

            System.out.println("Número digitado: " + numero);
        }

        scanner.close();
    }
}
