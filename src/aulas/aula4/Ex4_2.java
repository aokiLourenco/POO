package aulas.aula4;

import java.util.Scanner;

public class Ex4_2 {
    
    public static void main(String[] args) {
        
        Scanner val_input = new Scanner(System.in);
        String  str_input = new String();

        
        System.out.print("Digite uma frase: ");
        str_input = val_input.nextLine();

        
        System.out.println("============== RESULTADO ==============");
        System.out.println("Número de caracteres numéricos: " + contarDigitos(str_input));
        System.out.println("             Número de espaços: " + contarCaracter(str_input, ' '));
        System.out.println("          Só contém minúsculas? " + soMinusculas(str_input));
        System.out.println("         Sem espaços repetidos: " + removerEspacosExtra(str_input));
        System.out.println("                  É palíndromo? " + ePalindromo(str_input));


        val_input.close();
    }

    public static int contarDigitos(String str_input) {
        int ocorrencias = 0;
        for (int i = 0; i < str_input.length(); i++) {
            if (Character.isDigit(str_input.charAt(i))) ocorrencias++;
        }
        return ocorrencias;
    }

   
    public static int contarCaracter(String str_input, char caracter) {
        int ocorrencias = 0;
        for (int i = 0; i < str_input.length(); i++) {
            if (str_input.charAt(i) == caracter) ocorrencias++;
        }
        return ocorrencias;
    }

    //public static boolean soMin(String str_input) {
        //if (str_input.toLowerCase().equals(str_input)) return true:
        //return false:
    //}
    
    //public static int espacos(String str_input) {
        //return str_input.trim().replaceAll(" +", " ")
    //}

    //public static boolean ePalindromo(String str_input) {
        //for (int i=1,; i < str_input.lenght()/2; i++) {
            //if (str_input.charAt(i-1) == str_input.charAt(str_input.lenght()-i)) return true;
        //}
        //return false;
    //}

    
    public static boolean soMinusculas(String str_input) {
        if (str_input.toLowerCase().equals(str_input)) return true;
        return false;
    }

    
    public static String removerEspacosExtra(String str_input) {
        return str_input.trim().replaceAll(" +", " ");
    }

    public static boolean ePalindromo(String str_input) {
        for (int i=1; i < str_input.length()/2; i++) {
            if (str_input.charAt(i-1) != str_input.charAt(str_input.length()-i)) return false;
        }
        return true;
    }
}
