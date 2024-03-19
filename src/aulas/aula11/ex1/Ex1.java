package aulas.aula11.ex1;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class Ex1 {
    
    public static void loadList(ArrayList<String> list, String path) throws IOException{
        Scanner input = new Scanner(new FileReader(path));
        String words = "";
        while (input.hasNext()){
            words = words + " " + input.next();
        }

        for(String word : words.toLowerCase().replaceAll("[\\t\\n\\.\\,\\:\\'\\‘\\’\\;\\?\\!\\-\\*\\{\\}\\=\\+\\&\\/\\\\(\\)\\[\\]\\”\\“\\\"\\']", " ").trim().split("\\s+")){
            if(word.length() > 2){
                list.add(word);
            }
        }
    }
    public static void main(String args[]) throws IOException{
        ArrayList<String> list = new ArrayList<>();
        Map<String, Map<String, Integer>> map = new TreeMap<>();
        
        loadList(list, "src/aula11/ex1/major.txt");

        for(int i=0; i<list.size()-1; i++){
            Map<String, Integer> map2 = new TreeMap<>();
            map.put(list.get(i), map2);
        }

        for(int i=0; i<list.size()-1; i++){
            String primary = list.get(i);
            String secundary = list.get(i+1);
            map.get(primary).put(secundary, map.get(primary).getOrDefault(secundary, 0)+1);
        }

        for(String even : map.toString().substring(1, map.toString().length()-2).split("},")){
            System.out.println(even + "}");
        }
    }

    
}
