package aulas.aula3;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args){
        int n;
	    boolean isPrime=true;
        Scanner sc= new Scanner(System.in);
	    do{
            System.out.println("Introduza um valor:");
	        n=sc.nextInt();
        }while(n<=0);
	    for(int i=2;isPrime && i*i<=n;i++)
            isPrime = (n%i) != 0;
	
	    if(isPrime)
	        System.out.println(n + " é primo");
	    else
	        System.out.println(n + " não é primo");
        sc.close();
    }
}