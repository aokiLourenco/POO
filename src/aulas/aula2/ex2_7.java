package aulas.aula2;

import java.util.Scanner;

public class ex2_7 {
    public static void main(String[] args) {
        double p1x,p1y,p2x,p2y,d;
        Scanner in = new Scanner(System.in);
        System.out.print("x de p1: ");
        p1x = in.nextDouble();
        
        System.out.print("y de p1: ");
        p1y = in.nextDouble();

        System.out.print("x de p2: ");
        p2x = in.nextDouble();

        System.out.print("y de p2: ");
        p2y = in.nextDouble();

        d=Math.sqrt(Math.pow((p1x-p2x), 2)+Math.pow((p1y-p2y), 2));

        in.close();
        System.out.println("A distância é: " + d);
    }
}