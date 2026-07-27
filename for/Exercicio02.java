import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;
        int resultado = 0;

        System.out.print("Digite o primeiro número: ");
        a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        b = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            resultado += b;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}