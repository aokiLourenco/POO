package aulas.aula2;
import java.util.Scanner;

public class ex2_6 {
    public static void main(String[] args) {
        int s,m,h;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Tempo (seg): ");
            s = in.nextInt();
        }while(s<0);

        h = s/3600;
        m = (s-3600*h)/60;
        s = s-3600*h-60*m;

        in.close();
        System.out.print(h+":"+m+":"+s+" (h:m:s)");
    }
}
