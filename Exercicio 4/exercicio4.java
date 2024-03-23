import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

        int populacaoA = 80000;
        double nascimentoA = 0.03;
        int populacaoB =200000;
        double nascimentoB = 0.015;
        int anos =  0;

        while (populacaoA <= populacaoB) {
            populacaoA+= populacaoA * nascimentoA;
            populacaoB+= populacaoB * nascimentoB;
            anos++;
        }
        System.out.println("Anos necessessários para o País A alcançar a populaçã B é:"+anos+" anos");

        inicialScanner.close();
    }
    
}
