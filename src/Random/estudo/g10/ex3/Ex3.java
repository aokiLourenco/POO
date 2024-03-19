package estudo.g10.ex3;

import java.util.*;

public class Ex3 {
    public static void main(String[] args){
       System.out.println(getPositions("esta vida de engeheiro"));
       System.out.println(getPositions("Hello World"));
    }

    public static String getPositions(String s){
        Map<Character, ArrayList<Integer>> mapa = new HashMap<>();

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            mapa.put(c, new ArrayList<>());
        } 

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            mapa.get(c).add(i);
        }

        return mapa.toString();
    }
}