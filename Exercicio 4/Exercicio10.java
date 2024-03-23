import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");

        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();

        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

        System.out.println("Números no intervalo entre " + menorNumero + " e " + maiorNumero + ":");
        for (int i = menorNumero; i <= maiorNumero; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}