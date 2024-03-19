package aulas.aula2;

import java.util.Scanner;

public class ex2_1 {

    public static void main(String[] args) {
        double km;
        System.out.println("Introduza o valor em kilómetros: ");
        Scanner in = new Scanner(System.in);
        km = in.nextDouble();
        double ml = km / 1.609;
        in.close();
        System.out.println(ml + " milhas");
    }
}
