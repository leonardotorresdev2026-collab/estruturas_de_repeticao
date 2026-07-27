import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidade = 0;

        do {

            System.out.print("Digite um número (-1 para sair): ");
            numero = scanner.nextInt();

            if (numero != -1) {
                soma += numero;
                quantidade++;
            }

        } while (numero != -1);

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (double) soma / quantidade);

        scanner.close();
    }
}
