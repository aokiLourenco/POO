package aulas.aula1;

import java.util.Scanner;

public class Ex5_3 {
    
    public static void main (String[] args){
        System.out.println("Introduza um número random: ");
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long a = s - s;
        System.out.println("Era uma vez POO que era muito fácil mas agora já não percebo nada disto :), road to " + a);
        sc.close();


    }
}
