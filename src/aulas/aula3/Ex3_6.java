package aulas.aula3;

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        
        final String N = "\033[0m"; final String V = "\033[0;31m"; final String VN = "\033[1;31m";
        int va, vm, nd;
        Scanner vi = new Scanner(System.in);
        do{
            try {
                System.out.print("Ano: ");
                va = vi.nextInt();
                break;
            } catch (Exception e) {
                vi.nextLine();
                System.out.println(VN + "ERRO: " + V + "O valor introduzido tem de ser um número inteiro!" + N);
            }
        }while(true);
        do{
            try {
                System.out.print("Mês: ");
                vm = vi.nextInt();
                if (vm >= 1 && vm <= 12) {
                    break;
                } else {
                    System.out.println(VN + "ERRO: " + V + "O valor introduzido tem de estar entre 1 e 12" + N);
                }
            } catch (Exception e) {
                vi.nextLine();
                System.out.println(VN + "ERRO: " + V + "O valor introduzido tem de ser um número inteiro!" + N);
            }
        }while(true);
        vi.close();
        if (vm == 2){
            if (va % 400 == 0) {
                nd = 29;
            } else if (va % 100 == 0) {
                nd = 28;
            } if (va % 4 == 0) {
                nd = 29;
            } else {
                nd = 28;
            }
        } else {
            if (vm==4 || vm==6 || vm==9 || vm==11) {
                nd = 30;
            } else {
                nd = 31;
            }
        }
        System.out.println("=============== RESULTADO ===============");
        System.out.println(String.format("O mês %02d do ano %d tem %02d dias.", vm, va, nd));
    }
}
