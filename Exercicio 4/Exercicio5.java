import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

        char continuar;

        do {
            System.out.println("Digite a população inicial do País A:");
            int populacaoA = inicialScanner.nextInt();

            System.out.println("Digite a taxa de nascimento do País A:");
            double nascimentoA = inicialScanner.nextDouble();

            System.out.println("Digite a população inicial do País B:");
            int populacaoB = inicialScanner.nextInt();

            System.out.println("Digite a taxa de nascimento do País B:");
            double nascimentoB = inicialScanner.nextDouble();

            int anos = 0;

            while (populacaoA <= populacaoB) {
                populacaoA += populacaoA * nascimentoA;
                populacaoB += populacaoB * nascimentoB;
                anos++;
            }

            System.out.println("Anos necessários para o País A alcançar a população B: " + anos + " anos");

            System.out.println("Deseja repetir a operação? (S/N)");
            continuar = inicialScanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        inicialScanner.close();
    }
}
