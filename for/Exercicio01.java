import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int funcionarios;
        double salario;
        double soma = 0;
        double maior = 0;
        double menor = 0;

        System.out.print("Quantidade de funcionários: ");
        funcionarios = scanner.nextInt();

        for (int i = 1; i <= funcionarios; i++) {

            System.out.print("Salário do funcionário " + i + ": ");
            salario = scanner.nextDouble();

            soma += salario;

            if (i == 1) {
                maior = salario;
                menor = salario;
            }

            if (salario > maior)
                maior = salario;

            if (salario < menor)
                menor = salario;
        }

        System.out.println("Média salarial: " + soma / funcionarios);
        System.out.println("Maior salário: " + maior);
        System.out.println("Menor salário: " + menor);

        scanner.close();
    }
}
