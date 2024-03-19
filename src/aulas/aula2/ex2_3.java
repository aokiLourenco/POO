package aulas.aula2;

import java.util.Scanner;

public class ex2_3 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de água (kg): ");
        double M = in.nextDouble();
        System.out.print("Temperatura inicial (ºC): ");
        double initialTemperature = in.nextDouble();
        System.out.print("Temperatura final (ºC): ");
        double finalTemperature = in.nextDouble();
        double Q = M * (finalTemperature - initialTemperature) * 4184;
        in.close();
        System.out.println("A energia necessária é " + Q + " J.");
    }
        
}
