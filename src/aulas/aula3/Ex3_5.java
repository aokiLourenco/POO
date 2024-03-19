package aulas.aula3;

import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args) {
        
        final String N = "\033[0m"; final String V = "\033[0;31m"; final String VN = "\033[1;31m";
        double vb, vj;
        final int num_meses = 12;
        Scanner vi = new Scanner(System.in);
        do{
            try {
                System.out.print("Investimento inicial (EUR): ");
                vb = vi.nextDouble();
                if (vb % 1000 == 0){
                    break;
                } else {
                    System.out.println(VN + "ERRO: " + V + "O valor introduzido tem de ser múltiplo de 1000!" + N);
                }
            } catch (Exception e) {
                vi.nextLine();
                System.out.println(VN + "ERRO: " + V + "O valor introduzido tem de ser um número!" + N);
            }
        }while(true);
        do{
            try {
                System.out.print("Taxa de juros (%): ");
                vj = vi.nextDouble();
                if (vj <= 5 && vj >= 0) {
                    break;
                } else {
                    System.out.println(VN + "ERRO: " + V + "O valor introduzido tem de estar entre 0% e 5%" + N);
                }
            } catch (Exception e) {
                vi.nextLine();
                System.out.println(VN + "ERRO: " + V + "O valor introduzido tem de ser um número!" + N);
            }
        }while(true);
        vi.close();
        System.out.println("=============== RESULTADO ===============");
        for (int i=1; i<= num_meses; i++) {
            vb += vb*(vj/100);
            System.out.println(String.format("Balanço no fim do mês %02d (EUR): %.2f", i , vb));
        }
    }
}
