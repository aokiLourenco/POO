package aulas.aula12.ex1;

import java.util.Set;
import java.util.TreeSet;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Ex1 {
    
    public static void main(String args[]) throws IOException{
        Set<String> palavras = new TreeSet<>();
        int num_palavras = 0;

        FileReader file_reader = new FileReader("src/aula11/ex1/major.txt");
        Scanner file_scanner = new Scanner(file_reader).useDelimiter("[\\p{Punct}\\s]+");
        String temp_palavras = "";
        while(file_scanner.hasNext()) temp_palavras = temp_palavras + " " + file_scanner.next();
        file_scanner.close();
        file_reader.close();
        for(String palavra : temp_palavras.split("\\s+")){
            palavras.add(palavra);
            num_palavras++;
        }
        System.out.println("Número total de palavras: " + num_palavras);
        System.out.println("Número de diferentes palavras: " + palavras.size());
        
    }
}
