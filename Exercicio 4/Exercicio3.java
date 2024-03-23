import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner inicialScanner= new Scanner(System.in);
 
        String nome ;    
        int idade ;
        double salario ;
        char sexo ;      
        char civil ;

        do{
            System.out.println("Digite seu nome:");
            nome = inicialScanner.nextLine();
           if (nome.length() < 3) {
            
            System.out.println("Nome inválido. Tente novamente:");}
        }   
        while (nome.length() < 3); {
               
        }

        do{
            System.out.println("Digite sua idade:");
            idade = inicialScanner.nextInt();
            if (idade <0 || idade > 150) {
            
                System.out.println("Idade inválida. Tente novamente:");}
               
            
        } while (idade <0 || idade > 150); {
                
        do{
            System.out.println("Digite seu salário:");
            salario = inicialScanner.nextDouble();
            if (salario <= 0) {
                System.out.println("Salário inválido. Tente novamente:");
            }
           

        }while (salario <= 0); {
           
            }
        do{
            System.out.println("Digite seu sexo:");
            sexo = inicialScanner.next().charAt(0);
            if (sexo != 'f' && sexo !='m') {
                System.out.println("Sexo inválido. Tente novamente:");
            }
                     
            }  while (sexo != 'f' && sexo !='m'); {
                    
                }
        do{
            System.out.println("Digite seu Estado Civil:");
            civil = inicialScanner.next().charAt(0);
            if (civil != 's'&& civil != 'c'&& civil != 'v'&& civil !='d') {
                
            System.out.println("Estado Civil inválido. Tente novamente:");
                
            }
        }while (civil != 's'&& civil != 'c'&& civil != 'v'&& civil !='d'); {
           
        System.out.println("Informações coletadas com sucesso!");
        }

        inicialScanner.close();
        }
    }
}
