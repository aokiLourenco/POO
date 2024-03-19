package aulas.aula3;

import java.util.Scanner;

public class Ex3_2 {
    public static void main (String[] args){
        
        System.out.println("Introduza um valor positivo: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt( );
        for (int i = N; i >= 0; i--)
            System.out.print(i + " ");
        sc.close();
    }
}
