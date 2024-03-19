package aulas.aula2;

import java.util.Scanner;

public class ex2_4 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        final int nm = 3;
        System.out.print("Montante investido?($): ");
        double investido = in.nextDouble();
        System.out.print("Taxa de juro mensal?(%): ");
        double juro = in.nextDouble();
        in.close();
        for (int i=1; i<= nm; i++){
            investido +=  (investido * (juro/100));
        }
        System.out.println("O valor que está investido ao final de 3 meses será de " + investido + " euros." );
    }
}
