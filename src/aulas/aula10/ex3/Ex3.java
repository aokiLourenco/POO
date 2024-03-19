package aulas.aula10.ex3;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Ex3 {
    
    public static String charaPosition(String s){
        Map<Character, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);
            map.put(c, new ArrayList<>());
        }

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.get(c).add(i);
        }
        return map.toString();
    }

    public static void main(String args[]){
        System.out.println(charaPosition("esta vida de engenheiro está..."));
    }
}
