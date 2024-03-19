package aulas.aula2;

import java.io.IOException;
import java.util.Scanner;

public class ex2_2 {
     public static void main(String[] args) throws IOException{
        double celsius;
        System.out.print("Temperatura em celsius: ");
        Scanner in = new Scanner(System.in);
        celsius = in.nextDouble();
        double fahrenheit = 1.8*celsius + 32;
        in.close();
        System.out.println("A temperatura em farenheit é: " + fahrenheit);
    }
}
    

