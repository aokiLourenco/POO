package aulas.aula4;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza algum texto");
        String str=sc.nextLine();
        System.out.println("frase convertida para minúsculas");
        System.out.println(str.toLowerCase());
        System.out.println("último carater da frase");
        System.out.println(str.charAt(str.length()-1));
        System.out.println("os três primeiros carateres");
        System.out.println(str.substring(0,3));
        sc.close();

    }    
}
