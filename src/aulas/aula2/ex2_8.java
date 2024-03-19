package aulas.aula2;
import java.util.Scanner;

public class ex2_8 {
    public static void main(String[] args) {
        double a,b,c,angle;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Cateto A: ");
            a = in.nextDouble();
        }while(a<=0);

        do{
            System.out.print("Cateto B: ");
            b = in.nextDouble();
        }while(b<=0);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("O valor da hipotenusa é " + c);

        angle = Math.toDegrees(Math.acos(a/c)) ;

        in.close();
        System.out.println("O valor do ângulo é " + angle + "º");
    }
}
