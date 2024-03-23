import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);


        System.out.println("Numero 1:");
            int numeroX = Integer.MIN_VALUE;

            System.out.println("Digite 5 numeros:");

            for (int contagem = 1; contagem <= 5;contagem++){
                System.out.println("Repetição:"+ contagem+1+"\n");
                    int numero= inicialScanner.nextInt();

                    if (numero > numeroX) {
                        numeroX = numero;
                        
                    }
            }
          System.out.println("O maior numero digitado é o núemero"+numeroX +":");
         
            

inicialScanner.close();
    }
    
}
