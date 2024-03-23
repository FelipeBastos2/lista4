import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10:");
        int nota = inicialScanner.nextInt();

            while (nota > 10) {
                System.out.println("Nota invalida, digite novamente:"+"\n");
                nota = inicialScanner.nextInt();
            }

        inicialScanner.close();
    }

}
