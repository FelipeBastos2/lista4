import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);
        int soma =0;

        System.out.println("Digite 5 numeros:");
        int numeros;
        for (int valor = 1 ; valor <=5;valor++){
        System.out.println("O resultado da soma é"+valor+":");
        int  numero = inicialScanner.nextInt();
        soma += numero*numero;

        }

            System.out.println("A média é:"+soma);
        inicialScanner.close();
    }
    
}
