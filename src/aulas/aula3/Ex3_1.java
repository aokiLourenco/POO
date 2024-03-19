package aulas.aula3;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args){

        double notaP,notaT;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nota componente prática: ");
            notaP = sc.nextDouble();
        }while((notaP<0) || (notaP>20));

        do{
            System.out.println("Nota componente teórica: ");
            notaT = sc.nextDouble();
        }while((notaT<0) || (notaT>20));

        long notaF = Math.round(0.4 * notaT + 0.6 * notaP);
        if ((notaT < 7.0 || notaP < 7.0))
            System.out.println("66");
        else
            System.out.println("A nota final do aluno é de " + notaF + " valores");
        sc.close();
    }
}
