package aulas.aula4;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        
        //Scanner val_input = new Scanner(System.in);
        //String str_input = new String();
        //String acro = new String("");

       // System.out.println("Digite uma frase: ");
        //str_input=val_input.nextLine();

        //for (String palavra : str_input.split(" ")) {
            //if (palavra.lenght()>=3) acro = acro + Character.toUpperCase(palavra.charAt(0));
        //}

        //System.out.println("Acrónimo: " + acro);
        //val_input.close();
        
        
        Scanner val_input = new Scanner(System.in);
        String  str_input = new String();
        String  acronimo  = new String("");

       
        System.out.print("Digite uma frase: ");
        str_input = val_input.nextLine();

       
        for (String palavra : str_input.split(" ")) { 
            if (palavra.length()>=3) acronimo = acronimo + Character.toUpperCase(palavra.charAt(0));
        }

        
        System.out.println("============== RESULTADO ==============");
        System.out.println("Acrónimo: " + acronimo);

        val_input.close();
    }
}
