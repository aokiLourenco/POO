package estudo.g5.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        Date date = new Date(0, 0, 0);
        
        do{
            
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            System.out.println();
            System.out.println("Choose an operation: ");

            input = sc.nextInt();
            sc.nextLine();
            
            if(input == 1) validDate(date, sc);
            if(input == 2) showDate(date);
            if(input == 3) date.increment();
            if(input == 4) date.decrement();
        
        } while(input != 0);

        sc.close();
    }

    public static void validDate(Date date, Scanner sc){
        do{
            System.out.println("Introduza uma data válida (AAAA-MM-DD)");
            String str = sc.nextLine();
            String[] str2 = str.split("-");
            date.setDate(Integer.parseInt(str2[0]), Integer.parseInt(str2[1]), Integer.parseInt(str2[2]));
            if(date.valid(Integer.parseInt(str2[0]), Integer.parseInt(str2[1]), Integer.parseInt(str2[2]))){
                break;
            } else{
                System.out.println("Data inválida");
            }

        } while(true);
    }

    public static void showDate(Date date){
        System.out.println(date.toString());
    }

}
