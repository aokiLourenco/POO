package aulas.aula2;

import java.util.Scanner;

public class ex2_5 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Inserção da velocidade percorrida no primeiro trajeto: ");
        double v1 = in.nextDouble();
        System.out.print("Inserção da distância percorrida no primeiro trajeto: ");
        double d1 = in.nextDouble();
        System.out.print("Inserção da velocidade percorrida no segundo trajeto: ");
        double v2 = in.nextDouble();
        System.out.print("Inserção da distância percorrida no segundo trajeto: ");
        double d2 = in.nextDouble();
        double vm = (d1+d2)/((d1/v1)+(d2/v2));
        in.close();
        System.out.println("A velocidade média final é " + vm );
    }
    
}
