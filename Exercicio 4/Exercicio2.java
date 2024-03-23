import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner inicialScanner = new Scanner(System.in);
        System.out.println("Digite o nome do usuário:");
        char  nomeUsuario = inicialScanner.next().charAt(0);
        System.out.println("Digite a senha:");
        char senhaUsuario =inicialScanner.next().charAt(0);
    
        while (true) {
            
            if (nomeUsuario == senhaUsuario) {
                System.out.println("\nO nome de usuário e senha devem ser diferentes.\nTente novamente.\n\n");
                System.out.println("Digite o nome do usuário:");
                nomeUsuario = inicialScanner.next().charAt(0);
                System.out.println("Digite a senha:");
                senhaUsuario = inicialScanner.next().charAt(0);
                
            }

            else {
                    System.out.println("Cadastro realizado com sucesso!");
                break;
            }
        }

        inicialScanner.close();
       
    }
}
